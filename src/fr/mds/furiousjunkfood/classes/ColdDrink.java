package fr.mds.furiousjunkfood.classes;

import fr.mds.furiousjunkfood.interfaces.Item;
import fr.mds.furiousjunkfood.interfaces.Packing;

public abstract class ColdDrink implements Item {

	private String name;
	private float price;
	private Packing packing;
	
	public ColdDrink(String name, float price) {
		this.packing = new Bottle();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String name() {
		return this.name;
	}

	@Override
	public Packing packing() {
		return this.packing;
	}
	
	@Override
	public float price() {
		return this.price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "La boisson " + name + " bouteille en "+ packing() + " au prix de "+ price + " euros";
	}

}
