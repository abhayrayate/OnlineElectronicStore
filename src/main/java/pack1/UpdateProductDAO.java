package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProductDAO 
{
	public int updateroduct(Productbean pbean)
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
}
