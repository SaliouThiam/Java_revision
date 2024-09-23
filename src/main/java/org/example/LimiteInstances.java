package org.example;

public class LimiteInstances {
    // Variable statique pour compter les instances
    private static int nombreInstances = 0;
    // Limite maximale d'instances
    private static final int LIMITE_INSTANCES = 5;

    // Constructeur
    public LimiteInstances() {
        // Vérification avant de créer une nouvelle instance
        if (nombreInstances >= LIMITE_INSTANCES) {
            throw new RuntimeException("Nombre maximum d'instances (" + LIMITE_INSTANCES + ") atteint.");
        }
        // Incrémenter le compteur si la limite n'est pas atteinte
        nombreInstances++;
        System.out.println("Instance " + nombreInstances + " créée : " + this.toString());
    }

    // Méthode statique pour obtenir le nombre d'instances créées
    public static int getNombreInstances() {
        return nombreInstances;
    }

    public static void main(String[] args) {
        try {
            // Création de 6 instances pour tester la limite
            LimiteInstances instance1 = new LimiteInstances();
            LimiteInstances instance2 = new LimiteInstances();
            LimiteInstances instance3 = new LimiteInstances();
            LimiteInstances instance4 = new LimiteInstances();
            LimiteInstances instance5 = new LimiteInstances();
            LimiteInstances instance6 = new LimiteInstances();  // Cette création échouera
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());  // Affiche "Nombre maximum d'instances (5) atteint."
        }
    }
}
