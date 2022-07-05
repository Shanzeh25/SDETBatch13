package com.syntax.ReviewClasse09;

import java.util.Objects;

public class Bicycle {
    String make;
    int gears;

    public Bicycle(String make, int gears, int maxSpeed) {
        this.make = make;
        this.gears = gears;
        this.maxSpeed = maxSpeed;
    }

    int maxSpeed;

    void ride (){
        System.out.println("Its time to drive bicycles");
    }
    void applyBreaks(){
        System.out.println("Applying brakes");
    }

    //type toString and select the second option to generate this method automatically
    @Override
    public String toString() {
        return "Bicycle{" +
                "make='" + make + '\'' +
                ", gears=" + gears +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return gears == bicycle.gears && maxSpeed == bicycle.maxSpeed && Objects.equals(make, bicycle.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, gears, maxSpeed);
    }
}

class MountainBikes extends Bicycle{
    boolean suspension=true;
    int seatHeight;

    public MountainBikes(String make, int gears, int maxSpeed,int seatHeight) {
        super(make, gears, maxSpeed);
        this.seatHeight=seatHeight;

    }

    void setSeatHeight(int seatHeight){
       this.seatHeight=seatHeight;
    }
}

class Test {
    public static void main(String[] args) {
        Bicycle bicycle=new Bicycle("TREK",4,30);
        Bicycle bicycle2=new Bicycle("TREK",4,30);
        //System.out.println(bicycle==bicycle2); //we should never use == sign to compare non-primitive data types
        System.out.println(bicycle.equals(bicycle2));
        System.out.println(bicycle);

    }
}