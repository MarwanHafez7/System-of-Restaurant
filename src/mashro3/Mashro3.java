/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mashro3;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Emad
 */
public class Mashro3 {



    public static void main(String[] args) {
GuiAdmin g=new GuiAdmin();
GUI f=new GUI();

//g.Adminlogin_form();
//g.change_pass();
//g.modfiy_form("riham");
//f.Welcome_form(2);
//g.register_form();
//f.login_form();
//f.start();
//f.make_order(2);
f.confirm_order(4);


 
    }
}