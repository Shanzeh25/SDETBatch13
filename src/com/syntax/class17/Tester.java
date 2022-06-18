package com.syntax.class17;

import com.syntax.class16.AccessModifiersDemo1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        AccessModifiersDemo1 ac = new AccessModifiersDemo1();
        // System.out.println(ac.password); error because its private
        String str = new String();// we don't see any import because this class
        // is present inside the java.lang
        //all teh classes inside java.lang package are imported by default for you

        System.out.println(ac.name);
        Employee emp = new Employee();
        Scanner scanner = new Scanner(System.in);

    }
}
