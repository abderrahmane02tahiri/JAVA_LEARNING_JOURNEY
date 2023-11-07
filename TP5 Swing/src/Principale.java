import javax.swing.*;

public class Principale {
    JFrame fe;
    JMenu menu_Fichier, menu_Aficher, menu_Apropos;
    JMenuBar menuBar;
    JMenuItem ienregistrer, iquitter, iajouter, iafficher, iapropos;

    public void demarrer() {
        fe = new JFrame("Application");
        fe.setSize(800, 600);
        fe.setLayout(null);
        fe.setVisible(true);
        fe.setIconImage(new ImageIcon("C://Users//PC//Pictures//Saved Pictures//3.jpg/").getImage());


        JMenuItem ienregistrer = new JMenuItem("Enregistrer");
        JMenuItem iquitter = new JMenuItem("Quitter");
        JMenuItem iajouter = new JMenuItem("Ajouter");
        JMenuItem iafficher = new JMenuItem("Afficher");
        JMenuItem iapropos = new JMenuItem("Apropos");


        menuBar = new JMenuBar();


        menu_Fichier = new JMenu("Fichier");
        menu_Aficher = new JMenu("Aficher");
        menu_Apropos = new JMenu("Aide");

        menu_Fichier.add(ienregistrer);
        menu_Fichier.addSeparator();
        menu_Fichier.add(iquitter);

        menu_Aficher.add(iafficher);
        menu_Aficher.add(iajouter);

        menu_Apropos.add(iapropos);

        menuBar.add(menu_Fichier);
        menuBar.add(menu_Aficher);
        menuBar.add(menu_Apropos);

        fe.setJMenuBar(menuBar);


    }
}
