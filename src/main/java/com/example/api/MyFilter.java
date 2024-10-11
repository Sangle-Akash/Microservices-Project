package com.example.api;

import java.util.List;
import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;
@Component
public class MyFilter implements GlobalFilter {
           
	@Override
		    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

		        System.out.println("filter() - executed.....");

//		        // validate request
//		        ServerHttpRequest request = exchange.getRequest();
//		        Set<String> queryParams = request.getQueryParams().keySet();
//
//		        if (!queryParams.contains("Secret")) {
//		            throw new RuntimeException("Invalid Request");
//		        }
//
//		        List<String> secretValues = request.getQueryParams().get("Secret");
//		        if (!secretValues.get(0).equals("Akash@123")) {
//		            throw new RuntimeException("Invalid Request");
//		        }

		        return chain.filter(exchange);
		    }
}
