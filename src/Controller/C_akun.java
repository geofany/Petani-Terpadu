/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.V_akun;
import View.V_editAkun;
import View.V_eventUser;
import View.V_homeUser;
import View.V_login;
import View.V_pengaduan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author GeGa
 */
public class C_akun {
    View.V_akun views;
   
   public C_akun(V_akun views){
       this.views = views;
       this.views.setVisible(true);
       this.views.klikHome(new tblHome());
       this.views.klikEvent(new tblEvent());
       this.views.klikPengaduan(new tblPengaduan());
       this.views.klikLogout(new tblLogout());
       this.views.klikEditAkun(new tblEditAkun());
       this.views.klikHapusAkun(new tblHapusAkun());
       //DIISI MODEL 
   }

    private class tblHapusAkun extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {            
            int response = views.confirm("Apakah Anda yakin ingin menghapus akun anda ?");
        
            if (response == JOptionPane.YES_OPTION) {
                String password = views.input("Masukkan Password Anda");
                if (password.equalsIgnoreCase("Password")) {
                    Controller.C_login logout = new Controller.C_login(new V_login());               
                    views.setVisible(false);
                } else {
                    views.message("Password Yang Anda Masukkan Salah!");
                }
                
        }
            
        }
    }

    private class tblEditAkun implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Controller.C_editAkun edit = new Controller.C_editAkun(new V_editAkun());
            views.setVisible(false);
        }

        
    }
   private class tblHome extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_homeUser home = new Controller.C_homeUser(new V_homeUser());
            views.setVisible(false);
            
        }
    }

    private class tblEvent extends MouseAdapter {
        
        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_eventUser event = new Controller.C_eventUser(new V_eventUser());
            views.setVisible(false);
            
        }
    }

    private class tblPengaduan extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_pengaduan pengaduan = new Controller.C_pengaduan(new V_pengaduan());
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
