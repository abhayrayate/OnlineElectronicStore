package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerLoginDAO 
{
	public CustomerBean checkcustlogin(String cus_uname,String cus_pass)
	{
		CustomerBean bean=null;
		try
		{
			Connection con=DBconnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("select * from customer where uname=? and pword=?");
			pstmt.setString(1, cus_uname);
			pstmt.setString(2, cus_pass);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				bean=new CustomerBean();
				bean.setUname(rs.getString(1));
				bean.setPass(rs.getString(2));
				bean.setFirstname(rs.getString(3));
				bean.setLastname(rs.getString(4));
				bean.setAddress(rs.getString(5));
				bean.setMailid(rs.getString(6));
				bean.setMobile(rs.getString(7));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return bean;
	}
}
