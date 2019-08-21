package com.bjsxt.spark.domain;

/**
 * program: traffic_teach->Area
 * description: 地区表
 * author: gerry
 * created: 2019-08-16 17:06
 **/
public class Area {
    private String areaId;
    private String areaName;

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Area(String areaId, String areaName) {
        this.areaId = areaId;
        this.areaName = areaName;
    }

    public Area() {
        super();
    }
}
