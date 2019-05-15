/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.V_tambahHome;

/**
 *
 * @author GeGa
 */
public class C_tambahHome {
    View.V_tambahHome views;
   
   public C_tambahHome(V_tambahHome views){
       this.views = views;
       this.views.setVisible(true);
       
   }
}
