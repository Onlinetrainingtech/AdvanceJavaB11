

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet 
{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	   PrintWriter out=resp.getWriter();
	   HttpSession sess=req.getSession();
	   
	   String f1=(String)sess.getAttribute("k1");
	   
	   String f2=(String)sess.getAttribute("k2");
	   
	   out.println(f1);
	   
	   out.println(f2);
}	
}
