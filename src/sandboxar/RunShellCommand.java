package sandboxar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;

public class RunShellCommand {
        static String home = System.getProperty("user.home");
	public static void main() {
	    //String[] arg = new String[]{"-u root", "-h localhost"};
		
        String textfields = 
        		Gui_run.Suhm + " " + Gui_run.Tuhm + " " +
        		Gui_run.Sfpv + " " + Gui_run.Tfpv + " " +
        		Gui_run.Sc + " " + Gui_run.Tc + " " +
        		Gui_run.Sf + " " + Gui_run.Tf + " " +
        		Gui_run.Sslf + " " + Gui_run.Tslf + " " +
        		Gui_run.Ser + " " + Gui_run.Ter + " " +
        		Gui_run.Shmp + " " + Gui_run.Thmp + " " +
        		Gui_run.Snas + " " + Gui_run.Tnas + " " +
        		Gui_run.Ssp + " " + Gui_run.Tsp + " " +
        		Gui_run.She + " " + Gui_run.The + " " +
        		Gui_run.Swts + " " + Gui_run.Twts + " " +
        		Gui_run.Sws + " " + Gui_run.Tws + " " +
        		Gui_run.Srer + " " + Gui_run.Trer + " " +
        		Gui_run.Srs + " " + Gui_run.Trs + " " +
        		Gui_run.Sevr + " " + Gui_run.Tevr + " " +
        		Gui_run.Sdds + " " + Gui_run.Tdds + " " +
        		Gui_run.Swi + " " + Gui_run.Twi + " " +
        		Gui_run.Swo + " " + Gui_run.Two + " " +
        		Gui_run.Scp + " " + Gui_run.Tcp;
        String checkboxes = 
        		Gui_run.Suhs + " " + Gui_run.Sus + " " + 
        		Gui_run.Sncl + " " + Gui_run.Srws + " " + 
        		Gui_run.Srwt;
        String buttons = "";
        try {
	        String ss = null;
	        String runcommand = home + "/src/SARndbox-2.3/bin/SARndbox" + " " + checkboxes + " " + textfields + " " + buttons;
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