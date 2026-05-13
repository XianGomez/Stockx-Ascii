package edu.teamrocket.Criteria;

import java.util.List;

import edu.teamrocket.Item.Item;
import edu.teamrocket.Offer.Offer;

public interface Criteria {
    public List<Offer> checkCriteria(Item item);
}
