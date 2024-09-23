package org.example;

public abstract class AbstractClass {
    private int a;
    private int b;
    public AbstractClass(int a, int b){
        this.a=a;
        this.b=b;
    }
    public abstract void TestMethode();

    public  int getA() {
        return a;
    };
}
