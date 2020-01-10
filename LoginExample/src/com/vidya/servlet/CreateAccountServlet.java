package com.vidya.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CreateAccountServlet
 */
@WebServlet("/CreateAccountServlet")
public class CreateAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); // Sets content sent to client as text/HTML
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(false);
		if(session == null) {
			
			if(request.getParameterMap().containsKey("email")) {
				String userEmail = request.getParameter("email");
				String userName = request.getParameter("username");
				String userPassword = request.getParameter("password");
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbuser", "root", "root");
					
					PreparedStatement ps = conn.prepareStatement("INSERT INTO user (email, username, password) VALUES(?,?,?)");
					ps.setString(1, userEmail);	
					ps.setString(2, userName);
					ps.setString(3, userPassword);
					
					int result = ps.executeUpdate();
					
					if(result==1) {
						out.println("Account created.. Please Login!!");
						out.println("<html><br><br></html>");
						
					}
					else {
						out.println("Create account error occured");
						out.println("<html><br><br></html>");
						
					}
					request.getRequestDispatcher("login.html").include(request, response);
					conn.close();
					
				}
				catch (ClassNotFoundException | SQLException e){
					e.printStackTrace();
				}
			}
			else {
				out.println("Session Invalid!!");
				out.println("<html><br><br></html>");
				request.getRequestDispatcher("login.html").include(request, response);
			}
			
		}
		else {
			int usrId= (int)session.getAttribute("idKey");
			if(request.getParameterMap().containsKey("update email")) {
				String userEmail = request.getParameter("update email");
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbuser", "root", "root");
					
					PreparedStatement ps = conn.prepareStatement("UPDATE user SET email =? WHERE id = ?");
					ps.setString(1, userEmail);	
					ps.setInt(2, usrId);
					//ps.setString(3, userPassword);
					
					int result = ps.executeUpdate();
					
					if(result==1) {
						out.println("Email updated");
						out.println("<html><br><br></html>");
					}
					else {
						out.println("Email update error occured");
						out.println("<html><br><br></html>");
						
					}
					request.getRequestDispatcher("LoginSuccess.jsp").include(request, response);
					conn.close();
					
				}
				catch (ClassNotFoundException | SQLException e){
					e.printStackTrace();
				}
			}
		}
		
	}

}
