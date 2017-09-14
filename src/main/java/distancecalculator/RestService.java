package distancecalculator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/")
public interface RestService {

    @GET
    @Path("info")
    String echo(@QueryParam("q") String message);

}
