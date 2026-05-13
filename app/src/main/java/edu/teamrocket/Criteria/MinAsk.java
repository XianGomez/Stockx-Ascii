package edu.teamrocket.Criteria;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.Item.Item;
import edu.teamrocket.Offer.Offer;

public class MinAsk implements Criteria {
    public MinAsk() {};

    public List<Offer> checkCriteria(Item item) {
        List<Offer> result = new ArrayList<>();
        Offer minAsk = null;

        for (Offer offer : item.offers()) {
            if (minAsk == null || offer.compareTo(minAsk) < 0) {
                minAsk = offer;
            }
        }

        if (minAsk != null) {
            result.add(minAsk);
        }

        return result;
    }
    
}
