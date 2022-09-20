package com.example.inversioncontrol;

public class OnePlus implements Mobiles {
	Cost cost;
	OnePlus(Cost cost){
		this.cost = cost;
	}

	@Override
	public void getModel() {
		// TODO Auto-generated method stub
		System.out.println("model : 11pro");

	}

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
		System.out.println("color : white");
		cost.getOnePlusCost();

	}

}
