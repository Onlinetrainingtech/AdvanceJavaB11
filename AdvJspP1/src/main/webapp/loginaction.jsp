<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String u1=request.getParameter("uname");

String p1=request.getParameter("pass");


//out.println("Your data is::"+u1+""+p1);

if(u1.equals("admin")&&p1.equals("admin@123"))
{
	RequestDispatcher rd=request.getRequestDispatcher("sucess.jsp");
	rd.forward(request, response);
	//out.println("LoginSucess!!!");
}
else
{
	RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
	rd.include(request, response);
	out.println("LoginFail!!!");
}

%>
</body>
</html>