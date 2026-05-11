package edu.teamrocket.Item;
import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.Offer.Offer;

public class Sneaker implements Item {
    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;

    private List<Offer> offerList;

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
        this.offerList = new ArrayList<>();
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

    public void add(Offer offer) {
        offerList.add(offer);
    }

    @Override
    public String toString() {
        return getName() + "\n" + "\t\t" + getStyle();
    }


    
}
