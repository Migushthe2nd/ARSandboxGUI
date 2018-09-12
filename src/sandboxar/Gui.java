/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandboxar;

import java.io.File;
import java.util.concurrent.TimeUnit;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author gast
 */
public class Gui {
    static String home = System.getProperty("user.home");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InstantiationException, ClassNotFoundException, IllegalAccessException, UnsupportedLookAndFeelException {
        File f = new File(home + "/.ARSandboxTool/options.txt");
        if(f.exists() && !f.isDirectory()) 
        { 
            sandboxar.Gui_run.main(null);
        }   
        else
        {
            sandboxar.Gui_install.main(null);
        }
    }
    
    public static void startinstalling(String[] args) throws InterruptedException {
        sandboxar.Gui_installingLoading.main(null);
        TimeUnit.SECONDS.sleep(2);
        sandboxar.InstallARSandbox.main();
    }   
}
