package admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ Delect_admin_servlet")
public class Delect_admin_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter ("id");
		
		boolean isTrue;
		
		
		isTrue = adminDButi.delectAdmin(id);
		
		if ( isTrue = true)
		{
	
			
			RequestDispatcher dis = request.getRequestDispatcher("admin_property_insert.jsp");
			dis.forward(request, response);
		}
		
		else
		{
			List <admin> addetails = adminDButi.getadmindetails(id);
			request.setAttribute("addetails", addetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("admin_account.jsp");
			dis.forward(request, response);
		}
		
		
		
	}}
		
		
		