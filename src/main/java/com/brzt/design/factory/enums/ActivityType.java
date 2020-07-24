package com.brzt.design.factory.enums;

public enum ActivityType {

    /**
     * 留言
     */
    FEEDBACK("FEEDBACK"),
    /**
     * 抽奖
     */
    LOTTERY("LOTTERY");

    /**
     * 类型
     */
    private String type;

    public String getType() {
        return type;
    }

    /**
     * 构造方法
     * @param type
     */
    ActivityType(String type) {
        this.type = type;
    }
}
