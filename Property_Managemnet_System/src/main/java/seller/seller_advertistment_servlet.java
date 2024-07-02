package seller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class approve_property_servlet
 */
@WebServlet("/seller_advertistmentt_servlet")
public class seller_advertistment_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        
		

		String owner_name = request.getParameter("owner");
		String owner_phone = request.getParameter("phone");

    
			List <Property> pdetails= sellerDButi.get_all_advertistment ( owner_name, owner_phone );
			request.setAttribute("pdetails", pdetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("seller_advertistments.jsp");
			dis.forward(request, response);
			
	}}
    	