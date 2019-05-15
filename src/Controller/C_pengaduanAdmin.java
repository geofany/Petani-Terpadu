/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.V_pengaduanAdmin;

/**
 *
 * @author GeGa
 */
public class C_pengaduanAdmin {
    View.V_pengaduanAdmin views;
   
   public C_pengaduanAdmin(V_pengaduanAdmin views){
       this.views = views;
       this.views.setVisible(true);
       
   }
}
