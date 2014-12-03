package demo;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/exemplo")
public class HelloParams {
	
	@GET 
	@Path("/id/{num}")
	public String getParam(@PathParam("num") String num) {
		  return "Exemplo @PathParam: " + num;
	}
	
	@GET 
	@Path("/id")
	public String getQuery(@QueryParam("num") String num) {
		
		return "Exemplo @QueryParam: " + num;
	}
	

}
