/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.V_homeAdmin;
/**
 *
 * @author GeGa
 */
public class C_homeAdmin {
    View.V_homeAdmin views;
    
    public C_homeAdmin(V_homeAdmin views){
        this.views = views;
        this.views.setVisible(true);
    }
}
