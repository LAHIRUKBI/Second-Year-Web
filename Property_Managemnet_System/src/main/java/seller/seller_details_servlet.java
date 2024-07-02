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


@WebServlet("/seller_details_servlet")
public class seller_details_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String username = request.getParameter("sellername");
			
			List<seller> seller_details = sellerDButi.getseller(username);	
			
			request.setAttribute("seller_details", seller_details);
			
			RequestDispatcher dis = request.getRequestDispatcher("seller_account.jsp");
			
			dis.forward(request, response);
		}
				
	}

