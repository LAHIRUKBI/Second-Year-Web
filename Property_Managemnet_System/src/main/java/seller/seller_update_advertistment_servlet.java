package seller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/seller_update_advertistment_servlet")
public class seller_update_advertistment_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pid = request.getParameter("pid");
		String title = request.getParameter("title");
		String type = request.getParameter("type");
		String location = request.getParameter("location");
		String description = request.getParameter("description");
		String owner = request.getParameter("owner");
		String owner_phone = request.getParameter("phone");		
		String price  = request.getParameter("price");
		
		String states  = "pending";


				
		double totalcost=Property_cost.calculateTotalCost(price);
		double discount = Property_cost.calculate_discount(price);
		
		boolean isTrue;
		
		isTrue = sellerDButi.updateadvertistment  ( pid,title, type,  location, description,owner,owner_phone,price,totalcost,states,discount );
		
		if ( isTrue = true)
		{
			List <Property> pdetails= sellerDButi.get_all_advertistment ( owner, owner_phone );
			request.setAttribute("pdetails", pdetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("seller_advertistment.jsp");
			dis.forward(request, response);
		}
		
		else 
		
		{
			
			{
			
		}
	}

}}
