import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class InformationEtudiant extends Frame implements ActionListener {

    TextField nomField, prenomField, dateNaissanceField, gmailField;
    TextField passwordField;
    Checkbox hommeCheckbox, femmeCheckbox;
    Choice paysChoice;
    TextArea commentaireArea;
    Button effacerButton, enregistrerButton;

    public InformationEtudiant() {
        setLayout(new GridLayout(11, 2));

        Label nomLabel = new Label("Nom:");
        nomField = new TextField(20);

        Label prenomLabel = new Label("Prénom:");
        prenomField = new TextField(20);

        Label dateNaissanceLabel = new Label("Date de naissance (jj/mm/aaaa):");
        dateNaissanceField = new TextField(20);

        Label gmailLabel = new Label("Gmail:");
        gmailField = new TextField(20);

        Label passwordLabel = new Label("Mot de passe:");
        passwordField = new TextField(20);

        Label genreLabel = new Label("Genre:");
        CheckboxGroup g = new CheckboxGroup();
        hommeCheckbox = new Checkbox("Homme ", g ,true);
        femmeCheckbox = new Checkbox("Femme", g ,false);

        Label paysLabel = new Label("Pays:");
        paysChoice = new Choice();
        paysChoice.add("Sélectionner un pays");
        paysChoice.add("Maroc");
        paysChoice.add("Canada");
        paysChoice.add("États-Unis");
        paysChoice.add("Palestine");
        paysChoice.add("Autre");

        Label commentaireLabel = new Label("Commentaire:");
        commentaireArea = new TextArea(4, 20);

        Label photoLabel = new Label("Photo:");
        Button choisirFichierButton = new Button("Choisir un fichier");

        effacerButton = new Button("Effacer");
        effacerButton.setBackground(Color.YELLOW);

        enregistrerButton = new Button("Enregistrer");
        enregistrerButton.setBackground(Color.GREEN);

        add(nomLabel);
        add(nomField);
        add(prenomLabel);
        add(prenomField);
        add(dateNaissanceLabel);
        add(dateNaissanceField);
        add(gmailLabel);
        add(gmailField);
        add(passwordLabel);
        add(passwordField);
        add(genreLabel);
        add(hommeCheckbox);
        add(new Label());
        add(femmeCheckbox);
        add(paysLabel);
        add(paysChoice);
        add(commentaireLabel);
        add(commentaireArea);
        add(photoLabel);
        add(choisirFichierButton);
        add(effacerButton);
        add(enregistrerButton);

        enregistrerButton.addActionListener(this);
        effacerButton.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        setTitle("Enregistrement des informations des étudiants");
        setSize(400, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enregistrerButton) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("student_information.txt", true));
                writer.write("Nom: " + nomField.getText() + "\n");
                writer.write("Prénom: " + prenomField.getText() + "\n");
                writer.write("Date de naissance: " + dateNaissanceField.getText() + "\n");
                writer.write("Gmail: " + gmailField.getText() + "\n");
                
                writer.write("\n\n\n"); 
                writer.close();
                System.out.println("Informations enregistrées avec succès !");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == effacerButton) {
            nomField.setText("");
            prenomField.setText("");
            dateNaissanceField.setText("");
            gmailField.setText("");
            passwordField.setText("");
            hommeCheckbox.setState(false);
            femmeCheckbox.setState(false);
            paysChoice.select(0);
            commentaireArea.setText("");
        }
    } }
