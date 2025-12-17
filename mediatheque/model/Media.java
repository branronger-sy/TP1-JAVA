package mediatheque.model;
public abstract class Media implements Affichable{
    protected String titre;
    protected int annee;
    protected boolean disponible;
    Media(String titre,int annee){
        this.titre=titre;
        this.annee=annee;
        this.disponible=true;
    }
    public String getTitre(){
        return this.titre;
    }
    public boolean estDisponible(){
        return this.disponible;
    }
    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }
    public abstract void afficherInfos();
}