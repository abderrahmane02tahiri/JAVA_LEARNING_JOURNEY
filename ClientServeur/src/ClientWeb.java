import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
import javax.swing.event.*;

public class ClientWeb {

    private JFrame fenetre;
    private JLabel labelAdresse;
    private JTextField champAdresse;
    private JButton boutonEnvoyer;
    private JButton boutonEffacer;
    private JEditorPane editorPane;

    public ClientWeb() {
        // Création des composants
        fenetre = new JFrame("Client Web HTTP");
        labelAdresse = new JLabel("Adresse:");
        champAdresse = new JTextField(20);
        boutonEnvoyer = new JButton("Envoyer");
        boutonEffacer = new JButton("Effacer");
        editorPane = new JEditorPane();
        editorPane.setEditable(false);
        editorPane.setContentType("text/html");

        // Ajout des composants à la fenêtre
        fenetre.setLayout(new GridLayout(4, 2));
        fenetre.add(labelAdresse);
        fenetre.add(champAdresse);
        fenetre.add(boutonEnvoyer);
        fenetre.add(boutonEffacer);
        fenetre.add(new JScrollPane(editorPane));

        // Ajout d'un gestionnaire d'évènement pour le bouton Envoyer
        boutonEnvoyer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String adresse = champAdresse.getText();
                try {
                    URL url = new URL(adresse);
                    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                    String inputLine;
                    StringBuilder content = new StringBuilder();
                    while ((inputLine = in.readLine()) != null) {
                        content.append(inputLine);
                    }
                    in.close();
                    editorPane.setText(content.toString());
                } catch (IOException ex) {
                    editorPane.setText("Erreur: Impossible de charger la page.");
                }
            }
        });

        // Ajout d'un gestionnaire d'évènement pour le bouton Effacer
        boutonEffacer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                champAdresse.setText("");
                editorPane.setText("");
            }
        });

        // Configuration et affichage de la fenêtre
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.pack();
        fenetre.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ClientWeb();
            }
        });
    }
}