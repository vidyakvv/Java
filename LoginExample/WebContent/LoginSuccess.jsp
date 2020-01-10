<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login Success Page</title>
</head>
<body>
Keep the page idle for 30 seconds
<br> And try reloading the page
<br> you will be redirected to home page automatically
<br>
<%
		//httpSession session = request.getSession(false);
		if (session != null) {
			if (session.getAttribute("user") != null) {
				String name = (String) session.getAttribute("user");
				out.print("Hello, " + name + "  Welcome to ur Profile");
			} else {
				out.println("Session Invalid!!");
				out.println("<html><br><br></html>");
				request.getRequestDispatcher("login.html").include(request, response);
			}
		}
%>
<form action="LogoutServlet" method="post">
		<input type="submit" value="Logout">
</form>

<form action="CreateAccountServlet" method="post">
	Update Email : <input type="text" name="update email">	<input type="submit" value="Update">
</form>
 	
</body>
</html>