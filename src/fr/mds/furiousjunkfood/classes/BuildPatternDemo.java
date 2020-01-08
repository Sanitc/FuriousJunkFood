package fr.mds.furiousjunkfood.classes;

public class BuildPatternDemo {	
	public static void main(String[] args) {
		
		MealBuilder monMealVege = new MealBuilder();
		MealBuilder monMeal = new MealBuilder();
		MealBuilder monMealPerso = new MealBuilder();
		
		System.err.println("---------------");
		
		//Menu vegetarien
		Meal vegMenu = monMealVege.prepareVegMeal().build();
		System.out.println("Menu vegetarien");
		vegMenu.showItems();
		System.out.println("Prix total : "+ vegMenu.getCost() + " €");
		
		System.err.println("---------------");
		
		//Menu normal
		Meal carneMenu = monMeal.prepareNonVegMeal().build();
		System.out.println("Menu normal");
		carneMenu.showItems();
		System.out.println("Prix total : "+ carneMenu.getCost() + " €");
		
		System.err.println("---------------");
		
		//Menu personalise
		Meal menuPerso = monMealPerso.prepareNonVegMeal().addItem(new ChickenBurger()).build();
		System.out.println("Menu perso");
		menuPerso.showItems();
		System.out.println("Prix total : "+ menuPerso.getCost() + " €");
		
		System.err.println("---------------");
		
	}
}
