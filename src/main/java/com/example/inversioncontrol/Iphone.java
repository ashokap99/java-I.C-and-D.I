package com.example.inversioncontrol;

public class Iphone implements Mobiles {
	
	Iphone()
	{
		System.out.println("Iphone constructor triggered");
	}
	Cost cost;
	Iphone(Cost cost){
		this.cost = cost;
	}

	@Override
	public void getModel() {
		// TODO Auto-generated method stub
		System.out.println("model : 14pro");
		//System.out.println("object creatd for Iphone");

	}

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
		System.out.println("color : black");
		cost.getIphoneCost();
     
	}

}
