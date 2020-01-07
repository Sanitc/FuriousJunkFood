package fr.mds.furiousjunkfood.classes;

public class Coke extends ColdDrink {

	private String name;
	private float price;
	
	public Coke() {
		this.name = "Breizh Cola";
		this.price = (float) 1.3;
	}
	
	
	@Override
	public String toString() {
		return "La boisson " + name + " bouteille en "+ super.packing() + " au prix de "+ price + " euros";
	}
}
