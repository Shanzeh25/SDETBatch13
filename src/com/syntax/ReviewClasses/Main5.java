package com.syntax.ReviewClasses;

class Main5 {

    static String maxLength(String[] arr) {



        String x=arr[0];
       int j=0;
        for( int i = 0; i < arr.length; i = j)
        {
            for( j =i+1; j < arr.length; j++)
            {
                if(x.length() < arr[j].length())
                {
                    x = arr[j];
                    break;
                }
            }
            }
           return x;

}
    public static void main(String[] args) {
        String[] arr = {"hey","yolo ","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }

}
