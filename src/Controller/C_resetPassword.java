/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.V_login;
import View.V_lupaPass;
import View.V_resetPassword;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author GeGa
 */
public class C_resetPassword {
   View.V_resetPassword views;
   
   public C_resetPassword(V_resetPassword views){
       this.views = views;
       this.views.setVisible(true);
       this.views.klikBack(new tblBack());
       this.views.klikReset(new tblReset());
   }

    private class tblBack implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Controller.C_lupaPass back = new Controller.C_lupaPass(new V_lupaPass());
            views.setVisible(false);
        }
    }

    private class tblReset implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Controller.C_login reset = new Controller.C_login(new V_login());
            views.setVisible(false);
        }
    }
}
