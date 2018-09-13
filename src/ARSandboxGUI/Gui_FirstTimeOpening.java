/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARSandboxGUI;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author gast
 */
public class Gui_FirstTimeOpening {
    static String home = System.getProperty("user.home");
    public static void main(String[] args) {
        //Checking if options.txt exist to prevent the 'Firt time opening' pop-up from popping up
        File f = new File(home + "/.ARSandboxTool/options.txt");
        if(f.exists() && !f.isDirectory()) 
        { 
            ARSandboxGUI.Gui_run.main();
        }   
        else
        {
            ARSandboxGUI.Gui_install.main();
        }
    }
    
    public static void startinstalling() throws InterruptedException {
        ARSandboxGUI.Gui_installingLoading.main(null);
        TimeUnit.SECONDS.sleep(2);
        ARSandboxGUI.InstallARSandbox.main();
    }   
}
