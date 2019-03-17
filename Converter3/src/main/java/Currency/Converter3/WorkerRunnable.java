package Currency.Converter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

import javax.servlet.ServletContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;



/**
 * Handle tcp connection,
 * returns currency conversion
 */
public class WorkerRunnable implements Runnable{
   
    
    protected Socket clientSocket = null;
    protected DataSet ds          = null;
    protected Result rs           = null;

    public WorkerRunnable(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public void run() {
        try {
            InputStream input  = clientSocket.getInputStream();
            OutputStream output = clientSocket.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(input));
            Boolean end   =  false;
            
            String bnrUrl="https://www.bnro.ro/nbrfxrates.xml";	
  		    Client client2 = ClientBuilder.newClient(); 
  		    WebTarget myResource = client2.target(bnrUrl); 
  		    
  		    output.write(("Examples :EUR,USD,AUD etc\n").getBytes());           
  		    output.write(("Please enter 1 currency to convert to RON or enter exit:").getBytes()); 		    
  		    while(!end) {
  		       String moneda1 =br.readLine();
  		       if(!moneda1.equals("exit")&& moneda1!=null){
  		           //Send GET request to BNR server
  		    	   ds =myResource.request(MediaType.APPLICATION_XML) .get(DataSet.class);
  		           //Find exchage rate
  		    	   rs=ExchangeRateUtil.findExchangeRate(ds.getBody().getCube(),moneda1);
  		           long time = System.currentTimeMillis();
  		           System.out.println("Request processed: " + time);
  		           //Return result
  		           output.write(("TCP sever OK n\nWorkerRunnable: " + rs.getMoneda1() +" "+rs.getMoneda2()+"\n").getBytes());
  		           output.write(("Please enter currency to convert to RON or enter exit:").getBytes());
  		       }else if (moneda1.equals("exit")) {
  		    	   end=true;
  		    	   output.write(("TCP server OK\n Exiting....").getBytes());
  		       }
  		    }
            output.close();
            input.close();         
      
        } catch (Exception e) {
            //report exception somewhere.
            e.printStackTrace();                   
        }
    }
}