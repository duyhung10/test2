/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic;

import Vocabulary.Dictionary;
import Vocabulary.History;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LeDuyHung
 */
public class mainGraphic extends javax.swing.JFrame {

    /**
     * Creates new form mainGraphic
     */
    Dictionary dic;
    History his;
    
    public mainGraphic() throws IOException {
        this.dic = new Dictionary();
        this.his = new History();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btShow5TuMoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taShow5TuMoi = new javax.swing.JTextArea();
        lbMCQ = new javax.swing.JLabel();
        btAnhViet = new javax.swing.JButton();
        btVietAnh = new javax.swing.JButton();
        btVocabulary = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EnglishLearning");
        setLocation(new java.awt.Point(430, 100));

        btShow5TuMoi.setBackground(new java.awt.Color(153, 255, 153));
        btShow5TuMoi.setText("5 News Vocabulary");
        btShow5TuMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btShow5TuMoiActionPerformed(evt);
            }
        });

        taShow5TuMoi.setColumns(20);
        taShow5TuMoi.setRows(5);
        jScrollPane1.setViewportView(taShow5TuMoi);

        lbMCQ.setBackground(new java.awt.Color(0, 204, 204));
        lbMCQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMCQ.setText("Multiple-choice questions");
        lbMCQ.setOpaque(true);

        btAnhViet.setText("ANH - VIỆT");
        btAnhViet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnhVietActionPerformed(evt);
            }
        });

        btVietAnh.setText("VIỆT - ANH");

        btVocabulary.setBackground(new java.awt.Color(153, 255, 153));
        btVocabulary.setText("Vocabulary");
        btVocabulary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVocabularyActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbMCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btAnhViet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btVietAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btShow5TuMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(btVocabulary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAnhViet, btVietAnh});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btShow5TuMoi, btVocabulary, lbMCQ});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btShow5TuMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btVocabulary, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btAnhViet, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addComponent(btVietAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btShow5TuMoi, btVocabulary});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btAnhViet, btVietAnh});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btShow5TuMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btShow5TuMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btShow5TuMoiActionPerformed

    private void btAnhVietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnhVietActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAnhVietActionPerformed

    private void btVocabularyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVocabularyActionPerformed
        try {
            // TODO add your handling code here:
            vocaManager vM = new vocaManager(dic, his);
            vM.show();
        } catch (IOException ex) {
            Logger.getLogger(mainGraphic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btVocabularyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainGraphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainGraphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainGraphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainGraphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new mainGraphic().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(mainGraphic.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnhViet;
    private javax.swing.JButton btShow5TuMoi;
    private javax.swing.JButton btVietAnh;
    private javax.swing.JButton btVocabulary;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbMCQ;
    private javax.swing.JTextArea taShow5TuMoi;
    // End of variables declaration//GEN-END:variables
}