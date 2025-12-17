package mediatheque.service;
import mediatheque.model.*;
import java.util.*;
public class Mediatheque {
     private final int CAPACITE_TAB;
    // private Media[] medias;
    private List<Media> medias=new ArrayList<>();
    private int nbMedias;
    public Mediatheque(int capacite){
        CAPACITE_TAB=capacite;
        // medias=new Media[CAPACITE_TAB];
        this.nbMedias=0;
    }
    public void ajouterMedia(Media m){
        if(nbMedias<CAPACITE_TAB)
            this.medias.add(m);
        else
            throw new ArrayIndexOutOfBoundsException("Table is completed");
    }
    public void afficherCatalogue(){
        for(Media media: this.medias)
            media.afficherInfos();
    }
    public Media chercherParTitre(String titre){
        for(Media media: this.medias){
            if(media.getTitre().equals(titre))
                return media;
        }
        return null;
    }
}
