/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class fgeneral extends javax.swing.JFrame {

    /**
     * Creates new form fgeneral
     */
    public fgeneral() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        encabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnMinimize = new javax.swing.JButton();
        menu = new javax.swing.JPanel();
        contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        encabezado.setBackground(new java.awt.Color(36, 41, 46));
        encabezado.setPreferredSize(new java.awt.Dimension(1080, 40));

        jLabel1.setBackground(new java.awt.Color(36, 41, 46));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Comercial continental");
        jLabel1.setPreferredSize(new java.awt.Dimension(49, 30));

        btnExit.setBackground(new java.awt.Color(36, 41, 46));
        btnExit.setFont(new java.awt.Font("Dialog", 0, 23)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setFocusPainted(false);
        btnExit.setPreferredSize(new java.awt.Dimension(23, 36));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnExitMouseReleased(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnMinimize.setBackground(new java.awt.Color(36, 41, 46));
        btnMinimize.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        btnMinimize.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimize.setText("-");
        btnMinimize.setBorder(null);
        btnMinimize.setBorderPainted(false);
        btnMinimize.setFocusPainted(false);
        btnMinimize.setPreferredSize(new java.awt.Dimension(12, 36));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseExited(evt);
            }
        });
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout encabezadoLayout = new javax.swing.GroupLayout(encabezado);
        encabezado.setLayout(encabezadoLayout);
        encabezadoLayout.setHorizontalGroup(
            encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezadoLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        encabezadoLayout.setVerticalGroup(
            encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezadoLayout.createSequentialGroup()
                .addGroup(encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(encabezadoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(encabezadoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        menu.setBackground(new java.awt.Color(0, 136, 204));
        menu.setPreferredSize(new java.awt.Dimension(70, 600));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        contenedor.setBackground(new java.awt.Color(36, 41, 46));
        contenedor.setPreferredSize(new java.awt.Dimension(1010, 600));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int sino = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null,"¿Desea Sallir del Sistema?","Exit",sino);
        if(resultado==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
        btnExit.setBackground(Color.RED);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
 
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseReleased
 
    }//GEN-LAST:event_btnExitMouseReleased

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        // TODO add your handling code here:
        btnExit.setBackground(new Color(36, 41, 46));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseEntered
        // TODO add your handling code here:
        btnMinimize.setBackground(Color.red);
    }//GEN-LAST:event_btnMinimizeMouseEntered

    private void btnMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseExited
        // TODO add your handling code here:
        btnMinimize.setBackground(new Color(36, 41, 46));
    }//GEN-LAST:event_btnMinimizeMouseExited

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        // TODO add your handling code here:
        this.setState(fgeneral.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed

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
            java.util.logging.Logger.getLogger(fgeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fgeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fgeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fgeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fgeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel encabezado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
