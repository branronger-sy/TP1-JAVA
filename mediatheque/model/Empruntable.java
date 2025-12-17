package mediatheque.model;
public interface Empruntable {
    void emprunter(Utilisateur u);
    void retourner();
    boolean estEmprunte();
}