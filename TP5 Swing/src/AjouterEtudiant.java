import javax.swing.*;
import java.awt.*;

public class AjouterEtudiant {
    private JPanel panel;
    private JLabel nomLabel, prenomLabel, dateNaissanceLabel, emailLabel, motDePasseLabel, cneLabel, genreLabel, paysLabel, diplomesLabel, photoLabel;
    private JTextField nomField, prenomField, dateNaissanceField, emailField, cneField;
    private JPasswordField motDePasseField;
    private JRadioButton hommeRadioButton, femmeRadioButton;
    private ButtonGroup genreButtonGroup;
    private JComboBox<String> paysComboBox, diplomesComboBox;
    private JButton choisirPhotoButton, effacerButton, enregistrerButton;

    public AjouterEtudiant() {
        panel = new JPanel();
        // Création des composants
        nomLabel = new JLabel("Nom");
        nomField = new JTextField(20);

        prenomLabel = new JLabel("Prénom");
        prenomField = new JTextField(20);

        dateNaissanceLabel = new JLabel("Date de Naissance");
        dateNaissanceField = new JTextField(20);

        emailLabel = new JLabel("Email");
        emailField = new JTextField(20);

        motDePasseLabel = new JLabel("Mot de passe");
        motDePasseField = new JPasswordField(20);

        cneLabel = new JLabel("CNE");
        cneField = new JTextField(20);

        genreLabel = new JLabel("Genre");
        hommeRadioButton = new JRadioButton("Homme");
        femmeRadioButton = new JRadioButton("Femme");

        genreButtonGroup = new ButtonGroup();
        genreButtonGroup.add(hommeRadioButton);
        genreButtonGroup.add(femmeRadioButton);

        paysLabel = new JLabel("Pays");
        String[] pays = {"QATAR", "PALENSTINE", "MAROR"};
        paysComboBox = new JComboBox<>(pays);

        diplomesLabel = new JLabel("Diplômes");
        String[] diplomes = {"Licence","Cycle d'ingenieur", "Master", "Doctorat"};
        diplomesComboBox = new JComboBox<>(diplomes);

        photoLabel = new JLabel("Photo");
        choisirPhotoButton = new JButton("Choisir Photo");

        effacerButton = new JButton("Effacer");
        enregistrerButton = new JButton("Enregistrer");

        // Ajout des composants au panel
        panel.add(nomLabel);
        panel.add(nomField);

        panel.add(prenomLabel);
        panel.add(prenomField);

        panel.add(dateNaissanceLabel);
        panel.add(dateNaissanceField);

        panel.add(emailLabel);
        panel.add(emailField);

        panel.add(motDePasseLabel);
        panel.add(motDePasseField);

        panel.add(cneLabel);
        panel.add(cneField);

        panel.add(genreLabel);
        panel.add(hommeRadioButton);
        panel.add(femmeRadioButton);

        panel.add(paysLabel);
        panel.add(paysComboBox);

        panel.add(diplomesLabel);
        panel.add(diplomesComboBox);

        panel.add(photoLabel);
        panel.add(choisirPhotoButton);

        panel.add(effacerButton);
        panel.add(enregistrerButton);



        panel.setLayout(new GridLayout(0, 2));
        panel.setSize(700,300);
        panel.setVisible(true);
    }

    public JPanel getPanel() {
        return panel;
    }
}
