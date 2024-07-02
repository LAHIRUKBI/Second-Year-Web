package admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "property_insert", urlPatterns = { "/property_insert" })
public class property_insert extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = request.getParameter("title");
		String type = request.getParameter("type");
		String location = request.getParameter("location");
		String description = request.getParameter("description");
		String owner_name = request.getParameter("owner_name");
		String owner_phone = request.getParameter("owner_phone");
		String email = request.getParameter("email");
		String price  = request.getParameter("price");
	
		
		owner_phone = owner_phone.replaceAll("\\s", "");
		owner_name = owner_name.replaceAll("\\s", "");
				
		double totalcost = admin_Property_cost.calculateTotalCost(price);
		double discount = admin_Property_cost.calculate_discount(price);
		
		String states = "pending";
		
		boolean isTrue;
		
		isTrue = adminDButi.insert_property ( title, type,  location, description,owner_name,owner_phone,price,totalcost,discount,states );
		
		if (isTrue == true)
		{
			
			List <Property> pdetails= adminDButi.getpropertydetails();
			request.setAttribute("pdetails", pdetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("admin_property_details.jsp");
			dis.forward(request, response);
			
		} else
		
			
		{
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}

}
}
