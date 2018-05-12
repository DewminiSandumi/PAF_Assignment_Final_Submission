package jdbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class Admin
 */
@WebServlet("/Admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Execute");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Execute2");
		try {
			System.out.println("Execute3");
			PrintWriter out=response.getWriter();
			out.println("Start Execute Do post");
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			String DOB=request.getParameter("dob");
			String P_address=request.getParameter("PermanentAddress");
			String C_address=request.getParameter("CurrentAddress");
			String Mobile=request.getParameter("mobile");
			String Telephone=request.getParameter("phone");
			String Email=request.getParameter("email");
			String Password=request.getParameter("password");
			String UserType=request.getParameter("UserType");
			String sql="insert into user(fname,lname,DOB,P_address,C_address,Mobile,Telephone,Email, Password, UserType) values(?,?,?,?,?,?,?,?,?,?)";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/paf", "root", "");
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, DOB);
			ps.setString(4, P_address);
			ps.setString(5, C_address);
			ps.setString(6, Mobile);
			ps.setString(7, Telephone);
			ps.setString(8, Email);
			ps.setString(9, Password);
			ps.setString(10, UserType);
			ps.executeUpdate();
			ps.close();
			conn.close();
			//PrintWriter out=response.getWriter();
			out.print("<a href=\"Admin.jsp\" class=\"btn btn-primary next\"><a>");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
