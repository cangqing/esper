package com.xiaoka.esper.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/8/21.
 */
class MapEventListener implements UpdateListener
{

    public void update(EventBean[] newEvents, EventBean[] oldEvents)
    {
        if (newEvents != null)
        {
            EventBean eventBean= newEvents[0];
            int age = (Integer) newEvents[0].get("age");
            System.out.println("age is " + age);
            List<String> children = (List<String>) newEvents[0].get("children");
            System.out.println("children is " + children);
            Map<String, Object> address= (Map<String, Object>) newEvents[0].get("address");
            System.out.println("address is " + address);
        }
    }
}
