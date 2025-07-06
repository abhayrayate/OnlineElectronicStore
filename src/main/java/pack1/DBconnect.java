package pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect 
{
	private static Connection con=null;
	static
	{
		try
		{
			Class.forName(DBinfo.Driver);
			con=DriverManager.getConnection(DBinfo.Durl,DBinfo.Duname,DBinfo.Dpass);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static Connection getCon()
	{
		return con;
	}
}
