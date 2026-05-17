package edu.teamrocket.Offer;

public class Sale implements Offer {
    private String size;
    private Integer price;

    public Sale(String size, int price) {
        this.size = size;
        this.price = price;
    }

    public String size() {
        return this.size;
    }

    public int value() {
        return this.price;
    }

    @Override
    public int compareTo(Offer sale) {
        return Integer.compare(this.value(), sale.value());
    }

    @Override
    public String toString() {
        return "\t\t" + size() + "\t" + value() + "\n";
    }
}
