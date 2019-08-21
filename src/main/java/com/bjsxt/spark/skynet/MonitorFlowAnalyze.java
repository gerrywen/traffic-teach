package com.bjsxt.spark.skynet;

import com.bjsxt.spark.conf.ConfigurationManager;
import com.bjsxt.spark.constant.Constants;
import com.bjsxt.spark.util.ParamUtils;
import com.bjsxt.spark.util.SparkUtils;
import com.spark.spark.test.MockData;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SQLContext;

/**
 * program: traffic_teach->MonitorFlowAnalyze
 * description: 卡扣流量监控模块
 *    1.检测卡扣状态
 *    2.获取车流排名前N的卡扣号
 *    3.数据库保存累加器5个状态（正常卡扣数，异常卡扣数，正常摄像头数，异常摄像头数，异常摄像头的详细信息）
 *    4.topN 卡口的车流量具体信息存库
 *    5.获取高速通过的TOPN卡扣
 *    6.获取车辆高速通过的TOPN卡扣，每一个卡扣中车辆速度最快的前10名
 *    7.区域碰撞分析
 *    8.卡扣碰撞分析
 *
 *
 *    ./spark-submit  --master spark://node1:7077,node2:7077
 *    --class com.bjsxt.spark.skynet.MonitorFlowAnalyze
 *    --driver-class-path ../lib/mysql-connector-java-5.1.6.jar:../lib/fastjson-1.2.11.jar
 *    --jars ../lib/mysql-connector-java-5.1.6.jar,../lib/fastjson-1.2.11.jar
 *    ../lib/ProduceData2Hive.jar
 *    1
 *
 * author: gerry
 * created: 2019-08-16 16:41
 **/
public class MonitorFlowAnalyze {
    public static void main(String[] args) {
        // 构建Spark运行时的环境参数
        SparkConf conf = new SparkConf().setAppName(Constants.SPARK_APP_NAME_SESSION);

        /**
         * 设置spark运行时的master  根据配置文件来决定的
         */
        SparkUtils.setMaster(conf);

        JavaSparkContext sc = new JavaSparkContext();
        /**
         * 查看配置文件是否是本地测试，若是本地测试那么创建一个SQLContext   如果是集群测试HiveContext
         */
        SQLContext sqlContext = SparkUtils.getSQLContext(sc);

        /**
         * 基于本地测试生成模拟测试数据，如果在集群中运行的话，直接操作Hive中的表就可以
         * 本地模拟数据注册成一张临时表
         * monitor_flow_action	数据表：监控车流量所有数据
         * monitor_camera_info	标准表：卡扣对应摄像头标准表
         */
        if (ConfigurationManager.getBoolean(Constants.SPARK_LOCAL)) {
            //本地
//			SparkUtils.mockData(sc, sqlContext);
            MockData.mock(sc,sqlContext);
        } else {
            //集群
            sqlContext.sql("use traffic");
        }

        /**
         * 给定一个时间段，统计出卡口数量的正常数量，异常数量，还有通道数
         * 异常数：每一个卡口都会有n个摄像头对应每一个车道，
         * 		如果这一段时间内卡口的信息没有第N车道的信息的话就说明这个卡口存在异常。
         * 这需要拿到一份数据（每一个卡口对应的摄像头的编号）
         * 模拟数据在monitor_camera_info临时表中
         */
        /**
         * 从配置文件my.properties中拿到spark.local.taskId.monitorFlow的taskId
         */

        Long taskId = ParamUtils.getTaskIdFromArgs(args, Constants.SPARK_LOCAL_TASKID_MONITOR);

        if(taskId == 0L){
            System.out.println("args is null.....");
            return;
        }

        /**
         * 获取ITaskDAO的对象，通过taskId查询出来的数据封装到Task（自定义）对象
         */

    }
}
