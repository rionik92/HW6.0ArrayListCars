package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        ArrayList<Car> c = new ArrayList<>(10);
//
//        c.add(1, new Car("Toyota", 2005, 3.0));
//        c.add(2, new Car("Honda", 2003, 2.5));
//        c.add(3, new Car("Mercedes", 2002, 2.3));
//        c.add(4, new Car("Ford", 1995, 4.5));
//        c.add(5, new Car("Hundai", 2011, 2.0));
//        c.add(6, new Car("Chevrolet", 2000, 4.4));
//        c.add(7, new Car("Cadillac", 2015, 6.0));
//        c.add(8, new Car("BMW", 1993, 2.0));
//        c.add(9, new Car("Lada", 2010, 1.6));
//        c.add(10, new Car("Bentley", 2018, 5.0));
//
//        c.sort(Car::compareTo);
//        System.out.println(Car.class.toString());
//        System.out.println(c);

        Car c1 = new Car("Toyota", 2005, 3.0);
        Car c2 = new Car("Honda", 2003, 2.5);
        Car c3 = new Car("Mercedes", 2002, 2.3);
        Car c4 = new Car("Ford", 1995, 4.5);
        Car c5 = new Car("Hundai", 2011, 2.0);
        Car c6 = new Car("Chevrolet", 2000, 4.4);
        Car c7 = new Car("Cadillac", 2015, 6.0);
        Car c8 = new Car("BMW", 1993, 2.0);
        Car c9 = new Car("Lada", 2010, 1.6);
        Car c10 = new Car("Bentley", 2018, 5.0);
        ArrayList<Car> list = new ArrayList<>();

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);
        list.add(c7);
        list.add(c8);
        list.add(c9);
        list.add(c10);

        System.out.println("------------сортировка по году------------");
        list.sort(Car::compareTo);
        for (Car y : list) {
            System.out.println(y);
        }
    }
}