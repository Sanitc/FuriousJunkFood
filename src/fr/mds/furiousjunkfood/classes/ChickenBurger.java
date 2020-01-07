package fr.mds.furiousjunkfood.classes;

import fr.mds.furiousjunkfood.interfaces.Packing;

public class ChickenBurger extends Burger {
	private String name;
	private float price;
	
	public ChickenBurger() {
		this.name = "Burger au poulet grillé";
		this.price = (float) 5.15;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Le burger " + name + " emballage en "+ super.packing() + " au prix de "+ price + " euros";
	}

}
