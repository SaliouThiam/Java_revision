package org.example;

public class MyString {
    static String s1 =  "Bonjour" ;

    static String S3=new String("Bonjour").intern();
    static String s4=new String(s1);
    static String s2 =  "Bonjour" ;


    public static void main(String[] args) {
        System.out.println(s1==s2);
        boolean b=s1.intern()==s4.intern();
        boolean b1=s1==s4;


        System.out.println("Comparaison en utilisant interne "+b);

        System.out.println("Comparaison sans utilisation interne "+b1);

       System.out.println("Le premier est :"+new XInstance().getNbrInstance()+" \tLe deuxiem est :"+new XInstance().getNbrInstance());

    }

}
