package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BuyProductServletDAO 
{
  
  public ArrayList<Productbean> buyproduct(String pcode)
  {
	 
	  ArrayList<Productbean> al= new ArrayList<Productbean>();
	  
	  try
	  {
	            if (pcode == null ) 
	            {
	                return al; 
	            }
		  Connection con=DBconnect.getCon();
		  PreparedStatement pstm=con.prepareStatement("select * from product where pid=?");
		  pstm.setString(1, pcode);
		   ResultSet rs= pstm.executeQuery();
		   while(rs.next())
		   {
			   Productbean pbean=new Productbean();
			   pbean.setP_codde(rs.getString(1));
			   pbean.setP_name(rs.getString(2));
			   pbean.setP_company(rs.getString(3));
			   pbean.setP_price(rs.getString(4));
			   pbean.setP_qty(rs.getString(5));
			   al.add(pbean);
		   } 
		   
	     
		  
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return al;
  }
}