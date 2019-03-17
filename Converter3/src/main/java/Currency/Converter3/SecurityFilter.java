package Currency.Converter3;

import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

import javax.annotation.Priority;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.glassfish.jersey.internal.util.Base64;
/**
 * Security filter with Basic Authentification
 * 
 */
@Provider
@PreMatching
public class SecurityFilter  implements ContainerRequestFilter{
    public static String AUTHORISATION_HEADER_KEY="Authorization";
    public static String AUTHORISATION_HEADER_PREFIX="Basic ";
    
    
	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		// TODO Auto-generated method stub
		List<String>authHeader=requestContext.getHeaders().get(AUTHORISATION_HEADER_KEY);
		if(authHeader!=null && authHeader.size()>0 ) {
			//Retrieve username and password from the request header
			String authToken = authHeader.get(0);
			authToken = authToken.replaceFirst(AUTHORISATION_HEADER_PREFIX,"");
			String decodedString = Base64.decodeAsString(authToken);
			StringTokenizer tokenizer = new StringTokenizer(decodedString,":");			
			String username = tokenizer.nextToken();
			String password = tokenizer.nextToken();
			
			//Check if correct credentials
			if("user".equals(username) && "password".equals(password)) {
				return;
			}
			Response unauthorizeStatus = Response
                    .status(Response.Status.UNAUTHORIZED)
                    .entity("User can not access resource")
                    .build();
            requestContext.abortWith(unauthorizeStatus);		                     
		}
		Response unauthorizeStatus = Response
                .status(Response.Status.UNAUTHORIZED)
                .entity("User can not access resource")
                .build();
        requestContext.abortWith(unauthorizeStatus);
		
	}

}
