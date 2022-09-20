package com.example.inversioncontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class InversionControlApplication {

	public static void main(String[] args) {
		//Spring Bean Container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MobilesConfig.class);
		
		Mobiles mob = context.getBean("getOnePlus",Mobiles.class);
		mob.getModel();
		mob.getColor();
		Mobiles mobi = context.getBean("getIphone",Mobiles.class);
		mobi.getModel();
		mobi.getColor();
	
		
	}

}
 