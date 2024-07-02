package admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Update_admin_serverlet")
public class Update_admin_serverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter ("id");
		String name = request.getParameter ("name");
		String email = request.getParameter ("email");
		String phone = request.getParameter ("phone");
		String username = request.getParameter ("username");
		String password = request.getParameter ("password");
		
		boolean isTrue;
		
		isTrue = adminDButi.updateadmin(id, name, email, phone, username, password);
		
		if ( isTrue = true)
		{
			List <admin> addetails = adminDButi.getadmindetails(id);
			request.setAttribute("addetails", addetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("admin_account.jsp");
			dis.forward(request, response);
		}
		
		else {
			
			{
				List <admin> addetails = adminDButi.getadmindetails(id);
				request.setAttribute("addetails", addetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("admin_details.jsp");
			dis.forward(request, response);
		}
	}

}}
