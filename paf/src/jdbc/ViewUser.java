package jdbc;

import java.io.IOException;
import java.io.PrintWriter;
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


/**
 * Servlet implementation class ViewUser
 */
@WebServlet("/ViewUser")
public class ViewUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String id=request.getParameter("l0");
			if(id.equals("l0")) {
			PrintWriter out=response.getWriter();
			
			out.print("<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"\r\n" + 
					"    pageEncoding=\"ISO-8859-1\"%>\r\n" + 
					"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n" + 
					"<html lang=\"\"><head>\r\n" + 
					"    <meta charset=\"utf-8\">\r\n" + 
					"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n" + 
					"    <meta name=\"description\" content=\"4C Knowledge Admin\">\r\n" + 
					"    <meta content=\"width=device-width, initial-scale=1, user-scalable=no\" name=\"viewport\">\r\n" + 
					"    \r\n" + 
					"    <title>Admin - 4C Knowledge</title>\r\n" + 
					"    <meta name=\"description\" content=\"Admin is a material design and bootstrap based responsive dashboard template created mainly for admin and backend applications.\">\r\n" + 
					"    \r\n" + 
					"  \r\n" + 
					"    \r\n" + 
					"    <!-- Google icon -->\r\n" + 
					"    <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n" + 
					"    \r\n" + 
					"    <!-- Bootstrap css -->\r\n" + 
					"    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\r\n" + 
					"    \r\n" + 
					"    <!-- Propeller css -->\r\n" + 
					"    <!-- build:[href] assets/css/ -->\r\n" + 
					"    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/propeller.min.css\">\r\n" + 
					"    <!-- /build -->\r\n" + 
					"    \r\n" + 
					"    <!-- Propeller date time picker css-->\r\n" + 
					"    <link rel=\"stylesheet\" type=\"text/css\" href=\"components/datetimepicker/css/bootstrap-datetimepicker.css\">\r\n" + 
					"    <link rel=\"stylesheet\" type=\"text/css\" href=\"components/datetimepicker/css/pmd-datetimepicker.css\">\r\n" + 
					"    \r\n" + 
					"    <!-- Propeller theme css-->\r\n" + 
					"    <link rel=\"stylesheet\" type=\"text/css\" href=\"themes/css/propeller-theme.css\">\r\n" + 
					"    \r\n" + 
					"    <!-- Propeller admin theme css-->\r\n" + 
					"    <link rel=\"stylesheet\" type=\"text/css\" href=\"themes/css/propeller-admin.css\">\r\n" + 
					"    \r\n" + 
					"    </head>\r\n" + 
					"    \r\n" + 
					"    <body class=\"\">\r\n" + 
					"    <!-- Header Starts -->\r\n" + 
					"    <!--Start Nav bar -->\r\n" + 
					"    <nav class=\"navbar navbar-inverse navbar-fixed-top pmd-navbar pmd-z-depth\">\r\n" + 
					"    \r\n" + 
					"        <div class=\"container-fluid\">\r\n" + 
					"            \r\n" + 
					"            \r\n" + 
					"            <div class=\"navbar-header\">\r\n" + 
					"                <a href=\"javascript:void(0);\" data-target=\"basicSidebar\" data-placement=\"left\" data-position=\"slidepush\" is-open=\"true\" is-open-width=\"1200\" class=\"btn btn-sm pmd-btn-fab pmd-btn-flat pmd-ripple-effect pull-left margin-r8 pmd-sidebar-toggle\"><i class=\"material-icons md-light\">menu</i></a>	\r\n" + 
					"              <a href=\"index.html\" class=\"navbar-brand\">\r\n" + 
					"                  4C Knowledge\r\n" + 
					"              </a>\r\n" + 
					"            </div>\r\n" + 
					"        </div>\r\n" + 
					"    \r\n" + 
					"    </nav><!--End Nav bar -->\r\n" + 
					"    <!-- Header Ends -->\r\n" + 
					"    \r\n" + 
					"    <!-- Sidebar Starts -->\r\n" + 
					"    <div class=\"pmd-sidebar-overlay\"></div>\r\n" + 
					"    \r\n" + 
					"    <!-- Left sidebar -->\r\n" + 
					"    <aside id=\"basicSidebar\" class=\"pmd-sidebar  sidebar-default pmd-sidebar-left bg-fill-darkblue sidebar-with-icons is-slidepush pmd-sidebar-left-fixed\" role=\"navigation\">\r\n" + 
					"        <ul class=\"nav pmd-sidebar-nav\">\r\n" + 
					"            \r\n" + 
					"            <!-- User info -->\r\n" + 
					"            <li class=\"dropdown pmd-dropdown pmd-user-info visible-xs visible-md visible-sm visible-lg\">\r\n" + 
					"                <a aria-expanded=\"false\" data-toggle=\"dropdown\" class=\"btn-user dropdown-toggle media\" data-sidebar=\"true\" aria-expandedhref=\"javascript:void(0);\">\r\n" + 
					"                    <div class=\"media-left\">\r\n" + 
					"                        <img src=\"themes/images/user-icon.png\" alt=\"New User\">\r\n" + 
					"                    </div>\r\n" + 
					"                    <div class=\"media-body media-middle\">Admin</div>\r\n" + 
					"                    <div class=\"media-right media-middle\"><i class=\"dic-more-vert dic\"></i></div>\r\n" + 
					"                </a>\r\n" + 
					"                <div class=\"pmd-dropdown-menu-container\"><div class=\"pmd-dropdown-menu-bg\"></div><ul class=\"dropdown-menu pm-ini\" style=\"display: none;\">\r\n" + 
					"                    <li><a href=\"login.html\">Logout</a></li>\r\n" + 
					"                </ul></div>\r\n" + 
					"            </li><!-- End user info -->\r\n" + 
					"            \r\n" + 
					"            <li> \r\n" + 
					"                 \r\n" + 
					"            </li>\r\n" + 
					"            \r\n" + 
					"            <li class=\"dropdown pmd-dropdown\"> \r\n" + 
					"                <a aria-expanded=\"false\" data-toggle=\"dropdown\" class=\"btn-user dropdown-toggle media active\" data-sidebar=\"true\" href=\"javascript:void(0);\">	\r\n" + 
					"                    <i class=\"media-left media-middle\"><svg version=\"1.1\" x=\"0px\" y=\"0px\" width=\"18px\" height=\"18.001px\" viewBox=\"0 0 18 18.001\" enable-background=\"new 0 0 18 18.001\" xml:space=\"preserve\">\r\n" + 
					"    <path fill=\"#C9C8C8\" d=\"M6.188,0.001C5.232,0.001,4.5,0.732,4.5,1.688c0,0.394,0.166,0.739,0.334,1.02L5.45,3.71\r\n" + 
					"        c0.113,0.113,0.176,0.341,0.176,0.51v0.281c0,0.619-0.506,1.125-1.125,1.125H0.282c-0.169,0-0.281,0.112-0.281,0.281V17.72\r\n" + 
					"        c0,0.168,0.112,0.281,0.281,0.281h4.219c0.619,0,1.125-0.506,1.125-1.125v-0.281c0-0.168-0.063-0.397-0.176-0.509\r\n" + 
					"        c0,0-0.615-0.946-0.615-1.002C4.666,14.802,4.5,14.457,4.5,14.063c0-0.956,0.731-1.688,1.688-1.688s1.688,0.731,1.688,1.688\r\n" + 
					"        c0,0.394-0.166,0.739-0.334,1.02l-0.616,1.002c-0.056,0.112-0.176,0.341-0.176,0.509v0.281c0,0.619,0.506,1.125,1.125,1.125h4.219\r\n" + 
					"        c0.168,0,0.281-0.113,0.281-0.281V13.5c0-0.619,0.506-1.125,1.125-1.125h0.281c0.169,0,0.396,0.063,0.51,0.176\r\n" + 
					"        c0,0,0.945,0.616,1.002,0.616c0.337,0.168,0.626,0.334,1.02,0.334c0.956,0,1.687-0.731,1.687-1.687c0-0.957-0.731-1.688-1.687-1.688\r\n" + 
					"        c-0.394,0-0.738,0.166-1.02,0.334l-1.002,0.616c-0.113,0.056-0.341,0.176-0.51,0.176H13.5c-0.619,0-1.125-0.506-1.125-1.125V5.908\r\n" + 
					"        c0-0.168-0.113-0.281-0.281-0.281H7.875c-0.619,0-1.125-0.506-1.125-1.125V4.221c0-0.168,0.063-0.397,0.176-0.51\r\n" + 
					"        c0,0,0.616-0.945,0.616-1.001c0.168-0.281,0.334-0.626,0.334-1.02C7.875,0.733,7.144,0.002,6.188,0.001L6.188,0.001z\"></path>\r\n" + 
					"    </svg></i> \r\n" + 
					"                    <span class=\"media-body\">Users</span>\r\n" + 
					"                    <div class=\"media-right media-bottom\"><i class=\"dic-more-vert dic\"></i></div>\r\n" + 
					"                </a> \r\n" + 
					"                <div class=\"pmd-dropdown-menu-container\"><div class=\"pmd-dropdown-menu-bg\"></div><ul class=\"dropdown-menu pm-ini\" style=\"display: block;\">\r\n" + 
					"                    <li><a href=\"Admin.jsp\" class=\"active\">Add User</a></li>\r\n" + 
					"    <li><a href=\"ViewUser.jsp#ViewUser\" class=\"active\">View User</a></li>\r\n" + 
					"                    <li><a href=\"DeleteUser.html\">Delete User</a></li>\r\n" + 
					"                    <li><a href=\"shadow.html\">Black List</a></li>\r\n" + 
					"                    \r\n" + 
					"         \r\n" + 
					"                </ul></div>\r\n" + 
					"            </li>\r\n" + 
					"            <li class=\"dropdown pmd-dropdown\"> \r\n" + 
					"                <a aria-expanded=\"true\" data-toggle=\"dropdown\" class=\"btn-user dropdown-toggle media\" data-sidebar=\"true\" href=\"javascript:void(0);\">	\r\n" + 
					"                    <i class=\"material-icons media-left pmd-sm\">swap_calls</i> \r\n" + 
					"                    <span class=\"media-body\">Admins</span>\r\n" + 
					"                    <div class=\"media-right media-bottom\"><i class=\"dic-more-vert dic\"></i></div>\r\n" + 
					"                </a> \r\n" + 
					"                <div class=\"pmd-dropdown-menu-container\"><div class=\"pmd-dropdown-menu-bg\"></div><ul class=\"dropdown-menu pm-ini\" style=\"display: none;\">\r\n" + 
					"                    <li><a href=\"custom-scroll.html\">Add Admin</a></li>\r\n" + 
					"                    <li><a href=\"datetimepicker.html\">View Admin</a></li>\r\n" + 
					"                    <li><a href=\"range-slider.html\">Remove Admin</a></li>\r\n" + 
					"                    \r\n" + 
					"                </ul></div>\r\n" + 
					"            </li>\r\n" + 
					"            \r\n" + 
					"            <li class=\"dropdown pmd-dropdown\"> \r\n" + 
					"                <a aria-expanded=\"false\" data-toggle=\"dropdown\" class=\"btn-user dropdown-toggle media\" data-sidebar=\"true\" href=\"javascript:void(0);\">	\r\n" + 
					"                    <i class=\"media-left media-middle\"><svg version=\"1.1\" x=\"0px\" y=\"0px\" width=\"14.187px\" height=\"18px\" viewBox=\"0 0 14.187 18\" enable-background=\"new 0 0 14.187 18\" xml:space=\"preserve\">\r\n" + 
					"    <path fill=\"#C9C8C8\" d=\"M0,0v18h14.187V0H0z M3.121,3.293h2.023v4.767H3.121V3.293z M11.211,14.764H2.948v-2.022h8.263V14.764\r\n" + 
					"        L11.211,14.764z M11.211,11.585H2.948V9.563h8.263V11.585L11.211,11.585z M11.211,8.407H7.455V6.385h3.756V8.407z M11.211,5.229\r\n" + 
					"        H7.455V3.207h3.756V5.229z\"></path>\r\n" + 
					"    </svg></i>\r\n" + 
					"                    <span class=\"media-body\">Category</span>\r\n" + 
					"                    <div class=\"media-right media-bottom\"><i class=\"dic-more-vert dic\"></i></div>\r\n" + 
					"                </a> \r\n" + 
					"                <div class=\"pmd-dropdown-menu-container\"><div class=\"pmd-dropdown-menu-bg\"></div><ul class=\"dropdown-menu pm-ini\" style=\"display: none;\">\r\n" + 
					"                    <li><a href=\"AddCategory.html\">Add Category</a></li>\r\n" + 
					"                    <li><a href=\"AddCategory.html#IL01\">View Category</a></li>\r\n" + 
					"    <li><a href=\"form.html\">Edit Category</a></li>\r\n" + 
					"    <li><a href=\"form.html\">Delete Category</a></li>\r\n" + 
					"                </ul></div>\r\n" + 
					"            </li>\r\n" + 
					"            <li class=\"dropdown pmd-dropdown\"> \r\n" + 
					"                 \r\n" + 
					"                \r\n" + 
					"            </li>\r\n" + 
					"    \r\n" + 
					"            \r\n" + 
					"            \r\n" + 
					"            \r\n" + 
					"            \r\n" + 
					"            \r\n" + 
					"        </ul>\r\n" + 
					"    </aside><!-- End Left sidebar -->\r\n" + 
					"    <!-- Sidebar Ends -->  \r\n" + 
					"        \r\n" + 
					"    <!--content area start-->\r\n" + 
					"    <div id=\"ViewUser\" class=\"pmd-content content-area dashboard\">\r\n" + 
					"     <h2>Users</h2>\r\n" + 
					"       <div class=\"pmd-card pmd-z-depth pmd-card-custom-view\">\r\n" + 
					"   \r\n" + 
					"							<div class=\"table-responsive\"> \r\n" + 
					"								<table cellspacing=\"0\" cellpadding=\"0\" class=\"table pmd-table\" id=\"table-propeller\">\r\n" + 
					"									<thead>\r\n" + 
					"										<tr>\r\n" + 
					"											<th>First Name</th>\r\n" + 
					"											<th>Last Name</th>\r\n" + 
					"											<th>Mobile </th>\r\n" + 
					"											<th>Telephone</th>\r\n" + 
					"											<th>Current Address</th>\r\n" + 
					"											<th>Permanent Address</th>\r\n" + 
					"											<th>Email Address</th>\r\n" + 
					"											<th>Interests</th>\r\n" + 
					"											<th>User Type</th>\r\n" + 
					"											<th></th>\r\n" + 
					"										</tr>\r\n" + 
					"									</thead>\r\n" + 
					"									");

			String sql="select fname,lname,P_address,C_address,Mobile,Telephone,Email,UserType from user";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/paf", "root", "");
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				out.print("<tbody><tr><td>");
				out.println(rs.getString(1));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString(2));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString(5));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString(6));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString(3));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString(4));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString(7));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString(8));
				out.print("</tbody>\r\n" + 
						"								</table>\r\n" + 
						"							</div>\r\n" + 
						"						</div> \r\n" + 
						"    \r\n" + 
						"    </div><input type=\"submit\" value=\"Delete\" class=\"btn btn-default\"><!--end content area-->\r\n" + 
						"    \r\n" + 
						"    <!-- Footer Starts -->\r\n" + 
						"    <!--footer start-->\r\n" + 
						"    \r\n" + 
						"    <!--footer end-->\r\n" + 
						"    <!-- Footer Ends -->\r\n" + 
						"    \r\n" + 
						"    <!-- Scripts Starts -->\r\n" + 
						"    <script src=\"assets/js/jquery-1.12.2.min.js\"></script>\r\n" + 
						"    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n" + 
						"    <script>\r\n" + 
						"        $(document).ready(function() {\r\n" + 
						"            var sPath=window.location.pathname;\r\n" + 
						"            var sPage = sPath.substring(sPath.lastIndexOf('/') + 1);\r\n" + 
						"            $(\".pmd-sidebar-nav\").each(function(){\r\n" + 
						"                $(this).find(\"a[href='\"+sPage+\"']\").parents(\".dropdown\").addClass(\"open\");\r\n" + 
						"                $(this).find(\"a[href='\"+sPage+\"']\").parents(\".dropdown\").find('.dropdown-menu').css(\"display\", \"block\");\r\n" + 
						"                $(this).find(\"a[href='\"+sPage+\"']\").parents(\".dropdown\").find('a.dropdown-toggle').addClass(\"active\");\r\n" + 
						"                $(this).find(\"a[href='\"+sPage+\"']\").addClass(\"active\");\r\n" + 
						"            });\r\n" + 
						"        });\r\n" + 
						"    </script>\r\n" + 
						"    <script type=\"text/javascript\">\r\n" + 
						"    (function() {\r\n" + 
						"      \"use strict\";\r\n" + 
						"      var toggles = document.querySelectorAll(\".c-hamburger\");\r\n" + 
						"      for (var i = toggles.length - 1; i >= 0; i--) {\r\n" + 
						"        var toggle = toggles[i];\r\n" + 
						"        toggleHandler(toggle);\r\n" + 
						"      };\r\n" + 
						"      function toggleHandler(toggle) {\r\n" + 
						"        toggle.addEventListener( \"click\", function(e) {\r\n" + 
						"          e.preventDefault();\r\n" + 
						"          (this.classList.contains(\"is-active\") === true) ? this.classList.remove(\"is-active\") : this.classList.add(\"is-active\");\r\n" + 
						"        });\r\n" + 
						"      }\r\n" + 
						"    \r\n" + 
						"    })();\r\n" + 
						"    </script>\r\n" + 
						"    \r\n" + 
						"    <script src=\"assets/js/propeller.min.js\"></script> \r\n" + 
						"    \r\n" + 
						"    <!-- Javascript for revenue progressbar animation effect-->\r\n" + 
						"    <script>\r\n" + 
						"        function progress(percent, $element) {\r\n" + 
						"            var progressBarWidth = percent * $element.width() / 100;\r\n" + 
						"            $element.find('.progress-bar').animate({ width: progressBarWidth }, 500);\r\n" + 
						"        } \r\n" + 
						"        \r\n" + 
						"        progress(50, $('.cash-progressbar'));\r\n" + 
						"        progress(30, $('.card-progressbar'));\r\n" + 
						"        progress(60, $('.wallet-progressbar'));\r\n" + 
						"        progress(40, $('.credit-progressbar'));\r\n" + 
						"        progress(10, $('.other-progressbar'));\r\n" + 
						"    </script>\r\n" + 
						"    <!-- Javascript for revenue progressbar animation effect-->	\r\n" + 
						"    \r\n" + 
						"    \r\n" + 
						"    <!--circle chart-->\r\n" + 
						"    <script src=\"themes/js/circles.min.js\"></script>\r\n" + 
						"    <script>\r\n" + 
						"      <!-- javascript for total sales chart-->\r\n" + 
						"            var colors = [\r\n" + 
						"                ['#dfe3e7', '#f79332'], ['#dfe3e7', '#f79332'], ['#dfe3e7', '#f79332'], ['#dfe3e7', '#2ab7ee'], ['#dfe3e7', '#00719d']\r\n" + 
						"            ], circles = [];\r\n" + 
						"            for (var i = 1; i <= 3; i++) {\r\n" + 
						"                var child = document.getElementById('circles-' + i),\r\n" + 
						"                    percentage = 10 + (i * 8);\r\n" + 
						"    \r\n" + 
						"                circles.push(Circles.create({\r\n" + 
						"                    id:         child.id,\r\n" + 
						"                    value:		percentage,\r\n" + 
						"                    radius:     50,\r\n" + 
						"                    width:      7,\r\n" + 
						"                    colors:     colors[i - 1],\r\n" + 
						"                     textClass:           'circles-text',\r\n" + 
						"                      styleText:           true\r\n" + 
						"                }));\r\n" + 
						"            }\r\n" + 
						"      <!-- javascript for total sales chart-->\r\n" + 
						"        </script>\r\n" + 
						"    \r\n" + 
						"    <!--staked column chart for payment-->\r\n" + 
						"    <script src=\"themes/js/highcharts.js\"></script>\r\n" + 
						"    <script src=\"themes/js/highcharts-more.js\"></script>\r\n" + 
						"    \r\n" + 
						"    <!-- Payment chart js-->\r\n" + 
						"    <script>\r\n" + 
						"    $(function paymentChart(){\r\n" + 
						"        $('#payment-chart').highcharts({\r\n" + 
						"            chart: {\r\n" + 
						"                type: 'column'\r\n" + 
						"            },\r\n" + 
						"            colors: \"#00719d,#2ab7ee\".split(\",\"),\r\n" + 
						"            title: {\r\n" + 
						"                text: 'Last 10 days comparison',\r\n" + 
						"                style: {\r\n" + 
						"                    color: \"#4d575d\",\r\n" + 
						"                    fontSize: \"14px\",\r\n" + 
						"                },\r\n" + 
						"            },\r\n" + 
						"            xAxis: {\r\n" + 
						"                categories: ['9-7', '10-7', '11-7', '12-7', '13-7', '14-7', '15-7', '16-7', '17-7', '18-7']\r\n" + 
						"            },\r\n" + 
						"            yAxis: {\r\n" + 
						"                min: 0,\r\n" + 
						"                title: {\r\n" + 
						"                        text: \"Amount\"\r\n" + 
						"                },\r\n" + 
						"                stackLabels: {\r\n" + 
						"                        enabled: false,\r\n" + 
						"                        style: {\r\n" + 
						"                            fontWeight: 'bold',\r\n" + 
						"                            color: (Highcharts.theme && Highcharts.theme.textColor) || 'black'\r\n" + 
						"                        }\r\n" + 
						"                    }\r\n" + 
						"                },\r\n" + 
						"            legend: {\r\n" + 
						"                enabled: !0,\r\n" + 
						"                align: \"right\",\r\n" + 
						"                layout: \"horizontal\",\r\n" + 
						"                labelFormatter: function() {\r\n" + 
						"                    return this.name\r\n" + 
						"                },\r\n" + 
						"                borderColor: false,\r\n" + 
						"                borderRadius: 0,\r\n" + 
						"                navigation: {\r\n" + 
						"                    activeColor: \"#274b6d\",\r\n" + 
						"                    inactiveColor: \"#CCC\"\r\n" + 
						"                },\r\n" + 
						"                shadow: false,\r\n" + 
						"                itemStyle: {\r\n" + 
						"                    color: \"#888888\",\r\n" + 
						"                    fontSize: \"12px\",\r\n" + 
						"                    fontWeight: \"normal\"\r\n" + 
						"                },\r\n" + 
						"                itemHoverStyle: {\r\n" + 
						"                    color: \"#000\"\r\n" + 
						"                },\r\n" + 
						"                itemHiddenStyle: {\r\n" + 
						"                    color: \"#CCC\"\r\n" + 
						"                },\r\n" + 
						"                itemCheckboxStyle: {\r\n" + 
						"                    position: \"absolute\"\r\n" + 
						"                },\r\n" + 
						"                symbolHeight: 10,\r\n" + 
						"                symbolWidth: 10,\r\n" + 
						"                symbolPadding: 5,\r\n" + 
						"                verticalAlign: \"bottom\",\r\n" + 
						"                x: 0,\r\n" + 
						"                y: 0,\r\n" + 
						"                title: {\r\n" + 
						"                    style: {\r\n" + 
						"                        fontWeight: \"normal\"\r\n" + 
						"                    }\r\n" + 
						"                }\r\n" + 
						"            },\r\n" + 
						"            tooltip: {\r\n" + 
						"                headerFormat: '<b>{point.x}</b><br/>',\r\n" + 
						"                pointFormat: '{series.name}: {point.y}<br/>Total: {point.stackTotal}',\r\n" + 
						"                backgroundColor: '#ffffff',\r\n" + 
						"                borderColor: '#f0f0f0',\r\n" + 
						"                shadow: true\r\n" + 
						"            },\r\n" + 
						"            plotOptions: {\r\n" + 
						"                column: {\r\n" + 
						"                    stacking: 'normal',\r\n" + 
						"                    dataLabels: {\r\n" + 
						"                        enabled: false,\r\n" + 
						"                        color: (Highcharts.theme && Highcharts.theme.dataLabelsColor) || 'white',\r\n" + 
						"                        style: {\r\n" + 
						"                            textShadow: '0 0 3px black'\r\n" + 
						"                        }\r\n" + 
						"                    }\r\n" + 
						"                }\r\n" + 
						"            },\r\n" + 
						"             credits: {\r\n" + 
						"                enabled: false,\r\n" + 
						"            },\r\n" + 
						"            series: [{\r\n" + 
						"                name: 'Card',\r\n" + 
						"                data: [25000, 50000, 75000, 75000, 60000, 70000, 10000, 2500, 5000, 25000]\r\n" + 
						"            }, {\r\n" + 
						"                name: 'Wallet',\r\n" + 
						"                data: [75000, 50000, 25000, 25000, 30000, 30000, 90000, 25000, 3000, 50000]\r\n" + 
						"            }]\r\n" + 
						"            \r\n" + 
						"        });\r\n" + 
						"    });\r\n" + 
						"    </script>\r\n" + 
						"    \r\n" + 
						"    <!--staked column chart for sms details-->\r\n" + 
						"    <script>\r\n" + 
						"    $( function smsChart() { \r\n" + 
						"        $('#sms-chart').highcharts({\r\n" + 
						"            chart: {\r\n" + 
						"                zoomType: 'none'\r\n" + 
						"            },\r\n" + 
						"            colors: \"#e75c5c,#9159b8\".split(\",\"),\r\n" + 
						"             title: {\r\n" + 
						"                text: 'Last 7 days comparison',\r\n" + 
						"                style: {\r\n" + 
						"                    color: \"#4d575d\",\r\n" + 
						"                    fontSize: \"14px\",\r\n" + 
						"                },\r\n" + 
						"            },\r\n" + 
						"            xAxis: [{\r\n" + 
						"                categories: ['3-7', '4-7', '5-7', '6-7', '7-7', '8-7', '9-7']\r\n" + 
						"            }],\r\n" + 
						"            yAxis: [{ // Primary yAxis\r\n" + 
						"                labels: {\r\n" + 
						"                    style: {\r\n" + 
						"                        color: Highcharts.getOptions().colors[1]\r\n" + 
						"                    }\r\n" + 
						"                },\r\n" + 
						"                title: {\r\n" + 
						"                    text: 'User Count',\r\n" + 
						"                    style: {\r\n" + 
						"                        color: Highcharts.getOptions().colors[1]\r\n" + 
						"                    }\r\n" + 
						"                }\r\n" + 
						"            }, { // Secondary yAxis\r\n" + 
						"                title: {\r\n" + 
						"                    text: 'Total Days',\r\n" + 
						"                    style: {\r\n" + 
						"                        color: Highcharts.getOptions().colors[0]\r\n" + 
						"                    }\r\n" + 
						"                },\r\n" + 
						"                labels: {\r\n" + 
						"                    style: {\r\n" + 
						"                        color: Highcharts.getOptions().colors[0]\r\n" + 
						"                    }\r\n" + 
						"                },\r\n" + 
						"                opposite: true\r\n" + 
						"            }],\r\n" + 
						"            legend: {\r\n" + 
						"                enabled: !0,\r\n" + 
						"                align: \"right\",\r\n" + 
						"                layout: \"horizontal\",\r\n" + 
						"                labelFormatter: function() {\r\n" + 
						"                    return this.name\r\n" + 
						"                },\r\n" + 
						"                borderColor: false,\r\n" + 
						"                borderRadius: 0,\r\n" + 
						"                navigation: {\r\n" + 
						"                    activeColor: \"#274b6d\",\r\n" + 
						"                    inactiveColor: \"#CCC\"\r\n" + 
						"                },\r\n" + 
						"                shadow: false,\r\n" + 
						"                itemStyle: {\r\n" + 
						"                    color: \"#888888\",\r\n" + 
						"                    fontSize: \"12px\",\r\n" + 
						"                    fontWeight: \"normal\"\r\n" + 
						"                },\r\n" + 
						"                itemHoverStyle: {\r\n" + 
						"                    color: \"#000\"\r\n" + 
						"                },\r\n" + 
						"                itemHiddenStyle: {\r\n" + 
						"                    color: \"#CCC\"\r\n" + 
						"                },\r\n" + 
						"                itemCheckboxStyle: {\r\n" + 
						"                    position: \"absolute\",\r\n" + 
						"                    width: \"12px\",\r\n" + 
						"                    height: \"12px\"\r\n" + 
						"                },\r\n" + 
						"                symbolHeight: 10,\r\n" + 
						"                symbolWidth: 10,\r\n" + 
						"                symbolPadding: 5,\r\n" + 
						"                verticalAlign: \"bottom\",\r\n" + 
						"                x: 0,\r\n" + 
						"                y: 0,\r\n" + 
						"                title: {\r\n" + 
						"                    style: {\r\n" + 
						"                        fontWeight: \"normal\"\r\n" + 
						"                    }\r\n" + 
						"                }\r\n" + 
						"            },\r\n" + 
						"    \r\n" + 
						"            tooltip: {\r\n" + 
						"                shared: true,\r\n" + 
						"                backgroundColor: '#ffffff',\r\n" + 
						"                borderColor: '#f0f0f0',\r\n" + 
						"                shadow: true\r\n" + 
						"            },\r\n" + 
						"             credits: {\r\n" + 
						"                enabled: false,\r\n" + 
						"            },\r\n" + 
						"    \r\n" + 
						"            series: [{\r\n" + 
						"                name: 'Total Days',\r\n" + 
						"                type: 'spline',\r\n" + 
						"                yAxis: 1,\r\n" + 
						"                data: [49.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6],\r\n" + 
						"                tooltip: {\r\n" + 
						"                    pointFormat: '<span style=\"font-weight: bold; color: {series.color}\">{series.name}</span>: '\r\n" + 
						"                }\r\n" + 
						"            }, {\r\n" + 
						"                name: 'Total Days error',\r\n" + 
						"                type: 'errorbar',\r\n" + 
						"                yAxis: 1,\r\n" + 
						"                data: [[48, 51], [68, 73], [92, 110], [128, 136], [140, 150], [171, 179], [135, 143]],\r\n" + 
						"                tooltip: {\r\n" + 
						"                    pointFormat: '(error range: {point.low}-{point.high})<br/>'\r\n" + 
						"                }\r\n" + 
						"            }, {\r\n" + 
						"                name: 'User Count',\r\n" + 
						"                type: 'column',\r\n" + 
						"                data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2],\r\n" + 
						"                tooltip: {\r\n" + 
						"                    pointFormat: '<span style=\"font-weight: bold; color: {series.color}\">{series.name}</span>: <b>{point.y:.1f}</b> '\r\n" + 
						"                }\r\n" + 
						"            }, {\r\n" + 
						"                name: 'User Count error',\r\n" + 
						"                type: 'errorbar',\r\n" + 
						"                data: [[6, 8], [5.9, 7.6], [9.4, 10.4], [14.1, 15.9], [18.0, 20.1], [21.0, 24.0], [23.2, 25.3]],\r\n" + 
						"                tooltip: {\r\n" + 
						"                    pointFormat: '(error range: {point.low}-{point.high})<br/>'\r\n" + 
						"                }\r\n" + 
						"            }]\r\n" + 
						"        });\r\n" + 
						"    });\r\n" + 
						"    </script>\r\n" + 
						"    <!-- Scripts Ends -->\r\n" + 
						"    <!-- Javascript for Datepicker -->\r\n" + 
						"    <script type=\"text/javascript\" language=\"javascript\" src=\"components/datetimepicker/js/moment-with-locales.js\"></script>\r\n" + 
						"    <script type=\"text/javascript\" language=\"javascript\" src=\"components/datetimepicker/js/bootstrap-datetimepicker.js\"></script>\r\n" + 
						"    <script>\r\n" + 
						"        // Linked date and time picker \r\n" + 
						"        // start date date and time picker \r\n" + 
						"        $('#datepicker-default').datetimepicker();\r\n" + 
						"        $(\".auto-update-year\").html(new Date().getFullYear());\r\n" + 
						"    </script> \r\n" + 
						"    \r\n" + 
						"    \r\n" + 
						"    </body></html>");
			}}
			else{
				PrintWriter out=response.getWriter();
				
				out.print("<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"\r\n" + 
						"    pageEncoding=\"ISO-8859-1\"%>\r\n" + 
						"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n" + 
						"<html lang=\"\"><head>\r\n" + 
						"    <meta charset=\"utf-8\">\r\n" + 
						"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n" + 
						"    <meta name=\"description\" content=\"4C Knowledge Admin\">\r\n" + 
						"    <meta content=\"width=device-width, initial-scale=1, user-scalable=no\" name=\"viewport\">\r\n" + 
						"    \r\n" + 
						"    <title>Admin - 4C Knowledge</title>\r\n" + 
						"    <meta name=\"description\" content=\"Admin is a material design and bootstrap based responsive dashboard template created mainly for admin and backend applications.\">\r\n" + 
						"    \r\n" + 
						"  \r\n" + 
						"    \r\n" + 
						"    <!-- Google icon -->\r\n" + 
						"    <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n" + 
						"    \r\n" + 
						"    <!-- Bootstrap css -->\r\n" + 
						"    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.min.css\">\r\n" + 
						"    \r\n" + 
						"    <!-- Propeller css -->\r\n" + 
						"    <!-- build:[href] assets/css/ -->\r\n" + 
						"    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/propeller.min.css\">\r\n" + 
						"    <!-- /build -->\r\n" + 
						"    \r\n" + 
						"    <!-- Propeller date time picker css-->\r\n" + 
						"    <link rel=\"stylesheet\" type=\"text/css\" href=\"components/datetimepicker/css/bootstrap-datetimepicker.css\">\r\n" + 
						"    <link rel=\"stylesheet\" type=\"text/css\" href=\"components/datetimepicker/css/pmd-datetimepicker.css\">\r\n" + 
						"    \r\n" + 
						"    <!-- Propeller theme css-->\r\n" + 
						"    <link rel=\"stylesheet\" type=\"text/css\" href=\"themes/css/propeller-theme.css\">\r\n" + 
						"    \r\n" + 
						"    <!-- Propeller admin theme css-->\r\n" + 
						"    <link rel=\"stylesheet\" type=\"text/css\" href=\"themes/css/propeller-admin.css\">\r\n" + 
						"    \r\n" + 
						"    </head>\r\n" + 
						"    \r\n" + 
						"    <body class=\"\">\r\n" + 
						"    <!-- Header Starts -->\r\n" + 
						"    <!--Start Nav bar -->\r\n" + 
						"    <nav class=\"navbar navbar-inverse navbar-fixed-top pmd-navbar pmd-z-depth\">\r\n" + 
						"    \r\n" + 
						"        <div class=\"container-fluid\">\r\n" + 
						"            \r\n" + 
						"            \r\n" + 
						"            <div class=\"navbar-header\">\r\n" + 
						"                <a href=\"javascript:void(0);\" data-target=\"basicSidebar\" data-placement=\"left\" data-position=\"slidepush\" is-open=\"true\" is-open-width=\"1200\" class=\"btn btn-sm pmd-btn-fab pmd-btn-flat pmd-ripple-effect pull-left margin-r8 pmd-sidebar-toggle\"><i class=\"material-icons md-light\">menu</i></a>	\r\n" + 
						"              <a href=\"index.html\" class=\"navbar-brand\">\r\n" + 
						"                  4C Knowledge\r\n" + 
						"              </a>\r\n" + 
						"            </div>\r\n" + 
						"        </div>\r\n" + 
						"    \r\n" + 
						"    </nav><!--End Nav bar -->\r\n" + 
						"    <!-- Header Ends -->\r\n" + 
						"    \r\n" + 
						"    <!-- Sidebar Starts -->\r\n" + 
						"    <div class=\"pmd-sidebar-overlay\"></div>\r\n" + 
						"    \r\n" + 
						"    <!-- Left sidebar -->\r\n" + 
						"    <aside id=\"basicSidebar\" class=\"pmd-sidebar  sidebar-default pmd-sidebar-left bg-fill-darkblue sidebar-with-icons is-slidepush pmd-sidebar-left-fixed\" role=\"navigation\">\r\n" + 
						"        <ul class=\"nav pmd-sidebar-nav\">\r\n" + 
						"            \r\n" + 
						"            <!-- User info -->\r\n" + 
						"            <li class=\"dropdown pmd-dropdown pmd-user-info visible-xs visible-md visible-sm visible-lg\">\r\n" + 
						"                <a aria-expanded=\"false\" data-toggle=\"dropdown\" class=\"btn-user dropdown-toggle media\" data-sidebar=\"true\" aria-expandedhref=\"javascript:void(0);\">\r\n" + 
						"                    <div class=\"media-left\">\r\n" + 
						"                        <img src=\"themes/images/user-icon.png\" alt=\"New User\">\r\n" + 
						"                    </div>\r\n" + 
						"                    <div class=\"media-body media-middle\">Admin</div>\r\n" + 
						"                    <div class=\"media-right media-middle\"><i class=\"dic-more-vert dic\"></i></div>\r\n" + 
						"                </a>\r\n" + 
						"                <div class=\"pmd-dropdown-menu-container\"><div class=\"pmd-dropdown-menu-bg\"></div><ul class=\"dropdown-menu pm-ini\" style=\"display: none;\">\r\n" + 
						"                    <li><a href=\"login.html\">Logout</a></li>\r\n" + 
						"                </ul></div>\r\n" + 
						"            </li><!-- End user info -->\r\n" + 
						"            \r\n" + 
						"            <li> \r\n" + 
						"                 \r\n" + 
						"            </li>\r\n" + 
						"            \r\n" + 
						"            <li class=\"dropdown pmd-dropdown\"> \r\n" + 
						"                <a aria-expanded=\"false\" data-toggle=\"dropdown\" class=\"btn-user dropdown-toggle media active\" data-sidebar=\"true\" href=\"javascript:void(0);\">	\r\n" + 
						"                    <i class=\"media-left media-middle\"><svg version=\"1.1\" x=\"0px\" y=\"0px\" width=\"18px\" height=\"18.001px\" viewBox=\"0 0 18 18.001\" enable-background=\"new 0 0 18 18.001\" xml:space=\"preserve\">\r\n" + 
						"    <path fill=\"#C9C8C8\" d=\"M6.188,0.001C5.232,0.001,4.5,0.732,4.5,1.688c0,0.394,0.166,0.739,0.334,1.02L5.45,3.71\r\n" + 
						"        c0.113,0.113,0.176,0.341,0.176,0.51v0.281c0,0.619-0.506,1.125-1.125,1.125H0.282c-0.169,0-0.281,0.112-0.281,0.281V17.72\r\n" + 
						"        c0,0.168,0.112,0.281,0.281,0.281h4.219c0.619,0,1.125-0.506,1.125-1.125v-0.281c0-0.168-0.063-0.397-0.176-0.509\r\n" + 
						"        c0,0-0.615-0.946-0.615-1.002C4.666,14.802,4.5,14.457,4.5,14.063c0-0.956,0.731-1.688,1.688-1.688s1.688,0.731,1.688,1.688\r\n" + 
						"        c0,0.394-0.166,0.739-0.334,1.02l-0.616,1.002c-0.056,0.112-0.176,0.341-0.176,0.509v0.281c0,0.619,0.506,1.125,1.125,1.125h4.219\r\n" + 
						"        c0.168,0,0.281-0.113,0.281-0.281V13.5c0-0.619,0.506-1.125,1.125-1.125h0.281c0.169,0,0.396,0.063,0.51,0.176\r\n" + 
						"        c0,0,0.945,0.616,1.002,0.616c0.337,0.168,0.626,0.334,1.02,0.334c0.956,0,1.687-0.731,1.687-1.687c0-0.957-0.731-1.688-1.687-1.688\r\n" + 
						"        c-0.394,0-0.738,0.166-1.02,0.334l-1.002,0.616c-0.113,0.056-0.341,0.176-0.51,0.176H13.5c-0.619,0-1.125-0.506-1.125-1.125V5.908\r\n" + 
						"        c0-0.168-0.113-0.281-0.281-0.281H7.875c-0.619,0-1.125-0.506-1.125-1.125V4.221c0-0.168,0.063-0.397,0.176-0.51\r\n" + 
						"        c0,0,0.616-0.945,0.616-1.001c0.168-0.281,0.334-0.626,0.334-1.02C7.875,0.733,7.144,0.002,6.188,0.001L6.188,0.001z\"></path>\r\n" + 
						"    </svg></i> \r\n" + 
						"                    <span class=\"media-body\">Users</span>\r\n" + 
						"                    <div class=\"media-right media-bottom\"><i class=\"dic-more-vert dic\"></i></div>\r\n" + 
						"                </a> \r\n" + 
						"                <div class=\"pmd-dropdown-menu-container\"><div class=\"pmd-dropdown-menu-bg\"></div><ul class=\"dropdown-menu pm-ini\" style=\"display: block;\">\r\n" + 
						"                    <li><a href=\"Admin.jsp\" class=\"active\">Add User</a></li>\r\n" + 
						"    <li><a href=\"ViewUser.jsp#ViewUser\" class=\"active\">View User</a></li>\r\n" + 
						"                    <li><a href=\"DeleteUser.html\">Delete User</a></li>\r\n" + 
						"                    <li><a href=\"shadow.html\">Black List</a></li>\r\n" + 
						"                    \r\n" + 
						"         \r\n" + 
						"                </ul></div>\r\n" + 
						"            </li>\r\n" + 
						"            <li class=\"dropdown pmd-dropdown\"> \r\n" + 
						"                <a aria-expanded=\"true\" data-toggle=\"dropdown\" class=\"btn-user dropdown-toggle media\" data-sidebar=\"true\" href=\"javascript:void(0);\">	\r\n" + 
						"                    <i class=\"material-icons media-left pmd-sm\">swap_calls</i> \r\n" + 
						"                    <span class=\"media-body\">Admins</span>\r\n" + 
						"                    <div class=\"media-right media-bottom\"><i class=\"dic-more-vert dic\"></i></div>\r\n" + 
						"                </a> \r\n" + 
						"                <div class=\"pmd-dropdown-menu-container\"><div class=\"pmd-dropdown-menu-bg\"></div><ul class=\"dropdown-menu pm-ini\" style=\"display: none;\">\r\n" + 
						"                    <li><a href=\"custom-scroll.html\">Add Admin</a></li>\r\n" + 
						"                    <li><a href=\"datetimepicker.html\">View Admin</a></li>\r\n" + 
						"                    <li><a href=\"range-slider.html\">Remove Admin</a></li>\r\n" + 
						"                    \r\n" + 
						"                </ul></div>\r\n" + 
						"            </li>\r\n" + 
						"            \r\n" + 
						"            <li class=\"dropdown pmd-dropdown\"> \r\n" + 
						"                <a aria-expanded=\"false\" data-toggle=\"dropdown\" class=\"btn-user dropdown-toggle media\" data-sidebar=\"true\" href=\"javascript:void(0);\">	\r\n" + 
						"                    <i class=\"media-left media-middle\"><svg version=\"1.1\" x=\"0px\" y=\"0px\" width=\"14.187px\" height=\"18px\" viewBox=\"0 0 14.187 18\" enable-background=\"new 0 0 14.187 18\" xml:space=\"preserve\">\r\n" + 
						"    <path fill=\"#C9C8C8\" d=\"M0,0v18h14.187V0H0z M3.121,3.293h2.023v4.767H3.121V3.293z M11.211,14.764H2.948v-2.022h8.263V14.764\r\n" + 
						"        L11.211,14.764z M11.211,11.585H2.948V9.563h8.263V11.585L11.211,11.585z M11.211,8.407H7.455V6.385h3.756V8.407z M11.211,5.229\r\n" + 
						"        H7.455V3.207h3.756V5.229z\"></path>\r\n" + 
						"    </svg></i>\r\n" + 
						"                    <span class=\"media-body\">Category</span>\r\n" + 
						"                    <div class=\"media-right media-bottom\"><i class=\"dic-more-vert dic\"></i></div>\r\n" + 
						"                </a> \r\n" + 
						"                <div class=\"pmd-dropdown-menu-container\"><div class=\"pmd-dropdown-menu-bg\"></div><ul class=\"dropdown-menu pm-ini\" style=\"display: none;\">\r\n" + 
						"                    <li><a href=\"AddCategory.html\">Add Category</a></li>\r\n" + 
						"                    <li><a href=\"AddCategory.html#IL01\">View Category</a></li>\r\n" + 
						"    <li><a href=\"form.html\">Edit Category</a></li>\r\n" + 
						"    <li><a href=\"form.html\">Delete Category</a></li>\r\n" + 
						"                </ul></div>\r\n" + 
						"            </li>\r\n" + 
						"            <li class=\"dropdown pmd-dropdown\"> \r\n" + 
						"                 \r\n" + 
						"                \r\n" + 
						"            </li>\r\n" + 
						"    \r\n" + 
						"            \r\n" + 
						"            \r\n" + 
						"            \r\n" + 
						"            \r\n" + 
						"            \r\n" + 
						"        </ul>\r\n" + 
						"    </aside><!-- End Left sidebar -->\r\n" + 
						"    <!-- Sidebar Ends -->  \r\n" + 
						"        \r\n" + 
						"    <!--content area start-->\r\n" + 
						"    <div id=\"ViewUser\" class=\"pmd-content content-area dashboard\">\r\n" + 
						"     <h2>Users</h2>\r\n" + 
						"       <div class=\"pmd-card pmd-z-depth pmd-card-custom-view\">\r\n" + 
						"   \r\n" + 
						"							<div class=\"table-responsive\"> \r\n" + 
						"								<table cellspacing=\"0\" cellpadding=\"0\" class=\"table pmd-table\" id=\"table-propeller\">\r\n" + 
						"									<thead>\r\n" + 
						"										<tr>\r\n" + 
						"											<th>First Name</th>\r\n" + 
						"											<th>Last Name</th>\r\n" + 
						"											<th>Mobile </th>\r\n" + 
						"											<th>Telephone</th>\r\n" + 
						"											<th>Current Address</th>\r\n" + 
						"											<th>Permanent Address</th>\r\n" + 
						"											<th>Email Address</th>\r\n" + 
						"											<th>Interests</th>\r\n" + 
						"											<th>User Type</th>\r\n" + 
						"											<th></th>\r\n" + 
						"										</tr>\r\n" + 
						"									</thead>\r\n" + 
						"									");

				String sql="select fname,lname,P_address,C_address,Mobile,Telephone,Email,UserType from user where UserType=2";
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin", "root", "");
				PreparedStatement ps=conn.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					out.print("<tbody><tr><td>");
					out.println(rs.getString(1));
					out.print("</td>");
					out.print("<td>");
					out.println(rs.getString(2));
					out.print("</td>");
					out.print("<td>");
					out.println(rs.getString(3));
					out.print("</td>");
					out.print("<td>");
					out.println(rs.getString(4));
					out.print("</td>");
					out.print("<td>");
					out.println(rs.getString(5));
					out.print("</td>");
					out.print("<td>");
					out.println(rs.getString(6));
					out.print("</td>");
					out.print("<td>");
					out.println(rs.getString(7));
					out.print("</td>");
					out.print("<td>");
					out.println(rs.getString(8));
					out.print("</tbody>\r\n" + 
							"								</table>\r\n" + 
							"							</div>\r\n" + 
							"						</div> \r\n" + 
							"    \r\n" + 
							"    </div><input type=\"submit\" value=\"Delete\" class=\"btn btn-default\"><!--end content area-->\r\n" + 
							"    \r\n" + 
							"    <!-- Footer Starts -->\r\n" + 
							"    <!--footer start-->\r\n" + 
							"    \r\n" + 
							"    <!--footer end-->\r\n" + 
							"    <!-- Footer Ends -->\r\n" + 
							"    \r\n" + 
							"    <!-- Scripts Starts -->\r\n" + 
							"    <script src=\"assets/js/jquery-1.12.2.min.js\"></script>\r\n" + 
							"    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n" + 
							"    <script>\r\n" + 
							"        $(document).ready(function() {\r\n" + 
							"            var sPath=window.location.pathname;\r\n" + 
							"            var sPage = sPath.substring(sPath.lastIndexOf('/') + 1);\r\n" + 
							"            $(\".pmd-sidebar-nav\").each(function(){\r\n" + 
							"                $(this).find(\"a[href='\"+sPage+\"']\").parents(\".dropdown\").addClass(\"open\");\r\n" + 
							"                $(this).find(\"a[href='\"+sPage+\"']\").parents(\".dropdown\").find('.dropdown-menu').css(\"display\", \"block\");\r\n" + 
							"                $(this).find(\"a[href='\"+sPage+\"']\").parents(\".dropdown\").find('a.dropdown-toggle').addClass(\"active\");\r\n" + 
							"                $(this).find(\"a[href='\"+sPage+\"']\").addClass(\"active\");\r\n" + 
							"            });\r\n" + 
							"        });\r\n" + 
							"    </script>\r\n" + 
							"    <script type=\"text/javascript\">\r\n" + 
							"    (function() {\r\n" + 
							"      \"use strict\";\r\n" + 
							"      var toggles = document.querySelectorAll(\".c-hamburger\");\r\n" + 
							"      for (var i = toggles.length - 1; i >= 0; i--) {\r\n" + 
							"        var toggle = toggles[i];\r\n" + 
							"        toggleHandler(toggle);\r\n" + 
							"      };\r\n" + 
							"      function toggleHandler(toggle) {\r\n" + 
							"        toggle.addEventListener( \"click\", function(e) {\r\n" + 
							"          e.preventDefault();\r\n" + 
							"          (this.classList.contains(\"is-active\") === true) ? this.classList.remove(\"is-active\") : this.classList.add(\"is-active\");\r\n" + 
							"        });\r\n" + 
							"      }\r\n" + 
							"    \r\n" + 
							"    })();\r\n" + 
							"    </script>\r\n" + 
							"    \r\n" + 
							"    <script src=\"assets/js/propeller.min.js\"></script> \r\n" + 
							"    \r\n" + 
							"    <!-- Javascript for revenue progressbar animation effect-->\r\n" + 
							"    <script>\r\n" + 
							"        function progress(percent, $element) {\r\n" + 
							"            var progressBarWidth = percent * $element.width() / 100;\r\n" + 
							"            $element.find('.progress-bar').animate({ width: progressBarWidth }, 500);\r\n" + 
							"        } \r\n" + 
							"        \r\n" + 
							"        progress(50, $('.cash-progressbar'));\r\n" + 
							"        progress(30, $('.card-progressbar'));\r\n" + 
							"        progress(60, $('.wallet-progressbar'));\r\n" + 
							"        progress(40, $('.credit-progressbar'));\r\n" + 
							"        progress(10, $('.other-progressbar'));\r\n" + 
							"    </script>\r\n" + 
							"    <!-- Javascript for revenue progressbar animation effect-->	\r\n" + 
							"    \r\n" + 
							"    \r\n" + 
							"    <!--circle chart-->\r\n" + 
							"    <script src=\"themes/js/circles.min.js\"></script>\r\n" + 
							"    <script>\r\n" + 
							"      <!-- javascript for total sales chart-->\r\n" + 
							"            var colors = [\r\n" + 
							"                ['#dfe3e7', '#f79332'], ['#dfe3e7', '#f79332'], ['#dfe3e7', '#f79332'], ['#dfe3e7', '#2ab7ee'], ['#dfe3e7', '#00719d']\r\n" + 
							"            ], circles = [];\r\n" + 
							"            for (var i = 1; i <= 3; i++) {\r\n" + 
							"                var child = document.getElementById('circles-' + i),\r\n" + 
							"                    percentage = 10 + (i * 8);\r\n" + 
							"    \r\n" + 
							"                circles.push(Circles.create({\r\n" + 
							"                    id:         child.id,\r\n" + 
							"                    value:		percentage,\r\n" + 
							"                    radius:     50,\r\n" + 
							"                    width:      7,\r\n" + 
							"                    colors:     colors[i - 1],\r\n" + 
							"                     textClass:           'circles-text',\r\n" + 
							"                      styleText:           true\r\n" + 
							"                }));\r\n" + 
							"            }\r\n" + 
							"      <!-- javascript for total sales chart-->\r\n" + 
							"        </script>\r\n" + 
							"    \r\n" + 
							"    <!--staked column chart for payment-->\r\n" + 
							"    <script src=\"themes/js/highcharts.js\"></script>\r\n" + 
							"    <script src=\"themes/js/highcharts-more.js\"></script>\r\n" + 
							"    \r\n" + 
							"    <!-- Payment chart js-->\r\n" + 
							"    <script>\r\n" + 
							"    $(function paymentChart(){\r\n" + 
							"        $('#payment-chart').highcharts({\r\n" + 
							"            chart: {\r\n" + 
							"                type: 'column'\r\n" + 
							"            },\r\n" + 
							"            colors: \"#00719d,#2ab7ee\".split(\",\"),\r\n" + 
							"            title: {\r\n" + 
							"                text: 'Last 10 days comparison',\r\n" + 
							"                style: {\r\n" + 
							"                    color: \"#4d575d\",\r\n" + 
							"                    fontSize: \"14px\",\r\n" + 
							"                },\r\n" + 
							"            },\r\n" + 
							"            xAxis: {\r\n" + 
							"                categories: ['9-7', '10-7', '11-7', '12-7', '13-7', '14-7', '15-7', '16-7', '17-7', '18-7']\r\n" + 
							"            },\r\n" + 
							"            yAxis: {\r\n" + 
							"                min: 0,\r\n" + 
							"                title: {\r\n" + 
							"                        text: \"Amount\"\r\n" + 
							"                },\r\n" + 
							"                stackLabels: {\r\n" + 
							"                        enabled: false,\r\n" + 
							"                        style: {\r\n" + 
							"                            fontWeight: 'bold',\r\n" + 
							"                            color: (Highcharts.theme && Highcharts.theme.textColor) || 'black'\r\n" + 
							"                        }\r\n" + 
							"                    }\r\n" + 
							"                },\r\n" + 
							"            legend: {\r\n" + 
							"                enabled: !0,\r\n" + 
							"                align: \"right\",\r\n" + 
							"                layout: \"horizontal\",\r\n" + 
							"                labelFormatter: function() {\r\n" + 
							"                    return this.name\r\n" + 
							"                },\r\n" + 
							"                borderColor: false,\r\n" + 
							"                borderRadius: 0,\r\n" + 
							"                navigation: {\r\n" + 
							"                    activeColor: \"#274b6d\",\r\n" + 
							"                    inactiveColor: \"#CCC\"\r\n" + 
							"                },\r\n" + 
							"                shadow: false,\r\n" + 
							"                itemStyle: {\r\n" + 
							"                    color: \"#888888\",\r\n" + 
							"                    fontSize: \"12px\",\r\n" + 
							"                    fontWeight: \"normal\"\r\n" + 
							"                },\r\n" + 
							"                itemHoverStyle: {\r\n" + 
							"                    color: \"#000\"\r\n" + 
							"                },\r\n" + 
							"                itemHiddenStyle: {\r\n" + 
							"                    color: \"#CCC\"\r\n" + 
							"                },\r\n" + 
							"                itemCheckboxStyle: {\r\n" + 
							"                    position: \"absolute\"\r\n" + 
							"                },\r\n" + 
							"                symbolHeight: 10,\r\n" + 
							"                symbolWidth: 10,\r\n" + 
							"                symbolPadding: 5,\r\n" + 
							"                verticalAlign: \"bottom\",\r\n" + 
							"                x: 0,\r\n" + 
							"                y: 0,\r\n" + 
							"                title: {\r\n" + 
							"                    style: {\r\n" + 
							"                        fontWeight: \"normal\"\r\n" + 
							"                    }\r\n" + 
							"                }\r\n" + 
							"            },\r\n" + 
							"            tooltip: {\r\n" + 
							"                headerFormat: '<b>{point.x}</b><br/>',\r\n" + 
							"                pointFormat: '{series.name}: {point.y}<br/>Total: {point.stackTotal}',\r\n" + 
							"                backgroundColor: '#ffffff',\r\n" + 
							"                borderColor: '#f0f0f0',\r\n" + 
							"                shadow: true\r\n" + 
							"            },\r\n" + 
							"            plotOptions: {\r\n" + 
							"                column: {\r\n" + 
							"                    stacking: 'normal',\r\n" + 
							"                    dataLabels: {\r\n" + 
							"                        enabled: false,\r\n" + 
							"                        color: (Highcharts.theme && Highcharts.theme.dataLabelsColor) || 'white',\r\n" + 
							"                        style: {\r\n" + 
							"                            textShadow: '0 0 3px black'\r\n" + 
							"                        }\r\n" + 
							"                    }\r\n" + 
							"                }\r\n" + 
							"            },\r\n" + 
							"             credits: {\r\n" + 
							"                enabled: false,\r\n" + 
							"            },\r\n" + 
							"            series: [{\r\n" + 
							"                name: 'Card',\r\n" + 
							"                data: [25000, 50000, 75000, 75000, 60000, 70000, 10000, 2500, 5000, 25000]\r\n" + 
							"            }, {\r\n" + 
							"                name: 'Wallet',\r\n" + 
							"                data: [75000, 50000, 25000, 25000, 30000, 30000, 90000, 25000, 3000, 50000]\r\n" + 
							"            }]\r\n" + 
							"            \r\n" + 
							"        });\r\n" + 
							"    });\r\n" + 
							"    </script>\r\n" + 
							"    \r\n" + 
							"    <!--staked column chart for sms details-->\r\n" + 
							"    <script>\r\n" + 
							"    $( function smsChart() { \r\n" + 
							"        $('#sms-chart').highcharts({\r\n" + 
							"            chart: {\r\n" + 
							"                zoomType: 'none'\r\n" + 
							"            },\r\n" + 
							"            colors: \"#e75c5c,#9159b8\".split(\",\"),\r\n" + 
							"             title: {\r\n" + 
							"                text: 'Last 7 days comparison',\r\n" + 
							"                style: {\r\n" + 
							"                    color: \"#4d575d\",\r\n" + 
							"                    fontSize: \"14px\",\r\n" + 
							"                },\r\n" + 
							"            },\r\n" + 
							"            xAxis: [{\r\n" + 
							"                categories: ['3-7', '4-7', '5-7', '6-7', '7-7', '8-7', '9-7']\r\n" + 
							"            }],\r\n" + 
							"            yAxis: [{ // Primary yAxis\r\n" + 
							"                labels: {\r\n" + 
							"                    style: {\r\n" + 
							"                        color: Highcharts.getOptions().colors[1]\r\n" + 
							"                    }\r\n" + 
							"                },\r\n" + 
							"                title: {\r\n" + 
							"                    text: 'User Count',\r\n" + 
							"                    style: {\r\n" + 
							"                        color: Highcharts.getOptions().colors[1]\r\n" + 
							"                    }\r\n" + 
							"                }\r\n" + 
							"            }, { // Secondary yAxis\r\n" + 
							"                title: {\r\n" + 
							"                    text: 'Total Days',\r\n" + 
							"                    style: {\r\n" + 
							"                        color: Highcharts.getOptions().colors[0]\r\n" + 
							"                    }\r\n" + 
							"                },\r\n" + 
							"                labels: {\r\n" + 
							"                    style: {\r\n" + 
							"                        color: Highcharts.getOptions().colors[0]\r\n" + 
							"                    }\r\n" + 
							"                },\r\n" + 
							"                opposite: true\r\n" + 
							"            }],\r\n" + 
							"            legend: {\r\n" + 
							"                enabled: !0,\r\n" + 
							"                align: \"right\",\r\n" + 
							"                layout: \"horizontal\",\r\n" + 
							"                labelFormatter: function() {\r\n" + 
							"                    return this.name\r\n" + 
							"                },\r\n" + 
							"                borderColor: false,\r\n" + 
							"                borderRadius: 0,\r\n" + 
							"                navigation: {\r\n" + 
							"                    activeColor: \"#274b6d\",\r\n" + 
							"                    inactiveColor: \"#CCC\"\r\n" + 
							"                },\r\n" + 
							"                shadow: false,\r\n" + 
							"                itemStyle: {\r\n" + 
							"                    color: \"#888888\",\r\n" + 
							"                    fontSize: \"12px\",\r\n" + 
							"                    fontWeight: \"normal\"\r\n" + 
							"                },\r\n" + 
							"                itemHoverStyle: {\r\n" + 
							"                    color: \"#000\"\r\n" + 
							"                },\r\n" + 
							"                itemHiddenStyle: {\r\n" + 
							"                    color: \"#CCC\"\r\n" + 
							"                },\r\n" + 
							"                itemCheckboxStyle: {\r\n" + 
							"                    position: \"absolute\",\r\n" + 
							"                    width: \"12px\",\r\n" + 
							"                    height: \"12px\"\r\n" + 
							"                },\r\n" + 
							"                symbolHeight: 10,\r\n" + 
							"                symbolWidth: 10,\r\n" + 
							"                symbolPadding: 5,\r\n" + 
							"                verticalAlign: \"bottom\",\r\n" + 
							"                x: 0,\r\n" + 
							"                y: 0,\r\n" + 
							"                title: {\r\n" + 
							"                    style: {\r\n" + 
							"                        fontWeight: \"normal\"\r\n" + 
							"                    }\r\n" + 
							"                }\r\n" + 
							"            },\r\n" + 
							"    \r\n" + 
							"            tooltip: {\r\n" + 
							"                shared: true,\r\n" + 
							"                backgroundColor: '#ffffff',\r\n" + 
							"                borderColor: '#f0f0f0',\r\n" + 
							"                shadow: true\r\n" + 
							"            },\r\n" + 
							"             credits: {\r\n" + 
							"                enabled: false,\r\n" + 
							"            },\r\n" + 
							"    \r\n" + 
							"            series: [{\r\n" + 
							"                name: 'Total Days',\r\n" + 
							"                type: 'spline',\r\n" + 
							"                yAxis: 1,\r\n" + 
							"                data: [49.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6],\r\n" + 
							"                tooltip: {\r\n" + 
							"                    pointFormat: '<span style=\"font-weight: bold; color: {series.color}\">{series.name}</span>: '\r\n" + 
							"                }\r\n" + 
							"            }, {\r\n" + 
							"                name: 'Total Days error',\r\n" + 
							"                type: 'errorbar',\r\n" + 
							"                yAxis: 1,\r\n" + 
							"                data: [[48, 51], [68, 73], [92, 110], [128, 136], [140, 150], [171, 179], [135, 143]],\r\n" + 
							"                tooltip: {\r\n" + 
							"                    pointFormat: '(error range: {point.low}-{point.high})<br/>'\r\n" + 
							"                }\r\n" + 
							"            }, {\r\n" + 
							"                name: 'User Count',\r\n" + 
							"                type: 'column',\r\n" + 
							"                data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2],\r\n" + 
							"                tooltip: {\r\n" + 
							"                    pointFormat: '<span style=\"font-weight: bold; color: {series.color}\">{series.name}</span>: <b>{point.y:.1f}</b> '\r\n" + 
							"                }\r\n" + 
							"            }, {\r\n" + 
							"                name: 'User Count error',\r\n" + 
							"                type: 'errorbar',\r\n" + 
							"                data: [[6, 8], [5.9, 7.6], [9.4, 10.4], [14.1, 15.9], [18.0, 20.1], [21.0, 24.0], [23.2, 25.3]],\r\n" + 
							"                tooltip: {\r\n" + 
							"                    pointFormat: '(error range: {point.low}-{point.high})<br/>'\r\n" + 
							"                }\r\n" + 
							"            }]\r\n" + 
							"        });\r\n" + 
							"    });\r\n" + 
							"    </script>\r\n" + 
							"    <!-- Scripts Ends -->\r\n" + 
							"    <!-- Javascript for Datepicker -->\r\n" + 
							"    <script type=\"text/javascript\" language=\"javascript\" src=\"components/datetimepicker/js/moment-with-locales.js\"></script>\r\n" + 
							"    <script type=\"text/javascript\" language=\"javascript\" src=\"components/datetimepicker/js/bootstrap-datetimepicker.js\"></script>\r\n" + 
							"    <script>\r\n" + 
							"        // Linked date and time picker \r\n" + 
							"        // start date date and time picker \r\n" + 
							"        $('#datepicker-default').datetimepicker();\r\n" + 
							"        $(\".auto-update-year\").html(new Date().getFullYear());\r\n" + 
							"    </script> \r\n" + 
							"    \r\n" + 
							"    \r\n" + 
							"    </body></html>");
				}
			}
					} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*try {
			PrintWriter out=response.getWriter();

			String sql="select fname,lname,P_address,C_address,Mobile,Telephone,Email,UserType from user";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin", "root", "");
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				out.print("<tr><td>");
				out.println(rs.getString(1));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString(2));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString(3));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString(4));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString(5));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString(6));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString(7));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString(8));
				out.print("</td></tr>");
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

}
