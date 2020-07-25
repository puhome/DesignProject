package com.brzt.design.factory;

import com.brzt.design.factory.enums.ActivityType;
import com.brzt.design.factory.impl.Lottery;
import org.junit.Before;
import org.junit.Test;

/**
 * @author puhome
 * @data 2020/7/24
 */
public class ActivityTest {

    private ActivityFactory activityFactory;

    @Before
    public void init(){
        activityFactory=new ActivityFactory();
    }
    /**
     * 抽奖测试
     */
    @Test
    public  void  useLottery()
    {
        Activity activity=activityFactory.getActivity(ActivityType.LOTTERY.getType());
        activity.action();
    }

    /**
     * 留言测试
     */
    @Test
    public void userFeedBack()
    {
        Activity activity=activityFactory.getActivity(ActivityType.FEEDBACK.getType());
        activity.action();
    }
}
