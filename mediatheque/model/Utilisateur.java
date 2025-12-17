package mediatheque.model;
public class Utilisateur implements Affichable{
    private String nom;
    private String prenom;
    private int age;
    public Utilisateur(String nom,String prenom,int age){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String Prenom){
        this.prenom=Prenom;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getIdente(){
        return this.getPrenom()+" "+this.getNom();
    }
    @Override
    public void afficherInfos(){
        System.out.println("Nom: "+getNom()+"\n"+
        "Prenom: "+getPrenom()+"\n"+
        "Age: "+getAge());
    }
}
