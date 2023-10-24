public class Main {
    public static void main(String[] args) {
        // Création d'une instance de GestionFichier avec un répertoire par défaut
        GestionFichier gestionFichier = new GestionFichier();

        // Création d'un fichier
        gestionFichier.creeFichier("monFichier.txt");


        // Création d'un dossier
        gestionFichier.creeDossier("monDossier");

        // Liste les fichiers et dossiers dans le répertoire actuel
        gestionFichier.list();

        // Suppression d'un fichier ou d'un dossier
        gestionFichier.supprimer("monFichier.txt");

        // Liste à nouveau les fichiers et dossiers dans le répertoire actuel
        gestionFichier.list();

    }
}
