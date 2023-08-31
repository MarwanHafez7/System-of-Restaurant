/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mashro3;



import javax.swing.border.Border;
import static javax.swing.JOptionPane.showMessageDialog;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
//import javafx.scene.layout.Border;
import javax.imageio.ImageIO;
import javax.swing.*;


public class GUI implements ActionListener,ItemListener  {
     ResultSet r;
     int ID=0;
     GuiAdmin admin=new GuiAdmin();
     int counter=0;
     Order order=new Order();
    
  
       
    //Start page attributes
    JButton AdminBtn= new JButton("Login as Admin");
    JButton UserBtn= new JButton("Login as User");
    JFrame JStart=new JFrame();
    JPanel StartPan =new JPanel();
    ImageIcon mpg8 = new ImageIcon(getClass().getResource("Background.jpg"));
    JLabel imageLabel8;
    JLabel StartL= new JLabel("Pizza Shop");
    
    public void start()
    {
        JStart.setVisible(true);
        JStart.setSize(416,750);
        JStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JStart.setLayout(null);
        JStart.setLocation(100,100);
        
        
        StartPan.setLayout(null);
        StartPan.setBounds(0, 0, 400, 711);
        StartPan.setVisible(true);
        imageLabel8 = new JLabel(mpg8);
        imageLabel8.setBounds(0, 0, 400, 711);

        
         StartPan.setLayout(null);
         StartPan.setBounds(0, 0, 400, 711);
         JStart.add(StartPan);
         
         StartPan.add(StartL);
         StartPan.add(AdminBtn);
         StartPan.add(UserBtn);
         StartPan.add(imageLabel8);
         
        StartL.setBounds(85, 70, 360, 50);
        StartL.setFont(new Font("Harlow Solid Italic",Font.ITALIC,50));
        StartL.setForeground(new Color(255,255,255));
        
        
        AdminBtn.setBounds(30, 190, 340, 40);
        AdminBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,24));
        AdminBtn.setForeground(new Color(255,255,255));
        AdminBtn.setBackground(new Color(255,153,0));
        Border border = BorderFactory.createBevelBorder(0, null, null,null, Color.DARK_GRAY);
        AdminBtn.setBorder(border);
        AdminBtn.addActionListener(this);
        
        UserBtn.setBounds(30, 250, 340, 40);
        UserBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,24));
        UserBtn.setForeground(new Color(255,255,255));
        UserBtn.setBackground(new Color(255,153,0));
        UserBtn.setBorder(border);   
        UserBtn.addActionListener(this);
    }
       
    
      
     //change password 
         JPasswordField current_password=new JPasswordField ();
          JPasswordField confirm_password=new JPasswordField ();
        JPasswordField new_password=new JPasswordField ();
         
          JLabel current_pass=new JLabel(" Current password");
           JLabel new_pass=new JLabel(" New password");
            JLabel confirm_pass=new JLabel("Confirm password");
             JLabel PageLl=new JLabel("Change Password");
             JFrame JPass=new JFrame();
            JPanel PassPan =new JPanel();
             JButton b_save= new JButton("Save changes");
              JButton b_back= new JButton("Bck to menu");
              JLabel imageLabel3;
              ImageIcon mpg4 = new ImageIcon(getClass().getResource("Black Pizza .jpg"));
      
      public void change_pass(){
         JPass.setVisible(true);
        JPass.setSize(416,750);
        JPass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPass.setLayout(null);
        JPass.setLocation(100,100);
        
        
        PassPan.setLayout(null);
        PassPan.setBounds(0, 0, 400, 711);
        PassPan.setVisible(true);
        imageLabel3 = new JLabel(mpg4);
        imageLabel3.setBounds(0, 0, 400, 711);

        
         PassPan.setLayout(null);
         PassPan.setBounds(0, 0, 400, 711);
         JPass.add(PassPan);
         
         PassPan.add(PageLl);
         PassPan.add(current_password);
         PassPan.add(new_password);
         PassPan.add(confirm_password);
         PassPan.add(current_pass);
         PassPan.add(new_pass);
         PassPan.add(confirm_pass);
         PassPan.add(b_save);
         PassPan.add(b_back);
         PassPan.add(imageLabel3);
         
          PageLl.setVisible(true);
        PageLl.setBounds(90, 70, 360, 50);
        PageLl.setFont(new Font("Harlow Solid Italic",Font.ITALIC,32));
        PageLl.setForeground(new Color(255,153,0));
        
        current_pass.setVisible(true);
        current_pass.setBounds(40, 160, 200, 30);
        current_pass.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        current_pass.setForeground(new Color(255,153,0));
        
         new_pass.setVisible(true);
        new_pass.setBounds(40, 230, 200, 30);
        new_pass.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        new_pass.setForeground(new Color(255,153,0));
        
         confirm_pass.setVisible(true);
        confirm_pass.setBounds(40, 300, 200, 30);
        confirm_pass.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        confirm_pass.setForeground(new Color(255,153,0));
       
        current_password.setVisible(true);
        current_password.setBounds(210, 160, 160, 30);
        current_password.setFont(new Font("Tahoma",Font.PLAIN,11));
        current_password.setForeground(new Color(153,153,153));
        current_password.setForeground(Color.LIGHT_GRAY);
        Border border3 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        current_password.setBorder(border3);
        
        
        new_password.setVisible(true);
        new_password.setBounds(210, 230, 160, 30);
        new_password.setFont(new Font("Tahoma",Font.PLAIN,11));
        new_password.setForeground(new Color(153,153,153));
        new_password.setForeground(Color.LIGHT_GRAY);
        new_password.setBorder(border3); 
        
        confirm_password.setVisible(true);
        confirm_password.setBounds(210, 300, 160, 30);
        confirm_password.setFont(new Font("Tahoma",Font.PLAIN,11));
        confirm_password.setForeground(new Color(153,153,153));
        confirm_password.setForeground(Color.LIGHT_GRAY);
        confirm_password.setBorder(border3); 
        
          
          
        b_save.setBounds(140, 370, 120, 30);
        b_save.setBackground(new Color(255,153,0));
        b_save.setForeground(new Color(255,255,255));
        b_save.setFont(new Font("Tahoma",Font.BOLD,14));
        Border border4 = BorderFactory.createBevelBorder(0, null, null,null,Color.DARK_GRAY);
        b_save.setBorder(border4);
     
        b_back.setBounds(151, 410, 100, 30);
        b_back.setBackground(new Color(255,255,255));
        b_back.setForeground(new Color(255,153,0));
        b_back.setFont(new Font("Tahoma",Font.BOLD,14));
        b_back.setBorder(border4);
        
        
  
          b_save.addActionListener(this);    
          b_back.addActionListener(this);
                 
                 
          
    }
      
     
      
       
       Connection c;
    Database db= new Database();
    
    
  
    
    
    
    
   //login_attribute
   JTextField t1=new JTextField();
    JPasswordField t2=new JPasswordField ();
    JButton b1= new JButton("Login");
    JButton b2= new JButton("Signup");
    JLabel l1= new JLabel("Username");
    JLabel l2= new JLabel("Password");
    JLabel PageL= new JLabel("Login");
    JPanel p1=new JPanel();
    JFrame j=new JFrame();
    ImageIcon mpg = new ImageIcon(getClass().getResource("Delicious Pizza.JPG"));
    JLabel imageLabel;
   public void login_form()
   {
       
        
       j.setVisible(true);
       j.setSize(400,711);
       j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       j.setLocation(100, 100);
       j.setLayout(null);
              
        j.add(p1);
        p1.setLayout(null);
        p1.setBounds(0, 0, 400, 711);
       
        imageLabel = new JLabel(mpg);
        imageLabel.setBounds(0, 0, 400, 711);
        p1.add(t1);
        p1.add(t2);
        p1.add(b1);
        p1.add(b2);
        p1.add(l1);
        p1.add(l2);
        p1.add(PageL);
        p1.add(imageLabel);
        
        
      
        PageL.setBounds(125, 130, 1000, 80);
        PageL.setFont(new Font("Harlow Solid Italic",Font.ITALIC,60));
        PageL.setForeground(new Color(255,153,0));
        
        l1.setBounds(60, 260, 90, 30);
        l1.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        l1.setForeground(new Color(255,153,0));
        
        l2.setBounds(60, 340, 80, 30);
        l2.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        l2.setForeground(new Color(255,153,0));
        
        t1.setBounds(170, 260, 160, 30);
        t1.setFont(new Font("Tahoma",Font.PLAIN,11));
        t1.setForeground(new Color(153,153,153));
        t1.setForeground(Color.LIGHT_GRAY);
        Border border = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        t1.setBorder(border);
        
        t2.setBounds(170, 340, 160, 30);
        t2.setFont(new Font("Tahoma",Font.PLAIN,11));
        t2.setForeground(new Color(153,153,153));
        t2.setForeground(Color.LIGHT_GRAY);
        Border border1 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        t2.setBorder(border1);
        
        b1.setBounds(90, 430, 100, 30);
        b1.setBackground(new Color(255,153,0));
        b1.setForeground(new Color(255,255,255));
        b1.setFont(new Font("Tahoma",Font.BOLD,14));
        Border border2 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        b1.setBorder(border2);
        
        
        b2.setBounds(200, 430, 100, 30);
        b2.setBackground(new Color(255,153,0));
        b2.setForeground(new Color(255,255,255));
        b2.setFont(new Font("Tahoma",Font.BOLD,14));
        Border border3 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        b2.setBorder(border3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
       
   }
   
   //register attribute
    JTextField Nametxt=new JTextField();
    JTextField Addresstxt=new JTextField();
    JTextField Numbertxt=new JTextField();
    JPasswordField Passtxt=new JPasswordField();
    JLabel NameL=new JLabel("Username");
    JLabel AddressL=new JLabel("Address");
    JLabel NumberL=new JLabel("Number");
    JLabel PassL= new JLabel("Password");
    JLabel PageL1= new JLabel("Signup");
    JButton b3= new JButton("Signup");
    JButton b00= new JButton("back");
    JPanel p2=new JPanel();
    JFrame j2=new JFrame();
   
   public void register_form ()
   {
       j2.setSize(400,711);
       j2.setVisible(true);
       j2.setLocation(100,100);
       j2.setLayout(null);
       j2.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
       
       j2.add(p2);
       p2.setLayout(null);
       p2.setBounds(0,0,400,711);
       imageLabel = new JLabel(mpg);
       imageLabel.setBounds(0, 0, 400, 711);
     
        p2.add(PageL1);
        p2.add(Nametxt);
        p2.add(Addresstxt);
        p2.add(Numbertxt);
        p2.add(Passtxt);
        p2.add(b3);
        p2.add(NameL);
        p2.add(AddressL);
        p2.add(NumberL);
        p2.add(PassL);
        p2.add(imageLabel);
        p2.add(b00);
      
        PageL1.setBounds(110, 120, 1000, 80);
        PageL1.setFont(new Font("Harlow Solid Italic",Font.ITALIC,60));
        PageL1.setForeground(new Color(255,153,0));
        
        NameL.setBounds(60, 240, 90, 30);
        NameL.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        NameL.setForeground(new Color(255,153,0));
        
        AddressL.setBounds(60, 300, 80, 30);
        AddressL.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        AddressL.setForeground(new Color(255,153,0));
        
        NumberL.setBounds(60, 360, 500, 30);
        NumberL.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        NumberL.setForeground(new Color(255,153,0));
        
        PassL.setBounds(60, 420, 80, 30);
        PassL.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        PassL.setForeground(new Color(255,153,0));
        
        
        Nametxt.setBounds(170, 240, 160, 30);
        Nametxt.setFont(new Font("Tahoma",Font.PLAIN,11));
        Nametxt.setForeground(new Color(153,153,153));
        Nametxt.setText("Enter Name");
        Nametxt.setForeground(Color.LIGHT_GRAY);
        Border border = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        Nametxt.setBorder(border);
        
        Addresstxt.setBounds(170, 300, 160, 30);
        Addresstxt.setFont(new Font("Tahoma",Font.PLAIN,11));
        Addresstxt.setForeground(new Color(153,153,153));
        Addresstxt.setText("Enter Address");
        Addresstxt.setForeground(Color.LIGHT_GRAY);
        Border border1 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        Addresstxt.setBorder(border1);
        
        Numbertxt.setBounds(170, 360, 160, 30);
        Numbertxt.setFont(new Font("Tahoma",Font.PLAIN,11));
        Numbertxt.setForeground(new Color(153,153,153));
        Numbertxt.setText("Enter Number");
        Numbertxt.setForeground(Color.LIGHT_GRAY);
        Border border2 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        Numbertxt.setBorder(border2);
        
        Passtxt.setBounds(170, 420, 160, 30);
        Passtxt.setFont(new Font("Tahoma",Font.PLAIN,11));
        Passtxt.setForeground(new Color(153,153,153));
        Passtxt.setText("Enter Password");
        Passtxt.setForeground(Color.LIGHT_GRAY);
        Border border3 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        Passtxt.setBorder(border3);
        
        
        
        b3.setBounds(200, 480, 100, 30);
        b3.setBackground(new Color(255,153,0));
        b3.setForeground(new Color(255,255,255));
        b3.setFont(new Font("Tahoma",Font.BOLD,14));
        
         b00.setBounds(50, 480, 100, 30);
        b00.setBackground(new Color(255,153,0));
        b00.setForeground(new Color(255,255,255));
        b00.setFont(new Font("Tahoma",Font.BOLD,14));
        
        
        
        
        
        Border border4 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        b3.setBorder(border4);
        b00.setBorder(border4);
 
        b3.addActionListener(this);
         b00.addActionListener(this);
        
        
        
        
   }
   
   
     //modify attribute
        JTextField mt3=new JTextField();
       JTextField mt4=new JTextField();
       JTextField mt5=new JTextField();
        JLabel ml3=new JLabel("username");
         JLabel ml4=new JLabel("ContactNumber");
          JLabel ml5=new JLabel("Address");
         JLabel ml6=new JLabel("Manage Profile");
         
         
           JPanel mp2=new JPanel();
       JFrame mj2=new JFrame();
       JButton modify= new JButton("Modify");
       
   
   
public void modfiy_form(int id)
   {
        db.connect();
          r=db.retreive_Userdata("users");
           
               try{
            while (r.next())
            {
             
                
                if (id==r.getInt("id"))
                {
                    mt3.setText(r.getString("name"));
                    mt4.setText(String.valueOf(r.getInt("contactNumber")));
                    mt5.setText(r.getString("address"));
                    break;
                }
               
                }
            }catch (SQLException ex)
                {
                    System.out.print(ex.getMessage());
                }
       
       mj2.setSize(400,711);
       mj2.setVisible(true);
       mj2.setLocation(100,100);
       mj2.setLayout(null);
       mj2.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
       
       mj2.add(mp2);
       mp2.setLayout(null);
       mp2.setBounds(0,0,400,711);
       imageLabel = new JLabel(mpg);
       imageLabel.setBounds(0, 0, 400, 711);
     
        mp2.add(ml6);       
        mp2.add(mt3);
        mp2.add(mt4);
        mp2.add(mt5);
        mp2.add(modify);
        mp2.add(ml3);
        mp2.add(ml4);
        mp2.add(ml5);
        mp2.add(imageLabel);
        
        
        ml6.setBounds(60, 120, 1000, 80);
        ml6.setFont(new Font("Harlow Solid Italic",Font.ITALIC,40));
        ml6.setForeground(new Color(255,153,0));
        
        ml3.setBounds(60, 240, 90, 30);
        ml3.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        ml3.setForeground(new Color(255,153,0));
        
        ml4.setBounds(60, 300, 80, 30);
        ml4.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        ml4.setForeground(new Color(255,153,0));
        
        ml5.setBounds(60, 360, 500, 30);
        ml5.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        ml5.setForeground(new Color(255,153,0));
        
        
        mt3.setBounds(170, 240, 160, 30);
        mt3.setFont(new Font("Tahoma",Font.PLAIN,11));
        mt3.setForeground(new Color(153,153,153));
      
        mt3.setForeground(Color.LIGHT_GRAY);
        Border border = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        mt3.setBorder(border);
        
        mt4.setBounds(170, 300, 160, 30);
        mt4.setFont(new Font("Tahoma",Font.PLAIN,11));
        mt4.setForeground(new Color(153,153,153));
        mt4.setForeground(Color.LIGHT_GRAY);
        Border border1 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        mt4.setBorder(border1);
        
        mt5.setBounds(170, 360, 160, 30);
        mt5.setFont(new Font("Tahoma",Font.PLAIN,11));
        mt5.setForeground(new Color(153,153,153));
        mt5.setForeground(Color.LIGHT_GRAY);
        Border border2 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        mt5.setBorder(border2);
        
        
        modify.setBounds(150, 430, 100, 30);
        modify.setBackground(new Color(255,153,0));
        modify.setForeground(new Color(255,255,255));
        modify.setFont(new Font("Tahoma",Font.BOLD,14));
        Border border4 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        modify.setBorder(border4);
        

        modify.addActionListener(this);
        
   }
   
   //welcome attributes
       JButton ManageBtn= new JButton("Manage Profile");
       JButton LogoutBtn= new JButton("Log Out");
       JButton OrderBtn= new JButton("Make Order");
       JButton PassBtn= new JButton("Change Password");
    
        JPanel p3=new JPanel();
        JFrame j3=new JFrame();
        JLabel l6=new JLabel();
         JLabel label = new JLabel("Welcome to our Pizza Shop");
         JLabel PageLablel ;
         ImageIcon mpg1 = new ImageIcon(getClass().getResource("Pizza Pizzeria.jpg"));
         JLabel imageLabel1;
   
   public void Welcome_form(int id)
   {
       
             
               
       try {
           while (r.next())
           {
               if(r.getInt("id")==id){
                   
                   l6.setText("welcome mr :"+r.getString("name"));
                   
                   break;
                   
               }
               
           }
       }catch (SQLException ex){
           System.out.print(ex.getMessage());
       }
       
       j3.setSize(416,750);
       j3.setVisible(true);
       j3.setLocation(100,100);
       j3.setLayout(null);
       j3.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
       
       j3.add(p3);
       p3.setLayout(null);
       p3.setBounds(0,0, 416,750);
       imageLabel1 = new JLabel(mpg1);
       imageLabel1.setBounds(0, 0, 400, 711);
        
       p3.add(label);
       p3.add(ManageBtn);
       p3.add(PassBtn);
       p3.add(OrderBtn);
       p3.add(LogoutBtn);
       p3.add(imageLabel1);
       
       
        label.setBounds(20, 70, 360, 50);
        label.setFont(new Font("Harlow Solid Italic",Font.ITALIC,32));
        label.setForeground(new Color(255,153,0));
        
        
        ManageBtn.setBounds(30, 180, 340, 40);
        ManageBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,24));
        ManageBtn.setForeground(new Color(255,255,255));
        ManageBtn.setBackground(new Color(255,153,0));
        Border border = BorderFactory.createBevelBorder(0, null, null,null, Color.DARK_GRAY);
        ManageBtn.setBorder(border);
      
        OrderBtn.setBounds(30, 240, 340, 40);
        OrderBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,24));
        OrderBtn.setForeground(new Color(255,255,255));
        OrderBtn.setBackground(new Color(255,153,0));
        Border border1 = BorderFactory.createBevelBorder(0, null, null,null, Color.DARK_GRAY);
        OrderBtn.setBorder(border1);
        
        PassBtn.setBounds(30, 300, 340, 40);
        PassBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,24));
        PassBtn.setForeground(new Color(255,255,255));
        PassBtn.setBackground(new Color(255,153,0));
        Border border2 = BorderFactory.createBevelBorder(0, null, null,null, Color.DARK_GRAY);
        PassBtn.setBorder(border2);
        
        LogoutBtn.setBounds(30, 360, 340, 40);
        LogoutBtn.setFont(new Font("Harlow Solid Italic",Font.ITALIC,24));
        LogoutBtn.setForeground(new Color(255,255,255));
        LogoutBtn.setBackground(new Color(255,153,0));
        Border border3 = BorderFactory.createBevelBorder(0, null, null,null, Color.DARK_GRAY);
        LogoutBtn.setBorder(border3);
        
        
        
    
       ManageBtn.addActionListener(this);
       LogoutBtn.addActionListener(this);
       OrderBtn.addActionListener(this);
       PassBtn.addActionListener(this);
   
       
   }
  //makeOrder attributes  
    JTextArea OrderDetails=new JTextArea ();
    JTextField Quantity=new JTextField ();
    JTextField Address=new JTextField ();
    JTextField Addtionals=new JTextField ();
    JTextField TotalPrice=new JTextField();
    JTextField  Username_Text=new JTextField();
    JLabel OrderDetails_Label=new JLabel("Order Details");
    JLabel Quantity_Label=new JLabel("Quantity");
    JLabel Address_Label=new JLabel("Address");
    JLabel Addtionals_Label=new JLabel("Addtionals");
    JLabel Username_Label=new JLabel("UserName");
    JLabel Total_Price=new JLabel("TotalPrice");
    JLabel Payment_By=new JLabel("Payment_By");
    JRadioButton visa=new JRadioButton("Visa");
    JRadioButton cod=new JRadioButton("COD");
    ButtonGroup group=new ButtonGroup();
    JButton deliver=new JButton("Accept Order");
    JButton cancel=new JButton("Cancel");
    JFrame order_frame=new JFrame();
    JPanel order_panel=new JPanel();
    JLabel PageLabel=new JLabel("Confirm Order");
    
    ImageIcon mpg2 = new ImageIcon(getClass().getResource("Piza.jpg"));
    JLabel imageLabel2;
   
   public void confirm_order (int id)
   {
       db.connect();
        r=db.retreive_Userdata("users");
                
       try {
           while (r.next())
           {
               if(r.getInt("id")==id){
                   
                   Username_Text.setText(r.getString("name"));
                   
                   break;
                   
               }
               
           }
       }catch (SQLException ex){
           System.out.print(ex.getMessage());
       }
       
       order_frame.setSize(416,750);
       order_frame.setVisible(true);
       order_frame.setLocation(100,100);
       order_frame.setLayout(null);
       order_frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
       
       order_frame.add(order_panel);
       order_panel.setLayout(null);
       order_panel.setBounds(0,0,416,750);
       imageLabel2 = new JLabel(mpg2);
       imageLabel2.setBounds(0, 0, 400, 711);
      
       order_panel.add(PageLabel);
       order_panel.add(Username_Text);
       order_panel.add(Address);
       order_panel.add(OrderDetails);
       order_panel.add(Quantity);
       order_panel.add(Addtionals);
       order_panel.add(TotalPrice);
       
       order_panel.add(Username_Label);
       order_panel.add(Address_Label);
       order_panel.add(OrderDetails_Label);
       order_panel.add(Quantity_Label);
       order_panel.add(Addtionals_Label);
       order_panel.add(Total_Price);
       order_panel.add(Payment_By);
       order_panel.add(visa);
       order_panel.add(cod);
       order_panel.add(deliver);
       order_panel.add(cancel);
       group.add(visa);
       group.add(cod);
       order_panel.add(imageLabel2);
       
        PageLabel.setBounds(109, 30, 360, 50);
        PageLabel.setFont(new Font("Harlow Solid Italic",Font.ITALIC,32));
        PageLabel.setForeground(new Color(255,153,0));
       
        Username_Label.setBounds(60, 110, 200, 30);
        Username_Label.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        Username_Label.setForeground(new Color(255,153,0));

        Address_Label.setBounds(60, 150, 90, 30);
        Address_Label.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        Address_Label.setForeground(new Color(255,153,0));
        
        OrderDetails_Label.setBounds(60, 190, 200, 30);
        OrderDetails_Label.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        OrderDetails_Label.setForeground(new Color(255,153,0));
        
        Quantity_Label.setBounds(60, 250, 200, 30);
        Quantity_Label.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        Quantity_Label.setForeground(new Color(255,153,0));
        
        Addtionals_Label.setBounds(60, 290, 200, 30);
        Addtionals_Label.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        Addtionals_Label.setForeground(new Color(255,153,0));
        
        Total_Price.setBounds(60, 330, 200, 30);
        Total_Price.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        Total_Price.setForeground(new Color(255,153,0));
       
        Payment_By.setBounds(60, 370, 200, 30);
        Payment_By.setFont(new Font("Harlow Solid Italic",Font.ITALIC,20));
        Payment_By.setForeground(new Color(255,153,0));
       
       
        Username_Text.setBounds(190, 110, 160, 30);
        Username_Text.setFont(new Font("Tahoma",Font.PLAIN,11));
        Username_Text.setForeground(new Color(153,153,153));
        Username_Text.setForeground(Color.LIGHT_GRAY);
        Border border = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        Username_Text.setBorder(border);
        
        Address.setBounds(190, 150, 160, 30);
        Address.setFont(new Font("Tahoma",Font.PLAIN,11));
        Address.setForeground(new Color(153,153,153));
        Address.setForeground(Color.LIGHT_GRAY);
        Border border1 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        Address.setBorder(border1);
        
        OrderDetails.setBounds(190, 190, 160, 45);
        OrderDetails.setFont(new Font("Tahoma",Font.PLAIN,11));
        OrderDetails.setForeground(new Color(153,153,153));
        OrderDetails.setForeground(Color.LIGHT_GRAY);
        Border border2 = BorderFactory.createBevelBorder(0, null, null, Color.DARK_GRAY, null);
        OrderDetails.setBorder(border2);
       
        Quantity.setBounds(190, 250, 160, 30);
        Quantity.setFont(new Font("Tahoma",Font.PLAIN,11));
        Quantity.setForeground(new Color(153,153,153));
        Quantity.setForeground(Color.LIGHT_GRAY);
        Quantity.setBorder(border2);
      
        Addtionals.setBounds(190, 290, 160, 30);
        Addtionals.setFont(new Font("Tahoma",Font.PLAIN,11));
        Addtionals.setForeground(new Color(153,153,153));
        Addtionals.setForeground(Color.LIGHT_GRAY);
        Addtionals.setBorder(border2);
      
        TotalPrice.setBounds(190, 330, 160, 30);
        TotalPrice.setFont(new Font("Tahoma",Font.PLAIN,11));
        TotalPrice.setForeground(new Color(153,153,153));
        TotalPrice.setForeground(Color.LIGHT_GRAY);
        TotalPrice.setBorder(border2);
 
        visa.setBounds(190, 370, 60, 30);
        visa.setFont(new Font("Tahoma",Font.PLAIN,11));
        visa.setForeground(new Color(51,51,51));
        visa.setBackground(Color.WHITE);
        visa.setBorder(border2);
        
        cod.setBounds(290,370,60,30);
        cod.setFont(new Font("Tahoma",Font.PLAIN,11));
        cod.setForeground(new Color(51,51,51));
        cod.setBackground(Color.WHITE);
        cod.setBorder(border2);
    
        deliver.setBounds(135, 450, 130, 30);
        deliver.setBackground(new Color(255,153,0));
        deliver.setForeground(new Color(255,255,255));
        deliver.setFont(new Font("Tahoma",Font.BOLD,14));
        Border border4 = BorderFactory.createBevelBorder(0, null, null,null,Color.DARK_GRAY);
        deliver.setBorder(border4);
        deliver.addActionListener(this);
        
        cancel.setBounds(151, 490, 100, 30);
        cancel.setBackground(new Color(255,255,255));
        cancel.setForeground(new Color(255,153,0));
        cancel.setFont(new Font("Tahoma",Font.BOLD,14));
        cancel.setBorder(border4);
        cancel.addActionListener(this);
      
   }
   
   //image attribute 
     JLabel pepprony_image,MixMeat_image,Chicken_image,Cheese_image,Margretta_image;
     JLabel  Small_pepprony=new JLabel("Small");
     JLabel Medium_pepprony=new JLabel("Medium");
     JLabel Large_pepprony=new JLabel("Large");
     JLabel  Small_Cheese=new JLabel("Small");
     JLabel Medium_Cheese=new JLabel("Medium");
     JLabel Large_Cheese=new JLabel("Large");
     JLabel   Small_MixMeat=new JLabel("Small");
     JLabel     Medium_MixMeat=new JLabel("Medium");
     JLabel     Large_MixMeat=new JLabel("Large");
     JLabel  Small_Chicken=new JLabel("Small");
     JLabel      Medium_Chicken=new JLabel("Medium");
     JLabel   Large_Chicken=new JLabel("Large");
     JLabel  Small_Margretta=new JLabel("Small");
     JLabel      Medium_Margretta=new JLabel("Medium");
     JLabel   Large_Margretta=new JLabel("Large");
     JLabel     Small_Cost_pepprony=new JLabel("70 LE");
     JLabel     Medium_Cost_pepprony=new JLabel("110 LE");
     JLabel    Large_Cost_pepprony=new JLabel("150 LE");
     JLabel     Small_Cost_Cheese=new JLabel("60 LE");
     JLabel     Medium_Cost_Cheese=new JLabel("100 LE");
     JLabel    Large_Cost_Cheese=new JLabel("130 LE");        
     JLabel    Small_Cost_MixMeat=new JLabel("85 LE");
     JLabel    Medium_Cost_MixMeat=new JLabel("120 LE");
     JLabel   Large_Cost_MixMeat=new JLabel("160 LE");
     JLabel   Small_Cost_Chicken=new JLabel("75 LE");
     JLabel    Medium_Cost_Chicken=new JLabel("115 LE");
     JLabel    Large_Cost_Chicken=new JLabel("155 LE");
     JLabel   Small_Cost_Margretta=new JLabel("55 LE");
     JLabel    Medium_Cost_Margretta=new JLabel("95 LE");
     JLabel    Large_Cost_Margretta=new JLabel("105 LE");
                 
     JRadioButton  thin_Crust_Margretta=new JRadioButton("ThinCrust");
     JRadioButton  thick_Crust_Margretta=new JRadioButton("ThickCrust");
     JRadioButton  thin_Crust_pepprony=new JRadioButton("ThinCrust");
     JRadioButton  thick_Crust_pepprony=new JRadioButton("ThickCrust");
     JRadioButton  thin_Crust_Cheese=new JRadioButton("ThinCrust");
     JRadioButton  thick_Crust_Cheese=new JRadioButton("ThickCrust");
     JRadioButton  thin_Crust_MixMeat=new JRadioButton("ThinCrust");
     JRadioButton  thick_Crust_MixMeat=new JRadioButton("ThickCrust");
     JRadioButton  thin_Crust_Chicken=new JRadioButton("ThinCrust");
     JRadioButton  thick_Crust_Chicken=new JRadioButton("ThickCrust");
                
     JButton   Small_Button_pepprony=new JButton("+");
     JButton  Medium_Button_pepprony=new JButton("+");
     JButton   Large_Button_pepprony=new JButton("+");
     JButton Small_Button_MixMeat=new JButton("+");
     JButton    Medium_Button_MixMeat=new JButton("+");
     JButton  Large_Button_MixMeat=new JButton("+");
     JButton   Small_Button_Chicken=new JButton("+");
     JButton   Medium_Button_Chicken=new JButton("+");
     JButton  Large_Button_Chicken=new JButton("+");
     JButton   Small_Button_Cheese=new JButton("+");
     JButton   Medium_Button_Cheese=new JButton("+");
     JButton  Large_Button_Cheese=new JButton("+");
     JButton   Small_Button_Margretta=new JButton("+");
     JButton   Medium_Button_Margretta=new JButton("+");
     JButton  Large_Button_Margretta=new JButton("+");
     JButton   backing=new JButton("Back");
     
     ButtonGroup Group_pepprony,Group_MixMeat,Group_Chicken,Group_Cheese,Group_Margretta;
   
     
     JButton Next=new JButton("Next");
     JFrame image_frame=new JFrame();
     String arr[]={"Vegan","Vegeteran"};
     JComboBox Categroies=new JComboBox(arr);
     ImageIcon pepprony,MixMeat ,Cheese,Margretta,Chicken;
     Dimension d;
     JPanel image_panel=new JPanel();
   
    ImageIcon mpg5 = new ImageIcon(getClass().getResource("Pii.jpg"));
    JLabel imageP;
    JLabel labelP = new JLabel("Make Order");
    JLabel labelP1 = new JLabel("Choose Category");
    
    JLabel Add=new JLabel("Addtionals");
    JCheckBox ketchub=new JCheckBox("Extra ketchub");
    JCheckBox Motzrella=new JCheckBox("Extra motzrella");
    JCheckBox Parpeque =new JCheckBox("Extra parpeque");
    
     private void Vegan()
   {
      
       Group_pepprony=new ButtonGroup();
       Group_pepprony.add(thin_Crust_pepprony);
       Group_pepprony.add(thick_Crust_pepprony);
       Group_MixMeat=new ButtonGroup();
       Group_MixMeat.add(thin_Crust_MixMeat);
       Group_MixMeat.add(thick_Crust_MixMeat);
       Group_Chicken=new ButtonGroup();
       Group_Chicken.add(thin_Crust_Chicken);
       Group_Chicken.add(thick_Crust_Chicken);
             
                 
        //adjust pepprony attributes
        imageP.add(pepprony_image);
        imageP.add(Small_pepprony);
        imageP.add(Medium_pepprony);
        imageP.add(Large_pepprony);
        imageP.add(Small_Cost_pepprony);
        imageP.add(Medium_Cost_pepprony);
        imageP.add(Large_Cost_pepprony);
        imageP.add(Small_Button_pepprony);
        imageP.add(Medium_Button_pepprony);
        imageP.add(Large_Button_pepprony);
        imageP.add(thin_Crust_pepprony);
        imageP.add(thick_Crust_pepprony);
        imageP.add(ketchub);
        imageP.add(Motzrella);
        imageP.add(Parpeque);
          
      
        pepprony_image.setBounds(30,300,150,150);
        Border border4 = BorderFactory.createBevelBorder(0, null, null,null,Color.DARK_GRAY);
        pepprony_image.setBorder(border4);
        
        
        Small_pepprony.setBounds(30,460,100,40);
        Small_pepprony.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Small_pepprony.setForeground(new Color(255,153,0));
        
        Medium_pepprony.setBounds(30,500,100,40);
        Medium_pepprony.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Medium_pepprony.setForeground(new Color(255,153,0));
        
        Large_pepprony.setBounds(30,540,100,40);
        Large_pepprony.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Large_pepprony.setForeground(new Color(255,153,0));
        
        
        Small_Cost_pepprony.setBounds(100,466,100,30);
        Small_Cost_pepprony.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Small_Cost_pepprony.setForeground(new Color(255,153,0));
        
        Medium_Cost_pepprony.setBounds(100,506,100,30);
        Medium_Cost_pepprony.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Medium_Cost_pepprony.setForeground(new Color(255,153,0));
        
        Large_Cost_pepprony.setBounds(100,548,100,30);
        Large_Cost_pepprony.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Large_Cost_pepprony.setForeground(new Color(255,153,0));
        
        
        Small_Button_pepprony.setBounds(160,472,20,20);
        Small_Button_pepprony.setBackground(new Color(255,255,255));
        Small_Button_pepprony.setForeground(new Color(255,153,0));
        Small_Button_pepprony.setFont(new Font("Tahoma",Font.BOLD,15));
        Small_Button_pepprony.setBorder(border4);
        
        Medium_Button_pepprony.setBounds(160,510,20,20);
        Medium_Button_pepprony.setBackground(new Color(255,255,255));
        Medium_Button_pepprony.setForeground(new Color(255,153,0));
        Medium_Button_pepprony.setFont(new Font("Tahoma",Font.BOLD,15));
        Medium_Button_pepprony.setBorder(border4);
        
    
        Large_Button_pepprony.setBounds(160,552,20,20);
        Large_Button_pepprony.setBackground(new Color(255,255,255));
        Large_Button_pepprony.setForeground(new Color(255,153,0));
        Large_Button_pepprony.setFont(new Font("Tahoma",Font.BOLD,15));
        Large_Button_pepprony.setBorder(border4);
       
      
        
        thin_Crust_pepprony.setBounds(30,585,75,25);
        thin_Crust_pepprony.setBackground(new Color(255,255,255));
        thin_Crust_pepprony.setForeground(new Color(255,153,0));
        thin_Crust_pepprony.setFont(new Font("Harlow Solid Italic",Font.BOLD,10));
        thin_Crust_pepprony.setBorder(border4);
        
        
        
        thick_Crust_pepprony.setBounds(107,585,75,25);
        thick_Crust_pepprony.setBackground(new Color(255,255,255));
        thick_Crust_pepprony.setForeground(new Color(255,153,0));
        thick_Crust_pepprony.setFont(new Font("Harlow Solid Italic",Font.BOLD,10));
        thick_Crust_pepprony.setBorder(border4);

         
        //adjust MixMeat attributes       
        imageP.add(MixMeat_image);
        imageP.add(Small_MixMeat);
        imageP.add(Medium_MixMeat);
        imageP.add(Large_MixMeat);
        imageP.add(Small_Cost_MixMeat);
        imageP.add(Medium_Cost_MixMeat);
        imageP.add(Large_Cost_MixMeat);
        imageP.add(Small_Button_MixMeat);
        imageP.add(Medium_Button_MixMeat);
        imageP.add(Large_Button_MixMeat);
        imageP.add(thin_Crust_MixMeat);
        imageP.add(thick_Crust_MixMeat);
        
        
        
        MixMeat_image.setBounds(220,300,150,150);
        MixMeat_image.setBorder(border4);
        
        
        Small_MixMeat.setBounds(220,460,100,40);
        Small_MixMeat.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Small_MixMeat.setForeground(new Color(255,153,0));
        
        Medium_MixMeat.setBounds(220,500,100,40);
        Medium_MixMeat.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Medium_MixMeat.setForeground(new Color(255,153,0));
        
        
        Large_MixMeat.setBounds(220,540,100,40);
        Large_MixMeat.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Large_MixMeat.setForeground(new Color(255,153,0));
        
        
        
        Small_Cost_MixMeat.setBounds(290,466,100,30);
        Small_Cost_MixMeat.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Small_Cost_MixMeat.setForeground(new Color(255,153,0));
        
        Medium_Cost_MixMeat.setBounds(290,506,100,30);
        Medium_Cost_MixMeat.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Medium_Cost_MixMeat.setForeground(new Color(255,153,0));
        
        Large_Cost_MixMeat.setBounds(290,548,100,30);
        Large_Cost_MixMeat.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Large_Cost_MixMeat.setForeground(new Color(255,153,0));
        
        
        
        Small_Button_MixMeat.setBounds(350,472,20,20);
        Small_Button_MixMeat.setBackground(new Color(255,255,255));
        Small_Button_MixMeat.setForeground(new Color(255,153,0));
        Small_Button_MixMeat.setFont(new Font("Tahoma",Font.BOLD,15));
        Small_Button_MixMeat.setBorder(border4);
        
        Medium_Button_MixMeat.setBounds(350,510,20,20);
        Medium_Button_MixMeat.setBackground(new Color(255,255,255));
        Medium_Button_MixMeat.setForeground(new Color(255,153,0));
        Medium_Button_MixMeat.setFont(new Font("Tahoma",Font.BOLD,15));
        Medium_Button_MixMeat.setBorder(border4);
        
        Large_Button_MixMeat.setBounds(350,552,20,20);
        Large_Button_MixMeat.setBackground(new Color(255,255,255));
        Large_Button_MixMeat.setForeground(new Color(255,153,0));
        Large_Button_MixMeat.setFont(new Font("Tahoma",Font.BOLD,15));
        Large_Button_MixMeat.setBorder(border4);
     
        
        
        thin_Crust_MixMeat.setBounds(220,585,75,25);
        thin_Crust_MixMeat.setBackground(new Color(255,255,255));
        thin_Crust_MixMeat.setForeground(new Color(255,153,0));
        thin_Crust_MixMeat.setFont(new Font("Harlow Solid Italic",Font.BOLD,10));
        thin_Crust_MixMeat.setBorder(border4);
        
        thick_Crust_MixMeat.setBounds(297,585,75,25);
        thick_Crust_MixMeat.setBackground(new Color(255,255,255));
        thick_Crust_MixMeat.setForeground(new Color(255,153,0));
        thick_Crust_MixMeat.setFont(new Font("Harlow Solid Italic",Font.BOLD,10));
        thick_Crust_MixMeat.setBorder(border4);
  
        
        
        Next.setBounds(150,660,100,25);
        Next.setBackground(new Color(255,255,255));
        Next.setForeground(new Color(255,153,0));
        Next.setFont(new Font("Tahoma",Font.BOLD,14));
        Next.setBorder(border4);
        Next.addActionListener(this);
        
        
        ketchub.setBounds(30,620,110,30);
        ketchub.setBackground(new Color(255,153,0));
        ketchub.setForeground(new Color(255,255,255));
        ketchub.setFont(new Font("Harlow Solid Italic",Font.BOLD,12));
        ketchub.setBorder(border4);
        
        Motzrella.setBounds(146,620,110,30);
        Motzrella.setBackground(new Color(255,153,0));
        Motzrella.setForeground(new Color(255,255,255));
        Motzrella.setFont(new Font("Harlow Solid Italic",Font.BOLD,10));
        Motzrella.setBorder(border4);
       
        Parpeque.setBounds(262,620,110,30);
        Parpeque.setBackground(new Color(255,153,0));
        Parpeque.setForeground(new Color(255,255,255));
        Parpeque.setFont(new Font("Harlow Solid Italic",Font.BOLD,12));
        Parpeque.setBorder(border4);
        
        //adjust Chicken attributes
//        imageP.add(Chicken_image);
//        imageP.add(Small_Chicken);
//        imageP.add(Medium_Chicken);
//        imageP.add(Large_Chicken);
//        imageP.add(Small_Cost_Chicken);
//        imageP.add(Medium_Cost_Chicken);
//        imageP.add(Large_Cost_Chicken);
//        imageP.add(Small_Button_Chicken);
//        imageP.add(Medium_Button_Chicken);
//        imageP.add(Large_Button_Chicken);
//        imageP.add(thin_Crust_Chicken);
//        imageP.add(thick_Crust_Chicken);
//      
//        Chicken_image.setBounds(100,550,225,225);
//       
//        Small_Chicken.setBounds(170,780,100,30);
//        Medium_Chicken.setBounds(170,820,100,30);
//        Large_Chicken.setBounds(170,860,100,30);
//        Small_Chicken.setFont(new Font("italic",Font.ITALIC,20));
//        Medium_Chicken.setFont(new Font("italic",Font.ITALIC,20));
//        Large_Chicken.setFont(new Font("italic",Font.ITALIC,20));
//        Small_Chicken.setForeground(Color.GREEN);
//        Medium_Chicken.setForeground(Color.GREEN);
//        Large_Chicken.setForeground(Color.GREEN);
//      
//        Small_Button_Chicken.setBounds(420,780,70,30);
//        Medium_Button_Chicken.setBounds(420,820,70,30);
//        Large_Button_Chicken.setBounds(420,860,70,30);
//                      
//        Small_Cost_Chicken.setBounds(350,780,100,30);
//        Medium_Cost_Chicken.setBounds(350,820,100,30);
//        Large_Cost_Chicken.setBounds(350,860,100,30);
//        Small_Cost_Chicken.setFont(new Font("italic",Font.ITALIC,20));
//        Medium_Cost_Chicken.setFont(new Font("italic",Font.ITALIC,20));
//        Large_Cost_Chicken.setFont(new Font("italic",Font.ITALIC,20));
//        Small_Cost_Chicken.setForeground(Color.GREEN);
//        Medium_Cost_Chicken.setForeground(Color.GREEN);
//        Large_Cost_Chicken.setForeground(Color.GREEN);
//        thin_Crust_Chicken.setBounds(120,900,100,30);
//        thick_Crust_Chicken.setBounds(240,900,100,30);
  

        
           
           
        
        
        
   }
   
   private void Vegeterian ()
   {
       
      
        Group_Margretta=new ButtonGroup();
        Group_Margretta.add(thin_Crust_Margretta);
        Group_Margretta.add(thick_Crust_Margretta);
        Group_Cheese=new ButtonGroup();
        Group_Cheese.add(thin_Crust_Cheese);
        Group_Cheese.add(thick_Crust_Cheese);
               
             
                 
      //adjust cheese attributes
      
        imageP.add(Cheese_image);
        imageP.add(Next); 
        imageP.add(Small_Cheese);
        imageP.add(Medium_Cheese);
        imageP.add(Large_Cheese);
        imageP.add(Small_Cost_Cheese);
        imageP.add(Medium_Cost_Cheese);
        imageP.add(Large_Cost_Cheese);
        imageP.add(Small_Button_Cheese);
        imageP.add(Medium_Button_Cheese);
        imageP.add(Large_Button_Cheese);
        imageP.add(thin_Crust_Cheese);
        imageP.add(thick_Crust_Cheese);
        imageP.add(ketchub);
        imageP.add(Motzrella);
        imageP.add(Parpeque);
          
        Cheese_image.setBounds(30,300,150,150);
        Border border4 = BorderFactory.createBevelBorder(0, null, null,null,Color.DARK_GRAY);
        Cheese_image.setBorder(border4);
        
        
        Small_Cheese.setBounds(30,460,100,40);
        Small_Cheese.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Small_Cheese.setForeground(new Color(255,153,0));
        
        Medium_Cheese.setBounds(30,500,100,40);
        Medium_Cheese.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Medium_Cheese.setForeground(new Color(255,153,0));
        
        Large_Cheese.setBounds(30,540,100,40);
        Large_Cheese.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Large_Cheese.setForeground(new Color(255,153,0));
   
        Small_Cost_Cheese.setBounds(100,466,100,30);
        Small_Cost_Cheese.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Small_Cost_Cheese.setForeground(new Color(255,153,0));
        
        Medium_Cost_Cheese.setBounds(100,506,100,30);
        Medium_Cost_Cheese.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Medium_Cost_Cheese.setForeground(new Color(255,153,0));
        
        Large_Cost_Cheese.setBounds(100,548,100,30);
        Large_Cost_Cheese.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Large_Cost_Cheese.setForeground(new Color(255,153,0));
        
        
      
        Small_Button_Cheese.setBounds(160,472,20,20);
        Small_Button_Cheese.setBackground(new Color(255,255,255));
        Small_Button_Cheese.setForeground(new Color(255,153,0));
        Small_Button_Cheese.setFont(new Font("Tahoma",Font.BOLD,15));
        Small_Button_Cheese.setBorder(border4);
        
        Medium_Button_Cheese.setBounds(160,510,20,20);
        Medium_Button_Cheese.setBackground(new Color(255,255,255));
        Medium_Button_Cheese.setForeground(new Color(255,153,0));
        Medium_Button_Cheese.setFont(new Font("Tahoma",Font.BOLD,15));
        Medium_Button_Cheese.setBorder(border4);
        
    
        Large_Button_Cheese.setBounds(160,552,20,20);
        Large_Button_Cheese.setBackground(new Color(255,255,255));
        Large_Button_Cheese.setForeground(new Color(255,153,0));
        Large_Button_Cheese.setFont(new Font("Tahoma",Font.BOLD,15));
        Large_Button_Cheese.setBorder(border4);
                      
        
        thin_Crust_Cheese.setBounds(30,585,75,25);
        thin_Crust_Cheese.setBackground(new Color(255,255,255));
        thin_Crust_Cheese.setForeground(new Color(255,153,0));
        thin_Crust_Cheese.setFont(new Font("Harlow Solid Italic",Font.BOLD,10));
        thin_Crust_Cheese.setBorder(border4);
        
        
        
        thick_Crust_Cheese.setBounds(107,585,75,25);
        thick_Crust_Cheese.setBackground(new Color(255,255,255));
        thick_Crust_Cheese.setForeground(new Color(255,153,0));
        thick_Crust_Cheese.setFont(new Font("Harlow Solid Italic",Font.BOLD,10));
        thick_Crust_Cheese.setBorder(border4);
        
        
        
        
       
       
         // adjust Margretta attributes
        imageP.add(Margretta_image);     
     
        imageP.add(Small_Margretta);
        imageP.add(Medium_Margretta);
        imageP.add(Large_Margretta);
        imageP.add(Small_Cost_Margretta);
        imageP.add(Medium_Cost_Margretta);
        imageP.add(Large_Cost_Margretta);
        imageP.add(Small_Button_Margretta);
        imageP.add(Medium_Button_Margretta);
        imageP.add(Large_Button_Margretta); 
        imageP.add(thin_Crust_Margretta);
        imageP.add(thick_Crust_Margretta);
          
        
        Margretta_image.setBounds(220,300,150,150);
        Margretta_image.setBorder(border4);
        
        
        Small_Margretta.setBounds(220,460,100,40);
        Small_Margretta.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Small_Margretta.setForeground(new Color(255,153,0));
        
        Medium_Margretta.setBounds(220,500,100,40);
        Medium_Margretta.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Medium_Margretta.setForeground(new Color(255,153,0));
        
        
        Large_Margretta.setBounds(220,540,100,40);
        Large_Margretta.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Large_Margretta.setForeground(new Color(255,153,0));
       
        
        Small_Cost_Margretta.setBounds(290,466,100,30);
        Small_Cost_Margretta.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Small_Cost_Margretta.setForeground(new Color(255,153,0));
        
        Medium_Cost_Margretta.setBounds(290,506,100,30);
        Medium_Cost_Margretta.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Medium_Cost_Margretta.setForeground(new Color(255,153,0));
        
        Large_Cost_Margretta.setBounds(290,548,100,30);
        Large_Cost_Margretta.setFont(new Font("Harlow Solid Italic",Font.ITALIC,16));
        Large_Cost_Margretta.setForeground(new Color(255,153,0));
        
        
        
        Small_Button_Margretta.setBounds(350,472,20,20);
        Small_Button_Margretta.setBackground(new Color(255,255,255));
        Small_Button_Margretta.setForeground(new Color(255,153,0));
        Small_Button_Margretta.setFont(new Font("Tahoma",Font.BOLD,15));
        Small_Button_Margretta.setBorder(border4);
        
        Medium_Button_Margretta.setBounds(350,510,20,20);
        Medium_Button_Margretta.setBackground(new Color(255,255,255));
        Medium_Button_Margretta.setForeground(new Color(255,153,0));
        Medium_Button_Margretta.setFont(new Font("Tahoma",Font.BOLD,15));
        Medium_Button_Margretta.setBorder(border4);
        
        Large_Button_Margretta.setBounds(350,552,20,20);
        Large_Button_Margretta.setBackground(new Color(255,255,255));
        Large_Button_Margretta.setForeground(new Color(255,153,0));
        Large_Button_Margretta.setFont(new Font("Tahoma",Font.BOLD,15));
        Large_Button_Margretta.setBorder(border4);
     
        
        
        thin_Crust_Margretta.setBounds(220,585,75,25);
        thin_Crust_Margretta.setBackground(new Color(255,255,255));
        thin_Crust_Margretta.setForeground(new Color(255,153,0));
        thin_Crust_Margretta.setFont(new Font("Harlow Solid Italic",Font.BOLD,10));
        thin_Crust_Margretta.setBorder(border4);
        
        thick_Crust_Margretta.setBounds(297,585,75,25);
        thick_Crust_Margretta.setBackground(new Color(255,255,255));
        thick_Crust_Margretta.setForeground(new Color(255,153,0));
        thick_Crust_Margretta.setFont(new Font("Harlow Solid Italic",Font.BOLD,10));
        thick_Crust_Margretta.setBorder(border4);
  
        
        
        Next.setBounds(150,660,100,25);
        Next.setBackground(new Color(255,255,255));
        Next.setForeground(new Color(255,153,0));
        Next.setFont(new Font("Tahoma",Font.BOLD,14));
        Next.setBorder(border4);
        Next.addActionListener(this);
        
        
        ketchub.setBounds(30,620,110,30);
        ketchub.setBackground(new Color(255,153,0));
        ketchub.setForeground(new Color(255,255,255));
        ketchub.setFont(new Font("Harlow Solid Italic",Font.BOLD,12));
        ketchub.setBorder(border4);
        
        Motzrella.setBounds(146,620,110,30);
        Motzrella.setBackground(new Color(255,153,0));
        Motzrella.setForeground(new Color(255,255,255));
        Motzrella.setFont(new Font("Harlow Solid Italic",Font.BOLD,10));
        Motzrella.setBorder(border4);
       
        Parpeque.setBounds(262,620,110,30);
        Parpeque.setBackground(new Color(255,153,0));
        Parpeque.setForeground(new Color(255,255,255));
        Parpeque.setFont(new Font("Harlow Solid Italic",Font.BOLD,12));
        Parpeque.setBorder(border4);
              
      
   }
   
   
  
          
   public void make_order(int id)
   {
       db.connect();
       r=db.retreive_Userdata("users");
                
       try {
           while (r.next())
           {
               if(r.getInt("id")==id){
                   
                   Username_Text.setText(r.getString("name"));
                   
                   break;
                   
               }
               
           }
       }catch (SQLException ex){
           System.out.print(ex.getMessage());
       }
       
      
       image_frame.setSize(416,751);
       image_frame.setVisible(true);
       image_frame.setLocation(100,100);
       image_frame.setLayout(null);
       image_frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
       imageP = new JLabel(mpg5);
       imageP.setBounds(0, 0, 400, 711);
       
       image_frame.setVisible(true);
       image_panel.setLayout(null);
       image_panel.setBounds(0, 0, 416, 751);
       
       image_panel.add(labelP);
       image_panel.add(labelP1);
       image_panel.add(Categroies);
       image_panel.add(Next);
       image_panel.add(imageP);
       
       
       
       
        labelP.setBounds(115, 62, 360, 50);
        labelP.setFont(new Font("Harlow Solid Italic",Font.ITALIC,35));
        labelP.setForeground(new Color(255,153,0));
        
        labelP1.setBounds(30, 190, 360, 50);
        labelP1.setFont(new Font("Harlow Solid Italic",Font.ITALIC,28));
        labelP1.setForeground(new Color(255,255,255));
       
       Categroies.setBounds(50, 245, 300, 30);
       Categroies.setBackground(new Color(255,255,255));
       Categroies.setForeground(new Color(255,153,0));
       Categroies.setFont(new Font("Tahoma",Font.BOLD,14));
       Border border4 = BorderFactory.createBevelBorder(10, Color.DARK_GRAY,null ,null,null);
       Categroies.setBorder(border4);
       
       
       Next.setBounds(880,900,100,50);
       Next.addActionListener(this);
       
       Small_Button_pepprony.addActionListener(this);
       Medium_Button_pepprony.addActionListener(this);
       Large_Button_pepprony.addActionListener(this);
        
       Small_Button_MixMeat.addActionListener(this);
       Medium_Button_MixMeat.addActionListener(this);
       Large_Button_MixMeat.addActionListener(this);
       Small_Button_Chicken.addActionListener(this);
       Medium_Button_Chicken.addActionListener(this);
       Large_Button_Chicken.addActionListener(this);
       Small_Button_Cheese.addActionListener(this);
       Medium_Button_Cheese.addActionListener(this);
       Large_Button_Cheese.addActionListener(this);
       Small_Button_Margretta.addActionListener(this);
       Medium_Button_Margretta.addActionListener(this);
       Large_Button_Margretta.addActionListener(this);
        
        
        
        
        image_panel.add(backing);
        backing.setBounds(600,900,300,50);
        backing.setBackground(new Color(255,153,0));
        backing.setForeground(new Color(255,255,255));
        backing.setFont(new Font("tahoma",Font.PLAIN,18));
        backing.addActionListener(this);
          
       
        
        
     //  Categroies.setBackground(Color.YELLOW);
       
      //Categroies.addActionListener(this);
      Categroies.addItemListener(this);
      
             try {
       pepprony=new ImageIcon(getClass().getResource("Peprony.JPG"));
       MixMeat=new ImageIcon(getClass().getResource("MixMeat.JPG"));
      // Chicken=new ImageIcon(getClass().getResource("chicken.JPEG"));
       Cheese=new ImageIcon(getClass().getResource("Cheese.jpg"));
       Margretta=new ImageIcon(getClass().getResource("Margreta.jpg"));
       image_frame.add(image_panel);
       image_panel.setBackground(Color.BLACK);
       
       pepprony_image=new JLabel(pepprony);
       MixMeat_image=new JLabel(MixMeat);
       Chicken_image=new JLabel(Chicken);
       Cheese_image=new JLabel(Cheese);
       Margretta_image=new JLabel(Margretta);
    
       }catch (Exception ex)
       {
           System.out.print(ex.getMessage());
       
       }
       
              
       
     
    
       
   }
    @Override
    public void actionPerformed(ActionEvent e) {
       
          
  
  db.connect();
  
  
  
  if(e.getSource()==AdminBtn)
  {
      admin.Adminlogin_form();
      JStart.setVisible(false);
  }
   if(e.getSource()==UserBtn)
  {
      login_form();
       JStart.setVisible(false);
  }
    
        if(e.getSource()==b1)
        {
              r=db.retreive_Userdata("users");
         try {
          while(r.next())
          {


           if(r.getString("password").equalsIgnoreCase(String.valueOf(t2.getPassword()))&&t1.getText().toString().equalsIgnoreCase(r.getString("name")))
           {
               ID=r.getInt("id");
              
                 
             JOptionPane.showMessageDialog(null,"login succesfuly");  
             Welcome_form(ID);
             break;
           }
           
          else if(r.getString("password").equalsIgnoreCase(String.valueOf(t2.getPassword()))&&t1.getText().toString().equalsIgnoreCase(r.getString("name"))&&r.isLast())
          {
              JOptionPane.showMessageDialog(null,"wrong username or password");  
          }
          
               }
          }  catch (SQLException ex){
                   System.out.print(ex.getMessage());
               }
        }
        
        
        if(e.getSource()==b2)
        {
         register_form();
         j.setVisible(false);
        }
        
        
        if(e.getSource()==b3)
        {
            db.insert_Userdata(Nametxt.getText().toString(), Integer.parseInt(Numbertxt.getText().toString()), Addresstxt.getText().toString(),String.valueOf(Passtxt.getPassword()));
            login_form();
            j2.setVisible(false);
        }
        
        if(e.getSource()==ManageBtn)
        {
            
            
            modfiy_form(ID);
        }
          
            if(e.getSource()==modify)
            {
                try{
                db.update_UserName(mt3.getText().toString(), r.getString("name"));
                db.update_UserContact(Integer.parseInt(mt4.getText().toString()), r.getInt("contactNumber"));
                db.update_UserAddress(mt5.getText().toString(),r.getString("address") );
                Welcome_form(r.getInt("id"));
                System.out. print("modified succesfulyy");
                }catch (SQLException ex)
                {
                    System.out.print(ex.getMessage());
                }
                mj2.setVisible(false);
                
            }
            if(e.getSource()==LogoutBtn)
            {
                
              
                j3.setVisible(false);
                login_form();
            }
            if(e.getSource()==OrderBtn)
            {
                j3.setVisible(false);
                make_order(ID);
                
            }
            if(e.getSource()==Next)
            {
                
         confirm_order(ID);
               
                
                
            }
        
            if(e.getSource()==Small_Button_pepprony)
            {
                counter++;
                Quantity.setText(String.valueOf(counter));
              
                PizzaBuilder small_pepprony=new pepprony_pizza();
                
                order.setPizzabuilder(small_pepprony);
                if (thin_Crust_pepprony.isSelected())
                {
                    order.constructPizza("small", "thin");
                }
                else if(thick_Crust_pepprony.isSelected())
                {
                    order.constructPizza("small", "thick");
                }
                else
                {
                    order.constructPizza("small", "thin");
                }
                pizza piz=order.getPizza();
              if(ketchub.isSelected())
              {
                  
                  small_pepprony=new Ketchub(small_pepprony);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Ketchub \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Ketchub \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(small_pepprony.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+small_pepprony.getCost()));

                  }
                  ketchub.setSelected(false);
              }
              if(Motzrella.isSelected())
              {
                  small_pepprony=new Mozarella(small_pepprony);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Motzrella \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Motzrella \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(small_pepprony.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+small_pepprony.getCost()));

                  }
                  Motzrella.setSelected(false);
              }
              if(Parpeque.isSelected())
              {
                   small_pepprony=new Parpeque(small_pepprony);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Parpeque \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Parpeque \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(small_pepprony.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+small_pepprony.getCost()));

                  }
                  Parpeque.setSelected(false);
              }
            
                if(TotalPrice.getText().equals(""))
                {
               
                 
                 TotalPrice.setText(String.valueOf(piz.getCost()));
                }
                else
                {
                    TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText().trim())+piz.getCost()));
                }
                if(OrderDetails.getText().equals(""))
                {
                  OrderDetails.setText(" pepprony "+piz.getSize()+" "+piz.getCrust()+"\n");

                }
                else
                {
                OrderDetails.setText(OrderDetails.getText()+" pepprony "+piz.getSize()+" "+piz.getCrust()+"\n");

                }
               
            }
            
             if(e.getSource()==Medium_Button_pepprony)
            {
               counter++;
                Quantity.setText(String.valueOf(counter));
                PizzaBuilder medium_pepprony=new pepprony_pizza();
                
                order.setPizzabuilder(medium_pepprony);
                if (thin_Crust_pepprony.isSelected())
                {
                    order.constructPizza("medium", "thin");
                }
                else if(thick_Crust_pepprony.isSelected())
                {
                    order.constructPizza("medium", "thick");
                }
                else
                {
                    order.constructPizza("medium", "thin");
                }
                pizza piz=order.getPizza();
                  if(ketchub.isSelected())
              {
                  
                  medium_pepprony=new Ketchub(medium_pepprony);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Ketchub \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Ketchub \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(medium_pepprony.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+medium_pepprony.getCost()));

                  }
                  ketchub.setSelected(false);
              }
              if(Motzrella.isSelected())
              {
                  medium_pepprony=new Mozarella(medium_pepprony);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Motzrella \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Motzrella \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(medium_pepprony.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+medium_pepprony.getCost()));

                  }
                  Motzrella.setSelected(false);
              }
              if(Parpeque.isSelected())
              {
                   medium_pepprony=new Parpeque(medium_pepprony);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Parpeque \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Parpeque \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(medium_pepprony.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+medium_pepprony.getCost()));

                  }
                  Parpeque.setSelected(false);
              }
              
                if(TotalPrice.getText().equals(""))
                {
               
                 
                 TotalPrice.setText(String.valueOf(piz.getCost()));
                }
                else
                {
                    TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText().trim())+piz.getCost()));
                }
                if(OrderDetails.getText().equals(""))
                {
                  OrderDetails.setText(" pepprony "+piz.getSize()+" "+piz.getCrust());

                }
                else
                {
                OrderDetails.setText(OrderDetails.getText()+" pepprony "+piz.getSize()+" "+piz.getCrust());

                }
               
            }
             if(e.getSource()==Large_Button_pepprony)
            {
             counter++;  
               Quantity.setText(String.valueOf(counter));
                PizzaBuilder large_pepprony=new pepprony_pizza();
                
                order.setPizzabuilder(large_pepprony);
                if (thin_Crust_pepprony.isSelected())
                {
                    order.constructPizza("large", "thin");
                }
                else if(thick_Crust_pepprony.isSelected())
                {
                    order.constructPizza("large", "thick");
                }
                else
                {
                    order.constructPizza("large", "thin");
                }
                pizza piz=order.getPizza();
                     if(ketchub.isSelected())
              {
                  
                  large_pepprony=new Ketchub(large_pepprony);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Ketchub \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Ketchub \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(large_pepprony.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+large_pepprony.getCost()));

                  }
                  ketchub.setSelected(false);
              }
              if(Motzrella.isSelected())
              {
                  large_pepprony=new Mozarella(large_pepprony);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Motzrella \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Motzrella \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(large_pepprony.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+large_pepprony.getCost()));

                  }
                  Motzrella.setSelected(false);
              }
              if(Parpeque.isSelected())
              {
                   large_pepprony=new Parpeque(large_pepprony);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Parpeque \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Parpeque \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(large_pepprony.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+large_pepprony.getCost()));

                  }
                  Parpeque.setSelected(false);
              }
              
                if(TotalPrice.getText().equals(""))
                {
               
                 
                 TotalPrice.setText(String.valueOf(piz.getCost()));
                }
                else
                {
                    TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText().trim())+piz.getCost()));
                }
                if(OrderDetails.getText().equals(""))
                {
                  OrderDetails.setText(" pepprony "+piz.getSize()+" "+piz.getCrust());

                }
                else
                {
                OrderDetails.setText(OrderDetails.getText()+" pepprony "+piz.getSize()+" "+piz.getCrust());

                }
               
            }
            
            if(e.getSource()==Small_Button_MixMeat)
            {
               
               counter++;
               Quantity.setText(String.valueOf(counter));
                PizzaBuilder small_mixmeat=new Mixmeat_pizza();
                
                order.setPizzabuilder(small_mixmeat);
                if (thin_Crust_MixMeat.isSelected())
                {
                    order.constructPizza("small", "thin");
                }
                else if(thick_Crust_MixMeat.isSelected())
                {
                    order.constructPizza("small", "thick");
                }
                else
                {
                    order.constructPizza("small", "thin");
                }
                pizza piz=order.getPizza();
                    if(ketchub.isSelected())
              {
                  
                  small_mixmeat=new Ketchub(small_mixmeat);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Ketchub \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Ketchub \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(small_mixmeat.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+small_mixmeat.getCost()));

                  }
                  ketchub.setSelected(false);
              }
              if(Motzrella.isSelected())
              {
                  small_mixmeat=new Mozarella(small_mixmeat);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Motzrella \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Motzrella \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(small_mixmeat.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+small_mixmeat.getCost()));

                  }
                  Motzrella.setSelected(false);
              }
              if(Parpeque.isSelected())
              {
                   small_mixmeat=new Parpeque(small_mixmeat);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Parpeque \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Parpeque \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(small_mixmeat.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+small_mixmeat.getCost()));

                  }
                  Parpeque.setSelected(false);
              }
              
                if(TotalPrice.getText().equals(""))
                {
               
                 
                 TotalPrice.setText(String.valueOf(piz.getCost()));
                }
                else
                {
                    TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText().trim())+piz.getCost()));
                }
                if(OrderDetails.getText().equals(""))
                {
                  OrderDetails.setText(" MixMeat "+piz.getSize()+" "+piz.getCrust());

                }
                else
                {
                OrderDetails.setText(OrderDetails.getText()+" MixMeat"+piz.getSize()+" "+piz.getCrust());

                }
               
            }
            if(e.getSource()==Medium_Button_MixMeat)
            {
               
               counter++;
               Quantity.setText(String.valueOf(counter));
                PizzaBuilder medium_mixmeat=new Mixmeat_pizza();
                
                order.setPizzabuilder(medium_mixmeat);
                if (thin_Crust_MixMeat.isSelected())
                {
                    order.constructPizza("medium", "thin");
                }
                else if(thick_Crust_MixMeat.isSelected())
                {
                    order.constructPizza("medium", "thick");
                }
                else
                {
                    order.constructPizza("medium", "thin");
                }
                pizza piz=order.getPizza();
                
                     if(ketchub.isSelected())
              {
                  
                  medium_mixmeat=new Ketchub(medium_mixmeat);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Ketchub \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Ketchub \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(medium_mixmeat.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+medium_mixmeat.getCost()));

                  }
                  ketchub.setSelected(false);
              }
              if(Motzrella.isSelected())
              {
                  medium_mixmeat=new Mozarella(medium_mixmeat);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Motzrella \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Motzrella \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(medium_mixmeat.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+medium_mixmeat.getCost()));

                  }
                  Motzrella.setSelected(false);
              }
              if(Parpeque.isSelected())
              {
                   medium_mixmeat=new Parpeque(medium_mixmeat);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Parpeque \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Parpeque \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(medium_mixmeat.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+medium_mixmeat.getCost()));

                  }
                  Parpeque.setSelected(false);
              }
              
              
                if(TotalPrice.getText().equals(""))
                {
               
                 
                 TotalPrice.setText(String.valueOf(piz.getCost()));
                }
                else
                {
                    TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText().trim())+piz.getCost()));
                }
                if(OrderDetails.getText().equals(""))
                {
                  OrderDetails.setText(" MixMeat "+piz.getSize()+" "+piz.getCrust());

                }
                else
                {
                OrderDetails.setText(OrderDetails.getText()+" MixMeat"+piz.getSize()+" "+piz.getCrust());

                }
               
            }
           
            
              if(e.getSource()==Large_Button_MixMeat)
            {
           counter++;
            Quantity.setText(String.valueOf(counter));
            if(Quantity.getText().equals(""))
                {
                    Quantity.setText(String.valueOf(counter));
                }
                else
                {
                   Quantity.setText(String.valueOf(counter+Integer.parseInt(Quantity.getText())));
                }
               
                PizzaBuilder large_mixmeat=new Mixmeat_pizza();
                
                order.setPizzabuilder(large_mixmeat);
                if (thin_Crust_MixMeat.isSelected())
                {
                    order.constructPizza("large", "thin");
                }
                else if(thick_Crust_MixMeat.isSelected())
                {
                    order.constructPizza("large", "thick");
                }
                else
                {
                    order.constructPizza("large", "thin");
                }
                pizza piz=order.getPizza();
                
                        if(ketchub.isSelected())
              {
                  
                  large_mixmeat=new Ketchub(large_mixmeat);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Ketchub \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Ketchub \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(large_mixmeat.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+large_mixmeat.getCost()));

                  }
                  ketchub.setSelected(false);
              }
              if(Motzrella.isSelected())
              {
                  large_mixmeat=new Mozarella(large_mixmeat);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Motzrella \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Motzrella \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(large_mixmeat.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+large_mixmeat.getCost()));

                  }
                  Motzrella.setSelected(false);
              }
              if(Parpeque.isSelected())
              {
                   large_mixmeat=new Parpeque(large_mixmeat);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Parpeque \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Parpeque \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(large_mixmeat.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+large_mixmeat.getCost()));

                  }
                  Parpeque.setSelected(false);
              }
              
                if(TotalPrice.getText().equals(""))
                {
               
                 
                 TotalPrice.setText(String.valueOf(piz.getCost()));
                }
                else
                {
                    TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText().trim())+piz.getCost()));
                }
                if(OrderDetails.getText().equals(""))
                {
                  OrderDetails.setText(" MixMeat "+piz.getSize()+" "+piz.getCrust());

                }
                else
                {
                OrderDetails.setText(OrderDetails.getText()+" MixMeat"+piz.getSize()+" "+piz.getCrust());

                }
               
            }
            
             if(e.getSource()==Small_Button_Chicken)
            {
               
               counter++;
              Quantity.setText(String.valueOf(counter));
                PizzaBuilder small_chicken=new chicken_pizza();
                
                order.setPizzabuilder(small_chicken);
                if (thin_Crust_Chicken.isSelected())
                {
                    order.constructPizza("small", "thin");
                }
                else if(thick_Crust_Chicken.isSelected())
                {
                    order.constructPizza("small", "thick");
                }
                else
                {
                    order.constructPizza("small", "thin");
                }
                pizza piz=order.getPizza();
                
                          if(ketchub.isSelected())
              {
                  
                  small_chicken=new Ketchub(small_chicken);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Ketchub \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Ketchub \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(small_chicken.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+small_chicken.getCost()));

                  }
                  ketchub.setSelected(false);
              }
              if(Motzrella.isSelected())
              {
                  small_chicken=new Mozarella(small_chicken);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Motzrella \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Motzrella \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(small_chicken.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+small_chicken.getCost()));

                  }
                  Motzrella.setSelected(false);
              }
              if(Parpeque.isSelected())
              {
                   small_chicken=new Parpeque(small_chicken);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Parpeque \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Parpeque \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(small_chicken.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+small_chicken.getCost()));

                  }
                  Parpeque.setSelected(false);
              }
              
                if(TotalPrice.getText().equals(""))
                {
               
                 
                 TotalPrice.setText(String.valueOf(piz.getCost()));
                }
                else
                {
                    TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText().trim())+piz.getCost()));
                }
                if(OrderDetails.getText().equals(""))
                {
                  OrderDetails.setText(" Chicken "+piz.getSize()+" "+piz.getCrust());

                }
                else
                {
                OrderDetails.setText(OrderDetails.getText()+"Chicken"+piz.getSize()+" "+piz.getCrust());

                }
               
            }
              if(e.getSource()==Medium_Button_Chicken)
            {
               counter++;
                Quantity.setText(String.valueOf(counter));
                PizzaBuilder medium_chicken=new chicken_pizza();
                
                order.setPizzabuilder(medium_chicken);
                if (thin_Crust_Chicken.isSelected())
                {
                    order.constructPizza("medium", "thin");
                }
                else if(thick_Crust_Chicken.isSelected())
                {
                    order.constructPizza("medium", "thick");
                }
                else
                {
                    order.constructPizza("medium", "thin");
                }
                pizza piz=order.getPizza();
                
                      if(ketchub.isSelected())
              {
                  
                  medium_chicken=new Ketchub(medium_chicken);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Ketchub \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Ketchub \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(medium_chicken.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+medium_chicken.getCost()));

                  }
                  ketchub.setSelected(false);
              }
              if(Motzrella.isSelected())
              {
                  medium_chicken=new Mozarella(medium_chicken);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Motzrella \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Motzrella \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(medium_chicken.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+medium_chicken.getCost()));

                  }
                  Motzrella.setSelected(false);
              }
              if(Parpeque.isSelected())
              {
                   medium_chicken=new Parpeque(medium_chicken);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Parpeque \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Parpeque \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(medium_chicken.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+medium_chicken.getCost()));

                  }
                  Parpeque.setSelected(false);
              }
              
                if(TotalPrice.getText().equals(""))
                {
               
                 
                 TotalPrice.setText(String.valueOf(piz.getCost()));
                }
                else
                {
                    TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText().trim())+piz.getCost()));
                }
                if(OrderDetails.getText().equals(""))
                {
                  OrderDetails.setText(" Chicken "+piz.getSize()+" "+piz.getCrust());

                }
                else
                {
                OrderDetails.setText(OrderDetails.getText()+"Chicken"+piz.getSize()+" "+piz.getCrust());

                }
               
            }
              if(e.getSource()==Large_Button_Chicken)
            {
               
               counter++;
               Quantity.setText(String.valueOf(counter));
                PizzaBuilder large_chicken=new chicken_pizza();
                
                order.setPizzabuilder(large_chicken);
                if (thin_Crust_Chicken.isSelected())
                {
                    order.constructPizza("large", "thin");
                }
                else if(thick_Crust_Chicken.isSelected())
                {
                    order.constructPizza("large", "thick");
                }
                else
                {
                    order.constructPizza("large", "thin");
                }
                pizza piz=order.getPizza();
                           if(ketchub.isSelected())
              {
                  
                  large_chicken=new Ketchub(large_chicken);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Ketchub \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Ketchub \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(large_chicken.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+large_chicken.getCost()));

                  }
                  ketchub.setSelected(false);
              }
              if(Motzrella.isSelected())
              {
                  large_chicken=new Mozarella(large_chicken);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Motzrella \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Motzrella \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(large_chicken.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+large_chicken.getCost()));

                  }
                  Motzrella.setSelected(false);
              }
              if(Parpeque.isSelected())
              {
                   large_chicken=new Parpeque(large_chicken);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Parpeque \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Parpeque \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(large_chicken.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+large_chicken.getCost()));

                  }
                  Parpeque.setSelected(false);
              }
              
                if(TotalPrice.getText().equals(""))
                {
               
                 
                 TotalPrice.setText(String.valueOf(piz.getCost()));
                }
                else
                {
                    TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText().trim())+piz.getCost()));
                }
                if(OrderDetails.getText().equals(""))
                {
                  OrderDetails.setText(" Chicken "+piz.getSize()+" "+piz.getCrust());

                }
                else
                {
                OrderDetails.setText(OrderDetails.getText()+"Chicken"+piz.getSize()+" "+piz.getCrust());

                }
               
            }
             if(e.getSource()==Small_Button_Margretta)
            {
               
               counter++;
               Quantity.setText(String.valueOf(counter));
                PizzaBuilder small_margretta=new margretta_pizza();
                
                order.setPizzabuilder(small_margretta);
                if (thin_Crust_Margretta.isSelected())
                {
                    order.constructPizza("small", "thin");
                }
                else if(thick_Crust_Margretta.isSelected())
                {
                    order.constructPizza("small", "thick");
                }
                else
                {
                    order.constructPizza("small", "thin");
                }
                pizza piz=order.getPizza();
                
               if(ketchub.isSelected())
              {
                  
                  small_margretta=new Ketchub(small_margretta);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Ketchub \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Ketchub \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(small_margretta.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+small_margretta.getCost()));

                  }
                  ketchub.setSelected(false);
              }
              if(Motzrella.isSelected())
              {
                  small_margretta=new Mozarella(small_margretta);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Motzrella \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Motzrella \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(small_margretta.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+small_margretta.getCost()));

                  }
                  Motzrella.setSelected(false);
              }
              if(Parpeque.isSelected())
              {
                   small_margretta=new Parpeque(small_margretta);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Parpeque \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Parpeque \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(small_margretta.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+small_margretta.getCost()));

                  }
                  Parpeque.setSelected(false);
              }
              
                if(TotalPrice.getText().equals(""))
                {
               
                 
                 TotalPrice.setText(String.valueOf(piz.getCost()));
                }
                else
                {
                    TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText().trim())+piz.getCost()));
                }
                if(OrderDetails.getText().equals(""))
                {
                  OrderDetails.setText(" Margretta "+piz.getSize()+" "+piz.getCrust());

                }
                else
                {
                OrderDetails.setText(OrderDetails.getText()+"Margretta"+piz.getSize()+" "+piz.getCrust());

                }
               
            }
              if(e.getSource()==Medium_Button_Margretta)
            {
               counter++;
                Quantity.setText(String.valueOf(counter));
                PizzaBuilder medium_margretta=new margretta_pizza();
                
                order.setPizzabuilder(medium_margretta);
                if (thin_Crust_Margretta.isSelected())
                {
                    order.constructPizza("medium", "thin");
                }
                else if(thick_Crust_Margretta.isSelected())
                {
                    order.constructPizza("medium", "thick");
                }
                else
                {
                    order.constructPizza("medium", "thin");
                }
                pizza piz=order.getPizza();
                
                    if(ketchub.isSelected())
              {
                  
                  medium_margretta=new Ketchub(medium_margretta);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Ketchub \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Ketchub \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(medium_margretta.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+medium_margretta.getCost()));

                  }
                  ketchub.setSelected(false);
              }
              if(Motzrella.isSelected())
              {
                  medium_margretta=new Mozarella(medium_margretta);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Motzrella \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Motzrella \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(medium_margretta.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+medium_margretta.getCost()));

                  }
                  Motzrella.setSelected(false);
              }
              if(Parpeque.isSelected())
              {
                   medium_margretta=new Parpeque(medium_margretta);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Parpeque \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Parpeque \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(medium_margretta.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+medium_margretta.getCost()));

                  }
                  Parpeque.setSelected(false);
              }
              
                if(TotalPrice.getText().equals(""))
                {
               
                 
                 TotalPrice.setText(String.valueOf(piz.getCost()));
                }
                else
                {
                    TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText().trim())+piz.getCost()));
                }
                if(OrderDetails.getText().equals(""))
                {
                  OrderDetails.setText(" Margretta "+piz.getSize()+" "+piz.getCrust());

                }
                else
                {
                OrderDetails.setText(OrderDetails.getText()+"Margretta"+piz.getSize()+" "+piz.getCrust());

                }
               
            }
               if(e.getSource()==Large_Button_Margretta)
            {
               counter++;
             Quantity.setText(String.valueOf(counter));
                PizzaBuilder large_margretta=new margretta_pizza();
                
                order.setPizzabuilder(large_margretta);
                if (thin_Crust_Margretta.isSelected())
                {
                    order.constructPizza("large", "thin");
                }
                else if(thick_Crust_Margretta.isSelected())
                {
                    order.constructPizza("large", "thick");
                }
                else
                {
                    order.constructPizza("large", "thin");
                }
                pizza piz=order.getPizza();
                
                if(ketchub.isSelected())
              {
                  
                  large_margretta=new Ketchub(large_margretta);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Ketchub \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Ketchub \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(large_margretta.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+large_margretta.getCost()));

                  }
                  ketchub.setSelected(false);
              }
              if(Motzrella.isSelected())
              {
                  large_margretta=new Mozarella(large_margretta);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Motzrella \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Motzrella \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(large_margretta.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+large_margretta.getCost()));

                  }
                  Motzrella.setSelected(false);
              }
              if(Parpeque.isSelected())
              {
                   large_margretta=new Parpeque(large_margretta);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Parpeque \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Parpeque \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(large_margretta.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+large_margretta.getCost()));

                  }
                  Parpeque.setSelected(false);
              }
              
                if(TotalPrice.getText().equals(""))
                {
               
                 
                 TotalPrice.setText(String.valueOf(piz.getCost()));
                }
                else
                {
                    TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText().trim())+piz.getCost()));
                }
                if(OrderDetails.getText().equals(""))
                {
                  OrderDetails.setText(" Margretta "+piz.getSize()+" "+piz.getCrust());

                }
                else
                {
                OrderDetails.setText(OrderDetails.getText()+"Margretta"+piz.getSize()+" "+piz.getCrust());

                }
               
            }
             
             if(e.getSource()==Small_Button_Cheese)
            {
               
               counter++;
               Quantity.setText(String.valueOf(counter));
                PizzaBuilder small_cheese=new cheese_pizza();
                
                order.setPizzabuilder(small_cheese);
                if (thin_Crust_Cheese.isSelected())
                {
                    order.constructPizza("small", "thin");
                }
                else if(thick_Crust_Cheese.isSelected())
                {
                    order.constructPizza("small", "thick");
                }
                else
                {
                    order.constructPizza("small", "thin");
                }
                pizza piz=order.getPizza();
                
                  if(ketchub.isSelected())
              {
                  
                  small_cheese=new Ketchub(small_cheese);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Ketchub \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Ketchub \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(small_cheese.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+small_cheese.getCost()));

                  }
                  ketchub.setSelected(false);
              }
              if(Motzrella.isSelected())
              {
                  small_cheese=new Mozarella(small_cheese);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Motzrella \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Motzrella \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(small_cheese.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+small_cheese.getCost()));

                  }
                  Motzrella.setSelected(false);
              }
              if(Parpeque.isSelected())
              {
                   small_cheese=new Parpeque(small_cheese);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Parpeque \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Parpeque \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(small_cheese.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+small_cheese.getCost()));

                  }
                  Parpeque.setSelected(false);
              }
              
                if(TotalPrice.getText().equals(""))
                {
               
                 
                 TotalPrice.setText(String.valueOf(piz.getCost()));
                }
                else
                {
                    TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText().trim())+piz.getCost()));
                }
                if(OrderDetails.getText().equals(""))
                {
                  OrderDetails.setText(" Cheese "+piz.getSize()+" "+piz.getCrust());

                }
                else
                {
                OrderDetails.setText(OrderDetails.getText()+"Cheese"+piz.getSize()+" "+piz.getCrust());

                }
               
            }
               if(e.getSource()==Medium_Button_Cheese)
            {
               
               counter++;
             Quantity.setText(String.valueOf(counter));
                PizzaBuilder medium_cheese=new cheese_pizza();
                
                order.setPizzabuilder(medium_cheese);
                if (thin_Crust_Cheese.isSelected())
                {
                    order.constructPizza("medium", "thin");
                }
                else if(thick_Crust_Cheese.isSelected())
                {
                    order.constructPizza("medium", "thick");
                }
                else
                {
                    order.constructPizza("medium", "thin");
                }
                pizza piz=order.getPizza();
                
                    if(ketchub.isSelected())
              {
                  
                  medium_cheese=new Ketchub(medium_cheese);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Ketchub \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Ketchub \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(medium_cheese.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+medium_cheese.getCost()));

                  }
                  ketchub.setSelected(false);
              }
              if(Motzrella.isSelected())
              {
                  medium_cheese=new Mozarella(medium_cheese);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Motzrella \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Motzrella \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(medium_cheese.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+medium_cheese.getCost()));

                  }
                  Motzrella.setSelected(false);
              }
              if(Parpeque.isSelected())
              {
                   medium_cheese=new Parpeque(medium_cheese);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Parpeque \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Parpeque \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(medium_cheese.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+medium_cheese.getCost()));

                  }
                  Parpeque.setSelected(false);
              }
              
                if(TotalPrice.getText().equals(""))
                {
               
                 
                 TotalPrice.setText(String.valueOf(piz.getCost()));
                }
                else
                {
                    TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText().trim())+piz.getCost()));
                }
                if(OrderDetails.getText().equals(""))
                {
                  OrderDetails.setText(" Cheese "+piz.getSize()+" "+piz.getCrust());

                }
                else
                {
                OrderDetails.setText(OrderDetails.getText()+"Cheese"+piz.getSize()+" "+piz.getCrust());

                }
               
            }
                 if(e.getSource()==Large_Button_Cheese)
            {
               counter++;
               Quantity.setText(String.valueOf(counter));
                PizzaBuilder large_cheese=new cheese_pizza();
                
                order.setPizzabuilder(large_cheese);
                if (thin_Crust_Cheese.isSelected())
                {
                    order.constructPizza("large", "thin");
                }
                else if(thick_Crust_Cheese.isSelected())
                {
                    order.constructPizza("large", "thick");
                }
                else
                {
                    order.constructPizza("large", "thin");
                }
                pizza piz=order.getPizza();
                
                         if(ketchub.isSelected())
              {
                  
                  large_cheese=new Ketchub(large_cheese);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Ketchub \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Ketchub \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(large_cheese.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+large_cheese.getCost()));

                  }
                  ketchub.setSelected(false);
              }
              if(Motzrella.isSelected())
              {
                  large_cheese=new Mozarella(large_cheese);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Motzrella \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Motzrella \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(large_cheese.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+large_cheese.getCost()));

                  }
                  Motzrella.setSelected(false);
              }
              if(Parpeque.isSelected())
              {
                   large_cheese=new Parpeque(large_cheese);
                  if(Addtionals.getText()=="")
                  {
                      Addtionals.setText("Parpeque \n");
                  }
                  else
                  {
                       Addtionals.setText(Addtionals.getText()+"Parpeque \n");
                  }
                  if(TotalPrice.getText().equals(""))
                  {
                      TotalPrice.setText(String.valueOf(large_cheese.getCost()));
                  }
                  else
                  {
                  TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText())+large_cheese.getCost()));

                  }
                  Parpeque.setSelected(false);
              }
              
                if(TotalPrice.getText().equals(""))
                {
               
                 
                 TotalPrice.setText(String.valueOf(piz.getCost()));
                }
                else
                {
                    TotalPrice.setText(String.valueOf(Integer.parseInt(TotalPrice.getText().trim())+piz.getCost()));
                }
                if(OrderDetails.getText().equals(""))
                {
                  OrderDetails.setText(" Cheese "+piz.getSize()+" "+piz.getCrust());

                }
                else
                {
                OrderDetails.setText(OrderDetails.getText()+"Cheese"+piz.getSize()+" "+piz.getCrust());

                }
               
            }
                 if (e.getSource()==PassBtn)
                 {
                     change_pass();
                 }
                 
                 if(e.getSource()==b_save)
                 {
                     r=db.retreive_Userdata("users");
            try {
            while (r.next()){
                
                if (r.getString("password").equalsIgnoreCase(String.valueOf(current_password.getPassword()))){
                   
                     if (String.valueOf(confirm_password.getPassword()) .equalsIgnoreCase(String.valueOf(new_password.getPassword())))
                     {
                         
                         db.update_password(String.valueOf(confirm_password.getPassword()), String.valueOf(current_password.getPassword()));
                          showMessageDialog(null, "The changes has been saved successfully ");
                             break;
                }
                     else {
                     showMessageDialog(null, "the confirmation password is not like the new password...!");
                    break;
                     }
                  
                
            }
               if (!String.valueOf(confirm_password.getPassword()) .equalsIgnoreCase(String.valueOf(new_password.getPassword()))&&r.isLast()) {
                    showMessageDialog(null, "the current password is wrong please enter a valid password...!");
                                
                }
            }
            } catch (SQLException ex){
            
                System.out.println("THERE'S AN EXCEPTION !");
            
            
            }
                 }
            
            if (e.getSource()== b_back)
            {
          
            
                r=db.retreive_Userdata("users");
             try {
            while (r.next())
            {
                if(r.getInt("id")==ID)
                {
                     Welcome_form(r.getInt("id"));
                }
            }   
            } catch (SQLException ex){
            
                System.out.println(ex.getMessage());
             
            }
                      
    }
                 
            if(e.getSource()==deliver)
           {
               if(visa.isSelected())
               {
                   
               }
               else if(cod.isSelected())
               {
                   r=db.retreive_Userdata("users");
                      // String s=l6.getText();
                      // String arr[]=s.split(":");
                       try{
                           while (r.next())
                           {
                               if(r.getInt("id")==ID)
                               {
                         db.insert_toOrders(r.getInt("id"), OrderDetails.getText(),Username_Text.getText(), Integer.parseInt(TotalPrice.getText()),Address.getText());
                         
                        System.out.print("total price of order :"+TotalPrice.getText()+"\n order will deleverd to:"+Address.getText()); 
                        break;
                               }
                           }
                           
                       }catch (SQLException ex)
                       {
                           System.out.println(ex.getMessage());
                       }
                   
               }
               order_frame.setVisible(false);
           }
                 
                  if(e.getSource()==cancel)
                 {
                       OrderDetails.setText("");
                         Quantity.setText("");
                           Address.setText("");
                          Addtionals.setText("");
                        TotalPrice.setText("");
                         Username_Text.setText("");
                     make_order(ID);
                 }

  
            
    }
      @Override
    public void itemStateChanged(ItemEvent e) {
          Object item;
         item=Categroies.getSelectedItem();
         
         
         
                if(item.toString().equalsIgnoreCase("Vegan"))
                {
                     pepprony_image.setVisible(true);
                    MixMeat_image.setVisible(true);
                    Chicken_image.setVisible(true);
                   
                    Small_pepprony.setVisible(true);
                    Medium_pepprony.setVisible(true);
                    Large_pepprony.setVisible(true);
                    Small_MixMeat.setVisible(true);
                    Medium_MixMeat.setVisible(true);
                    Large_MixMeat.setVisible(true);
                    Small_Chicken.setVisible(true);
                    Medium_Chicken.setVisible(true);
                    Large_Chicken.setVisible(true);
                    Small_Cost_pepprony.setVisible(true);
                    Medium_Cost_pepprony.setVisible(true);
                    Large_Cost_pepprony.setVisible(true);
                    Small_Cost_MixMeat.setVisible(true);
                    Medium_Cost_MixMeat.setVisible(true);
                    Large_Cost_MixMeat.setVisible(true);
                    Small_Cost_Chicken.setVisible(true);
                    Medium_Cost_Chicken.setVisible(true);
                    Large_Cost_Chicken.setVisible(true);
                    Small_Button_pepprony.setVisible(true);
                    Medium_Button_pepprony.setVisible(true);
                    Large_Button_pepprony.setVisible(true);
                    Small_Button_MixMeat.setVisible(true);
                    Medium_Button_MixMeat.setVisible(true);
                    Large_Button_MixMeat.setVisible(true);
                    Small_Button_Chicken.setVisible(true);
                    Medium_Button_Chicken.setVisible(true);
                    Large_Button_Chicken.setVisible(true);
                    thin_Crust_pepprony.setVisible(true);
                    thick_Crust_pepprony.setVisible(true);
                    thin_Crust_MixMeat.setVisible(true);
                    thick_Crust_MixMeat.setVisible(true);
                    thin_Crust_Chicken.setVisible(true);
                    thick_Crust_Chicken.setVisible(true);
                     Add.setVisible(true);
                    ketchub.setVisible(true);
                    Motzrella.setVisible(true);
                    Parpeque.setVisible(true);
                    Vegan();
                    Cheese_image.setVisible(false);
                    Margretta_image.setVisible(false);
                     Cheese_image.setVisible(false);
                    Margretta_image.setVisible(false);
                 
                  Small_Cheese.setVisible(false);
                  Medium_Cheese.setVisible(false);
                 Large_Cheese.setVisible(false);
                  Small_Cost_Cheese.setVisible(false);
                 Medium_Cost_Cheese.setVisible(false);
                Large_Cost_Cheese.setVisible(false);
                Small_Button_Cheese.setVisible(false);
                Medium_Button_Cheese.setVisible(false);
                 Large_Button_Cheese.setVisible(false);
                 thin_Crust_Cheese.setVisible(false);
                 thick_Crust_Cheese.setVisible(false);
                
                  Small_Margretta.setVisible(false);
                  Medium_Margretta.setVisible(false);
                 Large_Margretta.setVisible(false);
                  Small_Cost_Margretta.setVisible(false);
                 Medium_Cost_Margretta.setVisible(false);
                Large_Cost_Margretta.setVisible(false);
                Small_Button_Margretta.setVisible(false);
                Medium_Button_Margretta.setVisible(false);
                 Large_Button_Margretta.setVisible(false);
                 thin_Crust_Margretta.setVisible(false);
                 thick_Crust_Margretta.setVisible(false);
           
                    
                }
                else if (item.toString().equalsIgnoreCase("Vegeteran"))
                {
                     Cheese_image.setVisible(true);
                    Margretta_image.setVisible(true);
                  
                  Small_Cheese.setVisible(true);
                  Medium_Cheese.setVisible(true);
                 Large_Cheese.setVisible(true);
                  Small_Cost_Cheese.setVisible(true);
                 Medium_Cost_Cheese.setVisible(true);
                Large_Cost_Cheese.setVisible(true);
                Small_Button_Cheese.setVisible(true);
                Medium_Button_Cheese.setVisible(true);
                 Large_Button_Cheese.setVisible(true);
                 thin_Crust_Cheese.setVisible(true);
                 thick_Crust_Cheese.setVisible(true);
                
                  Small_Margretta.setVisible(true);
                  Medium_Margretta.setVisible(true);
                 Large_Margretta.setVisible(true);
                  Small_Cost_Margretta.setVisible(true);
                 Medium_Cost_Margretta.setVisible(true);
                Large_Cost_Margretta.setVisible(true);
                Small_Button_Margretta.setVisible(true);
                Medium_Button_Margretta.setVisible(true);
                 Large_Button_Margretta.setVisible(true);
                 thin_Crust_Margretta.setVisible(true);
                 thick_Crust_Margretta.setVisible(true);
                  Add.setVisible(true);
                    ketchub.setVisible(true);
                    Motzrella.setVisible(true);
                    Parpeque.setVisible(true);
                    Vegeterian();
                    pepprony_image.setVisible(false);
                    MixMeat_image.setVisible(false);
                    Chicken_image.setVisible(false);
                    pepprony_image.setVisible(false);
                    MixMeat_image.setVisible(false);
                    Chicken_image.setVisible(false);
                 
                    Small_pepprony.setVisible(false);
                    Medium_pepprony.setVisible(false);
                    Large_pepprony.setVisible(false);
                    Small_MixMeat.setVisible(false);
                    Medium_MixMeat.setVisible(false);
                    Large_MixMeat.setVisible(false);
                    Small_Chicken.setVisible(false);
                    Medium_Chicken.setVisible(false);
                    Large_Chicken.setVisible(false);
                    Small_Cost_pepprony.setVisible(false);
                    Medium_Cost_pepprony.setVisible(false);
                    Large_Cost_pepprony.setVisible(false);
                    Small_Cost_MixMeat.setVisible(false);
                    Medium_Cost_MixMeat.setVisible(false);
                    Large_Cost_MixMeat.setVisible(false);
                    Small_Cost_Chicken.setVisible(false);
                    Medium_Cost_Chicken.setVisible(false);
                    Large_Cost_Chicken.setVisible(false);
                    Small_Button_pepprony.setVisible(false);
                    Medium_Button_pepprony.setVisible(false);
                    Large_Button_pepprony.setVisible(false);
                    Small_Button_MixMeat.setVisible(false);
                    Medium_Button_MixMeat.setVisible(false);
                    Large_Button_MixMeat.setVisible(false);
                    Small_Button_Chicken.setVisible(false);
                    Medium_Button_Chicken.setVisible(false);
                    Large_Button_Chicken.setVisible(false);
                    thin_Crust_pepprony.setVisible(false);
                    thick_Crust_pepprony.setVisible(false);
                    thin_Crust_MixMeat.setVisible(false);
                    thick_Crust_MixMeat.setVisible(false);
                    thin_Crust_Chicken.setVisible(false);
                    thick_Crust_Chicken.setVisible(false);
                 
                }

  
    
}
}
