package edu.teamrocket.Item;

import java.util.List;

import edu.teamrocket.Offer.Offer;

public interface Item {
    public int getBid();
    public int getAsk();
    public int getSale();
    public void add(Offer offer);
    public void setBid(int bid);
    public void setAsk(int ask);
    public void setSale(int sale);
    

    
}
