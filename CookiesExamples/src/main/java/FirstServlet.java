

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		String n=request.getParameter("email");
		
		Cookie ck=new Cookie("uname", n);
		
		response.addCookie(ck);
		
		out.println("<form action='SecondServlet' method='post'>");
		out.println("<input type='submit' value='Click'/>");
		out.println("</form>");
		
		
	}

}
