//package pack1;
//
//import java.io.IOException;
//import java.util.ArrayList;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//@WebServlet("/Generate_bill")
//public class GenerateServlet extends HttpServlet
//{
//	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
//	{
//		HttpSession session=req.getSession(false);
//		if(session==null)
//		{
//			req.setAttribute("msg", "Session Expired");
//			req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
//		}
//		else
//		{	
//			GenerateServletDAO gdao=new GenerateServletDAO();
////			CustomerBean bean=gdao.Custbill(req.getParameter("u_name"));
////			Productbean pbean=gdao.Probill(req.getParameter("p_code"));
//			String uname = req.getParameter("uname");
//			String pcode = req.getParameter("pcode");
//			System.out.println("uname: " + uname);
//			System.out.println("pcode: " + pcode);
//
//			CustomerBean bean = gdao.Custbill(uname);
//			Productbean pbean = gdao.Probill(pcode);
//
//			//session.setAttribute("uname", req.getParameter("uname")); 
//			//session.setAttribute("viewgenertebill", pbean);
//
//			session.setAttribute("cbean", bean);
//			session.setAttribute("viewgenertebill", pbean);
//			req.getRequestDispatcher("Generatebill.jsp").forward(req, res);
//		}
//	}
//}
