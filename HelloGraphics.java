import java.awt.*;
import javax.swing.*;

/**
 * Lab 6 starter example
 * 
 * @author Jim Teresco
 * @author Ira Goldstein
 * @version Spring 2025
 */

// a class that extends JPanel to override the paintComponent method,
// allowing us to interact with Java's graphics system
class GraphicsPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {

        // first, we should call the paintComponent method we are
        // overriding in JPanel
        super.paintComponent(g);
        Font fontNew = new Font("Comic Sans MS",1, 20); 
        // the Graphics object passed to this method has many methods
        // we can use to draw in the area of the panel, one of which
        // allows us to draw a String at a given x,y position
        g.setFont(fontNew);
        g.drawString("Hello, Java Graphics World!", (super.getWidth() / 2) - g.getFontMetrics().stringWidth(TOOL_TIP_TEXT_KEY),
        (super.getHeight() /2) - g.getFontMetrics().getAscent());
        
         

         
        
    }
}

class ArtProject extends JPanel{
   
   
    @ Override 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        
        g.drawArc(20,20, 70, 50, 0, 100); 
        g.drawRect(50,100,40,50);
        
    }
}

public class HelloGraphics implements Runnable {

    /**
     * The run method to set up the graphical user interface
     */
    @Override
    public void run() {

        // the usual JFrame setup steps
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("HelloGraphics");
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // construct JPanel with a custom paintComponent method
        JPanel panel = new GraphicsPanel();
        panel.setBackground(Color.GREEN);
        panel.setForeground(Color.BLUE);
        frame.add(panel);

        // display the window we've created
        frame.pack();
        frame.setVisible(true);

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame artframe = new JFrame("HelloGraphics");
        artframe.setPreferredSize(new Dimension(500, 500));
        artframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // construct JPanel with a custom paintComponent method
        JPanel artpanel1 = new ArtProject();
        artframe.add(artpanel1);

        // display the window we've created
        artframe.pack();
        artframe.setVisible(true);

        
    }

    public static void main(String args[]) {
        javax.swing.SwingUtilities.invokeLater(new HelloGraphics());
    }
}
