package org.example;

public class Test {
    public static void main(String[] args) {
        GreateClass greateObject =new GreateClass();
//        GreatClass.Smallclass smallclass=new GreateClass.Smallclass();
//        smallclass.smallMethode();
        GreateClass.Smallclass smallObject=greateObject.new Smallclass();
        smallObject.smallMethode();
        String title= """
           **---------------------------------------------**
            Test de nouvelle fonctionnalité sur les String
           **---------------------------------------------**
           
                """;
        System.out.println(" Test de la methode get classe "+smallObject.getClass().getName());

        System.out.println(title);

        String input = "Hello\nWorld!";
        System.out.println(input);

        System.out.println("------------------------------------");
        String configData = "File path: C:\\\\Documents\\\\MyFiles\\nEnd of file.";
        System.out.println(configData);  // Affiche littéralement: C:\\Documents\\MyFiles\nEnd of file
        System.out.println(configData.translateEscapes());

        System.out.println("---------------------------------------------");


        Sousclass r =new Sousclass(2, 3);
        r.TestMethode();
        int a=r.getA();
        System.out.println(a);

//        MyClass myClass = new MyInterface();


      String s=  """
               Une interface ne peut pas etre implémenter meme si toutes ses methhodes sont des methode par defaut 
                """;

      System.out.println(s);
        MyClass myClass = new MyClass();

        myClass.display();

        MyInterface myclass=new MyClass();

        // -----------------------------------------------------------------------------
        String Stg= """
                ------------------------------
                On va tester ici le nombre d'instance d'une classe
                
                -----------------------------
                """;

        System.out.println(s);


        NumberInstance Inst1=new NumberInstance();
        Inst1.GetNumberInstance();
        Inst1.GetNumberInstance();

        NumberInstance Inst2=new NumberInstance();
        Inst2.GetNumberInstance();

        NumberInstance Inst3=new NumberInstance();
        Inst3.GetNumberInstance();




    }




}

