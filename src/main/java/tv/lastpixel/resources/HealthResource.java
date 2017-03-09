package tv.lastpixel.resources;

import tv.lastpixel.swagger.api.HealthApi;
import tv.lastpixel.swagger.model.Health;

import javax.ws.rs.core.Response;


public class HealthResource extends HealthApi {
    @Override
    public Response health() {
        return Response.ok(new Health().status("ok").age(0)).build();
    }
}
