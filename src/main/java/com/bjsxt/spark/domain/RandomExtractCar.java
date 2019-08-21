package com.bjsxt.spark.domain;

/**
 * program: traffic_teach->RandomExtractCar
 * description: 随机抽取出来的car信息 domain
 * author: gerry
 * created: 2019-08-16 17:17
 **/
public class RandomExtractCar {
    private long taskId;
    private String car;
    private String date;
    private String dateHour;

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateHour() {
        return dateHour;
    }

    public void setDateHour(String dateHour) {
        this.dateHour = dateHour;
    }

    public RandomExtractCar(long taskId, String car, String date, String dateHour) {
        this.taskId = taskId;
        this.car = car;
        this.date = date;
        this.dateHour = dateHour;
    }

    public RandomExtractCar() {
        super();
    }
}
