package distancecalculator;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@ApplicationScoped
@Path("/")
public class Rest implements RestService{

    @GET
    @Path("{message}")
    public String echo(@PathParam("message") String message) {
        return message;
    }
}
