package edu.teamrocket.Criteria;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.Item.Item;
import edu.teamrocket.Offer.Bid;
import edu.teamrocket.Offer.Offer;

public class Bids implements Criteria {

    public Bids() {}

    public List<Offer> checkCriteria(Item item) {
        List<Offer> bids = new ArrayList<>();

        for (Offer offer : item.offers()) {
            if (offer instanceof Bid) {
                bids.add(offer);
            }
        }
        
        return bids;
    } 
}
