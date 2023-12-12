import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebClient extends JFrame {

    private JTextField urlField;
    private JEditorPane contentPane;

    public WebClient() {
        // Initialisation de la fenêtre
        super("Client Web HTTP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        // Création des composants
        JLabel urlLabel = new JLabel("URL:");
        urlField = new JTextField(20);
        JButton sendButton = new JButton("Envoyer");
        JButton clearButton = new JButton("Effacer");
        contentPane = new JEditorPane();
        contentPane.setContentType("text/html");

        // Ajout des composants à la fenêtre
        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.add(urlLabel);
        topPanel.add(urlField);
        topPanel.add(sendButton);
        topPanel.add(clearButton);
        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(contentPane), BorderLayout.CENTER);

        // Gestionnaire d'événements pour le bouton "Envoyer"
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String urlText = urlField.getText();
                if (!urlText.isEmpty()) {
                    // Envoyer la requête HTTP et afficher la réponse
                    try {
                        String response = sendHttpRequest(urlText);
                        contentPane.setText(response);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        contentPane.setText("Erreur lors de la récupération de la page.");
                    }
                }
            }
        });

        // Gestionnaire d'événements pour le bouton "Effacer"
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Effacer le contenu du JEditorPane et du champ d'URL
                contentPane.setText("");
                urlField.setText("");
            }
        });
    }

    // Méthode pour envoyer une requête HTTP GET et récupérer la réponse
    private String sendHttpRequest(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            return response.toString();
        } finally {
            connection.disconnect();
        }
    }

    // Méthode main pour tester la fenêtre
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WebClient().setVisible(true);
            }
        });
    }
}
