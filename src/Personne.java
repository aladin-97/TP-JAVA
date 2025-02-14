public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private String adresse;
    private String telephone;

    // Constructeur Par Defaut
    public Personne() {
        this.nom = "";
        this.prenom = "";
        this.age = 0;
        this.adresse = "";
        this.telephone = "";
    }

    // Constructeur parametré
    public Personne(String nom, String prenom, int age, String adresse, String telephone){
        this.nom = nom;
        this.prenom = prenom;
        this.age =age;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    // NOM
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    // PRENOM
    public String getPrenom(){
        return prenom;
    }
    public void setPrneom(String prenom){
        this.prenom = prenom;
    }

    // AGE
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    // ADRESSE
    public String getAdresse(){
        return adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    // TELEPHONE
    public String getTelephone(){
        return telephone;
    }
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }

    //METHODE AFFICHER
    public void afficher(){
        System.out.println("Nom: " + this.nom);
        System.out.println("Prenom: " + this.prenom);
        System.out.println("Age: " + this.age);
        System.out.println("Adresse: " + this.adresse);
        System.out.println("Telephone: " + this.telephone);
    }
}
