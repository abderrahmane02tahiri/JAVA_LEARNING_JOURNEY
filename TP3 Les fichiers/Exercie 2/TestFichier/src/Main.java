public class Main {
    public static void main(String[] args) {
        // Création d'une instance de TestFichier avec un fichier existant
    TestFichier testFichier = new TestFichier("C:\\Users\\PC\\Documents\\monDossier\\fichier.txt");

        // Ajout de texte au fichier
        testFichier.modifier("Nouvelle ligne de texte ajoutée.");

        // Affichage du contenu du fichier
        System.out.println("Contenu du fichier :");
        testFichier.afficher();

        // Copie du fichier vers une autre adresse
        testFichier.copierColler("chemin/vers/copieMonFichier.txt");
    }
}
