package mediatheque.model;

public class Afficheur {
    public static void afficherTout(Affichable[] elements) {
        for (Affichable a : elements) {
            if (a != null) {
                a.afficherInfos();
            }
        }
    }
}