package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerRegisterDAO 
{
	public int datainsert(CustomerBean bean)
	{
		int rowcount=0;
		try
		{
			Connection con=DBconnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
			pstmt.setString(1,bean.getUname());
			pstmt.setString(2,bean.getPass());
			pstmt.setString(3,bean.getFirstname());
			pstmt.setString(4,bean.getLastname());
			pstmt.setString(5,bean.getAddress());
			pstmt.setString(6,bean.getMailid());
			pstmt.setString(7,bean.getMobile());
			rowcount=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rowcount;
	}
}
