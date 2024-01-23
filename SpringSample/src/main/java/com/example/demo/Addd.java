package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;



@Component
public class Addd {
@Lazy
	public int addition(int a, int b) {
		return a+b;
	
	}


}
