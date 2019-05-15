/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.V_eventAdmin;

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
   }
   
   
}
