package jdbc;

import java.io.IOException;
import jdbc.encryptionDecryption;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Redirect;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	encryptionDecryption ed=new encryptionDecryption();
	
    public login() {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
		
			String name=request.getParameter("userName");
			String password=request.getParameter("password");
			String sql="select* from user where email=? and password=?";
			String dbname=null;
			String dbpassword=null;
			String dbUsertype="3";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/paf","root","");
			String pwd=ed.encrypt(password, 5);
			
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, pwd);
			ResultSet rs= ps.executeQuery();

			PrintWriter out=response.getWriter();
			
			while(rs.next()) {
				dbname=rs.getString("Email");
				dbpassword=rs.getString("Password");
				dbUsertype=rs.getString("UserType");
			}
			if(name.equals(dbname)&&pwd.equals(dbpassword)&&dbUsertype.equals("3")) {
				   out.println("<script type=\"text/javascript\">");
				   out.println("alert('Valid User');");
				   out.println("location='viewMember.jsp';");
				   out.println("</script>");
				
			}
			else if(name.equals(dbname)&&pwd.equals(dbpassword)&&dbUsertype.equals("2")){
				out.println("<script type=\"text/javascript\">");
				   out.println("alert('Valid User');");
				   out.println("location='Admin.jsp';");
				   out.println("</script>");
			}
			else if(name.equals(dbname)&&pwd.equals(dbpassword)&&dbUsertype.equals("1")){
				out.println("<script type=\"text/javascript\">");
				   out.println("alert('Valid User');");
				   out.println("location='ViewUser_owner.jsp';");
				   out.println("</script>");
			}
			else {
				
				   out.println("<script type=\"text/javascript\">");
				   out.println("alert('User or password incorrect');");
				   out.println("location='home.jsp';");
				   out.println("</script>");
				
			}
				
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
