package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteProductDAO 
{
	public int DeleteProduct(String pcode)
	{
		int rowcount=0;
		try
		{
			Connection con=DBconnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("delete from product where pid=?");
			pstmt.setString(1, pcode);
			rowcount=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rowcount;
	}
}
