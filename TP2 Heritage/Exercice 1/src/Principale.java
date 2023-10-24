import java.util.ArrayList;
import java.util.List;

public class Principale {
    public static void main(String[] args) {
       //Forme forme1 = new Forme();
        //Une classe abstraite est une classe qui ne peut pas être instanciée directement.
        // Elle est conçue pour être utilisée comme classe de base pour d'autres classes dérivées
        Cercle cercle1 = new Cercle(5,4,3.5f);
        cercle1.setRayon(10);
        System.out.println("Centre du cercle: X=" + cercle1.getX() + ", Y=" + cercle1.getY());
        System.out.println("Surface du cercle: " + cercle1.surface());


        Rectangle rectangle1 = new Rectangle(5,4,7, 8);
        rectangle1.setLargeur(9);
        rectangle1.setLongueur(8);
        rectangle1.deplacer(2.5f, 3.5f);
        System.out.println("Emplacement du rectangle: X=" + rectangle1.getX() + ", Y=" + rectangle1.getY());
        System.out.println("Surface du rectangle: " + rectangle1.surface());

        /*
            Question : i
            •circle1 = rectangle1 ; type incompatible
            •rectangle1 = cercle1 ;  type incompatible
            • rectangle1 = form1 ;
            • cercle1 =forml ;
            • form1=rectanglel ;
            • form1=cerclel ;
            */


        List<Forme> listeFormes = new ArrayList<>();

        // Ajouter deux rectangles à la liste
        listeFormes.add(new Rectangle(1.9f,4.9f,8.4f, 3.7f));
        listeFormes.add(new Rectangle(1.3f,1.7f,2, 4.6f));

        // Ajouter deux cercles à la liste
        listeFormes.add(new Cercle(1,2,3f));
        listeFormes.add(new Cercle(1,6,8f));

        // Parcourir la liste et afficher la surface de chaque forme
        for (Forme forme : listeFormes) {
            System.out.println("Type de forme : " + forme.getClass().getSimpleName());
            System.out.println("Surface : " + forme.surface());
            System.out.println("Perimetre : " + forme.perimeter());
        }


    }

}