package edu.teamrocket.Criteria;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.Item.Item;
import edu.teamrocket.Offer.Offer;

public class Size implements Criteria {

    private String size;
    public Size(String size) {
        this.size = size;
    };

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> result = new ArrayList<>();

        for (Offer offer : item.offers()) {
            if (offer.size().equals(size)) {
                result.add(offer);
            }
        }

        return result;
    }
    
}
