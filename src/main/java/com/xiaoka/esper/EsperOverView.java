package com.xiaoka.esper;

import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
import com.xiaoka.esper.event.Apple;
import com.xiaoka.esper.event.Orange;
import com.xiaoka.esper.listener.FruitListener;
import org.joda.time.DateTime;

/**
 * Created by Administrator on 2015/5/27.
 */
public class EsperOverView {

    public static void main(String[] args) {
        EPServiceProvider epService = EPServiceProviderManager.getDefaultProvider();

        EPAdministrator admin = epService.getEPAdministrator();
        DateTime dateTime = new DateTime();
        String product = Apple.class.getName();
        String epl = "select kind,id ,millons from " + product + " where millons>" + dateTime.minusHours(1).toDate().getTime();
        System.out.println(epl);
        String orange = Orange.class.getName();
        String ep2 = "select count(1) as count,kind from " + orange + ".win:time(3 hours)";

        EPStatement state = admin.createEPL(epl);
        state.addListener(new FruitListener());
//        EPStatement state2 = admin.createEPL(ep2);
//        state2.addListener(new FruitListener());


        EPRuntime runtime = epService.getEPRuntime();

        for (int i = 0; i < 5; i++) {
            Apple apple = new Apple();
            apple.setId(1);
            apple.setPrice(i);
            apple.setKind(1);
            DateTime date = new DateTime();
            apple.setMillons(date.minusHours(i).toDate().getTime());
            System.out.println(apple.getMillons());
            runtime.sendEvent(apple);
        }
    }
}

