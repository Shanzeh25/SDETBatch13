package com.syntax.class15;

import com.sun.xml.internal.ws.api.pipe.TubelineAssembler;

public class Task2 {
    //Create a method that will take a number and prints
    //whether the number is even or odd.

    void printEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static void main(String[] args) {
        Task2 task2=new Task2();
        task2.printEvenOrOdd(15);


    }

}
