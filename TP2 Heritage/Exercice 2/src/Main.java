import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Création d'un étudiant
        Etudiant etudiant1 = new Etudiant(1, "TAHIRI", "Abderrahmane", new Date(2002, 10, 30));

        // Calcul de l'âge de l'étudiant
        int age = etudiant1.calculerAge();
        System.out.println("L'étudiant  "+ etudiant1.getNom()+" "+etudiant1.getPrenom()+ " a " + age + " ans.");

        // Vérification de la relation de fraternité
        Etudiant etudiant2 = new Etudiant(2, "TAHIRI", "Ibrahim", new Date(2005, 11, 2));
        boolean estFrere = etudiant1.estFrerede(etudiant2);
        System.out.println("Les deux étudiants sont-ils frères ? " + estFrere);
    }
}
