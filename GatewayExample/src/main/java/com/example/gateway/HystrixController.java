package com.example.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HystrixController {

@RequestMapping("/orderfallback")
public Mono<String> orderserverfallback(){
	return Mono.just("The Order service is down");
}
@RequestMapping("/paymentfallback")
public Mono<String> paymentserverfallback(){
	return Mono.just("The Order service is down");
}
}
