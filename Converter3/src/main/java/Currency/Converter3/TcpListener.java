package Currency.Converter3;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class TcpListener
 * 
 * Starts the ThreadPoolServer tcp
 * 
 */
public class TcpListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
	ThreadPooledServer server ;
    public TcpListener() {
        // TODO Auto-generated constructor stub
    	//Instantiate threapool server with port 9000
    	server= new ThreadPooledServer(9000);
    	
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	System.out.println("Stopping Server");
    	server.stop();
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	
    	new Thread(server).start();

    }
    
	
}
