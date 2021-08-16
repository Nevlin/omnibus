package com.company.item;

public abstract class Item {
    protected String id;
    protected String name;
    protected String contentsFormat = "%-14s%s%n";

    public Item(String name) {
        this.name = name;
    }

    protected void setId(int counter, String startId) {
        this.id = startId + String.format("%03d", counter);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("  -  %s | %s", id, name);
    }

    public void printContents() {
        System.out.printf(contentsFormat, "ID:", id);
        System.out.printf(contentsFormat, "Name:", name);
    }
}
