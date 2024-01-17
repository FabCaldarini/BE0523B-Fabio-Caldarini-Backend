package it.epicode.week2.day3;

public class Customer {
    private long id;
    private String name;

    public Customer(long id, String name, int tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    private int tier;

}
