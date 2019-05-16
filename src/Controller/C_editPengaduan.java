/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.V_akun;
import View.V_editPengaduan;
import View.V_eventUser;
import View.V_histoyPengaduan;
import View.V_homeUser;
import View.V_login;
import View.V_pengaduan;
import View.V_prosesPengaduan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author GeGa
 */
public class C_editPengaduan {
    View.V_editPengaduan views;
   
   public C_editPengaduan(V_editPengaduan views){
       this.views = views;
       this.views.setVisible(true);
       this.views.klikEvent(new tblEvent());
       this.views.klikHome(new tblHome());
       this.views.klikProsesPengaduan(new tblProsesPengaduan());
       this.views.klikLogout(new tblLogout());
       this.views.klikSetting(new tblSetting());
       this.views.klikPengaduanBaru(new tblPengaduanBaru());
       this.views.klikHistoryPengaduan(new tblHistoryPengaduan());
       this.views.klikSimpan(new tblSimpan());
       this.views.klikAttachFile1(new tblAttachFile1());
       this.views.klikAttachFile2(new tblAttachFile2());
       
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
   
    private class tblSimpan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int response = views.confirm("Apakah Anda Yakin Ingin Mengubah Aduan ?");
            if (response == JOptionPane.YES_OPTION) {
                //DIISI MODEL
                views.message("Data Berhasil Disimpan");
                Controller.C_prosesPengaduan proses = new Controller.C_prosesPengaduan(new V_prosesPengaduan());
                views.setVisible(false);
            }
        }
    }
   
   private class tblEvent extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_eventUser event = new Controller.C_eventUser(new V_eventUser());
            views.setVisible(false);
            
        }
    }

    private class tblHome extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_homeUser home = new Controller.C_homeUser(new V_homeUser());
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

    private class tblSetting extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_akun setting = new Controller.C_akun(new V_akun());
            views.setVisible(false);
            
        }
    }

    private class tblPengaduanBaru extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_pengaduan pengaduanBaru = new Controller.C_pengaduan(new V_pengaduan());
            views.setVisible(false);
            
        }
    }

    private class tblHistoryPengaduan extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_historyPengaduan historyPengaduan = new Controller.C_historyPengaduan(new V_histoyPengaduan());
            views.setVisible(false);
            
        }
    }
   
    private class tblProsesPengaduan extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {            
            Controller.C_prosesPengaduan prosesPengaduan = new Controller.C_prosesPengaduan(new V_prosesPengaduan());
            views.setVisible(false);
            
        }
    }
    
    
    
}
