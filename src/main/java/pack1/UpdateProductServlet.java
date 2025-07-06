package pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession session=req.getSession(false);
		if(session==null)
		{
			req.setAttribute("msg", "Session Expried!");
			req.getRequestDispatcher("admin.html").forward(req, res);
		}
		else
		{
			String p_code=req.getParameter("p_code");
			ArrayList<Productbean> al=(ArrayList<Productbean>)session.getAttribute("productlist");
			Productbean pbean=null;
			Iterator<Productbean> i=al.iterator();
			while(i.hasNext())
			{
				pbean=i.next();
				if(p_code.equals(pbean.getP_codde()))
					break;
			}
			pbean.setP_price(req.getParameter("p_price"));
			pbean.setP_qty(req.getParameter("p_qty"));
			int rowcount=new UpdateProductDAO().updateroduct(pbean);
			if(rowcount>0)
			{
				req.setAttribute("msg", "Data updated succesfully");
				req.getRequestDispatcher("UpdateProduct.jsp").forward(req, res);
			}
		}
	}
}
