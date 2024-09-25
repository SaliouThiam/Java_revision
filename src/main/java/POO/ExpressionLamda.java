package POO;

@FunctionalInterface
public interface ExpressionLamda {


    void Mybstractmrthode();


    /*
    Une interface fonctionnelle ne peut pas avoir plus d'une méthode abstraite. Si plusieurs méthodes abstraites sont définies
      dans l'interface, celle-ci ne sera pas une interface fonctionnelle.
      Les méthodes publiques de la classe Object peuvent cependant être redéfinies dans une interface fonctionnelle.
     */
    boolean equals(Object o);

    /*
    Ci-dessous, bien que la méthode clone() soit déclarée dans la classe Object, l'interface fonctionnelle ne compile pas car la
méthode clone() de la classe Object est déclarée protected et non public
     */

    // Object clone();

    default void mydefaulmethode( int a){
        System.out.println("This is my default methode......"+a);
    }
}
