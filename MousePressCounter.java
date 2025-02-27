import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MousePressCounter extends MouseAdapter implements Runnable {
    
    int mouseCounter = 0; 

    public void run() {

        JFrame.setDefaultLookAndFeelDecorated(true);
	    JFrame frame = new JFrame("MousePressCounter");
	    frame.setPreferredSize(new Dimension(500, 500));
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        @Override
	    public void mouseClicked(MouseEvent e) {
            mouseCounter ++; 
		    System.out.println("mouseClicked: " + e);
	    }
    }

    public static void main(String args[]) {
		javax.swing.SwingUtilities.invokeLater(new MouseDemo());
	}

}
