
import javax.swing.JFrame;

public class View {
    JFrame jFrame;
    Controller controller;
    PlayerEntry playerEntry;

    View(Controller controller) {
        // Define member variables
        this.controller = controller;
        this.jFrame = new JFrame();

        // Create application window
        this.jFrame.setTitle("Placeholder Title");
        this.jFrame.setSize(750, 750);
        this.jFrame.setResizable(false);
        this.jFrame.setFocusable(true);
        this.jFrame.setVisible(true);
        this.jFrame.setLocationRelativeTo(null);
        this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load player entry screen
        this.playerEntry = new PlayerEntry(this.jFrame);
    }
}
