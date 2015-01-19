package ah.myapp.server;

import ah.myapp.server.dm.Person;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/person")
public class PersonResource
{
    @GET
    public String getName()
    {
        return "my name";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response Create(Person p)
    {
        return Response.status(200).entity("Person ID " + p.Id + " Name " + p.Name + " created").build();
    }
}

