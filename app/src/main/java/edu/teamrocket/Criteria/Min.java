package edu.teamrocket.Criteria;

import java.util.List;
import java.util.Optional;

import edu.teamrocket.Item.Item;
import edu.teamrocket.Offer.Offer;

public class Min implements Criteria {

    private Criteria criteria = null;
    private Criteria otherCriteria = null;

    public Min(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
    
        Criteria andCriteria = new AndCriteria(criteria, otherCriteria);
        Optional<Offer> offer = andCriteria.checkCriteria(item)
                                    .stream()
                                    .min(Offer::compareTo);
        return offer.isPresent()? List.of(offer.get()) : List.of();
    }

}