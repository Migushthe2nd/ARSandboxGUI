package ARSandboxGUI.NotInstalled;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class Class_FirstTimeInstall {
    static String passwd = Gui_enterpasswd.passwd;
    static String home = System.getProperty("user.home");
    public static void main() throws InterruptedException {
	    //String[] arg = new String[]{"-u root", "-h localhost"};
            System.out.println(passwd);
            try {
                TimeUnit.SECONDS.sleep(2);
	        String ss = null;
                File dir = new File(home + "/.ARSandboxTool");
                dir.mkdir();
                File file = new File(home + "/.ARSandboxTool/run.sh");
                file.setExecutable(true, true);
                //Write Content to run.sh
                FileWriter writer = new FileWriter(file);
                writer.write("echo " + passwd  + " | sudo -S ls\n" +
                "wget http://idav.ucdavis.edu/~okreylos/ResDev/Vrui/Build-Ubuntu.sh\n" +
                "bash Build-Ubuntu.sh\n" + 
                " cd " + home + "/src/\n" +
                "sudo wget http://idav.ucdavis.edu/~okreylos/ResDev/Kinect/Kinect-3.2.tar.gz\n" +
                "sudo tar xfz Kinect-3.2.tar.gz\n" +
                "cd " + home + "/src/Kinect-3.2\n" +
                "sudo make\n" +
                "sudo make install\n" +
                "sudo make installudevrules\n" +
                "cd " + home + "/src/\n" +
                "sudo wget http://idav.ucdavis.edu/~okreylos/ResDev/SARndbox/SARndbox-2.3.tar.gz\n" +
                "sudo tar xfz SARndbox-2.3.tar.gz\n" +
                "cd " + home + "/src/SARndbox-2.3\n" +
                "sudo make\n");
                writer.close();
                
                File filee = new File(home + "/.ARSandboxTool/run2.sh");
                filee.setExecutable(true, true);
                //Write Content to run2.sh
                FileWriter writerr = new FileWriter(filee);
                writerr.write("echo " + passwd + " | sudo -S ls\n" 
                        + "sudo /usr/local/bin/KinectUtil getCalib 0");
                writerr.close();
                
                
                File fileee = new File(home + "/.ARSandboxTool/run3.sh");
                fileee.setExecutable(true, true);
                //Write Content to run3.sh
                FileWriter writerrr = new FileWriter(fileee);
                writerrr.write("echo " + passwd + " | sudo -S ls\n" 
                        + "cd " + home + "/src/SARndbox-2.3"
                        + "RawKinectViewer -compress 0");
                writerrr.close();
                
                JOptionPane.showMessageDialog(null, "Press 'esc' when a spinning globe pops up", "Info", JOptionPane.INFORMATION_MESSAGE);
                //String ss = null;
	        //String command1 = "chmod +x " + home + "/.ARSandboxTool/run.sh";
                String command2 = home + "/.ARSandboxTool/run.sh";
                
	        System.out.println(command2);
                Process p2 = Runtime.getRuntime().exec(command2);
	        BufferedWriter writeerr = new BufferedWriter(new OutputStreamWriter(p2.getOutputStream()));
	        writeerr.write("dir");
	        writeerr.flush();
	        BufferedReader stdInputt = new BufferedReader(new InputStreamReader(p2.getInputStream()));
	        BufferedReader stdErrorr = new BufferedReader(new InputStreamReader(p2.getErrorStream()));
	        System.out.println("Command output:\n");
	        while ((ss = stdInputt.readLine()) != null) {
	            System.out.println(ss);
	        }
	        System.out.println("Error (if any):\n");
	        while ((ss = stdErrorr.readLine()) != null) {
	            System.out.println(ss);
	            
	        }
                
                p2.waitFor();
                
                JOptionPane.showMessageDialog(null,
            	//Waring message if launch not successful. More warnings to be implemented. 
            	"Now connect the Kinect to the pc. Click 'OK' to continue.", "Info", JOptionPane.INFORMATION_MESSAGE);
                            
                            
                //String command3 = "chmod +x " + home + "/.ARSandboxTool/run2.sh";
                String command4 = home + "/.ARSandboxTool/run2.sh";
                
                System.out.println(command4);
                Process p4 = Runtime.getRuntime().exec(command4);

	        BufferedWriter writeerrrr = new BufferedWriter(new OutputStreamWriter(p4.getOutputStream()));
	        writeerrrr.write("dir");
	        writeerrrr.flush();
	        BufferedReader stdInputttt = new BufferedReader(new InputStreamReader(p4.getInputStream()));
	        BufferedReader stdErrorrrr = new BufferedReader(new InputStreamReader(p4.getErrorStream()));
	        System.out.println("Command output:\n");
	        while ((ss = stdInputttt.readLine()) != null) {
	            System.out.println(ss);
	        }
	        System.out.println("Error (if any):\n");
	        while ((ss = stdErrorrrr.readLine()) != null) {
	            System.out.println(ss);
	            
	        }
                
                p4.waitFor();
                
                
                JOptionPane.showMessageDialog(null,
            	"Align your camera so that its field of view covers the interior of your sandbox." + System.lineSeparator() + "Click 'OK' to continue", "Info", JOptionPane.INFORMATION_MESSAGE);
                            
                            
                //String command3 = "chmod +x " + home + "/.ARSandboxTool/run2.sh";
                String command5 = home + "/.ARSandboxTool/run3.sh";
                
                System.out.println(command5);
                Process p5 = Runtime.getRuntime().exec(command5);

	        BufferedWriter writeerrrrr = new BufferedWriter(new OutputStreamWriter(p4.getOutputStream()));
	        writeerrrrr.write("dir");
	        writeerrrrr.flush();
	        BufferedReader stdInputtttt = new BufferedReader(new InputStreamReader(p4.getInputStream()));
	        BufferedReader stdErrorrrrr = new BufferedReader(new InputStreamReader(p4.getErrorStream()));
	        System.out.println("Command output:\n");
	        while ((ss = stdInputtttt.readLine()) != null) {
	            System.out.println(ss);
	        }
	        System.out.println("Error (if any):\n");
	        while ((ss = stdErrorrrrr.readLine()) != null) {
	            System.out.println(ss);
	            
	        }
                
                p5.waitFor();

	    } catch (IOException e) {
	        System.out.println("FROM CATCH " + e.toString());
            JOptionPane.showMessageDialog(null,
            		//Waring message if launch not successful. More warnings to be implemented. 
            		"" + System.lineSeparator() + "Error: " + e.toString(),
            		"Error", JOptionPane.WARNING_MESSAGE);
	    }
        }
}
