package ARSandboxGUI;
import ARSandboxGUI.NotInstalled.Gui_enterpasswd;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class_Main {
    static String home = System.getProperty("user.home");
    public static void main(String[] args) {
        //Checking if options.txt exist to prevent the 'Firt time opening' pop-up from popping up
        File f = new File(home + "/.ARSandboxTool/options.txt");
        if(f.exists() && !f.isDirectory()) 
        { 
            ARSandboxGUI.Installed.Gui_CommandCreator.main();
        }   
        else
        {
            ARSandboxGUI.Gui_Intro.main();
        }        
    }
    public static void IntroTOEnterPasswd() {
        ARSandboxGUI.Gui_Intro.gui.dispose();
        ARSandboxGUI.NotInstalled.Gui_enterpasswd.main();
    }
    public static void EnterPasswdTOInstallingLoading() {
        ARSandboxGUI.NotInstalled.Gui_enterpasswd.gui.dispose();
                try {
                    ARSandboxGUI.NotInstalled.Gui_installingLoading.main();
                    ARSandboxGUI.NotInstalled.Class_FirstTimeInstall.main();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Gui_enterpasswd.class.getName()).log(Level.SEVERE, null, ex);
                }
    }

    public static void IntroTOAlreadyInstalledLocationReminder() {
        ARSandboxGUI.Gui_Intro.gui.dispose();
        ARSandboxGUI.Installed.Gui_AlreadyInstalledLocationReminder.main();
    }
    
}
