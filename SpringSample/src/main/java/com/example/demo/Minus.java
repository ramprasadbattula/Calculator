package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component


public class Minus {
	@Bean
	@Lazy
	public int sub(int a, int b) {
		
		return a-b;
	}

}
