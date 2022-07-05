package com.syntax.ReviewClasses;

public class Main4 {
    static String alphabetical (String str){

        String max=str.charAt(0)+"";

        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)<str.charAt(i)){

                max=max+str.charAt(i);
            }
        }
        return max;
    }

    public static void main(String []args){
        System.out.println(alphabetical("hello"));
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));
    }


}
