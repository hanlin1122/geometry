import java.util.*;

class Main {
  public static void main(String[] args) {
    test3();
  }
  public static String pointToString(Point p){
    String str = "(" + p.x + ", " + p.y + ")";
    return str;
  }
  public static void test1(Point p){
    p.x = 1.2;
    p.y = 3.4;
    System.out.println(pointToString(p));
  }
  public static double slope(LineSegment l){
    if(l.ptA.x - l.ptB.x == 0){
      return 0;
    }
    double slope = (l.ptA.y - l.ptB.y) / (l.ptA.x - l.ptB.x);
    return slope;
  }
  public static double length(LineSegment l){
    double length = Math.sqrt(Math.pow((l.ptA.y-l.ptB.y),2) - Math.pow((l.ptB.x-l.ptB.x),2));
    return length;
  }
  public static String lineSegmentToString(LineSegment l){
    String str = "";
    str += "Line Segment between " + pointToString(l.ptA) + " and " + pointToString(l.ptB) +  "with slope " + slope(l) + " and length " + length(l);

    return str;
  }
  public static void test2(){
    LineSegment l = new LineSegment();
    l.ptA = new Point();
    l.ptB = new Point();
    l.ptA.x = 0;
    l.ptB.x = 11;
    l.ptA.y = 1;
    l.ptB.y = 12;

    System.out.println(pointToString(l.ptA));
    System.out.println(pointToString(l.ptB));
    System.out.println(lineSegmentToString(l));
    System.out.println(lineSegmentToString(l));
  }
  public static double area(Rectangle r){
    double area = length(r.lineSegAB) * length(r.lineSegBC);
    return area;
  }
  public static String rectangleToString(Rectangle r){
    String str = "";
    str += "Rectangle with vertices " + pointToString(r.ptA) + ", " + pointToString(r.ptB) + ", " + pointToString(r.ptC) + ", " + pointToString(r.ptD) + " and area " + area(r);

    return str;
  }
  public static void shift(Rectangle r, double h, double k){
    r.ptA.x += h;
    r.ptA.y += k;
    
    r.ptB.x += h;
    r.ptB.y += k;

    r.ptC.x += h;
    r.ptC.y += k;

    r.ptD.x += h;
    r.ptD.y += k;
  }
  public static void test3(){
    Rectangle r = new Rectangle();
    r.ptA = new Point();
    r.ptA.x = 0;
    r.ptA.y = 0;
    
    r.ptB = new Point();
    r.ptB.x = 0;
    r.ptB.y = 2;
    
    r.ptC = new Point();
    r.ptC.x = 6;
    r.ptC.y = 2;
    
    r.ptD = new Point();
    r.ptD.x = 6;
    r.ptD.y = 0;
    shift(r, 2, 3);
    System.out.println(rectangleToString(r));
  }
  
  public static double calcArea(Point c, Point p) {
    double r = Math.sqrt(Math.pow((p.x - c.x), 2) + Math.pow((p.y - c.y) , 2));
    double area = Math.PI * Math.pow(r, 2);

    return area;
  }
}
