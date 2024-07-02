package admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/update_advertistment_servlet")
public class update_advertistment_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pid = request.getParameter("pid");
		String title = request.getParameter("title");
		String type = request.getParameter("type");
		String location = request.getParameter("location");
		String description = request.getParameter("description");
		String owner_name = request.getParameter("owner_name");
		String owner_phone = request.getParameter("phone");		
		String price  = request.getParameter("price");
		
		String states  = "pending";
		
		owner_phone = owner_phone.replaceAll("\\s", "");
		owner_name = owner_phone.replaceAll("\\s", "");
				
		double totalcost=admin_Property_cost.calculateTotalCost(price);
		double discount = admin_Property_cost.calculate_discount(price);
		
		boolean isTrue;
		
		isTrue = adminDButi.updateadvertistment  ( pid,title, type,  location, description,owner_name,owner_phone,price,totalcost,states,discount );
		
		if ( isTrue = true)
		{
			List <Property> pdetails= adminDButi.getpropertydetails();
			request.setAttribute("pdetails", pdetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("admin_property_details.jsp");
			dis.forward(request, response);
		}
		
		else 
		
		{
			
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
			
		}
	}

}
