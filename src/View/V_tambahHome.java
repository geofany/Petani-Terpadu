/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author GeGa
 */
public class V_tambahHome extends javax.swing.JFrame {

    /**
     * Creates new form TambahHome
     */
    int mouseX;
    int mouseY;
    public V_tambahHome() {
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

        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        scroll = new javax.swing.JScrollPane();
        isi = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        eventBtn1 = new javax.swing.JLabel();
        foto1 = new javax.swing.JLabel();
        homeBtn5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pengaduanBtn = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel21.setBackground(new java.awt.Color(27, 27, 27));
        jPanel21.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel21.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel21.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(51, 51, 51));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(25, 25, 25));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 68, 460, -1));

        jTextField1.setBackground(new java.awt.Color(26, 26, 26));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Judul Postingan");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel10.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 460, 55));

        scroll.setBackground(new java.awt.Color(0, 0, 0));
        scroll.setOpaque(false);

        isi.setBackground(new java.awt.Color(25, 25, 25));
        isi.setColumns(20);
        isi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        isi.setForeground(new java.awt.Color(255, 255, 255));
        isi.setRows(5);
        isi.setText("Isi Postingan");
        isi.setBorder(null);
        isi.setOpaque(false);
        scroll.setViewportView(isi);

        jPanel10.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 460, 430));

        jButton1.setBackground(new java.awt.Color(118, 185, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setText("POSTING");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel10.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, -1, -1));

        eventBtn1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        eventBtn1.setForeground(new java.awt.Color(255, 255, 255));
        eventBtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/folder.png"))); // NOI18N
        eventBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventBtn1MouseClicked(evt);
            }
        });
        jPanel10.add(eventBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        foto1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        foto1.setForeground(new java.awt.Color(255, 255, 255));
        foto1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        foto1.setText("Belum Ada Lampiran");
        foto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto1MouseClicked(evt);
            }
        });
        jPanel10.add(foto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 250, 30));

        homeBtn5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        homeBtn5.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeBtn5.setText("Foto Postingan");
        homeBtn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtn5MouseClicked(evt);
            }
        });
        jPanel10.add(homeBtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        jPanel22.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 500, 650));

        jPanel21.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 77, 1330, 680));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/head.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel21.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 280, 27));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Exit.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel21.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Minimize.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel21.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 10, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Maximize.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel21.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(25, 25, 25));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BATAS.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, -1, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BATAS.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BATAS.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 50));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/admin blank.png"))); // NOI18N
        jLabel14.setText(" ADMIN GEOFANY");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(118, 185, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BERANDA FILL.png"))); // NOI18N
        jLabel3.setText(" BERANDA");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/EVENT BLANK.png"))); // NOI18N
        jLabel6.setText(" EVENT");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        pengaduanBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pengaduanBtn.setForeground(new java.awt.Color(255, 255, 255));
        pengaduanBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pengaduanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pengaduan blank.png"))); // NOI18N
        pengaduanBtn.setText(" PENGADUAN");
        pengaduanBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pengaduanBtnMouseClicked(evt);
            }
        });
        jPanel1.add(pengaduanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/EXIT BLANK.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, -1));

        jPanel21.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1330, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        // TODO add your handling code here:
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();
        this.setLocation(koordinatX-mouseX, koordinatY-mouseY);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        this.dispose();
        System.exit(1);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void eventBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventBtn1MouseClicked
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File gambar1 = chooser.getSelectedFile();
        String filename1 = gambar1.getAbsolutePath();
        foto1.setText(filename1);
    }//GEN-LAST:event_eventBtn1MouseClicked

    private void foto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_foto1MouseClicked

    private void homeBtn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtn5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_homeBtn5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        V_homeAdmin home = new V_homeAdmin();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        V_eventAdmin event = new V_eventAdmin();
        event.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void pengaduanBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengaduanBtnMouseClicked
        // TODO add your handling code here:
        V_pengaduanAdmin pengaduan = new V_pengaduanAdmin();
        pengaduan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pengaduanBtnMouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        V_login logout = new V_login();
        logout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Postingan Berhasil Ditambahkan");
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(V_tambahHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_tambahHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_tambahHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_tambahHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_tambahHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eventBtn1;
    private javax.swing.JLabel foto1;
    private javax.swing.JLabel homeBtn5;
    private javax.swing.JTextArea isi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel pengaduanBtn;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
