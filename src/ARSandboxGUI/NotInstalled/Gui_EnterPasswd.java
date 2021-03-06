package ARSandboxGUI.NotInstalled;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Gui_enterpasswd extends javax.swing.JFrame {
    public static String passwd;
    public Gui_enterpasswd() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        Done = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Text1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text1.setText("Enter your password to continue install:");

        Text2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text2.setText("Admin privileges are required. Make sure the password is correct!");

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        Done.setText("Done");
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Done))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text1)
                            .addComponent(Text2))
                        .addGap(0, 116, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Text1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Done)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed

    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        //Getting password from the input field
        char[] pass = PasswordField.getPassword();
        passwd = new String(pass);
            //Checking to see if the password field is empty, if so, a popup warns the user and the next dialog doesn't pop up
            if(passwd.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Password Field is empty"); 
            }
            else 
            {
            try {
                ARSandboxGUI.NotInstalled.Class_FirstTimeInstall.main();
            } catch (InterruptedException ex) {
                Logger.getLogger(Gui_enterpasswd.class.getName()).log(Level.SEVERE, null, ex);
            }
            }


    }//GEN-LAST:event_DoneActionPerformed

    public static void main() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            final Gui_enterpasswd gui = new Gui_enterpasswd();
                gui.setVisible(true);
                gui.setTitle("Password required");
                gui.pack();
                gui.setLocationRelativeTo(null);
                gui.setDefaultCloseOperation(Gui_enterpasswd.EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Done;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    // End of variables declaration//GEN-END:variables
}
