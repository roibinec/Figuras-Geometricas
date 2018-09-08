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
public class Line {

    public Line() {
    }

    public Line(Point pointStar, Point pointEnd) {
        this.pointStar = pointStar;
        this.pointEnd = pointEnd;
    }

    public Point getPointStar() {
        return pointStar;
    }

    public void setPointStar(Point pointStar) {
        this.pointStar = pointStar;
    }

    public Point getPointEnd() {
        return pointEnd;
    }

    public void setPointEnd(Point pointEnd) {
        this.pointEnd = pointEnd;
    }

    @Override
    public String toString() {
        return "Line{" + "pointStar=" + pointStar + ", pointEnd=" + pointEnd + '}';
    }
     private Point pointStar;
     private Point pointEnd;
     
}
