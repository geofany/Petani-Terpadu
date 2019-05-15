/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.V_tambahEvent;

/**
 *
 * @author GeGa
 */
public class C_tambahEvent {
    View.V_tambahEvent views;
   
   public C_tambahEvent(V_tambahEvent views){
       this.views = views;
       this.views.setVisible(true);
       
   }
}
