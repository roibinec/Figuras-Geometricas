/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryfigures;

/**
 *
 * @author Fer
 */
public class Triangule {

    @Override
    public String toString() {
        return "Triangule{" + "point1=" + point1 + ", point2=" + point2 + ", point3=" + point3 + '}';
    }
   private Point point1;
   private Point point2;
   private Point point3;

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Triangule(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Triangule() {
    }
    
}
