package fr.mds.furiousjunkfood.classes;

import fr.mds.furiousjunkfood.interfaces.Item;

public class MealBuilder {
	
	private Meal monMenu = new Meal();
	
	public MealBuilder prepareVegMeal() {
		VegBurger burgerVege = new VegBurger();
		Pepsi monPepsi = new Pepsi();
		
		this.monMenu.addItem(monPepsi);
		this.monMenu.addItem(burgerVege);
		return this;
	}
	
	public MealBuilder prepareNonVegMeal() {
		ChickenBurger burgerCarne = new ChickenBurger();
		Coke monBreizhCoca = new Coke();
		
		this.monMenu.addItem(monBreizhCoca);
		this.monMenu.addItem(burgerCarne);		
		return this;
		
	}
		
	public MealBuilder addItem(Item item) {
		this.monMenu.addItem(item);
		return this;
	}
	
	public Meal build() {
		return this.monMenu;
	}

}
