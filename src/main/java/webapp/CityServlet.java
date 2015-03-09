package webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CityServlet
 */
// 1. 정확한 맵핑(/city)
// 2. 확장자 맵핑(/city.do, *.do)
// 3. 경로 맵핑(/city/*)
@WebServlet("/city")
public class CityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CityServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	String className;
	String url;
	String user;
	String password;

	@Override
	public void init(ServletConfig config) throws ServletException {
		ServletContext application = config.getServletContext();
		
		className = (String) application.getAttribute("className");
		url = (String) application.getAttribute("url");
		user = (String) application.getAttribute("user");
		password = (String) application.getAttribute("password");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String myName = request.getParameter("name");
				
		out.println("<h1>" + myName + "</h1>");
		out.println("<div>className = " + className + "</div>");
		out.println("<div>url = " + url + "</div>");
		out.println("<div>user = " + user + "</div>");
		out.println("<div>password = " + password + "</div>");
	}

}
