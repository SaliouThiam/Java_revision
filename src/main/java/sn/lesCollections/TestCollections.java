package sn.lesCollections;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {

        // Test sur les ArrayList
        /*
         *
         * - Il accepte les doublons
         * - Il est ordonné L.equal(M) retourne Falses
        * */
        ArrayList<Integer> L=new ArrayList<>();
        ArrayList<Integer> M=new ArrayList<>();
        L.add(1);
        L.add(2);
        L.add(3);

        // ------------------------------------------------------------
        M.add(3);
        M.add(2);
        M.add(1);

        // test des Hashset ( ensemble)
        /*
        - Ils ne sont pas ordonnés
        - Ils n'acceptent pas de doublons
         */
        HashSet<Integer> E=new HashSet<>();
        HashSet<Integer> E1=new HashSet<>();

        // ------------------------------------------------------------
        E.add(1);
        E.add(2);
        E.add(3);
        //------------------------------------------------------

        E1.add(3);
        E1.add(2);
        E1.add(1);

        // Test des Linked List

        LinkedList<String> fileAttente = new LinkedList<>();
        fileAttente.addLast("Client 1");
        fileAttente.addLast("Client 2");
//        fileAttente.removeFirst();  // Le Client 1 est servis
        fileAttente.addFirst("Client 1");
        fileAttente.add("Client 4");
        fileAttente.add("Client 4"); // Accepte les doublons
        fileAttente.add(null);; // Elle accepte les valeur nulles
        fileAttente.remove(); // ça supprime le premier element par defaut

// -----------------------------------------------------
// TREE SET (un ensemble mais trié (ordoné)
        TreeSet<Integer> classementScores = new TreeSet<>();
        classementScores.add(1200);
        classementScores.add(1500);
        classementScores.add(900);  // Ordonné automatiquement





//---------------
    int[] T=new int[10];
    int[] T1 ={1,2,3,2};
    System.out.println(Arrays.toString(T1));




        boolean b=E.equals(E1);
        System.out.println(b);
        for(String client:fileAttente) {
            System.out.println(client);
        }

    }
}
