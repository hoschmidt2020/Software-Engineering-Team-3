//---------------------------------------------------------------------------------------|
/**
 *  University of Arkansas | Software Engineering (Spring 2022) | Mr. Strother | Team 3
 *  Change Date: February 13th, 2022 (Henry Schmidt)
 *  View Class: Controls the screen we are looking at and the GUI components
 */
//---------------------------------------------------------------------------------------|
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class View implements ActionListener{
    Controller controller;
    JLabel jlab;

    //------------------------------------------------------------------------------|
    //  View Constructor
    //------------------------------------------------------------------------------|
    View(){
        controller = new Controller();

        JFrame jfrm = new JFrame();
        JPanel jpnl = new JPanel();

        // Set title of our application window
        jfrm.setTitle("Laser Tag Application");
        // Set the size of the application window
        jfrm.setSize(750,750);
        jfrm.setFocusable(true);
        // Set the application to close when the window does
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Allocate our key and mouse listeners
        jfrm.addKeyListener(controller);
        jfrm.addMouseListener(controller);

        // This creates the menu bar
        jlab = new JLabel("Welcome to Laser Tag Tracker!");
        jlab.setFont(new Font("Serif", Font.PLAIN, 36));

        // Add our label to our panel and then our panel to our frame
        jpnl.setBackground(Color.GREEN);
        jpnl.add(jlab);
        jfrm.add(jpnl);

        // Make the window visible
        jfrm.setVisible(true);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

}
