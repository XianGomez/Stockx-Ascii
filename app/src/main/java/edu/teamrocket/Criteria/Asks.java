package edu.teamrocket.Criteria;

import java.util.ArrayList;
import java.util.List;

import edu.teamrocket.Item.Item;
import edu.teamrocket.Offer.Ask;
import edu.teamrocket.Offer.Offer;

public class Asks implements Criteria{
    public Asks() {};

    public List<Offer> checkCriteria(Item item) {
        List<Offer> asks = new ArrayList<>();
        
        for (Offer offer : item.offers()) {
            if (offer instanceof Ask) {
                asks.add(offer);
            }
        }
        return asks;
    };
    
}
