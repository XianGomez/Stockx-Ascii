package edu.teamrocket.Criteria;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.Item.Item;
import edu.teamrocket.Offer.Offer;

public class MaxBid implements Criteria {
    public MaxBid() {};

    public List<Offer> checkCriteria(Item item) {
        List<Offer> result = new ArrayList<>();
        Offer maxBid = null;
        for (Offer offer : item.offers()) {
            if (maxBid == null || offer.compareTo(maxBid) > 0) {
                maxBid = offer;
            }
        }

        if (maxBid != null) {
            result.add(maxBid);
        }

        return result;

    }
}
