package mediatheque.model;
public class Dvd extends Media implements Empruntable{
    private String realisateur;
    private int dureeMinutes;
    private Utilisateur emprunteur;
    public Dvd(String titre,int annee,String realisteur, int dureeMinutes){
        super(titre,annee);
        this.realisateur=realisteur;
        this.dureeMinutes=dureeMinutes;
    }
    @Override
    public void afficherInfos(){
        System.out.println("Titre: "+super.titre+"\n"+
        "Annee: "+super.annee+"\nRealisateur: "+this.realisateur
        +"\nDuree Minutes: "+this.dureeMinutes);
    }
    @Override
    public void emprunter(Utilisateur u){
        if(u==null || !super.estDisponible())
            throw new IllegalArgumentException("Precondition non respecter");
        super.setDisponible(false);
        this.emprunteur=new Utilisateur(u.getNom(), u.getPrenom(), u.getAge());
    }
    @Override
    public boolean estEmprunte(){
        return !super.estDisponible() || this.emprunteur!=null;
    }
    @Override
    public void retourner(){
        if(!this.estEmprunte())
            throw new IllegalArgumentException("Precondition non respecter");
        super.setDisponible(true);
        this.emprunteur=null;
    }
}
