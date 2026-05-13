package edu.teamrocket.Criteria;

import java.util.List;

import edu.teamrocket.Item.Item;
import edu.teamrocket.Offer.Offer;

public class Bids implements Criteria {

    public Bids() {}

    public List<Offer> checkCriteria(Item item) {
        return item.offers();
    } 
}
