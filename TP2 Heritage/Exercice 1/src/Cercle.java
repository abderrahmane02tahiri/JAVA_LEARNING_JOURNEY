public class Cercle extends Forme {
    private float rayon ;

    public float getRayon() {
        return rayon;
    }

    public void setRayon(float rayon) {
        this.rayon = rayon;
    }
    public Cercle(){}

    public Cercle(float a , float b , float rayon){
        super(a,b);
        this.rayon=rayon;

    }
    @Override
    public float surface() {
        return (float) (Math.PI * rayon * rayon);
    }

    @Override
    public float perimeter() {
        return (float) (2 * Math.PI * rayon);
    }
    @Override
    public String toString() {
        return "Cercle: X=" + getX() + ", Y=" + getY() + ", rayon=" + rayon;
    }
}
