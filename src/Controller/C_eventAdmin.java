/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.V_detailEventAdmin;
import View.V_editEvent;
import View.V_eventAdmin;
import View.V_homeAdmin;
import View.V_login;
import View.V_pengaduanAdmin;
import View.V_tambahEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author GeGa
 */
public class C_eventAdmin {
    View.V_eventAdmin views;
   
   public C_eventAdmin(V_eventAdmin views){
       this.views = views;
       this.views.setVisible(true);
       this.views.klikHome(new tblHome());
       this.views.klikPengaduan(new tblPengaduan());
       this.views.klikLogout(new tblLogout());
       this.views.klikDetail(new tblDetail());
       this.views.klikDelete(new tblDelete());
       this.views.klikEdit(new tblEdit());
       this.views.klikTambah(new tblTambah());
   }
   
   private class tblTambah extends MouseAdapter {
        
        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_tambahEvent tambah = new Controller.C_tambahEvent(new V_tambahEvent());
            views.setVisible(false);
            
        }
    }
   
   private class tblEdit extends MouseAdapter {
        
        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_editEvent edit = new Controller.C_editEvent(new V_editEvent());
            views.setVisible(false);
            
        }
    }
   
   private class tblDelete extends MouseAdapter {
        
        @Override
        public void mouseClicked(MouseEvent e) {            
            int response = views.confirm("Apakah Anda Yakin Ingin Menghapus Data ?");
            if (response == JOptionPane.YES_OPTION) {
                //DIISI MODEL
                views.message("Data Berhasil Dihapus");
                Controller.C_eventAdmin event = new Controller.C_eventAdmin(new V_eventAdmin());
                views.setVisible(false);
            } 
            
        }
    }
   
   private class tblDetail extends MouseAdapter {
        
        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_detailEventAdmin detail = new Controller.C_detailEventAdmin(new V_detailEventAdmin());
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
}
