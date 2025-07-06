package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddproductDAO 
{
	public int insertProduct(Productbean bean)
	{
		int rowcount=0;
		try
		{
			Connection con=DBconnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("insert into product values(?,?,?,?,?)");
			pstmt.setString(1, bean.getP_codde());
			pstmt.setString(2, bean.getP_name());
			pstmt.setString(3, bean.getP_company());
			pstmt.setString(4, bean.getP_price());
			pstmt.setString(5, bean.getP_qty());
			rowcount=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rowcount;
	}
}
