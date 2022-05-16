

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		
		String e1=req.getParameter("email");
		String s1=req.getParameter("col");
		
		if(e1.equals("admin@gmail.com")&&s1.equals("vsb"))
		{
			HttpSession sess=req.getSession();
			
			sess.setAttribute("k1",e1);
			sess.setAttribute("k2",s1);
			
			RequestDispatcher rd=req.getRequestDispatcher("second.jsp");
			rd.forward(req, resp);
			
		}
	}

}
