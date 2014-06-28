import javax.swing.*;
import java.awt.*;

/**
 * Created by chitrang3094 on 24-05-2014.
 */
public class Chart extends JComponent {
    public void paintComponent(Graphics g){
        g.fillRect(0,10,200,10);
        g.fillRect(0,30,300,10);
        g.fillRect(0,50,500,10);

    }
}
