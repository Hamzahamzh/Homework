import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class TowSquareComponents extends JComponent {
    public  void paintComponent(Graphics g) {
        Rectangle v=new Rectangle(200,200,200,200);
        Graphics2D d1=(Graphics2D)g ;
        d1.fill(v);
        Rectangle2D.Double square1=new Rectangle2D.Double(35,40,300,300);
        d1.setColor(Color.pink);
        d1.fill(square1);

        Rectangle2D.Double square2=new Rectangle2D.Double(350,40,300,300);
        d1.setColor(Color.magenta);
        d1.fill(square2);



    }
}
