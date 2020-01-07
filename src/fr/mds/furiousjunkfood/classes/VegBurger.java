package fr.mds.furiousjunkfood.classes;

public class VegBurger extends Burger {

	private String name;
	private float price;
	
	public VegBurger() {
		this.name = "Burger vegetarien";
		this.price = (float) 5.10;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Le burger " + name + " emballage en "+ super.packing() + " au prix de "+ price + " euros";
	}
}
