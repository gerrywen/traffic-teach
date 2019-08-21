package com.bjsxt.spark.domain;

/**
 * program: traffic_teach->TopNMonitor2CarCount
 * description: 获取车流量排名前N的卡口
 * author: gerry
 * created: 2019-08-16 17:21
 **/
public class TopNMonitor2CarCount {
    private long taskId;
    private String monitorId;
    private int carCount;

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(String monitorId) {
        this.monitorId = monitorId;
    }

    public int getCarCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    public TopNMonitor2CarCount(long taskId, String monitorId, int carCount) {
        this.taskId = taskId;
        this.monitorId = monitorId;
        this.carCount = carCount;
    }

    public TopNMonitor2CarCount() {
        super();
    }
}
