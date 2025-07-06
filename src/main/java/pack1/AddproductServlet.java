package pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/aps")
public class AddproductServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession session=req.getSession(false);//getsession(false) will use already exsiting session
		if(session==null)
		{
			req.setAttribute("msg", "Admin Session exeperied");
			req.getRequestDispatcher("admin.html").forward(req,res);
		}
		else
		{
			Productbean pbean=new Productbean();
			pbean.setP_codde(req.getParameter("pcode"));
			pbean.setP_name(req.getParameter("pname"));
			pbean.setP_company(req.getParameter("pcompany"));
			pbean.setP_price(req.getParameter("pprice"));
			pbean.setP_qty(req.getParameter("pqty"));
			int rowcount=new AddproductDAO().insertProduct(pbean);
			if(rowcount==0)
			{
				throw new ServletException("Data not inseted");
			}
			else
			{
				req.setAttribute("msg", "Data Inserted");
				req.getRequestDispatcher("Addproduct.jsp").forward(req, res);
			}
		}
	}
}
