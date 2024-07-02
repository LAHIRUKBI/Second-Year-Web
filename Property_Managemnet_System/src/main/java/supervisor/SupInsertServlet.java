package supervisor;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SupInsertServlet")
public class SupInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//catch date from supervisor insert page
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String branch = request.getParameter("bra");
        String username = request.getParameter("uid");
        String password = request.getParameter("psw");
        
        
        boolean isTrue;
        
        isTrue = SupDBUtil.insertsupervisor(name, email, phone, branch, username, password);
        
        if(isTrue == true) {
        	RequestDispatcher dis = request.getRequestDispatcher("SupLOGIN.jsp");
        	dis.forward(request, response);
        }
        else {
        	RequestDispatcher dis2 = request.getRequestDispatcher("Supinsert.jsp");
        	dis2.forward(request, response);
        }
		
	}

		
	}


