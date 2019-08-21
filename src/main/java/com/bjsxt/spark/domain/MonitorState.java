package com.bjsxt.spark.domain;

/**
 * program: traffic_teach->MonitorState
 * description: 卡口状态
 * author: gerry
 * created: 2019-08-16 17:11
 **/
public class MonitorState {
    private long taskId;
    private String normalMonitorCount;//正常的卡扣个数
    private String normalCameraCount;//正常的摄像头个数
    private String abnormalMonitorCount;//不正常的卡扣个数
    private String abnormalCameraCount;//不正常的摄像头个数
    private String abnormalMonitorCameraInfos;//不正常的摄像头详细信息

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String getNormalMonitorCount() {
        return normalMonitorCount;
    }

    public void setNormalMonitorCount(String normalMonitorCount) {
        this.normalMonitorCount = normalMonitorCount;
    }

    public String getNormalCameraCount() {
        return normalCameraCount;
    }

    public void setNormalCameraCount(String normalCameraCount) {
        this.normalCameraCount = normalCameraCount;
    }

    public String getAbnormalMonitorCount() {
        return abnormalMonitorCount;
    }

    public void setAbnormalMonitorCount(String abnormalMonitorCount) {
        this.abnormalMonitorCount = abnormalMonitorCount;
    }

    public String getAbnormalCameraCount() {
        return abnormalCameraCount;
    }

    public void setAbnormalCameraCount(String abnormalCameraCount) {
        this.abnormalCameraCount = abnormalCameraCount;
    }

    public String getAbnormalMonitorCameraInfos() {
        return abnormalMonitorCameraInfos;
    }

    public void setAbnormalMonitorCameraInfos(String abnormalMonitorCameraInfos) {
        this.abnormalMonitorCameraInfos = abnormalMonitorCameraInfos;
    }

    public MonitorState(long taskId, String normalMonitorCount, String normalCameraCount, String abnormalMonitorCount, String abnormalCameraCount, String abnormalMonitorCameraInfos) {
        this.taskId = taskId;
        this.normalMonitorCount = normalMonitorCount;
        this.normalCameraCount = normalCameraCount;
        this.abnormalMonitorCount = abnormalMonitorCount;
        this.abnormalCameraCount = abnormalCameraCount;
        this.abnormalMonitorCameraInfos = abnormalMonitorCameraInfos;
    }

    public MonitorState() {
        super();
    }
}
