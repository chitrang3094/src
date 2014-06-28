import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by chitrang3094 on 22-05-2014.
 */
public class Test extends JFrame {
    public Test(){
        setLayout(new BorderLayout());
    }
   public static JLabel label=new JLabel("ssup!!!");
    public static void main(String [] args){
        JFrame frame =new JFrame();

        JButton button= new JButton("Click me");
        JComponent chart=new Chart();
        ActionListener listen=new Listener();

        JPanel panel=new JPanel();
        //JPanel panel1=new JPanel();

        panel.add(label);
        panel.add(button);
        panel.add(chart);
        frame.add(panel);
        //frame.add(panel1);

       frame.setSize(300,400);
        frame.setTitle("HELLO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        button.addActionListener(listen);
    }

}
