package ah.myapp.server;

import ah.myapp.server.dm.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/person")
public class PersonResource
{

//    @GET
//    public String getName()
//    {
//        return "my name";
//    }

    @GET
    @Path("/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPersonById(@PathParam("id") int id)
    {
        if(id == 1)
        {
            return new Person(1234, "shumacher");
        }

        return new Person(4321, "drakula");
    }

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response Create(Person p)
    {
        return Response.status(200).entity("Person ID " + p.Id + " Name " + p.Name + " created").build();
    }
}

