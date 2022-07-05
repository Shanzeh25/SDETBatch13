package com.syntax.ReviewClasses;

class Main3 {
    static String alphabetical (String str){
        str=str.toLowerCase();
        char max=str.charAt(0);
        String result=String.valueOf(str.charAt(0));
        for(int i=0;i<str.length();i++){
            if(max<str.charAt(i)){
                result+=String.valueOf(str.charAt(i));
                max=str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String []args){
        System.out.println(alphabetical("hello"));
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));
    }


}
