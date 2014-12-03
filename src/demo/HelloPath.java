package demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;



@Path("/hello")
public class HelloPath {
	
	@GET 
	public String getHello() {
		  return "Hello";
	}
	
	@GET()
	@Path("/benfica")
	public String getBenfica() {
		  return "Hello SLB";
	}
	
	@GET()
	@Path("/sporting")
	public String getSporting() {
		  return "Hello SCP";
	}
	
	@GET()
	@Path("/porto")
	public String getPorto() {
		  return "Hello FCP";
	}
	

}
