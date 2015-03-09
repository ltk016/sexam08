package webapp;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
@WebListener
public class MyListener implements ServletContextListener {

	static Log log = LogFactory.getLog(MyListener.class);

	/**
	 * Default constructor.
	 */
	public MyListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {
		log.info("##########################");
		log.info("contextDestroyed()");
		log.info("##########################");
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent sce) {
		log.info("##########################");
		log.info("contextInitialized()");
		log.info("##########################");

		ServletContext application = sce.getServletContext();

		application.setAttribute("className", application.getInitParameter("className"));
		application.setAttribute("url", application.getInitParameter("url"));
		application.setAttribute("user", application.getInitParameter("user"));
		application.setAttribute("password", application.getInitParameter("password"));
	}
}
