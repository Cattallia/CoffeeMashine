package org.itstep;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CoffeMakerTest {

	@Test
	void testMakeCoffee() {
		Drink drink1 = new Drink("Espresso", 700);
		Drink drink2 = new Drink("Americano", 100);
		Drink drink3 = new Drink("Late", 200);
		Drink drink4 = new Drink("Cappuccino", 690);
		
		ArrayList<Drink> drinks = new ArrayList<>();
		drinks.addAll(Arrays.asList(drink1,drink2,drink3,drink4));
		CoffeMaker maker = new CoffeMaker();
		maker.setDrinks(drinks);
		maker.makeCoffee(550);
		
		
	}

}
