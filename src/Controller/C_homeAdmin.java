/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.V_detailEventAdmin;
import View.V_detailHomeAdmin;
import View.V_editEvent;
import View.V_editHome;
import View.V_eventAdmin;
import View.V_homeAdmin;
import View.V_login;
import View.V_pengaduanAdmin;
import View.V_tambahEvent;
import View.V_tambahHome;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author GeGa
 */
public class C_homeAdmin {
    View.V_homeAdmin views;
    
    public C_homeAdmin(V_homeAdmin views){
        this.views = views;
        this.views.setVisible(true);
        this.views.klikEvent(new tblEvent());
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
            Controller.C_tambahHome tambah = new Controller.C_tambahHome(new V_tambahHome());
            views.setVisible(false);
            
        }
    }
   
   private class tblEdit extends MouseAdapter {
        
        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_editHome edit = new Controller.C_editHome(new V_editHome());
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
                Controller.C_homeAdmin home = new Controller.C_homeAdmin(new V_homeAdmin());
                views.setVisible(false);
            } 
            
        }
    }
   
   private class tblDetail extends MouseAdapter {
        
        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_detailHomeAdmin detail = new Controller.C_detailHomeAdmin(new V_detailHomeAdmin());
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
}
