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

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isTrue;
		
		isTrue = adminDButi.validate(username, password);
		
		if (isTrue == true) {
			
			List<admin> addetails = adminDButi.getadmin(username);	
			
			request.setAttribute("addetails", addetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("admin_index.jsp");
			
			dis.forward(request, response);
		}
		

		else {
			
			out.println("<script type = 'text/javascript'>");
			out.println("alert ('your username or password is incorrect');");
			
			out.println ("location = 'login.jsp'");
			
			out.println ("</script>");
			
		}
		
		
	}

}
