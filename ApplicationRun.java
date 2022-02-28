
import splashScreen.splashScreen;

public class ApplicationRun {

    Controller controller;
    View view;

    // ------------------------------------------------------------------------------|
    // ApplicationRun Constructor
    // ------------------------------------------------------------------------------|
    ApplicationRun() {
        // Create instances of our view and controller
        controller = new Controller();
        view = new View(controller);
    }

    // ------------------------------------------------------------------------------|
    // Main: Create the ApplicationRun object and run the thread
    // ------------------------------------------------------------------------------|
    public static void main(String[] args) {
        splashScreen splashScr = new splashScreen();
        splashScr.start();
        ApplicationRun ApplRn = new ApplicationRun();
        DBService db = new DBService();
        db.test();
        ApplRn.run();
    }

    // ------------------------------------------------------------------------------|
    /**
     * Run: This function runs the thread and calls other update functions as necessary
     * 
     * @param none
     * @return nothing
     */
    // ------------------------------------------------------------------------------|
    public void run() {}

}
