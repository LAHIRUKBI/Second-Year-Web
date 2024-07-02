package seller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/seller_advertistment_delect_servlet")
public class seller_advertistment_delect_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pid = request.getParameter ("pid");
		String owner_name = request.getParameter("owner");
		String owner_phone = request.getParameter("phone");
		
		boolean isTrue;
		
		
		isTrue = sellerDButi.delectAdvertistment(pid);
		
		
		if ( isTrue = true)
		{
	
			
			RequestDispatcher dis = request.getRequestDispatcher("seller_property_insert.jsp");
			dis.forward(request, response);
		}
		
		else
		{
			List <Property> pdetails= sellerDButi.get_all_advertistment ( owner_name, owner_phone );
			request.setAttribute("pdetails", pdetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("seller_advertistments.jsp");
			dis.forward(request, response);
		}
		
		
		
	}}
		
		
		