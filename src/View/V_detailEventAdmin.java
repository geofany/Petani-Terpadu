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
public class V_detailEventAdmin extends javax.swing.JFrame {

    /**
     * Creates new form DetailEventAdmin
     */
    int mouseX;
    int mouseY;
    public V_detailEventAdmin() {
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

        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        judul = new javax.swing.JLabel();
        scroll2 = new javax.swing.JScrollPane();
        isi = new javax.swing.JTextArea();
        narahubung = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        lokasi = new javax.swing.JLabel();
        jam = new javax.swing.JLabel();
        head = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        homeBtn = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        eventBtn = new javax.swing.JLabel();
        pengaduanBtn = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JLabel();
        minimizeBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel27.setBackground(new java.awt.Color(27, 27, 27));
        jPanel27.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel27.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel27.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel28.setBackground(new java.awt.Color(51, 51, 51));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(25, 25, 25));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        foto.setForeground(new java.awt.Color(255, 255, 255));
        foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/berita.png"))); // NOI18N
        jPanel12.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        judul.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        judul.setForeground(new java.awt.Color(255, 255, 255));
        judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul.setText("LOREM IPSUM DOLOR SIT AMET");
        jPanel12.add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 214, 500, 60));

        scroll2.setBackground(new java.awt.Color(0, 0, 0));
        scroll2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll2.setOpaque(false);

        isi.setEditable(false);
        isi.setBackground(new java.awt.Color(25, 25, 25));
        isi.setColumns(20);
        isi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        isi.setForeground(new java.awt.Color(255, 255, 255));
        isi.setLineWrap(true);
        isi.setRows(5);
        isi.setText("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa \nqui officia deserunt mollit anim id est laborum.");
        isi.setBorder(null);
        isi.setOpaque(false);
        scroll2.setViewportView(isi);

        jPanel12.add(scroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 460, 230));

        narahubung.setBackground(new java.awt.Color(153, 153, 153));
        narahubung.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        narahubung.setForeground(new java.awt.Color(255, 255, 255));
        narahubung.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        narahubung.setText("Narahubung : Dea (08123456789)");
        jPanel12.add(narahubung, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 230, 30));

        tanggal.setBackground(new java.awt.Color(153, 153, 153));
        tanggal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tanggal.setForeground(new java.awt.Color(255, 255, 255));
        tanggal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanggal.setText("Tanggal Event : 30 September 2019");
        jPanel12.add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 250, 30));

        lokasi.setBackground(new java.awt.Color(153, 153, 153));
        lokasi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lokasi.setForeground(new java.awt.Color(255, 255, 255));
        lokasi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lokasi.setText("Lokasi Evet : Alun-Alun Kota Jember");
        jPanel12.add(lokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 260, 30));

        jam.setBackground(new java.awt.Color(153, 153, 153));
        jam.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jam.setForeground(new java.awt.Color(255, 255, 255));
        jam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jam.setText("Waktu Pelaksanaan : 08.00 - 15.00");
        jPanel12.add(jam, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 240, 30));

        jPanel28.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 500, 650));

        jPanel27.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 77, 1330, 680));

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
        jPanel27.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 280, 27));

        jPanel1.setBackground(new java.awt.Color(25, 25, 25));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BERANDA BLANK.png"))); // NOI18N
        homeBtn.setText(" BERANDA");
        jPanel1.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BATAS.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 50));

        eventBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        eventBtn.setForeground(new java.awt.Color(118, 185, 0));
        eventBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/EVENT FILL.png"))); // NOI18N
        eventBtn.setText(" EVENT");
        jPanel1.add(eventBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        pengaduanBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pengaduanBtn.setForeground(new java.awt.Color(255, 255, 255));
        pengaduanBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pengaduanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pengaduan blank.png"))); // NOI18N
        pengaduanBtn.setText(" PENGADUAN");
        jPanel1.add(pengaduanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BATAS.png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 50));

        logoutBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/EXIT BLANK.png"))); // NOI18N
        jPanel1.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BATAS.png"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, -1, 50));

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/admin blank.png"))); // NOI18N
        jLabel25.setText(" ADMIN GEOFANY");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, -1, -1));

        jPanel27.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1330, 50));

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Exit.png"))); // NOI18N
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        jPanel27.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 10, -1, -1));

        minimizeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Minimize.png"))); // NOI18N
        minimizeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseClicked(evt);
            }
        });
        jPanel27.add(minimizeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void klikHome(MouseAdapter action){
        homeBtn.addMouseListener(action);
    }
    
    public void klikEvent(MouseAdapter action){
        eventBtn.addMouseListener(action);
    }
    
    public void klikPengaduan(MouseAdapter action) {
        pengaduanBtn.addMouseListener(action);
    }
    
    public void klikLogout(MouseAdapter action){
        logoutBtn.addMouseListener(action);
    }
    
    public void setDetailEvent(String Foto, String Judul, String Lokasi, String Tanggal, String Jam, String Narahubung){
        foto.setText(Foto);
        judul.setText(Judul);
        lokasi.setText(Lokasi);
        tanggal.setText(Tanggal);
        jam.setText(Jam);
        narahubung.setText(Narahubung);
    }
    
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
            java.util.logging.Logger.getLogger(V_detailEventAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_detailEventAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_detailEventAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_detailEventAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_detailEventAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eventBtn;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel head;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JTextArea isi;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JLabel jam;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JLabel lokasi;
    private javax.swing.JLabel minimizeBtn;
    private javax.swing.JLabel narahubung;
    private javax.swing.JLabel pengaduanBtn;
    private javax.swing.JScrollPane scroll2;
    private javax.swing.JLabel tanggal;
    // End of variables declaration//GEN-END:variables
}
