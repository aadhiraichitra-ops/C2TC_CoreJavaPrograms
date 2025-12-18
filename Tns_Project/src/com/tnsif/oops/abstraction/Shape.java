package com.tnsif.oops.abstraction;


	public abstract class Shape {
	     protected float area; // 10.9f
		// public float area;
		// public float area;
	     
	     //abstract method 
		 abstract void calArea(); // return
		 
		 //concrete method
		 void show()
		 {
			 System.out.println("Area of shape is "+area);
		 }
}
