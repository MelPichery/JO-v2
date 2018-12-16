package org.tutorial.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.tutorial.beans.User;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginOK")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//instanciation user avec les paramètres admin et password
		User u = new User("admin","password");
		
		//récupération des paramètres dans des varibles
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		/*si les variables sont égales à admin,password alors on récupére la session
		*on envoie l'attribut de la session username et l'utilisateur est redirigé sur userAccueil
		 sinon l'utilisateur est renvoyé vers l'accueil*/
		if (username.equals(u.getUsername()) && password.equals(u.getPassword())) {
			
			HttpSession session = request.getSession();
			session.setAttribute("username",username);
			
			response.sendRedirect("accueil/userAccueil.jsp");
			
		}else {
			
			response.sendRedirect("accueil/accueil.jsp");
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
