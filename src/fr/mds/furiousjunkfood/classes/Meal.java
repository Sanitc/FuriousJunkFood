package fr.mds.furiousjunkfood.classes;

import java.util.ArrayList;
import java.util.List;

import fr.mds.furiousjunkfood.interfaces.Item;



public class Meal {
	
	private List<Item> monMenu = new ArrayList<Item>();
	
	public void addItem(Item item) {
		this.monMenu.add(item);
	}
	
	public float getCost() {
		float cout = 0;
		
		for (Item item : monMenu) {
			cout += item.price();
		}
		
		return cout;
	}
	
	public void showItems() {
		System.out.println("Ce menu contient : ");
		for (Item item : monMenu) {
			System.out.println("un(e) "+ item.name() + " au prix de " + item.price() + " €");
			
		}
	}
}
