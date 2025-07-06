package pack1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/ViewProducts")
public class ViewCustomerProductServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession session=req.getSession(false);
		if(session==null)
		{
			req.setAttribute("msg", "session experied");
			req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
		}
		else
		{
			ArrayList<Productbean> al=new ViewCustomerProductDAO().retriveCustomerProducts();
			session.setAttribute("Customerlist",al);
			req.getRequestDispatcher("ViewCustomerProduct.jsp").forward(req, res);
			
		}
	}
}

