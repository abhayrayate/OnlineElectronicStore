package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewProductDAO 
{
 ArrayList<Productbean> al=new ArrayList<Productbean>();
 public ArrayList<Productbean> reteriveProducts()
 {
	 try
	 {
		
		 Connection con=DBconnect.getCon();
		 PreparedStatement ps=con.prepareStatement("select * from product");
		 ResultSet rs= ps.executeQuery();
		 while(rs.next())
		 {
			 Productbean pb=new Productbean();
			 pb.setP_codde(rs.getString(1));
			 pb.setP_name(rs.getString(2));
			 pb.setP_company(rs.getString(3));
			 pb.setP_price(rs.getString(4));
			 pb.setP_qty(rs.getString(5));
			 al.add(pb);
		 }
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();	
	 }
	 return al;
	 
 }
}