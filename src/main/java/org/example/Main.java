package org.example;

public class Main {
    public static void main(String[] args) {
        //****************************Les variables***************************************
        // Les types de valeurs:
        // Les type primitives
        int a=5;
        int b=a;
        // Changement de la valeur de b
        b=10;
        System.out.println("La valeur de a est "+a);
        System.out.println("La valeur de b est "+b);

        //*********************Passaage par référence***********************
        Car car1=new Car("ROUGE");
        Car car2=car1;
//        System.out.println("La couleur de la voiture 1 est : "+car1.getColor());

        //Modification de la de valeur

        car2.setColor("Bleu");

        System.out.println("************************Après modifications***************************\n");
//        System.out.println("La nouvelle couleur de la voiture 1 est :"+ car1.getColor());

        Car  car3=new Car("Orange");
        Car car4=new Car("Orange");

//        System.out.println("Les deux objet ont le meme contenu mais pas egale");

        System.out.println(car3==car4);

        Car car5=new Car("Noir");
        Car car7=new Car();


        System.out.println("La couleur de la voiture "+car5.getColor());
        System.out.println("La couleur de la voiture "+car5.RecupColor());

        System.out.println("Test de this"+car5.getinstance().toString());




        Integer Age=GetAgeAsInt(false);
        Integer age=GetAgeAsInteger(false);




    }

    public static Integer GetAgeAsInteger(boolean AvailialeAge){
        if (AvailialeAge){
            return 25;
        }
        else {
            return null;
        }
    }

    public static int GetAgeAsInt(boolean AvailiableAge){
        if (AvailiableAge){
            return 25;
        }
        else {
            return 0;
        }
    }

}