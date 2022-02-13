//---------------------------------------------------------------------------------------|
/**
 *  University of Arkansas | Software Engineering (Spring 2022) | Mr. Strother | Team 3
 *  Change Date: February 13th, 2022 (Henry Schmidt)
 *  Application Run Class: The hub of the application this class controls the processes 
 *  of the application and connects its varying parts
 */
//---------------------------------------------------------------------------------------|

import java.awt.Toolkit;

public class ApplicationRun{

    Controller controller;
    View view;

    //------------------------------------------------------------------------------|
    //  ApplicationRun Constructor
    //------------------------------------------------------------------------------|
    ApplicationRun(){
        // Create instances of our view and controller
        controller = new Controller();
        view = new View();
    }
    
    //------------------------------------------------------------------------------|
    //Main: Create the ApplicationRun object and run the thread
    //------------------------------------------------------------------------------|
    public static void main(String[] args) {
        ApplicationRun ApplRn = new ApplicationRun();
        ApplRn.run();
    }

    //------------------------------------------------------------------------------|
    /**
     *  Run: This function runs the thread and calls other update functions as 
     *  necessary
     *  @param none
     *  @return nothing
     */
    //------------------------------------------------------------------------------|
    public void run(){
        
        // Keep the thread alive until we want to close the application
        while(true){

            // Refreshes the screen
            Toolkit.getDefaultToolkit().sync();

            // Try catch for the thread, the thread sleeps for 50 miliseconds
            try {
                Thread.sleep(40);
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }

}