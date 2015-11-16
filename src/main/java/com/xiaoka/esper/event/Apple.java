package com.xiaoka.esper.event;

import java.util.Date;

/**
 * Created by Administrator on 2015/5/27.
 */
public class Apple {
    private int id;
    private int price;

    private Long millons;

    private int kind;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public Long getMillons() {
        return millons;
    }

    public void setMillons(Long millons) {
        this.millons = millons;
    }
}
