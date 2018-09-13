package ARSandboxGUI.Installed;

import ARSandboxGUI.Installed.Gui_CommandCreator;
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
        		Gui_CommandCreator.Suhm + " " + Gui_CommandCreator.Tuhm + " " +
        		Gui_CommandCreator.Sfpv + " " + Gui_CommandCreator.Tfpv + " " +
        		Gui_CommandCreator.Sc + " " + Gui_CommandCreator.Tc + " " +
        		Gui_CommandCreator.Sf + " " + Gui_CommandCreator.Tf + " " +
        		Gui_CommandCreator.Sslf + " " + Gui_CommandCreator.Tslf + " " +
        		Gui_CommandCreator.Ser + " " + Gui_CommandCreator.Ter + " " +
        		Gui_CommandCreator.Shmp + " " + Gui_CommandCreator.Thmp + " " +
        		Gui_CommandCreator.Snas + " " + Gui_CommandCreator.Tnas + " " +
        		Gui_CommandCreator.Ssp + " " + Gui_CommandCreator.Tsp + " " +
        		Gui_CommandCreator.She + " " + Gui_CommandCreator.The + " " +
        		Gui_CommandCreator.Swts + " " + Gui_CommandCreator.Twts + " " +
        		Gui_CommandCreator.Sws + " " + Gui_CommandCreator.Tws + " " +
        		Gui_CommandCreator.Srer + " " + Gui_CommandCreator.Trer + " " +
        		Gui_CommandCreator.Srs + " " + Gui_CommandCreator.Trs + " " +
        		Gui_CommandCreator.Sevr + " " + Gui_CommandCreator.Tevr + " " +
        		Gui_CommandCreator.Sdds + " " + Gui_CommandCreator.Tdds + " " +
        		Gui_CommandCreator.Swi + " " + Gui_CommandCreator.Twi + " " +
        		Gui_CommandCreator.Swo + " " + Gui_CommandCreator.Two + " " +
        		Gui_CommandCreator.Scp + " " + Gui_CommandCreator.Tcp;
        String checkboxes = 
        		Gui_CommandCreator.Suhs + " " + Gui_CommandCreator.Sus + " " + 
        		Gui_CommandCreator.Sncl + " " + Gui_CommandCreator.Srws + " " + 
        		Gui_CommandCreator.Srwt;
        String buttons = "";
        try {
	        String ss = null;
	        String runcommand = home + "/src/SARndbox-2.3/bin/SARndbox" + " " + checkboxes + " " + textfields + " " + buttons;
                runcommand = runcommand.replace("null", "");
                runcommand = runcommand.replace(" ", "");
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
            		"Is the camera connected?" + System.lineSeparator() + "Error: " + e.toString(),
            		"Error",
            		JOptionPane.WARNING_MESSAGE);
	    }

	}
}