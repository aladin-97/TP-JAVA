public class Main {

    public static void main(String[] args) {

        // Création de deux instances de CompteBancaire
        Compte compte1 = new Compte("Ali", 2015, 1000);
        Compte compte2 = new Compte("Becher", 2018, 500);

        // Dépôt de 500 dinars sur le premier compte
        compte1.depot(500);

        // Dépôt de 1000 dinars sur le second compte
        compte2.depot(1000);

        // Retrait de 10 dinars sur le second compte
        compte2.retrait(10);

        // Virement de 75 dinars du premier compte vers le second
        compte1.virement(compte2, 75);

        // Affichage des détails des comptes
        System.out.println("Détails du compte 1:");
        compte1.afficher();
        System.out.println("\nDétails du compte 2:");
        compte2.afficher();

        // Création d'un tableau de 3 comptes
        Compte[] comptes = new Compte[3];
        comptes[0] = compte1;
        comptes[1] = compte2;
        comptes[2] = new Compte("Sarra", 2020, 2000);

        // Affichage du nombre total de comptes
        System.out.println("\nNombre total de comptes: " + Compte.getNbComptes());

        // Affichage du titulaire avec le solde le plus élevé
        System.out.println("Titulaire avec le solde le plus élevé: " + Compte.soldeMax(comptes));
    }

}