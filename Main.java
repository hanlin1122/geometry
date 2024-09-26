import java.util.*;

class Main {
  public static void main(String[] args) {
    
  }
  public static String pointToString(Point p){
    String str = "(" + p.x + ", " + p.y + ")";
    return str;
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
  public static double calcArea(Point c, Point p) {
    double r = Math.sqrt(Math.pow((p.x - c.x), 2) + Math.pow((p.y - c.y) , 2));
    double area = Math.PI * Math.pow(r, 2);

    return area;
  }
}
