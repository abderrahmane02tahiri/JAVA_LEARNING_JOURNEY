import java.lang.Math;

class Point{
    double x , y;
    public Point(double x, double y){
        this.x = x ;
        this.y = y ;
    }

    public double distanceTO(Point p){
        return Math.sqrt(Math.pow(this.x - p.x,2) + Math.pow(p.y - this.y , 2));
    }
    public Point translate (double dx , double dy){
        return new Point(this.x + dx , this.y + dy);
    }


    public String toString() {
        return "(" + x + "," + y +")";
    }

}

class LineSegment{
    private Point point1 ;
    private  Point point2 ;

    public LineSegment(Point point1 , Point point2){
        this.point1 = point1 ;
        this.point2 = point2 ;
    }

    public double length(){
        return point1.distanceTO(point2) ;
    }
}


public class Main {
    public static void main(String[] args) {

        Point P1 = new Point (1,4);
        Point P2 = new Point (-3,-2);
        Point P3 = new Point (-6,-1);

        Point P4 =P2.translate(2,-3);


        double c = P1.distanceTO(P2);

        System.out.println("la distance entre p1 et p2 est :" +c);

        LineSegment S = new LineSegment(P1,P3);
        double l =S.length();

        System.out.println("la longueur du segment S est :" +l);
        System.out.println("les nouveaux cordonnes apres translation de point P3 sont :" +P4);



    }

}