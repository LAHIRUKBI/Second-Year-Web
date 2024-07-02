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


@WebServlet("/update_seller_servlet")
public class update_seller_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String id = request.getParameter ("id");
		String name = request.getParameter ("name");
		String email = request.getParameter ("email");
		String phone = request.getParameter ("phone");
		String username = request.getParameter ("username");
		String password = request.getParameter ("password");
		
		boolean isTrue;
		
		isTrue = sellerDButi.updateseller(id, name, email, phone, username, password);
		
		if ( isTrue = true)
		{
			List <seller> seller_details = sellerDButi.getseller(username);	
			
			request.setAttribute("seller_details",seller_details);
			
			RequestDispatcher dis = request.getRequestDispatcher("seller_account.jsp");
			dis.forward(request, response);
		}
		
		else {
			
			
				List <seller> seller_detail = sellerDButi.getseller(username);	
				request.setAttribute("seller_detail",seller_detail);
			
			RequestDispatcher dis = request.getRequestDispatcher("seller_account.jsp");
			dis.forward(request, response);
		
	
		}}
}
