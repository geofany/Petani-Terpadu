/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.V_editHome;
import View.V_eventAdmin;
import View.V_homeAdmin;
import View.V_login;
import View.V_pengaduanAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author GeGa
 */
public class C_editHome {
    View.V_editHome views;
   
   public C_editHome(V_editHome views){
       this.views = views;
       this.views.setVisible(true);
       this.views.klikHome(new tblHome());
       this.views.klikEvent(new tblEvent());
       this.views.klikPengaduan(new tblPengaduan());
       this.views.klikLogout(new tblLogout());
       this.views.klikAttachFile(new tblAttachFile());
       this.views.klikSimpan(new tblSimpan());
   }
   
   private class tblSimpan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int response = views.confirm("Apakah Anda Yakin Ingin Menyimpan Data ?");
            if (response == JOptionPane.YES_OPTION) {
                //DIISI MODEL
                views.message("Data Berhasil Disimpan");
                Controller.C_homeAdmin home = new Controller.C_homeAdmin(new V_homeAdmin());
                views.setVisible(false);
            } else {
                views.message("Data Tidak Disimpan");
                Controller.C_homeAdmin home = new Controller.C_homeAdmin(new V_homeAdmin());
                views.setVisible(false);
            }
        }
    }
   
   private class tblHome extends MouseAdapter {
        
        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_homeAdmin home = new Controller.C_homeAdmin(new V_homeAdmin());
            views.setVisible(false);
            
        }
    }
   
    private class tblEvent extends MouseAdapter {
        
        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_eventAdmin event = new Controller.C_eventAdmin(new V_eventAdmin());
            views.setVisible(false);
            
        }
    }

    private class tblPengaduan extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_pengaduanAdmin pengaduan = new Controller.C_pengaduanAdmin(new V_pengaduanAdmin());
            views.setVisible(false);
            
        }
    }

    private class tblLogout extends MouseAdapter {
        
        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_login logout = new Controller.C_login(new V_login());
            views.setVisible(false);
            
        }
    }
    
    private class tblAttachFile extends MouseAdapter {
        
        @Override
        public void mouseClicked(MouseEvent e) {            
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File gambar1 = chooser.getSelectedFile();
            String filename1 = gambar1.getAbsolutePath();
            views.setFoto(filename1);
            
        }
    }
}
