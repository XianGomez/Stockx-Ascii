package edu.teamrocket.Offer;

public class Bid implements Offer {
    private String size;
    private Integer bid;

    public Bid(String size, int bid) {
        this.size = size;
        this.bid = bid;
    }

    public String size() {
        return this.size;
    }

    public int value() {
        return this.bid;
    }

    @Override
    public String toString() {
        
        return size() + "\t" + value();
    }

}
