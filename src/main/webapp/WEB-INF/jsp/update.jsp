<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<% 
request.setCharacterEncoding("utf-8");

	String lastname = request.getParameter("lastname");  
	String firstname = request.getParameter("firtname");  
	String address = request.getParameter("address");  
	String phone = request.getParameter("phone");  
	String email = request.getParameter("email");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lo54pj","root","root");
	String sql = "insert into client values(null,null,null,null,null)";
	
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1,lastname);
	ps.setString(2,firstname);
	ps.setString(3,address);
	ps.setString(4,phone);
	ps.setString(5,email);
	
	ps.executeUpdate();
	con.close();
	response.sendRedirect("success.jsp");
%>
