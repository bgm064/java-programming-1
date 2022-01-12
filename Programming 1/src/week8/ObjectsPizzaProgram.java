package week8;

import java.text.DecimalFormat;

public class ObjectsPizzaProgram {

	public static void main(String[] args) {

		Pizza first = new Pizza("Diavolo", 8.75);
		Pizza second = new Pizza("Frutti al Mare", 9.00);
		Pizza third = new Pizza("Alla Pollo", 7.50);
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
	}

}

class Pizza {
	
	DecimalFormat df = new DecimalFormat("0.00");

	private String name;
	private double price;

	public Pizza(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return name + " (" + df.format(price) + " euros)";
	}

}