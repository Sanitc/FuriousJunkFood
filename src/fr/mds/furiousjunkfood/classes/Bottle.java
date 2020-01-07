package fr.mds.furiousjunkfood.classes;

import fr.mds.furiousjunkfood.interfaces.Packing;

public class Bottle implements Packing{
	
	private String contenant;
	private String name;
	public Bottle() {
		this.name = "bouteille";
	}
	@Override
	public String setEmballage() {
		// TODO Auto-generated method stub
		return this.contenant = "verre";
	}
	
	@Override
	public String toString() {
		return this.setEmballage();
	}
}
