package admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/admin_details_servlet")
public class admin_details_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String username = request.getParameter("adminName");
			
			List<admin> addetails = adminDButi.getadmin(username);	
			
			request.setAttribute("addetails", addetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("admin_account.jsp");
			
			dis.forward(request, response);
		}
				
	}

