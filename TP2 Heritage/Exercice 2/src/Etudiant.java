import java.util.Calendar;
import java.util.Date;

public class Etudiant implements Personne {

    private int numSom;
    private String nom;
    private String prenom;
    private Date dateNaissance;

    public Etudiant() {
        this.numSom = 0;
        this.nom = "";
        this.prenom = "";
        this.dateNaissance = new Date();
    }

    public Etudiant(int numSom, String nom, String prenom, Date dateNaissance) {
        this.numSom = numSom;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public int getNumSom() {
        return numSom;
    }

    public void setNumSom(int numSom) {
        this.numSom = numSom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public int calculerAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - dateNaissance.getYear();
    }

    public boolean estFrerede(Personne personne) {
        if (personne instanceof Etudiant) {
            Etudiant autreEtudiant = (Etudiant) personne;
            return this.nom.equals(autreEtudiant.getNom());
        }
        return false;
    }

}
