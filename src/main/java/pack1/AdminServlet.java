package pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/alog")
public class AdminServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		AdminDAO ado=new AdminDAO();
		Adminbean bean=ado.checkadminlogin(req.getParameter("uname"),req.getParameter("pword"));
		if(bean==null)
		{	
			throw new ServletException("Check the code correctly");
//			req.setAttribute("msg","Invaild admin Arguments");
//			req.getRequestDispatcher("AdminLoginFailed.jsp").forward(req, res);
		}
		else
		{
			HttpSession session=req.getSession();
			session.setAttribute("abean", bean);
			req.getRequestDispatcher("AdminHome.jsp").forward(req, res);
		}
	}
}
