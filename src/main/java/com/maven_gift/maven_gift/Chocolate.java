package com.maven_gift.maven_gift;

public class Chocolate implements Gift{

	
	int price,weight,category;
	String name;
	
	public Chocolate(int price, int weight,String name,int category) {
		super();
		this.price = price;
		this.weight = weight;
		this.name=name;
		this.category=category;
	}
	
	
	public int getPrice()
	{
		return price;
	}
	
	
	public int getWeight()
	{
		return weight;
	}


	public String getName() {
		return name;
	}
	
	public int getCategory()
	{
		return category;
	}

	@Override
	public String toString() {
		return "Name=" +  name + " [price=" + price + ", weight=" + weight  + "]";
	}
	
}
