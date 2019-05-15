/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.V_detailPengaduanAdmin;
import View.V_eventAdmin;
import View.V_homeAdmin;
import View.V_login;
import View.V_pengaduanAdmin;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author GeGa
 */
public class C_detailPengaduanAdmin {
    View.V_detailPengaduanAdmin views;
   
   public C_detailPengaduanAdmin(V_detailPengaduanAdmin views){
       this.views = views;
       this.views.setVisible(true);
       this.views.klikHome(new tblHome());
       this.views.klikEvent(new tblEvent());
       this.views.klikPengaduan(new tblPengaduan());
       this.views.klikLogout(new tblLogout());
       //DIISI MODEL
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
   
}
