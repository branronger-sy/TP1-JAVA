package mediatheque.ui;
import java.util.Scanner;
import mediatheque.model.*;
import mediatheque.service.Mediatheque;
public class TestMediatheque {
    public static void main(String [] args){
        Mediatheque mediatheque=new Mediatheque(10);
        Livre livre1=new Livre("HANNIBAL",1955,"JEAN DISRETI",5012);
        Livre livre2=new Livre("POLITICS IN THE ROAD",2030,"ISSAM AFJDGHIGH",15921);
        Livre livre3=new Livre("KABAMA",1988,"LEONARDO MAMITA",503);
        Livre livre4=new Livre("GAME OF THRONES",1991,"GEORGE R R MARTIN",19827);
        Dvd dvd1=new Dvd("LOST",2003,"ANONYMOUS",812);
        Dvd dvd2=new Dvd("INCEPTION",2007,"SOMEONE",130);
        Dvd dvd3=new Dvd("THE GODFATHER",1981,"QUELQU'UN",200);
        Dvd dvd4=new Dvd("FILM HNA",2009,"CHI WA7D",109);
        mediatheque.ajouterMedia(livre1);
        mediatheque.ajouterMedia(livre2);
        mediatheque.ajouterMedia(livre3);
        mediatheque.ajouterMedia(livre4);
        mediatheque.ajouterMedia(dvd1);
        mediatheque.ajouterMedia(dvd2);
        mediatheque.ajouterMedia(dvd3);
        mediatheque.ajouterMedia(dvd4);
        Utilisateur user1=new Utilisateur("Afjdghigh","ISSAM",20);
        Utilisateur user2=new Utilisateur("Afjdghigh","IMRANE",12);
        Utilisateur user3=new Utilisateur("Afjdghigh","ADNANE",10);
        boolean estTerminer=false;
        Scanner scanner=new Scanner(System.in);
        int choix;
while (!estTerminer) {
    System.out.println("\n===== MENU =====");
    System.out.println("1 - Afficher le catalogue");
    System.out.println("2 - Emprunter un media");
    System.out.println("3 - Retourner un media");
    System.out.println("0 - Quitter");
    System.out.print("Votre choix : ");

    choix = scanner.nextInt();
    scanner.nextLine();

    switch (choix) {

        case 1:
            mediatheque.afficherCatalogue();
            break;

        case 2:
            System.out.print("Titre du media à emprunter : ");
            String titreEmp = scanner.nextLine();

            System.out.print("Nom de l'utilisateur : ");
            String nom = scanner.nextLine();

            System.out.print("Prénom de l'utilisateur : ");
            String prenom = scanner.nextLine();

            System.out.print("Age : ");
            int age = scanner.nextInt();
            scanner.nextLine();

            Utilisateur u = new Utilisateur(nom, prenom, age);

            Media mEmp = mediatheque.chercherParTitre(titreEmp);
            if (mEmp != null) {
                if (mEmp instanceof Livre) {
                    ((Livre) mEmp).emprunter(u);
                } else if (mEmp instanceof Dvd) {
                    ((Dvd) mEmp).emprunter(u);
                } else {
                    System.out.println("Ce type de media ne peut pas être emprunté !");
                }
            } else {
                System.out.println("Media introuvable !");
            }
            break;

        case 3:
            System.out.print("Titre du media à retourner : ");
            String titreRet = scanner.nextLine();

            Media mRet = mediatheque.chercherParTitre(titreRet);
            if (mRet != null) {
                if (mRet instanceof Livre) {
                    ((Livre) mRet).retourner();
                } else if (mRet instanceof Dvd) {
                    ((Dvd) mRet).retourner();
                } else {
                    System.out.println("Ce type de media ne peut pas être retourné !");
                }
            } else {
                System.out.println("Media introuvable !");
            }
            break;

        case 0:
            estTerminer = true;
            System.out.println("Au revoir");
            break;

        default:
            System.out.println("Choix invalide !");
    }
}

scanner.close();
        System.out.println("Test affichable");
        Affichable affichables[]=new Affichable [4];
        affichables[0]=new Dvd("OPENHEIMER", 2024, "CHRISTOPHER NOLAN", 140);
        affichables[1]=new Utilisateur("AFJDGHIGH", "IMRANE", 12);
        affichables[2]=new Utilisateur("AFJDGHIGH", "ADNANE", 10);
        affichables[3]=new Livre("THUS SPOKE ZRADIJT", 2023, "UNKNOWN AUTHOR", 12345);
        Afficheur.afficherTout(affichables);
        }
    }