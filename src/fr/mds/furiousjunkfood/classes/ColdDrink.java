package fr.mds.furiousjunkfood.classes;

import fr.mds.furiousjunkfood.interfaces.Item;
import fr.mds.furiousjunkfood.interfaces.Packing;

public abstract class ColdDrink implements Item {

	private String name;
	private Packing packing;
	private float price;
	
	public ColdDrink() {
		this.packing = new Bottle();
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
		return "nom : " + this.name + "\n prix : "+price;
	}

}
