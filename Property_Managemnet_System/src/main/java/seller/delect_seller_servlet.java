package seller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/delect_seller_servlet")
public class delect_seller_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter ("id");
		
		boolean isTrue;
		
		
		isTrue = sellerDButi.delectseller(id);
		
		if ( isTrue = true)
		{
	
			
			RequestDispatcher dis = request.getRequestDispatcher("seller_login.jsp");
			dis.forward(request, response);
		}
		
		else
		{
			List <seller> addetails = sellerDButi.getseller(id);
			request.setAttribute("addetails", addetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("seller_account.jsp");
			dis.forward(request, response);
		}
		
		
		
	}}
		
		
		