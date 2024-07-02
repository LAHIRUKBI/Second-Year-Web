package seller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login_seller_servlet")
public class seller_login_servlet extends HttpServlet {
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
		
		isTrue = sellerDButi.validate(username, password);
		
		if (isTrue == true) {
			
			List<seller> seller_details = sellerDButi.getseller(username);	
			
			request.setAttribute("seller_details", seller_details);
			
			RequestDispatcher dis = request.getRequestDispatcher("seller_index.jsp");
			
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
