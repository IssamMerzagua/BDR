package fr.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Autowired
    private JwtCustomFilter customJwtFilter;

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/catalogue/**")
                        .filters(f ->
                                f.addRequestHeader("header-1", "value1")
                                 .addResponseHeader("header-response-1", "value-response-1")
                                 )
                        .uri("http://localhost:8081"))
                .route(r -> r.path("/catalogue/**")
                        .uri("http://localhost:8081"))
                .route(r -> r.path("/**")
                        .uri("http://localhost:8081"))
                .build();
    }
}