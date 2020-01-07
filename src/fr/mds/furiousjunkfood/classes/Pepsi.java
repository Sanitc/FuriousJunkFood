package fr.mds.furiousjunkfood.classes;

public class Pepsi extends ColdDrink{
	
	private String name;
	private float price;
	
	public Pepsi() {
		this.name = "Pepsi";
		this.price = (float) 1.5;
	}
	
	@Override
	public String toString() {
		return "La boisson " + name + " bouteille en "+ super.packing() + " au prix de "+ price + " euros";	}
}
