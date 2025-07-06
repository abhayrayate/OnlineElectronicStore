//package pack1;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//
//public class GenerateServletDAO 
//{
//	public Productbean Probill(String p_code)
//	{
//		Productbean pbean=null;
//		try
//		{
//			Connection con=DBconnect.getCon();
//			PreparedStatement pstmt=con.prepareStatement("select * from product where pid=?");
//			pstmt.setString(1, p_code);
//			ResultSet rs=pstmt.executeQuery();
//			if(rs.next())
//			{
//				pbean=new Productbean();
//				pbean.setP_codde(rs.getString(1));
//				pbean.setP_name(rs.getString(2));
//				pbean.setP_company(rs.getString(3));
//				pbean.setP_price(rs.getString(4));
//				pbean.setP_qty(rs.getString(5));
//			}
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		return pbean;
//	  }
//	public CustomerBean Custbill(String cust_name)
//	{
//		CustomerBean bean=null;
//		try
//		{
//			Connection con=DBconnect.getCon();
//			PreparedStatement pstmt=con.prepareStatement("select * from customer where uname=?");
//			pstmt.setString(1, cust_name);
//			ResultSet rs=pstmt.executeQuery();
//			if(rs.next())
//			{
//				bean=new CustomerBean();
//				bean.setUname(rs.getString(1));
//				bean.setPass(rs.getString(2));
//				bean.setFirstname(rs.getString(3));
//				bean.setLastname(rs.getString(4));
//				bean.setAddress(rs.getString(5));
//				bean.setMailid(rs.getString(6));
//				bean.setMobile(rs.getString(7));
//			}
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		return bean;
//	}
//}
