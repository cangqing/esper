package com.xiaoka.esper;

import com.espertech.esper.client.*;
import com.google.common.collect.Lists;
import com.xiaoka.esper.listener.MapEventListener;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/6/2.
 */
public class EsperMapEvent {
    public static void main(String[] args) {

        EPServiceProvider epService = EPServiceProviderManager.getDefaultProvider();
        EPAdministrator admin = epService.getEPAdministrator();

        // Address定义
        Map<String, Object> address = new HashMap<String, Object>();
        address.put("road", String.class);
        address.put("street", String.class);
        address.put("houseNo", int.class);
        // 注册Address到Esper
        admin.getConfiguration().
                addEventType("Address", address);
        // Person定义
        Map<String, Object> person = new HashMap<String, Object>();
        person.put("name", String.class);
        person.put("age", int.class);
        person.put("children", List.class);
        person.put("address", "Address");
        // 注册Person到Esper
        admin.getConfiguration().
                addEventType("Person", person);

        String epl="select age,children,address, 1 as days from Person where name=\"p1\"";
        EPStatement state = admin.createEPL(epl);
        state.addListener(new MapEventListener());

        EPRuntime runtime = epService.getEPRuntime();

        Map<String, Object> person1 = new HashMap<String, Object>();
        person1.put("name","p1");
        person1.put("age",18);
        List<String> children= Lists.newArrayList();
        children.add("child11");
        children.add("child12");
        person1.put("children", children);
        Map<String, Object> address1= new HashMap<String, Object>();
        address1.put("road", "文一西路");
        address1.put("street", "文新街道");
        address1.put("houseNo",522);
        person1.put("address", address1);
        runtime.sendEvent(person1,"Person");

        Map<String, Object> person2 = new HashMap<String, Object>();
        person2.put("name","p2");
        person2.put("age",28);
        List<String> children2= Lists.newArrayList();
        children2.add("child21");
        children2.add("child22");
        person2.put("children",children);
        Map<String, Object> address2= new HashMap<String, Object>();
        address2.put("road", "文一西路");
        address2.put("street", "高教路");
        address2.put("houseNo", 969);
        person2.put("address", address2);
        runtime.sendEvent(person2,"Person");
    }
}

