package ARSandboxGUI.Installed;

public class Gui_AlreadyInstalledLocationReminder extends javax.swing.JFrame {

    public Gui_AlreadyInstalledLocationReminder() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        OK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Text1.setText("Assuming you have ARSandbox installed in the default location (/home/src),");

        Text2.setText("the next window allows you to enable launch arguments");

        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OK)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text1)
                    .addComponent(Text2))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(Text1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(OK)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        ARSandboxGUI.Installed.Gui_CommandCreator.main();
    }//GEN-LAST:event_OKActionPerformed

    public static void main() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            final Gui_AlreadyInstalledLocationReminder gui = new Gui_AlreadyInstalledLocationReminder();
                gui.setVisible(true);
                gui.setTitle("");
                gui.pack();
                gui.setLocationRelativeTo(null);
                gui.setDefaultCloseOperation(Gui_AlreadyInstalledLocationReminder.EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    // End of variables declaration//GEN-END:variables
}
