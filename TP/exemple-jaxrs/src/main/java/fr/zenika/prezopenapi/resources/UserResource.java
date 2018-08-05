package fr.zenika.prezopenapi.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import fr.zenika.prezopenapi.core.User;

@Path("/user")
@Produces({"application/json"})
public class UserResource {

  @GET
  @Path("/{userId}")
  public User getUserById(@PathParam("userId") Long petId) {
      // return pet
      return new User();
  }

  @POST
  @Consumes("application/json")
  public Response addUser(User user) {
    // add pet
    return Response.ok().build();
  }
}
