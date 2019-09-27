package com.everis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.everis.filter.ErrorFilter;
import com.everis.filter.PostFilter;
import com.everis.filter.PreFilter;
import com.everis.filter.RouteFilter;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayApplication.class, args);
	}
	
	@Bean
	public PreFilter preFilter() {
	  return new PreFilter();
	}
	
	@Bean PostFilter postFilter() {
	  return new PostFilter();
	}
	
	@Bean
	public ErrorFilter errorFilter() {
	  return new ErrorFilter();
	}
	
	@Bean
	public RouteFilter routeFilter() {
	  return new RouteFilter();
	}

}
