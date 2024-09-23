package org.example;

public class VitessExecution {

    public static String S1="S";
    public static String S2="T";


    //    Dans ce programme nous allons comparer deux la vitesse d execution de deux programmes
    public static void main(String[] args) {

        long Startime1=System.nanoTime();

        WithStringBuilder();

        long Endtime1=System.nanoTime();

        long executiontime1=(Startime1-Endtime1)/1_000_000;

        System.out.println("Le temps d'execution en utilisant String buider est : "+executiontime1);

    }

    private static void WithStringBuilder() {

        StringBuilder S3=new StringBuilder();


        // Example task: a simple loop

        for (int i = 0; i < 10; i++) {
            S3.append(S1).append(" ").append(S3);
        }
    }

    private static void WithoutStringBuilder() {
        // Example task: a simple loop
        String S3;
        for (int i = 0; i < 10; i++) {
            S3=S1+" "+S2;

        }
    }
}
