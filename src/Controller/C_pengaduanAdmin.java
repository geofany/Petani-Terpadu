/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.V_detailEventAdmin;
import View.V_detailPengaduanAdmin;
import View.V_eventAdmin;
import View.V_homeAdmin;
import View.V_login;
import View.V_pengaduanAdmin;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author GeGa
 */
public class C_pengaduanAdmin {
    View.V_pengaduanAdmin views;
   
   public C_pengaduanAdmin(V_pengaduanAdmin views){
       this.views = views;
       this.views.setVisible(true);
       this.views.klikEvent(new tblEvent());
       this.views.klikHome(new tblHome());
       this.views.klikLogout(new tblLogout());
       this.views.klikDetail(new tblDetail());
       this.views.klikTolak(new tblTolak());
       this.views.klikProses(new tblProses());
       this.views.klikSelesai(new tblSelesai());
   }
   
   private class tblTolak extends MouseAdapter {
        
        @Override
        public void mouseClicked(MouseEvent e) {            
            int response = views.confirm("Apakah Anda Yakin Ingin Menolak Pengaduan Ini ?");
            if (response == JOptionPane.YES_OPTION) {
                //DIISI MODEL
                views.message("Pengaduan Berhasil Ditolak");
                Controller.C_pengaduanAdmin pengaduan = new Controller.C_pengaduanAdmin(new V_pengaduanAdmin());
                views.setVisible(false);
            } 
            
        }
    }
   
   private class tblProses extends MouseAdapter {
        
        @Override
        public void mouseClicked(MouseEvent e) {            
            int response = views.confirm("Apakah Anda Yakin Ingin Memproses Pengaduan Ini ?");
            if (response == JOptionPane.YES_OPTION) {
                //DIISI MODEL
                views.message("Pengaduan Berhasil Diproses");
                Controller.C_pengaduanAdmin pengaduan = new Controller.C_pengaduanAdmin(new V_pengaduanAdmin());
                views.setVisible(false);
            } 
            
        }
    }
   
   private class tblSelesai extends MouseAdapter {
        
        @Override
        public void mouseClicked(MouseEvent e) {            
            int response = views.confirm("Apakah Anda Yakin Ingin Menyelesaikan Pengaduan Ini ?");
            if (response == JOptionPane.YES_OPTION) {
                //DIISI MODEL
                views.message("Pengaduan Berhasil Diselesaikan");
                Controller.C_pengaduanAdmin pengaduan = new Controller.C_pengaduanAdmin(new V_pengaduanAdmin());
                views.setVisible(false);
            } 
            
        }
    }
   
   private class tblDetail extends MouseAdapter {
        
        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_detailPengaduanAdmin detail = new Controller.C_detailPengaduanAdmin(new V_detailPengaduanAdmin());
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

    private class tblHome extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_homeAdmin home = new Controller.C_homeAdmin(new V_homeAdmin());
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
   
   
}
