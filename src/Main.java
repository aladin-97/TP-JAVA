//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Personne perso1= new Personne("Dupont","Jean",30,"10 rue de la Paix","01 23 45 67 89");
       Personne perso2= new Personne("Martin","Claire",25,"5 avenue des Champes-Elysées","06 12 34 56 78");

       System.out.println("Infos du 1eme personne");
       perso1.afficher();

       System.out.println("\nInfos du 2eme personne");
       perso2.afficher();

    }
}