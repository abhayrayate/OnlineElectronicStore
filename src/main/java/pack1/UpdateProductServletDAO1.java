package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UpdateProductServletDAO1 
{
	public int updatedbproduct(Productbean pbean)
	{
		int rowcount=0;
		try
		{
			Connection con=DBconnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("update product set pprice=?,pquantity=? where pid=?");
			pstmt.setString(1, pbean.getP_price());
			pstmt.setString(2, pbean.getP_qty());
			pstmt.setString(3, pbean.getP_codde());
			rowcount=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rowcount;
	}
	public ArrayList<Productbean> updateal(String pcode)
	{	
		ArrayList<Productbean> al=new ArrayList<Productbean>();
		try
		{
			if(pcode==null)
			{
				return al;
			}
			Connection con=DBconnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("select * from product where pid=?");
			pstmt.setString(1, pcode);
			ResultSet rs=pstmt.executeQuery();
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
