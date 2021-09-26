package de.die_gfi.oliver.kw39.foodorder.logic;

public class Meal {

    String description;
    double price;
    int count;

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public Meal(String description, double price) {
        this.description = description;
        this.price = price;
        this.count = 0;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "meal='" + description + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
