package com.vidya.servlet;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); // Sets content sent to client as text/HTML
		
		//PrintWriter out = response.getWriter(); // Write response in text using out PrinWriter variable
		//get request parameters for userID and password
		String usr = request.getParameter("username");
		String pwd = request.getParameter("password");
		//System.out.print(usr +" ---- "+ pwd);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// loads driver
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbuser", "root", "root"); // gets a new connection
	 
			PreparedStatement ps = c.prepareStatement("select * from user where username=? and password=?");
			ps.setString(1, usr);
			ps.setString(2, pwd);
	 
			ResultSet rs = ps.executeQuery();
			//ResultSetMetaData rsmd = rs.getMetaData();
		  
			//int columnsNumber = rsmd.getColumnCount();
		   

		while (rs.next()) {
			HttpSession session = request.getSession(true); // reuse existing session if exist 
			session.setAttribute("user", usr);
			session.setAttribute("idKey" , rs.getInt("id"));
			session.setMaxInactiveInterval(30);
			response.sendRedirect("LoginSuccess.jsp");
			c.close();
			return;
		}
		response.sendRedirect("error.html");
		c.close();
		return;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}