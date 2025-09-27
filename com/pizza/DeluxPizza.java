package com.pizza;

public class DeluxPizza extends Pizza{
public DeluxPizza(Boolean veg) {
	super (veg);
	super.addExtraCheese();
    super.addExtraToppingsAdded();
}

@Override
public void addExtraCheese() {
	// TODO Auto-generated method stub
    System.out.println("Cannot add extra cheese to Delux Pizza! It's already included.");

}

@Override
public void addExtraToppingsAdded() {
	// TODO Auto-generated method stub
    System.out.println("Cannot add extra toppings to Delux Pizza! They are already included.");

}
     
	
}
