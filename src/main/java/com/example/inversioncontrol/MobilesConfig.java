package com.example.inversioncontrol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobilesConfig {
	
	@Bean
	public Mobiles getOnePlus(Cost getCost)
	{
		return new OnePlus(getCost);
	}
	
	@Bean
	public Mobiles getIphone(Cost getCost)
	{
		return new Iphone(getCost);
	}
	@Bean
	public Cost getCost()
	{
		return new Cost();
	}
	
		

}
