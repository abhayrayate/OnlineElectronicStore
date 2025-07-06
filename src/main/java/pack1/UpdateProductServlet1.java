package pack1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Buy1")
public class UpdateProductServlet1 extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession session=req.getSession(false);
		if(session==null)
		{
			req.setAttribute("msg", "session Experied");
			req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
		}
		else
		{
			String pcode=req.getParameter("pcode");
			String reqqtystr=req.getParameter("reqno");
			int reqQty=Integer.parseInt(reqqtystr);
			ArrayList<Productbean> al=new UpdateProductServletDAO1().updateal(pcode);
				Productbean pbean=al.get(0);
				int currentQty=Integer.parseInt(pbean.getP_qty());
				int updateQty=currentQty-reqQty;
				pbean.setP_qty(String.valueOf(updateQty));
				int rowcount=new UpdateProductServletDAO1().updatedbproduct(pbean);
				if(rowcount>0)
				{
					req.setAttribute("product", pbean);
					req.setAttribute("reqno", reqqtystr);
					req.getRequestDispatcher("UpdateProduct1.jsp").forward(req, res);
				}
				else
				{
					req.setAttribute("msg", "Update failed");
					req.getRequestDispatcher("BuyProducts.jsp");
				}
		}
	}
}
