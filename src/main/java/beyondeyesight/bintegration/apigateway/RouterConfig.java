package beyondeyesight.bintegration.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class RouterConfig {

    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/iam")
                        .uri("https://dev.bintegration.so:8443"))
//                .route(p -> p
//                        .path("/resources")
//                        .uri("https://dev.bintegration.so:8443/resources"))
                .build();
    }
}
