package mediatheque.model;
public class Livre extends Media implements Empruntable{
    private String auteur;
    private int nombreDePages;
    private Utilisateur emprunteur;
    public Livre(String titre, int annee, String auteur, int nombreDePages){
        super(titre,annee);
        this.auteur=auteur;
        this.nombreDePages=nombreDePages;
    }
    @Override
    public void afficherInfos(){
        System.out.println("Titre: "+super.titre+"\n"+
        "Annee: "+super.annee+"\nAuteur: "+this.auteur
        +"\nNombre de pages: "+this.nombreDePages+"\nDisponibilite: "+
        this.disponible);
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
