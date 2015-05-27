package com.xiaoka.esper;

import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
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

public class EsperContext {
    public static void main(String[] args) {
        EPServiceProvider epService = EPServiceProviderManager.getDefaultProvider();
        EPAdministrator admin = epService.getEPAdministrator();
        EPRuntime runtime = epService.getEPRuntime();

        String Apple = Apple.class.getName();
        // 创建context
        String epl1 = "create context AppleContext partition by id,price from " + Apple;
        // context.id针对不同的Apple的id,price建立一个context，如果事件的id和price相同，则context.id也相同，即表明事件进入了同一个context
        String epl2 = "context AppleContext select context.id,context.name,context.key1,context.key2 from " + Apple;

        admin.createEPL(epl1);
        EPStatement state = admin.createEPL(epl2);
        state.addListener(new ContextPropertiesListener());

        Apple e1 = new Apple();
        e1.setId(1);
        e1.setPrice(20);
        System.out.println("sendEvent: id=1, price=20");
        runtime.sendEvent(e1);


        Apple e2 = new Apple();
        e2.setId(2);
        e2.setPrice(30);
        System.out.println("sendEvent: id=2, price=30");
        runtime.sendEvent(e2);

        Apple e3 = new Apple();
        e3.setId(1);
        e3.setPrice(20);
        System.out.println("sendEvent: id=1, price=20");
        runtime.sendEvent(e3);

        Apple e4 = new Apple();
        e4.setId(4);
        e4.setPrice(20);
        System.out.println("sendEvent: id=4, price=20");
        runtime.sendEvent(e4);
    }
}
