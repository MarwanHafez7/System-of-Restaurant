/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mashro3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


/**
 *
 * @author Emad
 */
public class Database {
    
    String user="root";
  String host="jdbc:mysql://localhost/hamdon";
   String pass="";
  
    Statement s;
    String query;
    Connection c;
    
    
    public Connection connect()
    {
        try {
            c=DriverManager.getConnection(host,user,pass);
         
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
     return c;
    }
    
   
    public ResultSet retreive_Userdata(String tableName)
    {
     
        ResultSet r;
        
        try {
             
            s=c.createStatement();
             query="select * from "+tableName+""; 
            r=s.executeQuery(query);
             return r;
        } catch (SQLException ex) {
          System.out.print(ex.getMessage());
        }
          return null;
    }
    
    public void insert_Userdata(String name,int contact,String address,String pass )
    {
          
        ResultSet r=retreive_Userdata("users");
           try {
               r.last();
            
            s=c.createStatement();
             query="insert into users values('"+(r.getInt("id")+1)+"','"+name+"','"+contact+"','"+address+"','"+pass+"')"; 
            s.execute(query);
            System.out.print("inserted successfully");
             
        } catch (SQLException ex) {
          System.out.print(ex.getMessage());
        }
    }
    
    public void update_UserName(String newname,String oldname)
    {
     
        try{
        s=c.createStatement();
        query="update users set name='" +newname+"'where name='"+oldname+"'";
        s.execute(query);
        }catch (SQLException e){
            System.out.print(e.getMessage());
        }
    }
      public void update_UserAddress(String newAdd,String OldAdd)
      {
          
        try{
        s=c.createStatement();
        query="update users set address='" +newAdd+"'where address='"+OldAdd+"'";
        s.execute(query);
        }catch (SQLException e){
            System.out.print(e.getMessage());
        }
      }
      public void update_UserContact(int newCont,int OldCont)
      {
            try{
        s=c.createStatement();
        query="update users set contactNumber='" +newCont+"'where contactNumber='"+OldCont+"'";
        s.execute(query);
        }catch (SQLException e){
            System.out.print(e.getMessage());
        }
      }
      public void update_password(String newpassword , String oldpassword)
    {
     
        try{
        s=c.createStatement();
       query="update users set password='" +newpassword+"'where password='"+oldpassword+"'";
        s.execute(query);
        }catch (SQLException e){
            System.out.print(e.getMessage());
        }
    }
      public void update_table(String tablename,String column,Object newval,Object oldval)
      {
          try {
              s=c.createStatement();
              query="update '"+tablename+"' set '"+column+"'='" +newval+"'where '"+column+"'='"+oldval+"'";
              s.execute(query);
              
          }catch (SQLException ex)
          {
              System.out.print(ex.getMessage());
          }
      }
      
       public void insert_toOrders(int id,String orderdetails,String name,int total,String address )
    {
          
      
           try {
              
            
            s=c.createStatement();
             query="insert into orders values('"+id+"','"+orderdetails+"','"+name+"','"+null+"','"+total +"' ,'"+address+"')"; 
            s.execute(query);
            System.out.print("inserted successfully");
             
        } catch (SQLException ex) {
          System.out.print(ex.getMessage());
        }
    }
    public void update_order(String new_confirmation )
    {
     
        try{
        s=c.createStatement();
       query="update orders set Confirmation='" +new_confirmation+"'where Confirmation='"+null+"'";
        s.execute(query);
        }catch (SQLException e){
            System.out.print(e.getMessage());
        }
    }
    
    public void delete_Orderrow(String column,String val)
    {
          try{
        s=c.createStatement();
       query="DELETE FROM orders WHERE '"+column+"' = '"+val+"'";
        s.execute(query);
        }catch (SQLException e){
            System.out.print(e.getMessage());
        }
    }
    
    public void Modify_balance(int newbalance,int creditnum)
    {
         try{
        s=c.createStatement();
       query="update credits set balance='" +newbalance+"'where balance='"+creditnum+"'";
        s.execute(query);
        }catch (SQLException e){
            System.out.print(e.getMessage());
        }
    }
}
