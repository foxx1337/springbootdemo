package tv.lastpixel;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import tv.lastpixel.resources.HealthResource;

import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("/v1")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(HealthResource.class);
        register(NotFoundExceptionHandler.class);
    }
}
