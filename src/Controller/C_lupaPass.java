/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.V_lupaPass;
import View.V_login;
import View.V_resetPassword;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author GeGa
 */
public class C_lupaPass {
    V_lupaPass views;
    String user;
    
    public C_lupaPass(V_lupaPass views) {
        this.views = views;
        this.views.setVisible(true);
        this.views.klikBack(new tblBack());
        this.views.klikNext(new tblNext());
    }

    private class tblBack implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.setVisible(false);
            Controller.C_login back = new Controller.C_login(new V_login());
        }
    }

    private class tblNext implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.setVisible(false);
            Controller.C_resetPassword reset = new Controller.C_resetPassword(new V_resetPassword());
        }
    }
    
    
}
