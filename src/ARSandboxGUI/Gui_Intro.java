package ARSandboxGUI;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class Gui_Intro {
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
            ARSandboxGUI.NotInstalled.Gui_install.main();
        }
    }
    
    public static void startinstalling() throws InterruptedException {
        ARSandboxGUI.NotInstalled.Gui_installingLoading.main(null);
        TimeUnit.SECONDS.sleep(2);
        ARSandboxGUI.NotInstalled.Class_FirstTimeInstall.main();

    }   
}
