package geometryfigures;

/**
 * @version  07 septiembre 2018
 * @author Roibin
 * 
 */
public class Rectangle {
    private int point1;
    private int point2;
    private int point3;
    private int point4;
    
    public Rectangle(){
        
    }

    public Rectangle(int point1, int point2, int point3, int point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public int getPoint1() {
        return point1;
    }

    public int getPoint2() {
        return point2;
    }

    public int getPoint3() {
        return point3;
    }

    public int getPoint4() {
        return point4;
    }

    public void setPoint1(int point1) {
        this.point1 = point1;
    }

    public void setPoint2(int point2) {
        this.point2 = point2;
    }

    public void setPoint3(int point3) {
        this.point3 = point3;
    }

    public void setpoint4(int point4) {
        this.point4 = point4;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "point1=" + point1 + ", point2=" + point2 + ", point3=" + point3 + ", point4=" + point4 + '}';
    }
    
    
    
    
}
