package org.example;

public class XInstance {
    private static int nbrInstance=0;
    public XInstance(){
        nbrInstance++;
    }
    public int getNbrInstance(){
        return nbrInstance;
    }
}
