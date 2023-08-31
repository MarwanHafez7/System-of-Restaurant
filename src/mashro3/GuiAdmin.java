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
     Admin a=Admin.getInstance();
    
    Database db=new Database();
    
    ImageIcon mpg = new ImageIcon(getClass().getResource("Delicious Pizza.JPEG"));
    JLabel imageLabel;
    
    ImageIcon mpg1 = new ImageIcon(getClass().getResource("Pizza Pizzeria.jpeg"));
         JLabel imageLabel1;
         
         ImageIcon mpg4 = new ImageIcon(getClass().getResource("Black Pizza.jpeg"));
        JLabel imageLabel3;
    
    
    
    //Admin Functions
   //login_attribute
    JTextField AdminN=new JTextField();
    JPasswordField AdminP=new JPasswordField ();
    JButton btn= new JButton("Login");
    JLabel namel= new JLabel("Username");
    JLabel passl= new JLabel("Password");
    JLabel AdminL= new JLabel("Login");
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
   // JButton CategBtn= new JButton("Manage Categories");
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
    
   public void AdminWelcome_form()
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
    JButton ConfBtn= new JButton("Confirm Order");
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
       MPl.add(ConfBtn);
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
        
        ConfBtn.setBounds(145, 380, 110, 40);
        ConfBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,18));
        ConfBtn.setForeground(new Color(255,255,255));
        ConfBtn.setBackground(new Color(255,153,0));
        ConfBtn.setBorder(border3);
        
        DeleteBtn.setBounds(260, 380, 110, 40);
        DeleteBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,18));
        DeleteBtn.setForeground(new Color(255,255,255));
        DeleteBtn.setBackground(new Color(255,153,0));
        DeleteBtn.setBorder(border3);
        
       ViewBtn.addActionListener(this);
       ConfBtn.addActionListener(this);
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
   
   public void Adminmodfiy_form()
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

    @Override
    public void actionPerformed(ActionEvent e) 
    {
    if (e.getSource()==btn)
    {
        
        db.connect();
        r=db.retreive_Userdata("admin");
        try {
            r.next();
            if(r.getString("username").equalsIgnoreCase(AdminN.getText())&&r.getString("password").equals(String.valueOf(AdminP.getPassword())))
            {
              JOptionPane.showMessageDialog(null, "login succesfully");
              AdminWelcome_form();
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
  
if(e.getSource()==ConfBtn)
    {
        a.confirm_booking_order();
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
   
}
if(e.getSource()==PassoBtn)
{
   Adminmodfiy_form();
}




    }

}