package org.example;

interface MyInterface {
    default void display() {
        System.out.println("Default method in interface.");
    }
}

class MyClass implements MyInterface {

    void myownmethode(){
        System.out.println("this is my own methode");
    }
}



