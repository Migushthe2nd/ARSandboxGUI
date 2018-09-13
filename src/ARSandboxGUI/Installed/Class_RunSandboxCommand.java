package ARSandboxGUI.Installed;

import ARSandboxGUI.Installed.Gui_CreateCommand;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;

public class Class_RunSandboxCommand {
        static String home = System.getProperty("user.home");
	public static void main() {
	    //String[] arg = new String[]{"-u root", "-h localhost"};
		
        String textfields = 
        		Gui_CreateCommand.Suhm + " " + Gui_CreateCommand.Tuhm + " " +
        		Gui_CreateCommand.Sfpv + " " + Gui_CreateCommand.Tfpv + " " +
        		Gui_CreateCommand.Sc + " " + Gui_CreateCommand.Tc + " " +
        		Gui_CreateCommand.Sf + " " + Gui_CreateCommand.Tf + " " +
        		Gui_CreateCommand.Sslf + " " + Gui_CreateCommand.Tslf + " " +
        		Gui_CreateCommand.Ser + " " + Gui_CreateCommand.Ter + " " +
        		Gui_CreateCommand.Shmp + " " + Gui_CreateCommand.Thmp + " " +
        		Gui_CreateCommand.Snas + " " + Gui_CreateCommand.Tnas + " " +
        		Gui_CreateCommand.Ssp + " " + Gui_CreateCommand.Tsp + " " +
        		Gui_CreateCommand.She + " " + Gui_CreateCommand.The + " " +
        		Gui_CreateCommand.Swts + " " + Gui_CreateCommand.Twts + " " +
        		Gui_CreateCommand.Sws + " " + Gui_CreateCommand.Tws + " " +
        		Gui_CreateCommand.Srer + " " + Gui_CreateCommand.Trer + " " +
        		Gui_CreateCommand.Srs + " " + Gui_CreateCommand.Trs + " " +
        		Gui_CreateCommand.Sevr + " " + Gui_CreateCommand.Tevr + " " +
        		Gui_CreateCommand.Sdds + " " + Gui_CreateCommand.Tdds + " " +
        		Gui_CreateCommand.Swi + " " + Gui_CreateCommand.Twi + " " +
        		Gui_CreateCommand.Swo + " " + Gui_CreateCommand.Two + " " +
        		Gui_CreateCommand.Scp + " " + Gui_CreateCommand.Tcp;
        String checkboxes = 
        		Gui_CreateCommand.Suhs + " " + Gui_CreateCommand.Sus + " " + 
        		Gui_CreateCommand.Sncl + " " + Gui_CreateCommand.Srws + " " + 
        		Gui_CreateCommand.Srwt;
        String buttons = "";
        try {
	        String ss = null;
	        String runcommand = home + "/src/SARndbox-2.3/bin/SARndbox" + " " + checkboxes + " " + textfields + " " + buttons;
                runcommand = runcommand.replace("null", "");
	        System.out.println(runcommand);
	        Process p = Runtime.getRuntime().exec(runcommand); //Change path to test error
	        BufferedWriter writeer = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
	        writeer.write("dir");
	        writeer.flush();
	        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
	        BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
	        System.out.println("Command output:\n");
	        while ((ss = stdInput.readLine()) != null) {
	            System.out.println(ss);
	        }
	        System.out.println("Error (if any):\n");
	        while ((ss = stdError.readLine()) != null) {
	            System.out.println(ss);
	            
	        }

	    } catch (IOException e) {
	        System.out.println("FROM CATCH " + e.toString());
            JOptionPane.showMessageDialog(null,
            		//Waring message if launch not successful. More warnings to be implemented. 
            		"Is de camera wel aangesloten? of anders" + System.lineSeparator() + "Error: " + e.toString(),
            		"Error",
            		JOptionPane.WARNING_MESSAGE);
	    }

	}
}