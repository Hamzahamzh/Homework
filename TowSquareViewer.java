import javax.swing.*;

public class TowSquareViewer {
    public static void main(String[] args) {
        JFrame x=new JFrame("My frame");
        x.setSize(900,900);
        TowSquareComponents v=new TowSquareComponents();
        x.add(v);
        x.setVisible(true);
        x.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }
}
