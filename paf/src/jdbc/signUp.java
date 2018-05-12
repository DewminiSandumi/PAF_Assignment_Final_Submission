package jdbc;

import java.io.IOException;
import java.util.*;

import jdbc.encryptionDecryption;
import java.io.PrintWriter;
import java.sql.Array;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class signUp
 */
@WebServlet("/signUp")
public class signUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	encryptionDecryption ed=new encryptionDecryption();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @param <function>
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * 
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  ,ArrayIndexOutOfBoundsException{
		try {
			
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			String dateOfBirth=request.getParameter("DOB");
			String pAddress=request.getParameter("pAddress");
			String cAddress=request.getParameter("cAddress");
			String mobile=request.getParameter("mobile");
			String phone=request.getParameter("phone");
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			String cPassword=request.getParameter("cPassword");			
			//String favourites=request.getParameter("favourites");
			String favourites="";
			String[] list=request.getParameterValues("favourites");			
			int userType=3;
			
			 for(int i=0;i<list.length;i++){
		            favourites+=list[i]+" , ";
		        }
			
			PrintWriter out=response.getWriter();
			if(password.equals(cPassword)) 
			{
				String pwd=ed.encrypt(password, 5);
				String sql="INSERT INTO user(fname, lname,DOB,P_address,C_address,Mobile,Telephone,Email,Password,favourites,UserType) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/paf","root","");
				
				PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
				ps.setString(1, fname);
				ps.setString(2, lname);
				ps.setString(3, dateOfBirth);
				ps.setString(4, pAddress);
				ps.setString(5, cAddress);
				ps.setString(6, mobile);
				ps.setString(7, phone);
				ps.setString(8, email);
				ps.setString(9, pwd);
				//ps.setArray(11, favourites);
				ps.setString(10, favourites);
				ps.setInt(11,userType);
				ps.executeUpdate();
				ps.close();
				con.close();
				System.out.println("Successfull");
				
				  out.println("<script type=\"text/javascript\">");
				  out.println("alert('Registration Successful');");
				  out.println("location='home.jsp';");
				  out.println("</script>");
			}
			
			else 
			{
				   out.println("<script type=\"text/javascript\">");
				   out.println("alert('Invalid password confirmation');");
				   out.println("location='home.jsp';");
				   out.println("</script>");
			}
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
