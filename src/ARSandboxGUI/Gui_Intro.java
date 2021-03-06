package ARSandboxGUI;

public class Gui_Intro extends javax.swing.JFrame {
    public static Gui_Intro gui;
    public Gui_Intro() {
        initComponents();
    }
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        OldInstall = new javax.swing.JButton();
        NewInstall = new javax.swing.JButton();
        introtext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("mainframe"); // NOI18N
        setResizable(false);

        title.setText("ARSandbox install utility");

        OldInstall.setText("I have already installed ARSandbox");
        OldInstall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OldInstallActionPerformed(evt);
            }
        });

        NewInstall.setText("I want to (re)install ARSandbox");
        NewInstall.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                NewInstallStateChanged(evt);
            }
        });
        NewInstall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewInstallActionPerformed(evt);
            }
        });

        introtext.setText("This simple Java GUI was made to make installing and running ARSandbox and its dependencies easier.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OldInstall, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NewInstall, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(introtext)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(introtext)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewInstall)
                    .addComponent(OldInstall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OldInstallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OldInstallActionPerformed
        ARSandboxGUI.Installed.Gui_AlreadyInstalledLocationReminder.main(null);	
    }//GEN-LAST:event_OldInstallActionPerformed

    private void NewInstallStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_NewInstallStateChanged

    }//GEN-LAST:event_NewInstallStateChanged

    private void NewInstallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewInstallActionPerformed
        ARSandboxGUI.Class_Main.IntroTOEnterPasswd();
    }//GEN-LAST:event_NewInstallActionPerformed

    public static void main() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                final Gui_Intro gui = new Gui_Intro();
                gui.setVisible(true);
                gui.setTitle("ARSandbox installation");
                gui.pack();
                gui.setLocationRelativeTo(null);
                gui.setDefaultCloseOperation(Gui_Intro.EXIT_ON_CLOSE);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewInstall;
    private javax.swing.JButton OldInstall;
    private javax.swing.JLabel introtext;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
