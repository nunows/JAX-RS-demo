package demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/helloworld")
public class HelloWorld {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTxt() {
		return "Hello World";
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHtml() {
		return "<html> " + "<title>" + "Hello World" + "</title>"
				+ "<body><h1>" + "Hello World" + "</body></h1>" + "</html> ";
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public String getXml() {
		return "<?xml version=\"1.0\"?>" + "<hello> Hello World" + "</hello>";
	}

}
