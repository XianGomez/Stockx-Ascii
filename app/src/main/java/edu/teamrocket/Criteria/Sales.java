package edu.teamrocket.Criteria;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.Item.Item;
import edu.teamrocket.Offer.Offer;
import edu.teamrocket.Offer.Sale;

public class Sales implements Criteria{
    public Sales() {};

    public List<Offer> checkCriteria(Item item) {
        List<Offer> salesList = new ArrayList<>();

        for (Offer offer : item.offers()) {
            if (offer instanceof Sale) {
                salesList.add(offer);
            }
        }
        
        return salesList;
    }
    
}
