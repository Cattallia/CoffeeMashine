package org.itstep;

import java.util.ArrayList;

public class CoffeMaker {

	private ArrayList<Drink> drinks;

	public ArrayList<Drink> getDrinks() {
		return drinks;
	}

	public void setDrinks(ArrayList<Drink> drinks) {
		this.drinks = drinks;

	}

	public void makeCoffee(int money) {
		int minValue = Integer.MAX_VALUE;
		for (Drink drink : drinks) {
			if (minValue >= drink.getPrice()) {
				minValue = drink.getPrice();
			}
		}
			if (minValue > money) {
				System.out.println("You shoud input"+(minValue-money)+"  yet!");
				return; 
			}
			for (Drink drink : drinks) {
				if (money>=drink.getPrice()) {
					System.out.println("You can buy "+drink.getName() +" and take "+(money-drink.getPrice())+" back!");
				}
			}
			
	}
}
