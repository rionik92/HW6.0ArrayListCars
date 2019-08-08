package com.company;

public class Car implements Comparable<Car> {

    private String model;
    private Integer year;
    private double volume;

    public Car(String model, int year, double volume) {
        this.model = model;
        this.year = year;
        this.volume = volume;
    }

    @Override
    public int compareTo(Car y) {
        int result = this.year.compareTo(y.year);
        return result;
    }

    public String toString() {
        return "Year= " + year +
                ", Volume= '" + volume + "'" +
                ", Model= '" + model + "'";
    }
}
