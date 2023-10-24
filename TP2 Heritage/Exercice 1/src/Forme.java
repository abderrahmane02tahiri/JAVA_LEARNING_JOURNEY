public abstract class Forme {
   // LES ATTRIBUTS
   private float X ;
   private float Y ;

    //LES METHODES

    // constructeur par defaut
    public Forme(){}
    // constructeur par argument
    public Forme(float x , float y){
        this.X=x;
        this.Y=y;
    }

    public void setX(float x) {
        X = x;
    }

    public void setY(float y) {
        Y = y;
    }

    public float getX() {
        return X;
    }

    public float getY() {
        return Y;
    }
    public void deplacer( float a , float b){
        X=a;
        Y=b;
    }
    public abstract float surface();
    public abstract float perimeter();
    @Override
    public String toString() {
        return "Forme: X=" + X + ", Y=" + Y;
    }

}
