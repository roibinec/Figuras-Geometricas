package geometryfigures;

/**
 * @version  07 septiembre 2018
 * @author Roibin
 * 
 */
public class TestFigure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Point point = new Point(4, 5);
        Rectangle rectangle = new Rectangle(point, point, point, point);
        System.out.println(point);
        System.out.println(rectangle);
        
    }
    
}
