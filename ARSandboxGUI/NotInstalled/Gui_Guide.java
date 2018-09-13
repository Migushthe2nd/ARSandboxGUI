/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARSandboxGUI.NotInstalled;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Gui_Guide extends javax.swing.JFrame {
    Gui_Guide p;

    public Gui_Guide() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        GuideHyperlink = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Howto = new javax.swing.JTextArea();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GuideHyperlink.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GuideHyperlink.setText("Original guide by Oliver Kreylos");
        GuideHyperlink.setBorderPainted(false);
        GuideHyperlink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuideHyperlinkActionPerformed(evt);
            }
        });

        Howto.setEditable(false);
        Howto.setColumns(20);
        Howto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Howto.setLineWrap(true);
        Howto.setRows(5);
        Howto.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. In feugiat mauris sit amet nibh varius, a tincidunt nisl venenatis. Vestibulum non tincidunt turpis, et tempor metus. Nullam quis sapien fermentum, gravida lorem vitae, ultrices massa. Maecenas iaculis luctus massa, a venenatis metus tincidunt vel. Aenean in orci ut ante sagittis semper. Sed rhoncus malesuada facilisis. Proin venenatis nisl non venenatis luctus. Nam ut diam faucibus, rutrum sem non, porttitor orci. Suspendisse consectetur augue vitae diam pulvinar, ac cursus justo commodo. Praesent condimentum vestibulum elementum.  Duis vel felis neque. Fusce porta risus ac lectus lacinia luctus. Etiam pharetra nisl lorem, eget aliquam risus fermentum sed. Aliquam venenatis odio et tortor consequat, vitae dignissim sapien varius. Pellentesque sit amet tellus non lectus placerat venenatis et vitae mauris. Curabitur rutrum cursus massa, non tincidunt quam consequat id. Maecenas ut commodo risus. Nulla facilisi. Pellentesque rutrum congue venenatis. Nulla quis iaculis lacus. Maecenas consequat ante quis elit consequat, nec commodo felis vehicula. Nullam nec accumsan massa. Vestibulum scelerisque commodo est, quis consequat arcu posuere eu. Etiam luctus massa vestibulum aliquam luctus. Morbi dapibus sapien nec bibendum consectetur. Integer quis augue non nisi dignissim porttitor.  Curabitur convallis egestas dui eu finibus. Proin scelerisque nec ante eu sodales. Suspendisse et sem eget lacus sodales dictum. Donec porttitor efficitur blandit. Phasellus vitae vestibulum quam. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed mi quam, consectetur eu enim in, gravida volutpat odio. Interdum et malesuada fames ac ante ipsum primis in faucibus. Duis sagittis blandit dolor dignissim vehicula. In ligula eros, luctus in consequat sed, dictum et massa.  Quisque posuere ante sapien, vitae malesuada turpis luctus non. Nunc ex leo, volutpat in risus sed, finibus vestibulum orci. Nam tincidunt mauris tortor, sit amet vehicula mauris dictum a. Maecenas viverra porttitor quam, non pharetra ipsum dictum quis. Fusce egestas dui enim, sit amet convallis nisl porta eu. Curabitur malesuada diam pulvinar ex semper, ac pretium libero tristique. Maecenas non ultricies metus. Sed vitae rutrum ipsum. Ut sodales massa risus, id volutpat libero bibendum eu. Nunc bibendum lacus fringilla, posuere eros non, suscipit mauris. Donec vestibulum dui turpis, bibendum molestie nisl iaculis venenatis. Suspendisse vel consectetur risus. Ut nec justo porta, facilisis ex quis, dignissim purus. Nullam at arcu magna. Sed ultrices ante non dui fermentum sollicitudin.  Nullam ipsum nunc, auctor vel rutrum non, vehicula quis mauris. Aenean convallis consequat mauris, nec feugiat ante ultrices id. Donec tincidunt libero vehicula consectetur volutpat. Curabitur vestibulum, purus eget eleifend ultricies, nibh eros vehicula justo, ac consectetur neque elit ut leo. In hac habitasse platea dictumst. Donec quis tempor quam. Nulla at feugiat tellus, ut vulputate lectus. Proin sit amet malesuada erat, vitae aliquam purus.");
        jScrollPane1.setViewportView(Howto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(GuideHyperlink)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GuideHyperlink, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuideHyperlinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuideHyperlinkActionPerformed
        String url="https://arsandbox.ucdavis.edu/forums/topic/complete-installation-instructions/";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Gui_Guide.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuideHyperlinkActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            final Gui_Guide gui = new Gui_Guide();
                gui.setVisible(true);
                gui.setTitle("Configuration guide");
                gui.pack();
                gui.setLocationRelativeTo(null);
                gui.setDefaultCloseOperation(Gui_Guide.EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuideHyperlink;
    private javax.swing.JTextArea Howto;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
