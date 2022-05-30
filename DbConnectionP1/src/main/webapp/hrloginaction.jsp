<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String u1=request.getParameter("name");
String p1=request.getParameter("pwd");


String str="select * from hrlogin";

Class.forName("org.h2.Driver");

Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/advancejava","sa","");

Statement stmt=conn.createStatement();


ResultSet rs=stmt.executeQuery(str);

rs.next();

String uname=rs.getString(1);

String pass=rs.getString(2);



if(uname.equals(u1)&&pass.equals(p1))
{
	RequestDispatcher rd=request.getRequestDispatcher("skillset.jsp");
	rd.forward(request, response);
	
}
else
{
	RequestDispatcher rd=request.getRequestDispatcher("hrlogin.jsp");
	rd.include(request, response);
	out.println("LoginFail!!!");
	
}


%>
</body>
</html>