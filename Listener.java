import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

/**
 * Created by chitrang3094 on 23-05-2014.
 */
public class Listener extends Test implements ActionListener{
    public void actionPerformed(ActionEvent event ){
        setLayout(new BorderLayout());
        label.setText("hii dude");
        System.out.println("yes");

       int n=JOptionPane.showConfirmDialog(null, "Do you want to start a new project?", "3DNA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        if(n==0){
            JOptionPane.showMessageDialog(null,"Are you sure data may be lost","3DNA",JOptionPane.YES_NO_OPTION,null);
        }

    }
}
