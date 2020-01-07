package fr.mds.furiousjunkfood.classes;

import fr.mds.furiousjunkfood.interfaces.Packing;

public class Wrapper implements Packing {
	
	private String emballage;
	private String name;
	
	public Wrapper() {
		this.name = "wrapper";
	}

	@Override
	public String setEmballage() {
		return this.emballage = "papier";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return setEmballage();
	}
}
