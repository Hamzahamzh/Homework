import java.awt.*;

public class Q1 {
    public static void main(String[] args) {
        Rectangle s=new Rectangle(8,7);
        double x = 2*s.getWidth()+2*s.getHeight();
        System.out.println("Expected space = "+x);
        System.out.println("Actual space = "+(2*(8+7)));

    }}

