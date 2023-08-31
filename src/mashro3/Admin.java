/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mashro3;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Emad
 */
public class Admin {
    ResultSet r;
     Database db=new Database();
    String name;
    String Address;
    int contact;
    String password;
    
    private static Admin instance=null;

    private Admin(String name, String Address, int contact, String password) {
        this.name = name;
        this.Address = Address;
        this.contact = contact;
        this.password = password;
    }
    public static Admin getInstance ()
    {
        if(instance==null)
            instance=new Admin("admin","darelsalam",123,"admin123");
       
        return instance;
      
    }
    public void confirm_booking_order ()
    {
  
    MySystem s=new MySystem();
       if (s.getDelievry_staff()==0){
            db.connect();
            r=db.retreive_Userdata("orders");
            try{
     while(r.next()&&s.getDelievry_staff()!=0)
     {
         db.update_order("Confirm");
         s.Delievry_staff_dec();
         if(s.getDelievry_staff()==0)
         {
             System.out.print("there is no staff available");
             break;
         }
     }
         
    
       }catch (SQLException ex)
       {
           System.out.print(ex.getMessage());
       }
           

}
    

   
    
    
}
     public void view_booking_order()
    {
        db.connect();
        r=db.retreive_Userdata("orders");
        try {
            while (r.next())
            {
             System.out.print(r.getInt("id")+" "+r.getString("orderdetails")+" "+
                     r.getString("username")+" "+r.getString("Confirmation")+" "+
                     r.getInt("totalprice")+" "+r.getString("address"));
             System.out.println();
            }
        }catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
public void cancel_booking_order()
        
    {
        db.connect();
        r=db.retreive_Userdata("orders");
        try {
            while (r.next())
            {
                if(r.getString("Confirmation").equalsIgnoreCase("waiting"))
                {
                    db.delete_Orderrow("Confirmation", "waiting");
                }
            }
        }catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
