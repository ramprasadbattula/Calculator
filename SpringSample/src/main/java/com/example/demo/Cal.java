package com.example.demo;

import java.util.Scanner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cal implements CommandLineRunner {
	@Autowired
	private Addd ad;
	@Autowired
	private Minus s;
	@Override
    public void run(String... args) {
		while(true) {
		System.out.println("What do you want to perform:\n 1) Addition \n 2)Subtraction ");
		Scanner in= new Scanner(System.in);
		int x=in.nextInt();
		 int a,b;
		if (x==1) {
			System.out.println("Enter numbers to add");
			a= in.nextInt();
			b=in.nextInt();
			System.out.println("Addition :" + ad.addition(a,b));
			
		}
		else if (x==2) {
			System.out.println("Enter numbers to Substract");
			 a= in.nextInt();
			b=in.nextInt();
			System.out.println("Substraction :" + s.sub(a,b));
			
		}
		else {
			System.out.println("Invalid Choice!!! Enter correct option either 1 or 2....");
		}
		}

	}
	}


