package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDAO 
{
	public Adminbean checkadminlogin(String admin_uname,String admin_pass)
	{
		Adminbean bean=null;
		try
		{
			Connection con=DBconnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("select * from admin where uname=? and pword=?");
			pstmt.setString(1, admin_uname);
			pstmt.setString(2, admin_pass);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				bean=new Adminbean();
				bean.setUname(rs.getString(1));
				bean.setPword(rs.getString(2));
				bean.setFname(rs.getString(3));
				bean.setLname(rs.getString(4));
				bean.setAddr(rs.getString(5));
				bean.setMid(rs.getString(6));
				bean.setPhone(rs.getString(7));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return bean;
	}
}
