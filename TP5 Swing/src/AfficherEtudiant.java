import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class AfficherEtudiant {
    private JPanel panel;
    private JTable etudiantTable;
    private JScrollPane scrollPane;

    public AfficherEtudiant() {
        panel = new JPanel();

        String[] TitreColomn = {"Nom", "Prénom", "Date de Naissance", "Email", "CNE", "Genre", "Pays", "Diplômes"};
        Object[][] data = {

                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},
                {"TAHIRI", "Abderrahmane", "10/30/2002", "abderra.tahiri@gmail.com", "ID108", "Homme", "MAROC", "Cycle d'ingenieur"},



        };


        DefaultTableModel model = new DefaultTableModel(data, TitreColomn);
        etudiantTable = new JTable(model);


        scrollPane = new JScrollPane(etudiantTable);
        panel.add(scrollPane);
        panel.setLayout(new BorderLayout());
        scrollPane.setSize(1000,333);
        scrollPane.setVisible(true);
    }

    public JScrollPane getPanel() {
        return scrollPane;
    }
}
