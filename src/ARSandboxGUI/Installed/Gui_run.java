package ARSandboxGUI.Installed;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public final class Gui_run extends JFrame {
    // The S is to switch the -arguments on
    // The T is to specify the argument settings: -Suhm Tuhm
public static String Suhm, Sfpv, Suhs, Sus, Sncl, Srws, Srwt, Sc, Sf, Ss, Sslf, Ser, Shmp, Snas, Ssp, She, Swts, Sws, Srer, Srs, Sevr, Sdds, Swi, Swo, Scp;
public static String Tuhm, Tfpv, Tc, Tf, Ts, Tslf, Ter, Thmp, Tnas, Tsp, The, Twts, Tws, Trer, Trs, Tevr, Tdds, Twi, Two, Tcp;
static String home = System.getProperty("user.home");

	
	JCheckBox CBuhm, CBfpv, CBuhs, CBus, CBncl, CBrws, CBrwt, CBc, CBf, CBs, CBslf, CBer, CBhmp, CBnas, CBsp, CBhe, CBwts, CBws, CBrer, CBrs, CBevr, CBdds, CBwi, CBwo, CBcp; 
	JTextField TFuhm, TFfpv, TFc, TFf, TFs, TFslf, TFer, TFhmp, TFnas, TFsp, TFhe, TFwts, TFws, TFrer, TFrs, TFevr, TFdds, TFwi, TFwo, TFcp;
	JButton run;
	JLabel E1, E2, E3, E4, E5, E6, E7, E8, L;
	//uhm, Lfpv, Luhs, Lus, Lncl, Lrws, L, Lc, Lf, Ls, Lslf, Ler, Lhmp, Lnas, Lsp, Lhe, Lwts, Lws, Lrer, Lrs, Levr, Ldds, Lwi, Lwo, Lcp
	JScrollPane pane;
@SuppressWarnings("empty-statement")
	public Gui_run() {
		setLayout(new GridLayout(26, 1, 0, 0));
		//setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		//panel.setLayout(new GridLayout(20,1));
		//panel.add(CBuhm); ??
//label	
		L = new JLabel("<html><p>Enables elevation color mapping and loads the elevation color map from the file of the given name</p></html>");
		add(L);	
		CBuhm = new JCheckBox("uhm inschakelen");
		add(CBuhm);
		CBuhm.setSelected(true);
		TFuhm = new JTextField(home + "/src/SARndbox-2.3/etc/SARndbox-2.3/HeightColorMap.cpt");
		add(TFuhm);
		TFuhm.setEnabled(true);
		
		L = new JLabel("<html><p>Fixes the navigation transformation so that Kinect camera and projector are aligned, as defined by the projector transform file of the given name</p></html>");
		add(L);	
		CBfpv = new JCheckBox("fpv optie");
		add(CBfpv);
		CBfpv.setSelected(true);
		TFfpv = new JTextField(home + "/src/SARndbox-2.3/etc/SARndbox-2.3/ProjectorMatrix.dat");
		add(TFfpv);
		TFfpv.setEnabled(true);
		
		L = new JLabel("<html><p>Enables hill shading</p></html>");
		add(L);	
		CBuhs = new JCheckBox("uhs");
		add(CBuhs);
		
		E1 = new JLabel("");
		add(E1);	
		
		L = new JLabel("<html><p>Enables shadows</p></html>");
		add(L);	
		CBus = new JCheckBox("us");
		add(CBus);
		
		E1 = new JLabel("");
		add(E1);	
		
		L = new JLabel("<html><p>Disables topographic contour lines</p></html>");
		add(L);	
		CBncl = new JCheckBox("ncl");
		add(CBncl);
		
		E1 = new JLabel("");
		add(E1);	
		
		L = new JLabel("<html><p>Renders water surface as geometric surface</p></html>");
		add(L);	
		CBrws = new JCheckBox("rws");
		add(CBrws);
		
		E1 = new JLabel("");
		add(E1);	
		
		L = new JLabel("<html><p>Renders water surface as texture</p></html>");
		add(L);	
		CBrwt = new JCheckBox("rwt");
		add(CBrwt);
		
		E1 = new JLabel("");
		add(E1);	
		
		L = new JLabel("<html><p>Selects the local 3D camera of the given index (0: first camera on USB bus)</p></html>");
		add(L);	
		CBc = new JCheckBox("c inschakelen <camera index>");
		add(CBc);
		TFc = new JTextField("0");
		add(TFc);
		TFc.setEnabled(false);
		
		L = new JLabel("<html><p>Reads a pre-recorded 3D video stream from a pair of color/depth files of the given file name prefix</p></html>");
		add(L);	
		CBf = new JCheckBox("f inschakelen <frame file name prefix>");
		add(CBf);
		TFf = new JTextField("");
		add(TFf);
		TFf.setEnabled(false);
		
		L = new JLabel("<html><p>Scale factor from real sandbox to simulated terrain</p></html>");
		add(L);	
		CBs = new JCheckBox("<html><p>s inschakelen (1:100 scale, 1cm in sandbox is 1m in terrain)</p></html>");
		add(CBs);
		TFs = new JTextField("100.0");
		add(TFs);
		TFs.setEnabled(false);
		
		L = new JLabel("<html><p>Loads the sandbox layout file of the given name</p></html>");
		add(L);	
		CBslf = new JCheckBox("slf inschakelen <sandbox layout file name>");
		add(CBslf);
		TFslf = new JTextField(home + "/src/SARndbox-2.3/etc/SARndbox-2.3/BoxLayout.txt");
		add(TFslf);
		TFslf.setEnabled(false);
		
		L = new JLabel("<html><p>Sets the range of valid sand surface elevations relative to the ground plane in cm</p></html>");
		add(L);	
		CBer = new JCheckBox("er inschakelen <min elevation> <max elevation>");
		add(CBer);
		TFer = new JTextField("Range of elevation color map");
		add(TFer);
		TFer.setEnabled(false);
		
		L = new JLabel("<html><p>Sets an explicit base plane equation to use for height color mapping</p></html>");
		add(L);	
		CBhmp = new JCheckBox("hmp inschakelen <x> <y> <z> <offset>");
		add(CBhmp);
		TFhmp = new JTextField("");
		add(TFhmp);
		TFhmp.setEnabled(false);
		
		L = new JLabel("<html><p>Sets the number of averaging slots in the frame filter; latency is (num averaging slots)*1/30 s</p></html>");
		add(L);	
		CBnas = new JCheckBox("nas inschakelen <num averaging slots>");
		add(CBnas);
		TFnas = new JTextField("30");
		add(TFnas);
		TFnas.setEnabled(false);
		
		L = new JLabel("<html><p> Sets the frame filter parameters minimum number of valid samples and maximum sample variance before convergence</p></html>");
		add(L);	
		CBsp = new JCheckBox("sp inschakelen <min num samples> <max variance>");
		add(CBsp);
		TFsp = new JTextField("10 2");
		add(TFsp);
		TFsp.setEnabled(false);
		
		L = new JLabel("<html><p>Sets the size of the hysteresis envelope used for jitter removal</p></html>");
		add(L);	
		CBhe = new JCheckBox("he inschakelen <hysteresis envelope>");
		add(CBhe);
		TFhe = new JTextField("0.1");
		add(TFhe);
		TFhe.setEnabled(false);
		
		L = new JLabel("<html><p>Sets the width and height of the water flow simulation grid</p></html>");
		add(L);	
		CBwts = new JCheckBox("wts inschakelen <water grid width> <water grid height>");
		add(CBwts);
		TFwts = new JTextField("640 480");
		add(TFwts);
		TFwts.setEnabled(false);
		
		L = new JLabel("<html><p> Sets the relative speed of the water simulation and the maximum number of simulation steps per frame</p></html>");
		add(L);	
		CBws = new JCheckBox("ws inschakelen <water speed> <water max steps>");
		add(CBws);
		TFws = new JTextField("1.0 30");
		add(TFws);
		TFws.setEnabled(false);
		
		L = new JLabel("<html><p>Sets the elevation range of the rain cloud level relative to the ground plane in cm</p></html>");
		add(L);	
		CBrer = new JCheckBox("rer inschakelen <min rain elevation> <max rain elevation>");
		add(CBrer);
		TFrer = new JTextField("Above range of elevation color map");
		add(TFrer);
		TFrer.setEnabled(false);
		
		L = new JLabel("<html><p>Sets the strength of global or local rainfall in cm/s</p></html>");
		add(L);	
		CBrs = new JCheckBox("rs inschakelen <rain strength>");
		add(CBrs);
		TFrs = new JTextField("0.25");
		add(TFrs);
		TFrs.setEnabled(false);
		
		L = new JLabel("<html><p>Water evaporation rate in cm/s</p></html>");
		add(L);	
		CBevr = new JCheckBox("evr inschakelen <evaporation rate>");
		add(CBevr);
		TFevr = new JTextField("0.0");
		add(TFevr);
		TFevr.setEnabled(false);
		
		L = new JLabel("<html><p>DEM matching distance scale factor in cm</p></html>");
		add(L);	
		CBdds = new JCheckBox("dds inschakelen <DEM distance scale>");
		add(CBdds);
		TFdds = new JTextField("1.0");
		add(TFdds);
		TFdds.setEnabled(false);
		
		L = new JLabel("<html><p>Sets the zero-based index of the display window to which the following rendering settings are applied</p></html>");
		add(L);	
		CBwi = new JCheckBox("wi inschakelen <window index>");
		add(CBwi);
		TFwi = new JTextField("0");
		add(TFwi);
		TFwi.setEnabled(false);
		
		L = new JLabel("<html><p>Sets the water depth at which water appears opaque in cm</p></html>");
		add(L);	
		CBwo = new JCheckBox("wo inschakelen <water opacity>");
		add(CBwo);
		TFwo = new JTextField("2.0");
		add(TFwo);
		TFwo.setEnabled(false);
		
		L = new JLabel("<html><p>Sets the name of a named POSIX pipe from which to read control commands</p></html>");
		add(L);	
		CBcp = new JCheckBox("cp inschakelen <control pipe name>");
		add(CBcp);
		TFcp = new JTextField("");
		add(TFcp);
		TFcp.setEnabled(false);
		
		run = new JButton("Run the Sandbox");
		add(run);
		
		events e = new events();
		TFuhm.addActionListener(e);
		CBuhm.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFuhm.setEnabled(true);
                        Suhm = ("-uhm");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFuhm.setEnabled(false);
                        Suhm = ("");
                        Tuhm = ("");
                    }
                }); 
                
		TFfpv.addActionListener(e);
		CBfpv.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFfpv.setEnabled(true);
                        Sfpv = ("-fpv");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFfpv.setEnabled(false);
                        Sfpv = ("");
                        Tfpv = ("");
                    }
                }); 

		CBuhs.addItemListener(e);
		CBus.addItemListener(e);
		CBncl.addItemListener(e);
		CBrws.addItemListener(e);
		CBrwt.addItemListener(e);
		
		TFc.addActionListener(e);
		CBc.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFc.setEnabled(true);
                        Sc = ("-c");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFc.setEnabled(false);
                        Sc = ("");
                        Tc = ("");
                    }
                }); 

		TFf.addActionListener(e);
		CBf.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFf.setEnabled(true);
                        Sf = ("-f");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFf.setEnabled(false);
                        Sf = ("");
                        Tf = ("");
                    }
                }); 
		
		TFs.addActionListener(e);
		CBs.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFs.setEnabled(true);
                        Ss = ("-s");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFs.setEnabled(false);
                        Ss = ("");
                        Ts = ("");
                    }
                }); 
		
		TFslf.addActionListener(e);
		CBslf.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFslf.setEnabled(true);
                        Sslf = ("-slf");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFslf.setEnabled(false);
                        Sslf = ("");
                        Tslf = ("");
                    }
                }); 
		
		TFer.addActionListener(e);
		CBer.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFer.setEnabled(true);
                        Ser = ("-er");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFer.setEnabled(false);
                        Ser = ("");
                        Ter = ("");
                    }
                }); 
		
		TFhmp.addActionListener(e);
		CBhmp.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFhmp.setEnabled(true);
                        Shmp = ("-hmp");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFhmp.setEnabled(false);
                        Shmp = ("");
                        Thmp = ("");
                    }
                });  
		
		TFnas.addActionListener(e);
		CBnas.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFnas.setEnabled(true);
                        Snas = ("-nas");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFnas.setEnabled(false);
                        Snas = ("");
                        Tnas = ("");
                    }
                });  
		
		TFsp.addActionListener(e);
		CBsp.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFsp.setEnabled(true);
                        Ssp = ("-sp");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFsp.setEnabled(false);
                        Ssp = ("");
                        Tsp = ("");
                    }
                }); 
		
		TFhe.addActionListener(e);
		CBhe.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFhe.setEnabled(true);
                        She = ("-he");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFhe.setEnabled(false);
                        She = ("");
                        The = ("");
                    }
                }); 
		
		TFwts.addActionListener(e);
		CBwts.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFwts.setEnabled(true);
                        Swts = ("-wts");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFwts.setEnabled(false);
                        Swts = ("");
                        Twts = ("");
                    }
                }); 
		
		TFws.addActionListener(e);
		CBws.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFws.setEnabled(true);
                        Sws = ("-ws");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFws.setEnabled(false);
                        Sws = ("");
                        Tws = ("");
                    }
                }); 
		
		TFrer.addActionListener(e);
		CBrer.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFrer.setEnabled(true);
                        Srer = ("-rer");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFrer.setEnabled(false);
                        Srer = ("");
                        Trer = ("");
                    }
                }); 
		
		TFrs.addActionListener(e);
		CBrs.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFrs.setEnabled(true);
                        Srs = ("-rs");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFrs.setEnabled(false);
                        Srs = ("");
                        Trs = ("");
                    }
                }); 
		
		TFevr.addActionListener(e);
		CBevr.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFevr.setEnabled(true);
                        Sevr = ("-evr");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFevr.setEnabled(false);
                        Sevr = ("");
                        Tevr = ("");
                    }
                }); 
		
		TFdds.addActionListener(e);
		CBdds.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFdds.setEnabled(true);
                        Sdds = ("-dds");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFdds.setEnabled(false);
                        Sdds = ("");
                        Tdds = ("");
                    }
                }); 
		
		TFwi.addActionListener(e);
		CBwi.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFwi.setEnabled(true);
                        Swi = ("-wi");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFwi.setEnabled(false);
                        Swi = ("");
                        Twi = ("");
                    }
                }); 
		
		TFwo.addActionListener(e);
		CBwo.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFwo.setEnabled(true);
                        Swo = ("-wo");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFwo.setEnabled(false);
                        Swo = ("");
                        Two = ("");
                    }
                }); 
		
		TFcp.addActionListener(e);
		CBcp.addItemListener((ItemEvent e1) -> {
                    if (e1.getStateChange() == ItemEvent.SELECTED) {
                        TFcp.setEnabled(true);
                        Scp = ("-cp");
                    } else if (e1.getStateChange() == ItemEvent.DESELECTED) {
                        TFcp.setEnabled(false);
                        Scp = ("");
                        Tcp = ("");
                    }
                }); 
		
		run.addActionListener(e);;
	}

	public class events implements ItemListener, ActionListener {
		public void itemStateChanged(ItemEvent e) {
			
		}

		
		public void actionPerformed(ActionEvent e) {
			if(run.isEnabled())
			{
//Checks and Texts
				if(CBuhm.isSelected()) 
				{
					Suhm = ("-uhm");
					Tuhm = TFuhm.getText();
					System.out.println("-uhm");
				}		
				if(CBfpv.isSelected())
				{
					Sfpv = ("-fpv");
					Tfpv = TFfpv.getText();
					System.out.println("-fpv");
				}			
				if(CBc.isSelected())
				{
					Tc = TFc.getText();
				}
				if(CBf.isSelected())
				{
					Tf = TFf.getText();
				}
				if(CBs.isSelected())
				{
					Ts = TFs.getText();
				}
				if(CBslf.isSelected())
				{
					Tslf = TFslf.getText();
				}
				if(CBer.isSelected())
				{
					Ter = TFer.getText();
				}
				if(CBhmp.isSelected())
				{
					Thmp = TFhmp.getText();
				}
				if(CBnas.isSelected())
				{
					Tnas = TFnas.getText();
				}
				if(CBsp.isSelected())
				{
					Tsp = TFsp.getText();
				}
				if(CBhe.isSelected())
				{
					The = TFhe.getText();
				}
				if(CBwts.isSelected())
				{
					Twts = TFwts.getText();
				}
				if(CBws.isSelected())
				{
					Tws = TFws.getText();
				}
				if(CBrer.isSelected())
				{
					Trer = TFrer.getText();
				}
				if(CBrs.isSelected())
				{
					Trs = TFrs.getText();
				}
				if(CBevr.isSelected())
				{
					Tevr = TFevr.getText();
				}
				if(CBdds.isSelected())
				{
					Tdds = TFdds.getText();
				}
				if(CBwi.isSelected())
				{
					Twi = TFwi.getText();
				}
				if(CBwo.isSelected())
				{
					Two = TFwo.getText();
				}
				if(CBcp.isSelected())
				{
					Tcp = TFcp.getText();
				}
				if(CBuhm.isSelected()) 
				{
					Suhm = ("-uhm");
					System.out.println("-uhm");
				}
//Checks Only				
				if(CBuhs.isSelected()) 
				{
					Suhs = ("-uhs");
					System.out.println("-uhs");
				}		
				if(CBus.isSelected()) 
				{
					Sus = ("-us");
					System.out.println("-us");
				}
				if(CBncl.isSelected()) 
				{
					Sncl = ("-ncl");
					System.out.println("-ncl");
				}
				if(CBrws.isSelected()) 
				{
					Srws = ("-rws");
					System.out.println("-rws");
				}
				if(CBrwt.isSelected()) 
				{
					Srwt = ("-rwt");
					System.out.println("-rwt");
				}
				
				Class_RunSandboxCommand.main();
			}
			
		}

	    }
	    public static void main() {
        
	    	final Gui_run gui_run = new Gui_run();
	    	gui_run.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	gui_run.setVisible(true);
	    	gui_run.setSize(1250, 980);
                gui_run.setTitle("ARSandbox start options");
                //gui_run.setBackground(new java.awt.Color(234, 241, 255));
                //gui_run.pack();

	}
}
