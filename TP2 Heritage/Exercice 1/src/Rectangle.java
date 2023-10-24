public class Rectangle extends Forme {
private float largeur ;
private float longueur ;

    public float getLargeur() {
        return largeur;
    }

    public float getLongueur() {
        return longueur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }
    public Rectangle(){}
 public Rectangle(float a ,float b ,float la , float lo){
        super(a,b);
        largeur=la;
        longueur=lo;
 }
    @Override
    public float surface() {
        return this.longueur * this.largeur;
    }

    @Override
    public float perimeter() {
        return (this.longueur + this.largeur) ;
    }

    public String toString() {
        return "Rectangle: X=" + getX() + ", Y=" + getY() + ", largeur=" + largeur + ", longueur=" + longueur;
    }
}
