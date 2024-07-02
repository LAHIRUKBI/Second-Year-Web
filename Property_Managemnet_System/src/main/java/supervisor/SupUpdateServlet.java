package supervisor;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SupUpdateServlet")
public class SupUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("supid");
	    String name = request.getParameter("name");
	    String email = request.getParameter("email");
	    String phone = request.getParameter("phone");
	    String branch = request.getParameter("branch");
	    String username = request.getParameter("uname");
	    String password = request.getParameter("pass");

	    boolean isTrue;
	    isTrue = SupDBUtil.updatesupervisor(id, name, email, phone, branch, username, password);

	    if (isTrue) {
	        // Set updated supervisor details as request attribute
	        List<Supervisor> supervisorDetails = SupDBUtil.getSupervisorDetails(id);
	        request.setAttribute("supDetails", supervisorDetails);

	        RequestDispatcher dis = request.getRequestDispatcher("Supaccount.jsp");
	        dis.forward(request, response);
	    } else {
	        RequestDispatcher dis2 = request.getRequestDispatcher("SupUPDATE.jsp");
	        dis2.forward(request, response);
	    }

}
	}
