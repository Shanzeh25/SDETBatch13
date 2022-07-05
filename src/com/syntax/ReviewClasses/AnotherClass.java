package com.syntax.ReviewClasses;

class AnotherClass{

    private String method1(){
        return "private";
    }
    String method2(){
        return "default";
    }
    protected String method3(){
        return "protected";
    }
    public String method4(){
        return "public";
    }
}

class Main2{
    public static void main(String []args){
     AnotherClass main=new AnotherClass();
        System.out.println(main.method4());

    }


}
