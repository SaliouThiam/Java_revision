package org.example;

public class TestBreakAvecEtiquette {
    public static void main(String args[]) {
        boolean saut = true;
        bloc1:
        {
            System.out.println("debut bloc1");
            bloc2:
            {
                System.out.println("debut bloc2");
                bloc3:
                {
                    System.out.println("debut bloc3");
                    if (saut) {
                        break bloc2;
                    }
                    System.out.println("fin bloc3");
                }
                System.out.println("fin bloc2");
            }
            System.out.println("fin bloc1");
        }
    }
    }