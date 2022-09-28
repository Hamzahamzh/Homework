import java.awt.*;

public class Q4 {
    public static void main(String[] args) {
        Rectangle Box=new Rectangle(5,10,20,30);
        Box.add(0,0);
        System.out.println(Box);
        System.out.println("Actuol space= "+ (Box.getHeight()+Box.getWidth()));
        System.out.println("Expected space= "+(25+40));



    }
}
