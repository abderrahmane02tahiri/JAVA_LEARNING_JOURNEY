import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

    public class InformationEtudiant extends Frame implements ActionListener{
        TextField NomField , PrenomField , DateNaissanceField , GmailField  ;
        TextField PasswordField ;
        Checkbox hommeCheckbox, femmeCheckbox;
        Choice payschoice ;
        TextArea commentArea ;
        Button effacerButton , enregistrerButton ;
        public InformationEtudiant (){
            setLayout(new GridLayout(11,2));

            Label Nomlabel = new Label("Nom : ");
            NomField = new TextField(20) ;

            Label PrenomLabel = new Label("prenom : ") ;
            PrenomField =new TextField(20);

            Label DateNessance = new Label(" date de naissance dd/mm/yyyy :  ");
            DateNaissanceField = new TextField(20) ;

            Label gamailLabel = new Label(" Gmail : ") ;
            GmailField = new TextField(20) ;

            Label Passwordlabel = new Label(" Password : ") ;
            PasswordField =  new TextField(20);

            Label Genrelabel = new Label(" sexe : ");
            CheckboxGroup g = new CheckboxGroup();
            hommeCheckbox = new Checkbox("Homme" , g ,true);
            femmeCheckbox = new Checkbox("Femme" , g , false) ;


            Label Pays = new Label("pays : ") ;
            payschoice = new Choice();
            payschoice.add("Selectionner un pays");
            payschoice.add("Maroc");
            payschoice.add("Canada");
            payschoice.add("France");
            payschoice.add("Etats-Unis");
            payschoice.add("Australlie");
            payschoice.add("Autre");


            Label commentaireLabel = new Label("commentaire : ") ;
            commentArea = new TextArea(4,20) ;


            Label photolabel = new Label(" upload a photo  : ") ;
            Button ChoirePhoto = new Button("choisir un fichier ") ;

            effacerButton = new Button("Effacer") ;
            effacerButton.setBackground(Color.yellow);

            enregistrerButton = new Button("Enregistrer");
            enregistrerButton.setBackground(Color.GREEN);


            add(Nomlabel);
            add(NomField);
            add(PrenomLabel);
            add(PrenomField);
            add(DateNessance);
            add(DateNaissanceField);
            add(gamailLabel);
            add(GmailField);
            add(Passwordlabel);
            add(PasswordField);
            add(Genrelabel);
            add(hommeCheckbox);
            add(new Label());
            add(femmeCheckbox);
            add(Pays);
            add(payschoice);
            add(commentaireLabel);
            add(commentArea);
            add(photolabel);
            add(ChoirePhoto);
            add(effacerButton);
            add(enregistrerButton);


            enregistrerButton.addActionListener(this);
            effacerButton.addActionListener(this);

            addWindowFocusListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                    System.exit(0);
                }
            });
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                    dispose(); // Close the window
                }
            });




            setTitle("TP 4 les interface graphiques");
            setSize(400,700) ;
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == enregistrerButton) {
                try {
                 BufferedWriter writer = new BufferedWriter(new FileWriter("student_information.txt" , true));
                 writer.write("--> Nom: " + NomField.getText() + "\n");
                 writer.write("--> Prenom: " + PrenomField.getText() + "\n");
                 writer.write("--> Date de Naissance: " + DateNaissanceField.getText() + "\n");
                 writer.write("--> Gmail: " + GmailField.getText() + "\n");
                 writer.write("\n");
                 writer.write("**************************************************************");
                 writer.write("\n");
                 writer.close();
                 System.out.println(" Informations enregistrées avec succès ! ");
                }catch (IOException Error){
                    Error.printStackTrace();
                }
            } else if (event.getSource()==effacerButton) {
                NomField.setText("");
                PrenomField.setText("");
                DateNaissanceField.setText("");
                GmailField.setText("");
                PasswordField.setText("");
                hommeCheckbox.setState(false);
                femmeCheckbox.setState(false);
                payschoice.select(0);
                commentArea.setText("");
            }


        }
    }