package com.brzt.design.factory;

import com.brzt.design.factory.enums.ActivityType;
import com.brzt.design.factory.impl.FeedBack;
import com.brzt.design.factory.impl.Lottery;

/**
 * 专题活动工厂
 * @author puhome
 * @data 2020/7/24
 */
public class ActivityFactory {
    /**
     *获取活动功能对象
     * @param activityTpye
     * @return
     */
    public Activity getActivity(String activityTpye) {
        if (activityTpye == null) {
            return null;
        }
        if (activityTpye.equalsIgnoreCase(ActivityType.LOTTERY.getType())) {
            return new Lottery();//抽奖
        } else if (activityTpye.equalsIgnoreCase(ActivityType.FEEDBACK.getType())) {
            return new FeedBack();//留言
        }
        return null;
    }
}

