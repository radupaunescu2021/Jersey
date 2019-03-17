package Currency.Converter3;

import java.io.StringReader;
import java.util.List;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import Currency.Converter3.DataSet.Body.Cube.Rate;

/**
 * Root resource (exposed at "curs" path)
 * Handles GET requests
 */
@Path("curs")
public class MyResource {
	 /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "JSON" media type.
     *
     */  
	
	@Context 
	ServletContext context;
    
	
	@GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public Result noParam(){
		Result rs =new Result();
		rs.setMoneda1("Query param /{moneda1} is mandatory,please add parameter to request");
		return rs;
		
	}
	
    @GET
    @Path("/{moneda1}")
    @Produces(MediaType.APPLICATION_JSON)
    public Result convert(@PathParam("moneda1") String moneda1,@QueryParam("transform") String moneda2) throws JAXBException
    {     
    	  DataSet ds2=null;
          String bnrUrl="https://www.bnro.ro/nbrfxrates.xml";	
          Result rs =new Result();
		  Client client2 = ClientBuilder.newClient(); 
		  WebTarget myResource = client2.target(bnrUrl); 
          
     	  System.out.println( "Hello World! accessing bnr currency exchange" );
          //Send GET request to BNR server	
		  try { 
			  ds2 =myResource.request(MediaType.APPLICATION_XML) .get(DataSet.class);
			  //Cache response
			  context.setAttribute("cache", ds2);
          }catch(Exception e) {
        	  System.out.println(e.getMessage());
			  System.out.println("Cached response");
			  //If server is not available get Data from cache
			  if(context.getAttribute("cache") != null) {
				 ds2=(DataSet) context.getAttribute("cache");
			  }			 
		  }
			  if(ds2==null && context.getAttribute("cache") != null) {
				  ds2=(DataSet) context.getAttribute("cache");
			  }
		 //Find specific exchange rate from the server XML response
		  try{			 
			 if(moneda2==null) {
				 rs=ExchangeRateUtil.findExchangeRate(ds2.getBody().getCube(),moneda1.toUpperCase());
			 }else {
				 rs=ExchangeRateUtil.findExchangeRate(ds2.getBody().getCube(),moneda1.toUpperCase(),moneda2);
			 }
			 System.out.println( "Finishing" );
    	  }catch(Exception e){
    		  System.out.println(e.getMessage());
    		  return rs;
    	  }
			 return rs;
		
        
    }
     
}
