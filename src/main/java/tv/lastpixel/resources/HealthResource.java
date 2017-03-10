package tv.lastpixel.resources;

import tv.lastpixel.swagger.api.HealthApi;
import tv.lastpixel.swagger.model.Health;

import javax.ws.rs.core.Response;


public class HealthResource extends HealthApi {

    @Override
    public Response getHealth() {
        return Response.ok(new Health().status("ok").age(0)).build();
    }

    @Override
    public Response putHealth(String phoey) {
        return Response.status(Response.Status.CREATED).entity("just got " + phoey + " as arg").build();
    }
}
