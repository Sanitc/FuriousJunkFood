package fr.mds.furiousjunkfood.classes;

public class BuildPatternDemo {	
	public static void main(String[] args) {
		
//		Pepsi peps = new Pepsi();
//		System.out.println(peps);
//		
//		VegBurger veg = new VegBurger();
//		System.out.println(veg);
//		
//		Coke coca = new Coke();
//		System.out.println(coca);
//		
//		ChickenBurger chick = new ChickenBurger();
//		System.out.println(chick);
		
		System.err.println("---------------");
		
		MealBuilder monMeal = new MealBuilder();
		//Menu vegetarien
		Meal vegMenu = monMeal.prepareVegMeal().build();
		System.out.println("Menu vegetarien");
		vegMenu.showItems();
		System.out.println("Prix total : "+ vegMenu.getCost());
		
		System.err.println("---------------");
		
		//Menu normal
		Meal carneMenu = monMeal.prepareNonVegMeal().build();
		System.out.println("Menu normal");
		carneMenu.showItems();
		System.out.println("Prix total : "+ carneMenu.getCost());
		
		System.err.println("---------------");
		
		//Menu personalise
		Meal menuPerso = monMeal.prepareNonVegMeal().addItem(new ChickenBurger()).build();
		System.out.println("Menu perso");
		menuPerso.showItems();
		System.out.println("Prix total : "+ menuPerso.getCost());
		
		System.err.println("---------------");
	}
}
