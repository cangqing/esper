package com.xiaoka.esper.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

/**
 * Created by Administrator on 2015/8/21.
 */
class FruitListener implements UpdateListener {

    public void update(EventBean[] newEvents, EventBean[] oldEvents) {
        if (newEvents != null) {
            Integer kind = (Integer) newEvents[0].get("kind");
            Integer id = (Integer) newEvents[0].get("id");
            Long millons = (Long) newEvents[0].get("millons");
            System.out.println("id=" + id + ",kind=" + kind + ",millons=" + millons);
        }
    }
}
