package ah.myapp.server;

import ah.myapp.server.dm.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

import java.util.List;

@Path("/person")
public class PersonResource
{
    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAllPersons()
    {
        Person p1 = new Person(444455, "King Crimson");
        Person p2 = new Person(1212112, "Queen Jersey");
        mPersons.add(p1);
        mPersons.add(p2);

        return mPersons;
    }


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

    private List<Person> mPersons = new ArrayList<Person>();
}

