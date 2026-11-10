package com.pluralsight;

public class Room {
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private int numberOfBeds;

    public Room(double price, int numberOfBeds) {
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied();
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty();
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }
    public void checkIn(){
        isOccupied = true;
        isDirty = true;
    }
    public void checkOut(){
        isOccupied = false;
        isDirty = true;

    }
    public void cleanRoom(){
        isDirty = false;
    }


}