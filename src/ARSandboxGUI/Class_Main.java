package ARSandboxGUI;
import java.io.File;

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
        ARSandboxGUI.NotInstalled.Gui_EnterPasswd.main();
    }
    public static void IntroTOAlreadyInstalledLocationReminder() {
        ARSandboxGUI.Gui_Intro.gui.dispose();
        ARSandboxGUI.Installed.Gui_AlreadyInstalledLocationReminder.main();
    }
    
}
