

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
				String n=req.getParameter("uname");
				
				out.println("<html>");
				out.println("<form action='SecondServlet'>");
				out.println("<input type='hidden' name='u1' value="+n+"/>");
				out.println("<input type='submit' value='ClickHere'/>");
				out.println("</form>");
	}

}
