package pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/creg")
public class CustomerRegisterServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		
		HttpSession session=req.getSession(false);
		if(session==null)
		{
			req.setAttribute("msg", "Admin session experied");
			req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
		}
		else
		{
			CustomerBean cbean=new CustomerBean();
			cbean.setUname(req.getParameter("c_uname"));
			cbean.setPass(req.getParameter("c_pword"));
			cbean.setFirstname(req.getParameter("c_fname"));
			cbean.setLastname(req.getParameter("c_lname"));
			cbean.setAddress(req.getParameter("c_addr"));
			cbean.setMailid(req.getParameter("c_mail"));
			cbean.setMobile(req.getParameter("c_mobile"));
			int rowcount=new CustomerRegisterDAO().datainsert(cbean);
			if(rowcount==0)
			{
				throw new ServletException("data not inserted");
			}
			else
			{
				req.setAttribute("msg", "data inserted");
				req.getRequestDispatcher("CustomerLogin.jsp").forward(req, res);
			}
		}
	}
}
