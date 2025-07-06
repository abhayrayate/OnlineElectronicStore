package pack1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/clog")
public class CustomerLoginServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		CustomerLoginDAO cldao=new CustomerLoginDAO();
		CustomerBean bean=cldao.checkcustlogin(req.getParameter("u_name"), req.getParameter("p_word"));
		if(bean==null)
		{
			throw new ServletException("Check the code correctly");
		}
		else
		{
			HttpSession session=req.getSession();
			session.setAttribute("cbean", bean);
			req.getRequestDispatcher("CustomerHome.jsp").forward(req, res);
		}
	}
}
