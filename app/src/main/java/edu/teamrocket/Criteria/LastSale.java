package edu.teamrocket.Criteria;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.Item.Item;
import edu.teamrocket.Offer.Offer;


public class LastSale implements Criteria{
    public LastSale() {};

    public List<Offer> checkCriteria(Item item) {
        List<Offer> lastSale = new ArrayList<>();

        if (!item.offers().isEmpty()) {
            lastSale.add(item.offers().get(item.offers().size() -1));
        }
        
        
        return lastSale;
    }
    
}
