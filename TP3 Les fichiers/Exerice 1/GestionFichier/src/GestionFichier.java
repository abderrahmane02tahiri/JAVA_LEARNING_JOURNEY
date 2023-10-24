import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GestionFichier {
    private String adress;

    // Constructeur par défaut
    public GestionFichier() {
        this.adress = "C:\\Users\\PC\\Documents";
    }

    // Constructeur avec argument
    public GestionFichier(String adress) {
        this.adress = adress;
    }

    // Getter pour l'attribut "adress"
    public String getAdress() {
        return adress;
    }

    // Setter pour l'attribut "adress"
    public void setAdress(String adress) {
        this.adress = adress;
    }

    // Méthode pour créer un fichier
    public void creeFichier(String nomFichier) {
        File file = new File(adress + File.separator + nomFichier);
        if (file.exists()) {
            System.out.println("Impossible : Le fichier existe déjà.");
        } else {
            try {

               if (file.createNewFile()) {
                    System.out.println("Fichier créé avec succès.");
                } else {
                    System.out.println("Impossible : Erreur lors de la création du fichier.");
                }
            } catch (IOException e) {
                System.out.println("Impossible : Erreur d'entrée/sortie.");
            }
        }
    }

    // Méthode pour créer un dossier
    public void creeDossier(String nomDossier) {
        File folder = new File(adress + File.separator + nomDossier);
        if (folder.exists()) {
            System.out.println("Impossible : Le dossier existe déjà.");
        } else {
            if (folder.mkdir()) {
                System.out.println("Dossier créé avec succès.");
            } else {
                System.out.println("Impossible : Erreur lors de la création du dossier.");
            }
        }
    }

    // Méthode pour supprimer un fichier ou un dossier
    public void supprimer(String nom) {
        File fileOrFolder = new File(adress + File.separator + nom);
        if (fileOrFolder.exists()) {
            if (fileOrFolder.delete()) {
                System.out.println("Supprimé avec succès.");
            } else {
                System.out.println("Impossible : Erreur lors de la suppression.");
            }
        } else {
            System.out.println("Impossible : Le fichier ou le dossier n'existe pas.");
        }
    }

    // Méthode pour lister les fichiers et dossiers dans l'adresse actuelle
    public void list() {
        File directory = new File(adress);
        File[] files = directory.listFiles();

        if (files != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

            System.out.println("NOM\t\t\t\t\t\t\t\t\t\t\t\tTYPE\t\t\t\t\t\t\t\t\tDATE MODIFICATION\t\t\t\t\t\t\t\t\tTAILLE");
            for (File file : files) {
                String type = file.isDirectory() ? "DOSSIER" : "FICHIER";
                String date = dateFormat.format(new Date(file.lastModified()));
                long size = file.isDirectory() ? 0 : file.length();

                System.out.println(file.getName() + "\t\t\t\t\t\t\t\t\t\t\t\t" + type + "\t\t\t\t\t\t\t\t\t" + date + "\t\t\t\t\t\t\t\t\t" + size);
            }
        } else {
            System.out.println("Impossible : L'adresse n'est pas un dossier.");
        }
    }
}
