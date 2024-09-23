package org.example;

public class Person {
    private String Name;
    private int Age;
    public Person(String Name, int Age){
        this.Name=Name;
        this.Age=Age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public Person GetNumberInstance(){
        return Person.this;
    }
}
