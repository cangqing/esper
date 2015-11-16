package com.xiaoka.esper.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

/**
 * Created by Administrator on 2015/5/27.
 */
class ContextPropertiesListener implements UpdateListener {

    public void update(EventBean[] newEvents, EventBean[] oldEvents) {
        if (newEvents != null) {
            EventBean event = newEvents[0];
            System.out.println("context.name " + event.get("name") + ", context.id " + event.get("id") + ", context.key1 " + event.get("key1")
                    + ", context.key2 " + event.get("key2"));
        }
    }
}
