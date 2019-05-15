/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.V_homeAdmin;
import View.V_homeUser;
import View.V_login;
import View.V_lupaPass;
import View.V_register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author GeGa
 */
public class C_login {
    
    V_login views;
    
    
    public C_login(V_login views) {
        this.views = views;
        this.views.setVisible(true);
        this.views.klikLogin(new tblLogin());
        this.views.klikDaftar(new tblDaftar());
        this.views.klikLupasPass(new tblLupasPass());
        
        
    }

    private class tblLupasPass extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_lupaPass lupass = new Controller.C_lupaPass(new V_lupaPass());
            views.setVisible(false);
            
        }
    }

    private class tblDaftar extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_register register = new Controller.C_register(new V_register());
            views.setVisible(false);
            
        }        
        
    }

    private class tblLogin implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if (views.getUsername().equalsIgnoreCase("admin")) {
                views.message("Selamat Datang " + views.getUsername());             
                Controller.C_homeAdmin homeAdmin = new Controller.C_homeAdmin(new V_homeAdmin());
            } else {
                views.message("Selamat Datang " + views.getUsername());
                Controller.C_homeUser homeUser = new Controller.C_homeUser(new V_homeUser());
            }
            views.setVisible(false);
            
        }
    }
    
    
    

    
        
    
    
   
}
