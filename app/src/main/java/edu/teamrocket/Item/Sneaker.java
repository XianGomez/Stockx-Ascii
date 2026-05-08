package edu.teamrocket.Item;
import java.util.List;

import edu.teamrocket.Offer.Offer;

public class Sneaker implements Item {
    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    
    public String getStyle() {
        return this.style;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int getSale() {
        return sale;
    }

    @Override
    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public int getBid() {
        return bid;
    }

    @Override
    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public int getAsk() {
        return ask;
    }

    @Override
    public void setAsk(int ask) {
        this.ask = ask;
    }

    @Override
    public String toString() {
        return getName() + "\n" + "\t\t" + getStyle();
    }


    
}
