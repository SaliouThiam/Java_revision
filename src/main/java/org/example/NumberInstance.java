package org.example;

public class NumberInstance {
    private  static NumberInstance Instance;
    private static int  i=1;
    private static int  applle=0;
    public void GetNumberInstance(){
//        int applle=0;

        if(Instance==null){
            System.out.println(" "+this.toString() +" est le premier instance");
            Instance=this;
        }

        if(this!=Instance) {
            i++;
            System.out.println(" " + this.toString() + " est le " + i + " ieme instance");
            Instance=this;
        }
        else{
            applle ++;
            System.out.println(" "+ applle +" ieme appelle de la methode par "+this +" qui est la "+i+" ieme instance");
        }



    }
}
