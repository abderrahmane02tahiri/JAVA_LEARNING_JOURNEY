import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class TestFichier {
    private File fichier;

    // Constructeur par défaut
    public TestFichier() {
        this.fichier = null;
    }

    // Constructeur avec argument
    public TestFichier(String filePath) {
        this.fichier = new File(filePath);
    }

    // Méthode pour ajouter du texte au fichier
    public void modifier(String txt) {
        if (fichier != null) {
            try (FileWriter writer = new FileWriter(fichier, true);
                 BufferedWriter bufferWriter = new BufferedWriter(writer);
                 PrintWriter out = new PrintWriter(bufferWriter)) {
                out.println(txt);
            } catch (IOException e) {
                System.out.println("Impossible : Erreur d'écriture dans le fichier.");
            }
        } else {
            System.out.println("Impossible : Aucun fichier n'a été spécifié.");
        }
    }

    // Méthode pour afficher le contenu du fichier
    public void afficher() {
        if (fichier != null) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
             } catch (IOException e) {
                System.out.println("Impossible : Erreur de lecture du fichier.");
            }
        } else {
            System.out.println("Impossible : Aucun fichier n'a été spécifié.");
        }
    }

    // Méthode pour copier-coller le fichier vers une autre adresse
    public void copierColler(String adresse) {
        if (fichier != null) {
            File destinationFile = new File(adresse);
            try {
                Files.copy(fichier.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Copie terminée avec succès.");
            } catch (IOException e) {
                System.out.println("Impossible : Erreur lors de la copie du fichier.");
            }
        } else {
            System.out.println("Impossible : Aucun fichier n'a été spécifié.");
        }
    }
}
