package com.syntax.ReviewClasses;

class Main {

    static String mixString(String a, String b)
    {


        String str = "";
        int len = 0;

        if (a.length() >= b.length())
        {
            len = a.length();
        } else
            len = b.length();


        for (int i = 0; i < len; i++)
        {

            if (i < a.length())
            {
                str += a.charAt(i);
            }

            if (i < b.length())
            {
                str += b.charAt(i);
            }

        }
        return str;
    }

    //test case below (dont change):
    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);

    }
}
