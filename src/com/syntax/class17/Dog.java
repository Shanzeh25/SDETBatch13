package com.syntax.class17;

public class Dog {

    String name;
    String breed;
    String color;
    int age;
    double weight;

    Dog(String dogName,String dogBreed,String dogColor,int dogAge,double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        if(dogAge<25){
            age=dogAge;
        }else{
            System.out.println("Dog age can not br greater than 30 ");
        }
        age=dogAge;
        weight=dogWeight;
    }
    void printInfo(){
        System.out.println("name "+breed+"Breed "+breed+"Color "+color+"Weight "+weight);
    }

    public static void main(String[] args) {
       /* Dog dog1=new Dog();
        dog1.name="Lofy";
        dog1.breed="German";
        dog1.color="Black";
        dog1.age=15;
        dog1.weight=20;
        dog1.printInfo();

        Dog dog2=new Dog();
        dog2.name="Gofu";
        dog2.breed="American";
        dog2.color="White";
        dog2.age=12;
        dog2.weight=15;
        dog2.printInfo();
        */
    }
}