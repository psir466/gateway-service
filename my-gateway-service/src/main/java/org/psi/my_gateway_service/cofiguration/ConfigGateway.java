package org.psi.my_gateway_service.cofiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;



@Configuration
public class ConfigGateway {

/*@Bean

// config classique la gateway connait le nom des service
RouteLocator gatewayRoutes(RouteLocatorBuilder builder){

    return builder.routes()
                    .route (r->r.path("/accounts/**").uri("lb://ACCOUNTS_LIST"))
                    .route (r->r.path("/account/**").uri("lb://ACCOUNT_BY_ID"))
                    .route (r->r.path("/accountSumDate/**").uri("lb://ACCOUNT_SUM_DATE"))
                    .route (r->r.path("/accountByTypeSumDate/**").uri("lb://ACCOUNT_TYPE_SUM_DATE"))
                    .route (r->r.path("/accountTypes/**").uri("lb://ACCOUNT_TYPES"))
                    .route (r->r.path("/saveaccounts/**").uri("lb://ACCOUNT_SAVE"))
                    .route (r->r.path("/markets/**").uri("lb://MARKETS"))
                    .build();

    }*/


    // config route dynamique

    @Bean
    DiscoveryClientRouteDefinitionLocator dynamicRoutes(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties dlp){


        return new DiscoveryClientRouteDefinitionLocator(rdc, dlp);

    }

}
