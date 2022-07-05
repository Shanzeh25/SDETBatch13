package com.syntax.ReviewClasses;

public class Main1 {
    static char thirdLetter(String s) {
        char x = 0;
        for (int i = 0; i < s.length(); i += 3) {
            x = (s.charAt(i));

        }

        return x;


    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}

