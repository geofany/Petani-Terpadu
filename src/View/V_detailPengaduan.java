/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.MouseAdapter;

/**
 *
 * @author GeGa
 */
public class V_detailPengaduan extends javax.swing.JFrame {

    /**
     * Creates new form V_detailPengaduan
     */
    int mouseX;
    int mouseY;
    public V_detailPengaduan() {
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
        scroll = new javax.swing.JScrollPane();
        deskripsiPengaduanTextArea = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        judulPengaduanField = new javax.swing.JTextField();
        text2 = new javax.swing.JLabel();
        attach1Btn = new javax.swing.JLabel();
        foto1 = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        attach2Btn = new javax.swing.JLabel();
        foto2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jenisPengaduanField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        historyPengaduanBtn = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pengaduanBaruBtn = new javax.swing.JLabel();
        prosesPengaduanBtn = new javax.swing.JLabel();
        head = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        homeBtn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        eventBtn = new javax.swing.JLabel();
        pengaduanBtn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        settingBtn = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        exitBtn = new javax.swing.JLabel();
        minimizeBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel21.setBackground(new java.awt.Color(27, 27, 27));
        jPanel21.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel21.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel21.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(51, 51, 51));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(25, 25, 25));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll.setBackground(new java.awt.Color(0, 0, 0));
        scroll.setOpaque(false);

        deskripsiPengaduanTextArea.setBackground(new java.awt.Color(25, 25, 25));
        deskripsiPengaduanTextArea.setColumns(20);
        deskripsiPengaduanTextArea.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        deskripsiPengaduanTextArea.setForeground(new java.awt.Color(255, 255, 255));
        deskripsiPengaduanTextArea.setRows(5);
        deskripsiPengaduanTextArea.setText("Sawah Saya Diserang Oleh Hama Wereng");
        deskripsiPengaduanTextArea.setBorder(null);
        deskripsiPengaduanTextArea.setOpaque(false);
        deskripsiPengaduanTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                deskripsiPengaduanTextAreaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                deskripsiPengaduanTextAreaFocusLost(evt);
            }
        });
        scroll.setViewportView(deskripsiPengaduanTextArea);

        jPanel10.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 460, 300));
        jPanel10.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, 480, -1));

        judulPengaduanField.setEditable(false);
        judulPengaduanField.setBackground(new java.awt.Color(26, 26, 26));
        judulPengaduanField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        judulPengaduanField.setForeground(new java.awt.Color(255, 255, 255));
        judulPengaduanField.setText("Tolong Bantu Usir Hama");
        judulPengaduanField.setBorder(null);
        judulPengaduanField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                judulPengaduanFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                judulPengaduanFieldFocusLost(evt);
            }
        });
        jPanel10.add(judulPengaduanField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 480, 40));

        text2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        text2.setForeground(new java.awt.Color(255, 255, 255));
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("Bukti Foto 2");
        jPanel10.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 30));

        attach1Btn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        attach1Btn.setForeground(new java.awt.Color(255, 255, 255));
        attach1Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attach1Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/folder.png"))); // NOI18N
        jPanel10.add(attach1Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        foto1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        foto1.setForeground(new java.awt.Color(255, 255, 255));
        foto1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        foto1.setText("Foto1.jpg");
        jPanel10.add(foto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 250, 30));

        text.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText("Bukti Foto 1");
        jPanel10.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 30));

        attach2Btn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        attach2Btn.setForeground(new java.awt.Color(255, 255, 255));
        attach2Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attach2Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/folder.png"))); // NOI18N
        jPanel10.add(attach2Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        foto2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        foto2.setForeground(new java.awt.Color(255, 255, 255));
        foto2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        foto2.setText("Foto2.jpg");
        jPanel10.add(foto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 250, 30));
        jPanel10.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 480, -1));

        jenisPengaduanField.setEditable(false);
        jenisPengaduanField.setBackground(new java.awt.Color(26, 26, 26));
        jenisPengaduanField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jenisPengaduanField.setForeground(new java.awt.Color(255, 255, 255));
        jenisPengaduanField.setText("Serangan Hama");
        jenisPengaduanField.setBorder(null);
        jPanel10.add(jenisPengaduanField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 480, 50));

        jPanel22.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 500, 600));

        jPanel2.setBackground(new java.awt.Color(25, 25, 25));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BATAS.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 50));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 10));

        historyPengaduanBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        historyPengaduanBtn.setForeground(new java.awt.Color(255, 255, 255));
        historyPengaduanBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        historyPengaduanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/history blank.png"))); // NOI18N
        historyPengaduanBtn.setText(" HISTORY PENGADUAN");
        jPanel2.add(historyPengaduanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BATAS.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, 50));

        pengaduanBaruBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pengaduanBaruBtn.setForeground(new java.awt.Color(255, 255, 255));
        pengaduanBaruBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pengaduanBaruBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tambah blank.png"))); // NOI18N
        pengaduanBaruBtn.setText(" BUAT PENGADUAN BARU");
        jPanel2.add(pengaduanBaruBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        prosesPengaduanBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        prosesPengaduanBtn.setForeground(new java.awt.Color(255, 255, 255));
        prosesPengaduanBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prosesPengaduanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/verifikasi blank.png"))); // NOI18N
        prosesPengaduanBtn.setText(" DALAM PROSES");
        jPanel2.add(prosesPengaduanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jPanel22.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, -1));

        jPanel21.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 77, 1330, 680));

        head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/head.png"))); // NOI18N
        head.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        head.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headMouseDragged(evt);
            }
        });
        head.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headMousePressed(evt);
            }
        });
        jPanel21.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 280, 27));

        jPanel1.setBackground(new java.awt.Color(25, 25, 25));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BERANDA BLANK.png"))); // NOI18N
        homeBtn.setText(" BERANDA");
        jPanel1.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BATAS.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, -1, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BATAS.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 50));

        eventBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        eventBtn.setForeground(new java.awt.Color(255, 255, 255));
        eventBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/EVENT BLANK.png"))); // NOI18N
        eventBtn.setText(" EVENT");
        jPanel1.add(eventBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        pengaduanBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pengaduanBtn.setForeground(new java.awt.Color(118, 185, 0));
        pengaduanBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pengaduanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/PENGADUAN FILL.png"))); // NOI18N
        pengaduanBtn.setText(" PENGADUAN");
        jPanel1.add(pengaduanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BATAS.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 50));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/USER BLANK.png"))); // NOI18N
        jLabel9.setText(" GEOFANY GALINDRA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, -1, -1));

        settingBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        settingBtn.setForeground(new java.awt.Color(255, 255, 255));
        settingBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/SETTING BLANK.png"))); // NOI18N
        jPanel1.add(settingBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, -1));

        logoutBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/EXIT BLANK.png"))); // NOI18N
        jPanel1.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, -1));

        jPanel21.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1330, 50));

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Exit.png"))); // NOI18N
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        jPanel21.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 10, -1, -1));

        minimizeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Minimize.png"))); // NOI18N
        minimizeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseClicked(evt);
            }
        });
        jPanel21.add(minimizeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, -1, -1));

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

    public void klikEvent(MouseAdapter action){
        eventBtn.addMouseListener(action);
    }
    
    public void klikHome(MouseAdapter action) {
        homeBtn.addMouseListener(action);
    }
    
    public void klikLogout(MouseAdapter action){
        logoutBtn.addMouseListener(action);
    }
    
    public void klikSetting(MouseAdapter action) {
        settingBtn.addMouseListener(action);
    }
    
    public void klikProsesPengaduan(MouseAdapter action){
        prosesPengaduanBtn.addMouseListener(action);
    }
    
    public void klikHistoryPengaduan(MouseAdapter action){
        historyPengaduanBtn.addMouseListener(action);
    }
    
    public void klikTambahPengaduan(MouseAdapter action){
        pengaduanBaruBtn.addMouseListener(action);
    }
    
    public void setDetail(String Judul, String Jenis, String Foto1, String Foto2, String isi){
        judulPengaduanField.setText(Judul);
        jenisPengaduanField.setText(Jenis);
        foto1.setText(Foto1);
        foto2.setText(Foto2);
        deskripsiPengaduanTextArea.setText(isi);
    }
    
    private void deskripsiPengaduanTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_deskripsiPengaduanTextAreaFocusGained
        // TODO add your handling code here:
        if (deskripsiPengaduanTextArea.getText().equalsIgnoreCase("Isi Pengaduan")) {
            deskripsiPengaduanTextArea.setText("");
        }
    }//GEN-LAST:event_deskripsiPengaduanTextAreaFocusGained

    private void deskripsiPengaduanTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_deskripsiPengaduanTextAreaFocusLost
        // TODO add your handling code here:
        if (deskripsiPengaduanTextArea.getText().equalsIgnoreCase("")) {
            deskripsiPengaduanTextArea.setText("Isi Pengaduan");
        }
    }//GEN-LAST:event_deskripsiPengaduanTextAreaFocusLost

    private void judulPengaduanFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_judulPengaduanFieldFocusGained
        // TODO add your handling code here:
        if (judulPengaduanField.getText().equalsIgnoreCase("Judul Pengaduan")) {
            judulPengaduanField.setText("");
        }
    }//GEN-LAST:event_judulPengaduanFieldFocusGained

    private void judulPengaduanFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_judulPengaduanFieldFocusLost
        // TODO add your handling code here:
        if (judulPengaduanField.getText().equalsIgnoreCase("")) {
            judulPengaduanField.setText("Judul Pengaduan");
        }
    }//GEN-LAST:event_judulPengaduanFieldFocusLost

    private void headMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMouseDragged
        // TODO add your handling code here:
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();
        this.setLocation(koordinatX-mouseX, koordinatY-mouseY);
    }//GEN-LAST:event_headMouseDragged

    private void headMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMousePressed
        // TODO add your handling code here:
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_headMousePressed

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        // TODO add your handling code here:
        this.dispose();
        System.exit(1);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        this.setState(V_login.ICONIFIED);    // TODO add your handling code here:
    }//GEN-LAST:event_minimizeBtnMouseClicked

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
            java.util.logging.Logger.getLogger(V_detailPengaduan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_detailPengaduan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_detailPengaduan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_detailPengaduan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_detailPengaduan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attach1Btn;
    private javax.swing.JLabel attach2Btn;
    private javax.swing.JTextArea deskripsiPengaduanTextArea;
    private javax.swing.JLabel eventBtn;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JLabel foto1;
    private javax.swing.JLabel foto2;
    private javax.swing.JLabel head;
    private javax.swing.JLabel historyPengaduanBtn;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jenisPengaduanField;
    private javax.swing.JTextField judulPengaduanField;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JLabel minimizeBtn;
    private javax.swing.JLabel pengaduanBaruBtn;
    private javax.swing.JLabel pengaduanBtn;
    private javax.swing.JLabel prosesPengaduanBtn;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel settingBtn;
    private javax.swing.JLabel text;
    private javax.swing.JLabel text2;
    // End of variables declaration//GEN-END:variables
}
