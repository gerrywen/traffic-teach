package com.bjsxt.spark.domain;

/**
 * program: traffic_teach->CarTrack
 * description: 保存车辆轨迹信息 domain
 * author: gerry
 * created: 2019-08-16 17:10
 **/
public class CarTrack {
    private long taskId;
    private String date;
    private String car;
    private String track;

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public CarTrack(long taskId, String date, String car, String track) {
        this.taskId = taskId;
        this.date = date;
        this.car = car;
        this.track = track;
    }

    public CarTrack() {
        super();
    }
}
