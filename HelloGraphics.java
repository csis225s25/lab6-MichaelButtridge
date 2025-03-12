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
        
        g.setColor(Color.GREEN); 
        g.fillArc(0, 300, 500, 500, 0,180); 
        g.setColor(Color.YELLOW);
        g.fillRect(170,170,150,150);
        g.setColor(Color.RED);
        int[] xPoints = {245, 145, 345};
        int[] yPoints = {90, 190, 190};
        g.fillPolygon(xPoints, yPoints, 3);
        g.fillRect(230,270,30,50);
        g.setColor(Color.YELLOW);
        g.fillOval(230,290, 10,10);
        g.setColor(Color.BLUE);
        g.fillRect(185,260,30,30);
        g.setColor(Color.BLACK);
        g.drawLine(200, 260, 200, 290);
        g.drawLine(185, 275, 215, 275);



        
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
        artpanel1.setBackground(Color.CYAN);
        artframe.add(artpanel1);

        // display the window we've created
        artframe.pack();
        artframe.setVisible(true);

        
    }

    public static void main(String args[]) {
        javax.swing.SwingUtilities.invokeLater(new HelloGraphics());
    }
}
