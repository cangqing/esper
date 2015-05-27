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
public class EsperOverView {

    public static void main(String[] args) throws InterruptedException {
        EPServiceProvider epService = EPServiceProviderManager.getDefaultProvider();

        EPAdministrator admin = epService.getEPAdministrator();

        String product = Apple.class.getName();
        String epl = "select avg(price) from " + product + ".win:length_batch(3)";

        EPStatement state = admin.createEPL(epl);
        state.addListener(new AppleListener());

        EPRuntime runtime = epService.getEPRuntime();

        Apple apple1 = new Apple();
        apple1.setId(1);
        apple1.setPrice(5);
        runtime.sendEvent(apple1);

        Apple apple2 = new Apple();
        apple2.setId(2);
        apple2.setPrice(2);
        runtime.sendEvent(apple2);

        Apple apple3 = new Apple();
        apple3.setId(3);
        apple3.setPrice(4);
        runtime.sendEvent(apple3);
    }
}

class AppleListener implements UpdateListener
{

    public void update(EventBean[] newEvents, EventBean[] oldEvents)
    {
        if (newEvents != null)
        {
            Double avg = (Double) newEvents[0].get("avg(price)");
            System.out.println("Apple's average price is " + avg);
        }
    }
}
