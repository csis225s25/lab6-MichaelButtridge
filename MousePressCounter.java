import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * This program displays a window that tracks the amount of times
 * the mouse has been clicked and has a reset button to set the number
 * to 0 
 * 
 * 
 * @author Michael Buttridge 
 * @version 3/12/25
 */

public class MousePressCounter extends MouseAdapter implements Runnable, ActionListener {
    
    private int mouseCounter = 0; 
    private JLabel label; 
    private JButton resetButton; 

    public void run() {

        //create new frame 
        JFrame.setDefaultLookAndFeelDecorated(true);
	    JFrame frame = new JFrame("MousePressCounter");
	    frame.setPreferredSize(new Dimension(500, 500));
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // mainPanel that holds other panels 
        JPanel mainPanel = new JPanel(new BorderLayout());

        // mouse panel that has everything for the mouse counter
        JPanel mousePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        label = new JLabel("Mouse press count: " + mouseCounter); 
        mousePanel.add(label); 
        

        // button panel for the reset button 
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        resetButton = new JButton("Reset"); 
        resetButton.addActionListener(this); 
        buttonPanel.add(resetButton); 

        // add panels to the main panel 
        mainPanel.add(mousePanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        //add listener for mouse panel 
        mousePanel.addMouseListener(this); 



        // adds to the frame and makes frame visable 
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);



    }
        // for when the reset button is pressed 
        @Override 
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == resetButton) {
                mouseCounter = 0;
                label.setText("Mouse press count: " + mouseCounter);
        }
    }
        // for when the mouse is clicked 
        @Override
        public void mouseClicked(MouseEvent e){
            mouseCounter ++ ; 
            label.setText("Mouse press count: " + mouseCounter);
        }
    

    public static void main(String args[]) {
		javax.swing.SwingUtilities.invokeLater(new MousePressCounter());
	}

}
