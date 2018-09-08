package geometryfigures;

/**
 * @version  07 septiembre 2018
 * @author Roibin
 * 
 */
public class Rectangle {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;
    
    public Rectangle(){
        
    }

    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public Point getPoint4() {
        return point4;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public void setpoint4(Point point4) {
        this.point4 = point4;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "point1=" + point1 + ", point2=" + point2 + ", point3=" + point3 + ", point4=" + point4 + '}';
    }

    
    
    
    
    
}
