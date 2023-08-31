/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mashro3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import static javax.swing.JOptionPane.showMessageDialog;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
//import javafx.scene.layout.Border;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author Emad
 */
public class GuiAdmin implements ActionListener {
     ResultSet r;
    
    Database db=new Database();
    
    ImageIcon mpg = new ImageIcon(getClass().getResource("Delicious Pizza.JPG"));
    JLabel imageLabel;
    
    ImageIcon mpg1 = new ImageIcon(getClass().getResource("Pizza Pizzeria.jpg"));
         JLabel imageLabel1;
         
         ImageIcon mpg4 = new ImageIcon(getClass().getResource("Black Pizza .jpg"));
        JLabel imageLabel3;
    
    
    
    //Admin Functions
   //login_attribute
    JTextField AdminN=new JTextField();
    JPasswordField AdminP=new JPasswordField ();
    JButton btn= new JButton("Login");
    JLabel namel= new JLabel("Username");
    JLabel passl= new JLabel("Password");
    JLabel AdminL= new JLabel("Login");
    JButton b_back4= new JButton("Bck to start") ;
    JPanel AdminPl =new JPanel();
    JFrame jAdmin=new JFrame();
    
   public void Adminlogin_form()
   {
       
        
       jAdmin.setVisible(true);
       jAdmin.setSize(400,711);
       jAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jAdmin.setLocation(100, 100);
       jAdmin.setLayout(null);
              
        jAdmin.add(AdminPl);
        AdminPl.setLayout(null);
        AdminPl.setBounds(0, 0, 400, 711);
       
        imageLabel = new JLabel(mpg);
        imageLabel.setBounds(0, 0, 400, 711);
        AdminPl.add(AdminN);
        AdminPl.add(AdminP);
        AdminPl.add(btn);
        AdminPl.add(AdminL);
        AdminPl.add(namel);
        AdminPl.add(passl);
        AdminPl.add(imageLabel);
        
        
      
        AdminL.setBounds(125, 130, 1000, 80);
        AdminL.setFont(new Font("Harlow Solid Italic",Font.ITALIC,60));
        AdminL.setForeground(new Color(255,153,0));
        
        namel.setBounds(60, 260, 90, 30);
        namel.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        namel.setForeground(new Color(255,153,0));
        
        passl.setBounds(60, 340, 80, 30);
        passl.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        passl.setForeground(new Color(255,153,0));
        
        AdminN.setBounds(170, 260, 160, 30);
        AdminN.setFont(new Font("Tahoma",Font.PLAIN,11));
        AdminN.setForeground(new Color(153,153,153));
        AdminN.setForeground(Color.LIGHT_GRAY);
        Border border = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        AdminN.setBorder(border);
        
        AdminP.setBounds(170, 340, 160, 30);
        AdminP.setFont(new Font("Tahoma",Font.PLAIN,11));
        AdminP.setForeground(new Color(153,153,153));
        AdminP.setForeground(Color.LIGHT_GRAY);
        Border border1 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        AdminP.setBorder(border1);
        
        btn.setBounds(145, 430, 100, 30);
        btn.setBackground(new Color(255,153,0));
        btn.setForeground(new Color(255,255,255));
        btn.setFont(new Font("Tahoma",Font.BOLD,14));
        Border border2 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        btn.setBorder(border2);
        
     
        
        btn.addActionListener(this);
    
        
       
   }
   
   
   //welcome attributes
    JButton CategBtn= new JButton("Manage Categories");
    JButton AdminLogoutBtn= new JButton("Log Out");
    JButton BookingBtn= new JButton("Manage Booking");
    JButton PaymentBtn= new JButton("Check Payment");
    JButton AvailBtn= new JButton("Check Availability");
    JButton DlevBtn= new JButton("Manage Delivery Staff");
    JButton PriceBtn= new JButton("Change Password");
    JButton PassoBtn= new JButton("Manage Profile");
    
    JPanel AdPl=new JPanel();
    JFrame Adj=new JFrame();
    //JLabel l6;
    JLabel Adla = new JLabel("Welcome to our Pizza Shop");
    JLabel PageLa ;
    
   public void AdminWelcome_form(int id)
   {
//       int zeft= 0;
//       db.connect();
//       r=db.retreive_Userdata("users");
//     try {
//       r.next() ;
//       zeft =r.getInt("id") ;}
//       catch(SQLException ex) {
//           System.out.println(ex.getMessage());
//           
//       }
//             
//               System.out.println(zeft);
//       try {
//           while (r.next())
//           {
//               if(r.getInt("id")==id){
//                   
//                   l6=new JLabel("welcome mr :"+r.getString("name"));
//                   String a7a= l6.getText() ;
//                   break;
//                   
//               }
//               
//           }
//       }catch (SQLException ex){
//           System.out.print(ex.getMessage());
//       }
       
       Adj.setSize(416,750);
       Adj.setVisible(true);
       Adj.setLocation(100,100);
       Adj.setLayout(null);
       Adj.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
       
       Adj.add(AdPl);
       AdPl.setLayout(null);
       AdPl.setBounds(0,0, 416,750);
       imageLabel1 = new JLabel(mpg1);
       imageLabel1.setBounds(0, 0, 400, 711);
        
       AdPl.add(Adla);
       AdPl.add(CategBtn);
       AdPl.add(BookingBtn);
       AdPl.add(PaymentBtn);
       AdPl.add(AvailBtn);
       AdPl.add(DlevBtn);
       AdPl.add(PriceBtn);
       AdPl.add(PassoBtn);
       AdPl.add(AdminLogoutBtn);
       AdPl.add(imageLabel1);
       
       
        Adla.setBounds(20, 70, 360, 50);
        Adla.setFont(new Font("Harlow Solid Italic",Font.ITALIC,32));
        Adla.setForeground(new Color(255,153,0));
        
        
        CategBtn.setBounds(30, 180, 340, 40);
        CategBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,24));
        CategBtn.setForeground(new Color(255,255,255));
        CategBtn.setBackground(new Color(255,153,0));
        Border border = BorderFactory.createBevelBorder(0, null, null,null, Color.DARK_GRAY);
        CategBtn.setBorder(border);
      
        BookingBtn.setBounds(30, 240, 340, 40);
        BookingBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,24));
        BookingBtn.setForeground(new Color(255,255,255));
        BookingBtn.setBackground(new Color(255,153,0));
        Border border1 = BorderFactory.createBevelBorder(0, null, null,null, Color.DARK_GRAY);
        BookingBtn.setBorder(border1);
        
        PaymentBtn.setBounds(30, 300, 340, 40);
        PaymentBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,24));
        PaymentBtn.setForeground(new Color(255,255,255));
        PaymentBtn.setBackground(new Color(255,153,0));
        Border border2 = BorderFactory.createBevelBorder(0, null, null,null, Color.DARK_GRAY);
        PaymentBtn.setBorder(border2);
        
        AvailBtn.setBounds(30, 360, 340, 40);
        AvailBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,24));
        AvailBtn.setForeground(new Color(255,255,255));
        AvailBtn.setBackground(new Color(255,153,0));
        Border border3 = BorderFactory.createBevelBorder(0, null, null,null, Color.DARK_GRAY);
        AvailBtn.setBorder(border3);
        
        
        DlevBtn.setBounds(30, 420, 340, 40);
        DlevBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,24));
        DlevBtn.setForeground(new Color(255,255,255));
        DlevBtn.setBackground(new Color(255,153,0));
        DlevBtn.setBorder(border3);
        
        PriceBtn.setBounds(30, 480, 340, 40);
        PriceBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,24));
        PriceBtn.setForeground(new Color(255,255,255));
        PriceBtn.setBackground(new Color(255,153,0));
        PriceBtn.setBorder(border3);
        
        PassoBtn.setBounds(30, 540, 340, 40);
        PassoBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,24));
        PassoBtn.setForeground(new Color(255,255,255));
        PassoBtn.setBackground(new Color(255,153,0));
        PassoBtn.setBorder(border3);
        
        AdminLogoutBtn.setBounds(30, 600, 340, 40);
        AdminLogoutBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,24));
        AdminLogoutBtn.setForeground(new Color(255,255,255));
        AdminLogoutBtn.setBackground(new Color(255,153,0));
        AdminLogoutBtn.setBorder(border3);
        
        
    
       CategBtn.addActionListener(this);
       BookingBtn.addActionListener(this);
       PaymentBtn.addActionListener(this);
       AvailBtn.addActionListener(this);
       DlevBtn.addActionListener(this);
       PriceBtn.addActionListener(this);
       PassoBtn.addActionListener(this);
       AdminLogoutBtn.addActionListener(this);
   
       
   }
   
   
   //manage orders attribute
   JPanel MPl=new JPanel();
   JFrame Mj=new JFrame();
   JLabel Mla = new JLabel("Manage Orders");
    JTextField ordertxt =new JTextField();
    JButton ViewBtn= new JButton("View Order");
    JButton EditBtn= new JButton("Edit Order");
    JButton DeleteBtn= new JButton("Delete Order");
    public void manage_orders()
    {
       Mj.setSize(416,750);
       Mj.setVisible(true);
       Mj.setLocation(100,100);
       Mj.setLayout(null);
       Mj.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
       
       Mj.add(MPl);
       MPl.setLayout(null);
       MPl.setBounds(0,0, 416,750);
       imageLabel3 = new JLabel(mpg4);
       imageLabel3.setBounds(0, 0, 400, 711);
        
       MPl.add(Mla);
       MPl.add(ordertxt);
       MPl.add(ViewBtn);
       MPl.add(EditBtn);
       MPl.add(DeleteBtn);
       MPl.add(imageLabel3);
        
        Mla.setBounds(90, 70, 360, 50);
        Mla.setFont(new Font("Harlow Solid Italic",Font.ITALIC,32));
        Mla.setForeground(new Color(255,153,0));
        
        
        ordertxt.setBounds(30, 150, 340, 200);
        ordertxt.setFont(new Font("Tahoma",Font.PLAIN,11));
        ordertxt.setForeground(new Color(153,153,153));
        ordertxt.setForeground(Color.LIGHT_GRAY);
        Border border = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        ordertxt.setBorder(border);
        
        ViewBtn.setBounds(30, 380, 110, 40);
        ViewBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,18));
        ViewBtn.setForeground(new Color(255,255,255));
        ViewBtn.setBackground(new Color(255,153,0));
        Border border3 = BorderFactory.createBevelBorder(0, null, null,null, Color.DARK_GRAY);
        ViewBtn.setBorder(border3);
        
        EditBtn.setBounds(145, 380, 110, 40);
        EditBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,18));
        EditBtn.setForeground(new Color(255,255,255));
        EditBtn.setBackground(new Color(255,153,0));
        EditBtn.setBorder(border3);
        
        DeleteBtn.setBounds(260, 380, 110, 40);
        DeleteBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,18));
        DeleteBtn.setForeground(new Color(255,255,255));
        DeleteBtn.setBackground(new Color(255,153,0));
        DeleteBtn.setBorder(border3);
        
       ViewBtn.addActionListener(this);
       EditBtn.addActionListener(this);
       DeleteBtn.addActionListener(this);
        
        
    }
    
    
    //Check payment attribute
    JPanel CPl=new JPanel();
    JFrame Cj=new JFrame();
    JLabel Cla = new JLabel("Check Payment");
    JLabel Cla1 = new JLabel("User's Name");
    JTextField checktxt =new JTextField();
    JTextField checktxt1 =new JTextField();
    JButton CBtn= new JButton("Check Payment");
    
    public void check_payments()
    {
       Cj.setSize(416,750);
       Cj.setVisible(true);
       Cj.setLocation(100,100);
       Cj.setLayout(null);
       Cj.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
       
       Cj.add(CPl);
       CPl.setLayout(null);
       CPl.setBounds(0,0, 416,750);
       imageLabel3 = new JLabel(mpg);
       imageLabel3.setBounds(0, 0, 400, 711);
        
       CPl.add(Cla);
       CPl.add(Cla1);
       CPl.add(checktxt);
       CPl.add(checktxt1);
       CPl.add(CBtn);
       CPl.add(imageLabel3);
        
        Cla.setBounds(90, 80, 360, 50);
        Cla.setFont(new Font("Harlow Solid Italic",Font.ITALIC,32));
        Cla.setForeground(new Color(255,255,255));
        
        Cla1.setBounds(30, 195, 360, 50);
        Cla1.setFont(new Font("Harlow Solid Italic",Font.ITALIC,24));
        Cla1.setForeground(new Color(255,153,0));
        
        checktxt.setBounds(30, 250, 340, 200);
        checktxt.setFont(new Font("Tahoma",Font.PLAIN,11));
        checktxt.setForeground(new Color(153,153,153));
        checktxt.setForeground(Color.LIGHT_GRAY);
        Border border = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        checktxt.setBorder(border);
        
        checktxt1.setBounds(180, 205, 190, 30);
        checktxt1.setFont(new Font("Tahoma",Font.PLAIN,11));
        checktxt1.setForeground(new Color(153,153,153));
        checktxt1.setForeground(Color.LIGHT_GRAY);
        checktxt1.setBorder(border);
        
        
        CBtn.setBounds(140, 470, 130, 40);
        CBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,18));
        CBtn.setForeground(new Color(255,255,255));
        CBtn.setBackground(new Color(255,153,0));
        Border border3 = BorderFactory.createBevelBorder(0, null, null,null, Color.DARK_GRAY);
        CBtn.setBorder(border3);
        
        
        
       CBtn.addActionListener(this);
        
        
    }
   
   
   
   //Available stock attribute
    JPanel SPl=new JPanel();
    JFrame Sj=new JFrame();
    JLabel Sla = new JLabel("Check Available Stocks");
    JTextField stxt =new JTextField();
    JButton SBtn= new JButton("Show Available Stocks");
    
    public void check_available()
    {
       Sj.setSize(416,750);
       Sj.setVisible(true);
       Sj.setLocation(100,100);
       Sj.setLayout(null);
       Sj.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
       
       Sj.add(SPl);
       SPl.setLayout(null);
       SPl.setBounds(0,0, 416,750);
       imageLabel = new JLabel(mpg);
       imageLabel.setBounds(0, 0, 400, 711);
        
       SPl.add(Sla);
       SPl.add(stxt);
       SPl.add(SBtn);
       SPl.add(imageLabel);
        
        Sla.setBounds(45, 100, 360, 50);
        Sla.setFont(new Font("Harlow Solid Italic",Font.ITALIC,32));
        Sla.setForeground(new Color(255,255,255));
        
      
        
        stxt.setBounds(30, 200, 340, 200);
        stxt.setFont(new Font("Tahoma",Font.PLAIN,11));
        stxt.setForeground(new Color(153,153,153));
        stxt.setForeground(Color.LIGHT_GRAY);
        Border border = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        stxt.setBorder(border);
        
        
        SBtn.setBounds(105, 430, 190, 40);
        SBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,18));
        SBtn.setForeground(new Color(255,255,255));
        SBtn.setBackground(new Color(255,153,0));
        Border border3 = BorderFactory.createBevelBorder(0, null, null,null, Color.DARK_GRAY);
        SBtn.setBorder(border3);
        
        
        
       SBtn.addActionListener(this);
        
        
    }
   
    
    //Staff attribute
    JPanel MsPl=new JPanel();
    JFrame Msj=new JFrame();
    JLabel Msla = new JLabel("Manage Delivery Staff");
    JTextField Mstxt =new JTextField();
    JButton MsBtn= new JButton("Show Available Staff");
    JButton MsBtn1= new JButton("Add Available Staff");
    public void manage_staff()
    {
       Msj.setSize(416,750);
       Msj.setVisible(true);
       Msj.setLocation(100,100);
       Msj.setLayout(null);
       Msj.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
       
       Msj.add(MsPl);
       MsPl.setLayout(null);
       MsPl.setBounds(0,0, 416,750);
       imageLabel = new JLabel(mpg);
       imageLabel.setBounds(0, 0, 400, 711);
        
       MsPl.add(Msla);
       MsPl.add(Mstxt);
       MsPl.add(MsBtn);
       MsPl.add(MsBtn1);
       MsPl.add(imageLabel);
        
        Msla.setBounds(45, 100, 360, 50);
        Msla.setFont(new Font("Harlow Solid Italic",Font.ITALIC,32));
        Msla.setForeground(new Color(255,255,255));
        
      
        
        Mstxt.setBounds(30, 200, 340, 200);
        Mstxt.setFont(new Font("Tahoma",Font.PLAIN,11));
        Mstxt.setForeground(new Color(153,153,153));
        Mstxt.setForeground(Color.LIGHT_GRAY);
        Border border = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        Mstxt.setBorder(border);
        
        
        MsBtn.setBounds(100, 415, 190, 40);
        MsBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,18));
        MsBtn.setForeground(new Color(255,255,255));
        MsBtn.setBackground(new Color(255,153,0));
        Border border3 = BorderFactory.createBevelBorder(0, null, null,null, Color.DARK_GRAY);
        MsBtn.setBorder(border3);
        
        MsBtn1.setBounds(100, 460, 190, 40);
        MsBtn1.setFont(new Font("Harlow Solid Italic",Font.ITALIC,18));
        MsBtn1.setForeground(new Color(255,255,255));
        MsBtn1.setBackground(new Color(255,153,0));
        MsBtn1.setBorder(border3);
        
        
       MsBtn.addActionListener(this);
        
        
    }
    
    
    
   
   //change password 
    JPasswordField Adcurrent_password=new JPasswordField ();
    JPasswordField Adconfirm_password=new JPasswordField ();
    JPasswordField Adnew_password=new JPasswordField ();
         
    JLabel Adcurrent_pass=new JLabel("Current Password");
    JLabel Adnew_pass=new JLabel("New Password");
    JLabel Adconfirm_pass=new JLabel("Confirm Password");
    JLabel AdPageLl=new JLabel("Change Password");
    JFrame AdJPass=new JFrame();
    JPanel AdPassPan =new JPanel();
    JButton Adb_save= new JButton("Save");
    JButton Adb_back= new JButton("Back");
    
    public void Adminchange_pass(){
         
        AdJPass.setVisible(true);
        AdJPass.setSize(416,750);
        AdJPass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AdJPass.setLayout(null);
        AdJPass.setLocation(100,100);
        
        
        AdPassPan.setLayout(null);
        AdPassPan.setBounds(0, 0, 400, 711);
        AdPassPan.setVisible(true);
        imageLabel3 = new JLabel(mpg4);
        imageLabel3.setBounds(0, 0, 400, 711);

        
         AdPassPan.setLayout(null);
         AdPassPan.setBounds(0, 0, 400, 711);
         AdJPass.add(AdPassPan);
         
         AdPassPan.add(AdPageLl);
         AdPassPan.add(Adcurrent_password);
         AdPassPan.add(Adnew_password);
         AdPassPan.add(Adconfirm_password);
         AdPassPan.add(Adcurrent_pass);
         AdPassPan.add(Adnew_pass);
         AdPassPan.add(Adconfirm_pass);
         AdPassPan.add(Adb_save);
         AdPassPan.add(Adb_back);
         AdPassPan.add(imageLabel3);
         
        AdPageLl.setBounds(90, 70, 360, 50);
        AdPageLl.setFont(new Font("Harlow Solid Italic",Font.ITALIC,32));
        AdPageLl.setForeground(new Color(255,153,0));
        
        Adcurrent_pass.setBounds(40, 160, 200, 30);
        Adcurrent_pass.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        Adcurrent_pass.setForeground(new Color(255,153,0));
        
        Adnew_pass.setBounds(40, 230, 200, 30);
        Adnew_pass.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        Adnew_pass.setForeground(new Color(255,153,0));
        
        Adconfirm_pass.setBounds(40, 300, 200, 30);
        Adconfirm_pass.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        Adconfirm_pass.setForeground(new Color(255,153,0));
       
         
        Adcurrent_password.setBounds(210, 160, 160, 30);
        Adcurrent_password.setFont(new Font("Tahoma",Font.PLAIN,11));
        Adcurrent_password.setForeground(new Color(153,153,153));
        Adcurrent_password.setText("Enter Password");
        Adcurrent_password.setForeground(Color.LIGHT_GRAY);
        Border border3 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        Adcurrent_password.setBorder(border3); 
        
        Adnew_password.setBounds(210, 230, 160, 30);
        Adnew_password.setFont(new Font("Tahoma",Font.PLAIN,11));
        Adnew_password.setForeground(new Color(153,153,153));
        Adnew_password.setText("Enter Password");
        Adnew_password.setForeground(Color.LIGHT_GRAY);
        Adnew_password.setBorder(border3); 
        
        Adconfirm_password.setBounds(210, 300, 160, 30);
        Adconfirm_password.setFont(new Font("Tahoma",Font.PLAIN,11));
        Adconfirm_password.setForeground(new Color(153,153,153));
        Adconfirm_password.setText("Enter Password");
        Adconfirm_password.setForeground(Color.LIGHT_GRAY);
        Adconfirm_password.setBorder(border3); 
        
          
          
        Adb_save.setBounds(140, 370, 120, 30);
        Adb_save.setBackground(new Color(255,153,0));
        Adb_save.setForeground(new Color(255,255,255));
        Adb_save.setFont(new Font("Tahoma",Font.BOLD,14));
        Border border4 = BorderFactory.createBevelBorder(0, null, null,null,Color.DARK_GRAY);
        Adb_save.setBorder(border4);
     
        Adb_back.setBounds(151, 410, 100, 30);
        Adb_back.setBackground(new Color(255,255,255));
        Adb_back.setForeground(new Color(255,153,0));
        Adb_back.setFont(new Font("Tahoma",Font.BOLD,14));
        Adb_back.setBorder(border4);
        
        
  
          Adb_save.addActionListener(this);    
          Adb_back.addActionListener(this);
                 
          
    }
   
   
    //modify attribute
       JTextField Amt3=new JTextField();
       JTextField Amt4=new JTextField();
       JTextField Amt5=new JTextField();
       JLabel Aml3=new JLabel("Username");
       JLabel Aml4=new JLabel("Address");
       JLabel Aml5=new JLabel("Number");
       JLabel Aml6=new JLabel("Manage Profile");
       JPanel Amp2=new JPanel();
       JFrame Amj2=new JFrame();
       JButton Amodify= new JButton("Modify");
   
   public void Adminmodfiy_form(String name)
   {
//       db.connect();
//          r=db.retreive_Userdata("users");
//           
//               try{
//            while (r.next())
//            {
//             
//                
//                if (name.equalsIgnoreCase(r.getString("name")))
//                {
//                    mt3.setText(r.getString("name"));
//                    mt4.setText(String.valueOf(r.getInt("contactNumber")));
//                    mt5.setText(r.getString("address"));
//                    break;
//                }
//               
//                }
//            }catch (SQLException ex)
//                {
//                    System.out.print(ex.getMessage());
//                }
       
       Amj2.setSize(400,711);
       Amj2.setVisible(true);
       Amj2.setLocation(100,100);
       Amj2.setLayout(null);
       Amj2.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
       
       Amj2.add(Amp2);
       Amp2.setLayout(null);
       Amp2.setBounds(0,0,400,711);
       imageLabel = new JLabel(mpg);
       imageLabel.setBounds(0, 0, 400, 711);
     
        Amp2.add(Aml6);       
        Amp2.add(Amt3);
        Amp2.add(Amt4);
        Amp2.add(Amt5);
        Amp2.add(Amodify);
        Amp2.add(Aml3);
        Amp2.add(Aml4);
        Amp2.add(Aml5);
        Amp2.add(imageLabel);
        
        
        Aml6.setBounds(60, 120, 1000, 80);
        Aml6.setFont(new Font("Harlow Solid Italic",Font.ITALIC,40));
        Aml6.setForeground(new Color(255,153,0));
        
        Aml3.setBounds(60, 240, 90, 30);
        Aml3.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        Aml3.setForeground(new Color(255,153,0));
        
        Aml4.setBounds(60, 300, 80, 30);
        Aml4.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        Aml4.setForeground(new Color(255,153,0));
        
        Aml5.setBounds(60, 360, 500, 30);
        Aml5.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        Aml5.setForeground(new Color(255,153,0));
        
        
        Amt3.setBounds(170, 240, 160, 30);
        Amt3.setFont(new Font("Tahoma",Font.PLAIN,11));
        Amt3.setForeground(new Color(153,153,153));
        Amt3.setText("Enter Name");
        Amt3.setForeground(Color.LIGHT_GRAY);
        Border border = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        Amt3.setBorder(border);
        
        Amt4.setBounds(170, 300, 160, 30);
        Amt4.setFont(new Font("Tahoma",Font.PLAIN,11));
        Amt4.setForeground(new Color(153,153,153));
        Amt4.setText("Enter Address");
        Amt4.setForeground(Color.LIGHT_GRAY);
        Border border1 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        Amt4.setBorder(border1);
        
        Amt5.setBounds(170, 360, 160, 30);
        Amt5.setFont(new Font("Tahoma",Font.PLAIN,11));
        Amt5.setForeground(new Color(153,153,153));
        Amt5.setText("Enter Number");
        Amt5.setForeground(Color.LIGHT_GRAY);
        Border border2 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        Amt5.setBorder(border2);
        
        
        Amodify.setBounds(150, 430, 100, 30);
        Amodify.setBackground(new Color(255,153,0));
        Amodify.setForeground(new Color(255,255,255));
        Amodify.setFont(new Font("Tahoma",Font.BOLD,14));
        Border border4 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        Amodify.setBorder(border4);
        

        Amodify.addActionListener(this);
        
   }
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
//    
//    //modify attribute
//        JTextField mt3=new JTextField();
//       JTextField mt4=new JTextField();
//       JTextField mt5=new JTextField();
//        JLabel ml3=new JLabel("username");
//         JLabel ml4=new JLabel("ContactNumber");
//          JLabel ml5=new JLabel("Address");
//         JLabel ml6=new JLabel("Manage Profile");
//         
//         
//           JPanel mp2=new JPanel();
//       JFrame mj2=new JFrame();
//       JButton modify= new JButton("Modify");
//       ImageIcon mpg = new ImageIcon(getClass().getResource("Delicious Pizza.JPEG"));
//         JLabel imageLabel;
//   
//   public void modfiy_form(String name)
//   {
//       db.connect();
//          r=db.retreive_Userdata("users");
//           
//               try{
//            while (r.next())
//            {
//             
//                
//                if (name.equalsIgnoreCase(r.getString("name")))
//                {
//                    mt3.setText(r.getString("name"));
//                    mt4.setText(String.valueOf(r.getInt("contactNumber")));
//                    mt5.setText(r.getString("address"));
//                    break;
//                }
//               
//                }
//            }catch (SQLException ex)
//                {
//                    System.out.print(ex.getMessage());
//                }
//       
//       mj2.setSize(400,711);
//       mj2.setVisible(true);
//       mj2.setLocation(100,100);
//       mj2.setLayout(null);
//       mj2.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
//       
//       mj2.add(mp2);
//       mp2.setLayout(null);
//       mp2.setBounds(0,0,400,711);
//       imageLabel = new JLabel(mpg);
//       imageLabel.setBounds(0, 0, 400, 711);
//     
//        mp2.add(ml6);       
//        mp2.add(mt3);
//        mp2.add(mt4);
//        mp2.add(mt5);
//        mp2.add(modify);
//        mp2.add(ml3);
//        mp2.add(ml4);
//        mp2.add(ml5);
//        mp2.add(imageLabel);
//        
//        
//        ml6.setBounds(60, 120, 1000, 80);
//        ml6.setFont(new Font("Harlow Solid Italic",Font.ITALIC,40));
//        ml6.setForeground(new Color(255,153,0));
//        
//        ml3.setBounds(60, 240, 90, 30);
//        ml3.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
//        ml3.setForeground(new Color(255,153,0));
//        
//        ml4.setBounds(60, 300, 80, 30);
//        ml4.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
//        ml4.setForeground(new Color(255,153,0));
//        
//        ml5.setBounds(60, 360, 500, 30);
//        ml5.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
//        ml5.setForeground(new Color(255,153,0));
//        
//        
//        mt3.setBounds(170, 240, 160, 30);
//        mt3.setFont(new Font("Tahoma",Font.PLAIN,11));
//        mt3.setForeground(new Color(153,153,153));
//        mt3.setText("Enter Name");
//        mt3.setForeground(Color.LIGHT_GRAY);
//        Border border = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
//        mt3.setBorder(border);
//        
//        mt4.setBounds(170, 300, 160, 30);
//        mt4.setFont(new Font("Tahoma",Font.PLAIN,11));
//        mt4.setForeground(new Color(153,153,153));
//        mt4.setText("Enter Address");
//        mt4.setForeground(Color.LIGHT_GRAY);
//        Border border1 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
//        mt4.setBorder(border1);
//        
//        mt5.setBounds(170, 360, 160, 30);
//        mt5.setFont(new Font("Tahoma",Font.PLAIN,11));
//        mt5.setForeground(new Color(153,153,153));
//        mt5.setText("Enter Number");
//        mt5.setForeground(Color.LIGHT_GRAY);
//        Border border2 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
//        mt5.setBorder(border2);
//        
//        
//        modify.setBounds(150, 430, 100, 30);
//        modify.setBackground(new Color(255,153,0));
//        modify.setForeground(new Color(255,255,255));
//        modify.setFont(new Font("Tahoma",Font.BOLD,14));
//        Border border4 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
//        modify.setBorder(border4);
//        
//
//        modify.addActionListener(this);
//        
//   }
//   
//      //change password 
//         JPasswordField current_password=new JPasswordField ();
//          JPasswordField confirm_password=new JPasswordField ();
//        JPasswordField new_password=new JPasswordField ();
//         
//          JLabel current_pass=new JLabel(" Current password");
//           JLabel new_pass=new JLabel(" New password");
//            JLabel confirm_pass=new JLabel("Confirm password");
//             JLabel PageLl=new JLabel("Change Password");
//             JFrame JPass=new JFrame();
//            JPanel PassPan =new JPanel();
//             JButton b_save= new JButton("Save changes");
//              JButton b_back= new JButton("Bck to menu");
//              JLabel imageLabel3;
//              ImageIcon mpg4 = new ImageIcon(getClass().getResource("black pizza.jpeg"));
//      
//      public void change_pass(){
//         JPass.setVisible(true);
//        JPass.setSize(416,750);
//        JPass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JPass.setLayout(null);
//        JPass.setLocation(100,100);
//        
//        
//        PassPan.setLayout(null);
//        PassPan.setBounds(0, 0, 400, 711);
//        PassPan.setVisible(true);
//        imageLabel3 = new JLabel(mpg4);
//        imageLabel3.setBounds(0, 0, 400, 711);
//
//        
//         PassPan.setLayout(null);
//         PassPan.setBounds(0, 0, 400, 711);
//         JPass.add(PassPan);
//         
//         PassPan.add(PageLl);
//         PassPan.add(current_password);
//         PassPan.add(new_password);
//         PassPan.add(confirm_password);
//         PassPan.add(current_pass);
//         PassPan.add(new_pass);
//         PassPan.add(confirm_pass);
//         PassPan.add(b_save);
//         PassPan.add(b_back);
//         PassPan.add(imageLabel3);
//         
//          PageLl.setVisible(true);
//        PageLl.setBounds(90, 70, 360, 50);
//        PageLl.setFont(new Font("Harlow Solid Italic",Font.ITALIC,32));
//        PageLl.setForeground(new Color(255,153,0));
//        
//        current_pass.setVisible(true);
//        current_pass.setBounds(40, 160, 200, 30);
//        current_pass.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
//        current_pass.setForeground(new Color(255,153,0));
//        
//         new_pass.setVisible(true);
//        new_pass.setBounds(40, 230, 200, 30);
//        new_pass.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
//        new_pass.setForeground(new Color(255,153,0));
//        
//         confirm_pass.setVisible(true);
//        confirm_pass.setBounds(40, 300, 200, 30);
//        confirm_pass.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
//        confirm_pass.setForeground(new Color(255,153,0));
//       
//        current_password.setVisible(true);
//        current_password.setBounds(210, 160, 160, 30);
//        current_password.setFont(new Font("Tahoma",Font.PLAIN,11));
//        current_password.setForeground(new Color(153,153,153));
//        current_password.setText("Enter Password");
//        current_password.setForeground(Color.LIGHT_GRAY);
//        Border border3 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
//        current_password.setBorder(border3);
//        
//        
//        new_password.setVisible(true);
//        new_password.setBounds(210, 230, 160, 30);
//        new_password.setFont(new Font("Tahoma",Font.PLAIN,11));
//        new_password.setForeground(new Color(153,153,153));
//        new_password.setText("Enter Password");
//        new_password.setForeground(Color.LIGHT_GRAY);
//        new_password.setBorder(border3); 
//        
//        confirm_password.setVisible(true);
//        confirm_password.setBounds(210, 300, 160, 30);
//        confirm_password.setFont(new Font("Tahoma",Font.PLAIN,11));
//        confirm_password.setForeground(new Color(153,153,153));
//        confirm_password.setText("Enter Password");
//        confirm_password.setForeground(Color.LIGHT_GRAY);
//        confirm_password.setBorder(border3); 
//        
//          
//          
//        b_save.setBounds(140, 370, 120, 30);
//        b_save.setBackground(new Color(255,153,0));
//        b_save.setForeground(new Color(255,255,255));
//        b_save.setFont(new Font("Tahoma",Font.BOLD,14));
//        Border border4 = BorderFactory.createBevelBorder(0, null, null,null,Color.DARK_GRAY);
//        b_save.setBorder(border4);
//     
//        b_back.setBounds(151, 410, 100, 30);
//        b_back.setBackground(new Color(255,255,255));
//        b_back.setForeground(new Color(255,153,0));
//        b_back.setFont(new Font("Tahoma",Font.BOLD,14));
//        b_back.setBorder(border4);
//        
//        
//  
//          b_save.addActionListener(this);    
//          b_back.addActionListener(this);
//                 
//                 
//          
//    }
//      
//   
//     //login_attribute
//    JTextField t1=new JTextField();
//    JPasswordField t2=new JPasswordField ();
//    JButton b1= new JButton("Login");
//    JButton b2= new JButton("Signup");
//    JLabel l1= new JLabel("Username");
//    JLabel l2= new JLabel("Password");
//    JLabel PageL= new JLabel("Login");
//    JPanel p1=new JPanel();
//    JFrame j=new JFrame();
//
//   public void login_form()
//   {
//       
//        
//       j.setVisible(true);
//       j.setSize(400,711);
//       j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       j.setLocation(100, 100);
//       j.setLayout(null);
//              
//        j.add(p1);
//        p1.setLayout(null);
//        p1.setBounds(0, 0, 400, 711);
//       
//        imageLabel = new JLabel(mpg);
//        imageLabel.setBounds(0, 0, 400, 711);
//        p1.add(t1);
//        p1.add(t2);
//        p1.add(b1);
//        p1.add(b2);
//        p1.add(l1);
//        p1.add(l2);
//        p1.add(PageL);
//        p1.add(imageLabel);
//        
//        
//      
//        PageL.setBounds(125, 130, 1000, 80);
//        PageL.setFont(new Font("Harlow Solid Italic",Font.ITALIC,60));
//        PageL.setForeground(new Color(255,153,0));
//        
//        l1.setBounds(60, 260, 90, 30);
//        l1.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
//        l1.setForeground(new Color(255,153,0));
//        
//        l2.setBounds(60, 340, 80, 30);
//        l2.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
//        l2.setForeground(new Color(255,153,0));
//        
//        t1.setBounds(170, 260, 160, 30);
//        t1.setFont(new Font("Tahoma",Font.PLAIN,11));
//        t1.setForeground(new Color(153,153,153));
//        t1.setText("Enter Name");
//        t1.setForeground(Color.LIGHT_GRAY);
//        Border border = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
//        t1.setBorder(border);
//        
//        t2.setBounds(170, 340, 160, 30);
//        t2.setFont(new Font("Tahoma",Font.PLAIN,11));
//        t2.setForeground(new Color(153,153,153));
//        t2.setText("Enter Password");
//        t2.setForeground(Color.LIGHT_GRAY);
//        Border border1 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
//        t2.setBorder(border1);
//        
//        b1.setBounds(90, 430, 100, 30);
//        b1.setBackground(new Color(255,153,0));
//        b1.setForeground(new Color(255,255,255));
//        b1.setFont(new Font("Tahoma",Font.BOLD,14));
//        Border border2 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
//        b1.setBorder(border2);
//        
//        
//        b2.setBounds(200, 430, 100, 30);
//        b2.setBackground(new Color(255,153,0));
//        b2.setForeground(new Color(255,255,255));
//        b2.setFont(new Font("Tahoma",Font.BOLD,14));
//        Border border3 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
//        b2.setBorder(border3);
//        
//        b1.addActionListener(this);
//        b2.addActionListener(this);
//        
//       
//   }
   
   
   



    @Override
    public void actionPerformed(ActionEvent e) {
        Admin a = Admin.getInstance();
        
         if(e.getSource()==SBtn){
            db.connect();
         
        r=db.retreive_Userdata("pizzas");
         try {
          while(r.next())
          {

              //String[] sa = r;
            String one=r.getString("pizzaname") ;
            int solding=r.getInt("small") ;
             int smalls=r.getInt("medium") ;
              int mediums=r.getInt("large") ;
             int large=r.getInt("soldnumber") ;
             
              
             
                 stxt.setText(one +"  "+ solding +"  "+smalls +"  "+ mediums+"  "+large);
             JOptionPane.showMessageDialog(null,"the data is showed in the run ");  
             
             break;
         
        
        
        }
         }
         catch (SQLException ex){
                   System.out.print(ex.getMessage());
               }
        
        
         
        
        
         if(e.getSource()==Adb_back){
             
             AdminWelcome_form(2);
         }
         
         if(e.getSource()==Adb_save){
             
         r=db.retreive_Userdata("admin");
            try {
            while (r.next()){
                
                if (r.getString("password").equalsIgnoreCase(String.valueOf(Adcurrent_password.getPassword()))){
                   
                     if (String.valueOf(Adconfirm_password.getPassword()) .equalsIgnoreCase(String.valueOf(Adnew_password.getPassword())))
                     {
                         
                         db.update_password(String.valueOf(Adconfirm_password.getPassword()), String.valueOf(Adcurrent_password.getPassword()));
                          showMessageDialog(null, "The changes has been saved successfully ");
                             break;
                }
                     else {
                     showMessageDialog(null, "the confirmation password is not like the new password...!");
                    break;
                     }
                  
                
            }
               if (!String.valueOf(Adconfirm_password.getPassword()) .equalsIgnoreCase(String.valueOf(Adnew_password.getPassword()))&&r.isLast()) {
                    showMessageDialog(null, "the current password is wrong please enter a valid password...!");
                                
                }
            }
            } catch (SQLException ex){
            
                System.out.println("THERE'S AN EXCEPTION !");
            
            
            }
                 }
            
         }
        
        if (e.getSource()==btn)
    {
        
        db.connect();
        r=db.retreive_Userdata("admin");
        try {
            r.next();
            if(r.getString("name").equalsIgnoreCase(AdminN.getText())&&r.getString("password").equals(String.valueOf(AdminP.getPassword())))
            {
              JOptionPane.showMessageDialog(null, "login succesfully");
                AdminWelcome_form(2);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "wrong username or password");

            }
        }catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
        
    if(e.getSource()==BookingBtn)
    {
    manage_orders();    
    }
    if(e.getSource()==ViewBtn)
    {
        a.view_booking_order();
    }
  
       if(e.getSource()==DeleteBtn)
    {
        a.cancel_booking_order();
    }


if(e.getSource()==AvailBtn)
{
    check_available();
}

if(e.getSource()==AdminLogoutBtn)
{
   Adminlogin_form();
}
if(e.getSource()==PaymentBtn)
{
     check_payments();
}
if(e.getSource()==DlevBtn)
{
    manage_staff();
}

if(e.getSource()==PriceBtn)
{
   Adminchange_pass();
}
if(e.getSource()==PassoBtn)
{
    Adminmodfiy_form("sama");
}

    }
   
   
  

   
    
}
