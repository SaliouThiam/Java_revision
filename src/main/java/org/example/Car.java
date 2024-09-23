package org.example;

public class Car {
    private String color;
    private String model;


    public Car(String color,String model){

        this.color=color;
        this.model=model;
    }
    public Car(String color){
        this.color=color;
    }

    public Car(){}
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    public String getModel(){
        return  this.model;
    }
    public String RecupColor(){
        return color;
    }

    public Car getinstance(){
        return Car.this;
    }



}
