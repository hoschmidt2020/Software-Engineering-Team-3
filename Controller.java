import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener {

    Controller() {

    }

    // ------------------------------------------------------------|
    // Required interface methods
    // ------------------------------------------------------------|
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        switch (e.getKeyCode()) {
        // Added by Abubakar Qasim - Feb 24th, enable faster testing
        case KeyEvent.VK_ESCAPE:
            System.out.println("--Exiting--");
            System.exit(0);
            break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
}
