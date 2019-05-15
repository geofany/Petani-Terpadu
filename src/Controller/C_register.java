/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.V_register;
import View.V_login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author GeGa
 */
public class C_register {
   View.V_register views;
   
   public C_register(V_register views){
       this.views = views;
       this.views.setVisible(true);
       this.views.klikAttachFile1(new tblAttachFile1());
       this.views.klikAttachFile2(new tblAttachFile2());
       this.views.klikKembali(new tblKembali());
       this.views.klikDaftar(new tblDaftar());
       
   }

    private class tblAttachFile1 extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {                 
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File gambar1 = chooser.getSelectedFile();
            String filename1 = gambar1.getAbsolutePath();
            views.setFoto1(filename1);
        }
    }

    private class tblAttachFile2 extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File gambar2 = chooser.getSelectedFile();
            String filename2 = gambar2.getAbsolutePath();
            views.setFoto2(filename2);
        }
    }

    private class tblKembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.setVisible(false);
            Controller.C_login login = new Controller.C_login(new V_login());
        }
    }

    private class tblDaftar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.setVisible(false);
            Controller.C_login login = new Controller.C_login(new V_login());
        }
    }
}
