package com.langfundamentals;

public class ShoppingCart {
	static String storeName="Vijetha";
	String customerName;
	String productName;
	double price;
	double finalPrice;
	int quantity;
	void addProducts(String pname,double pr,int qty) {
		productName=pname;
		price=pr;
		quantity=qty;
		System.out.println("Product Added Sucessfully");
		
	}
	void calculateTotal(double discount) {
		double totalPrice=quantity*price;
		double discountAmount=totalPrice*discount/100;
		finalPrice=totalPrice-discountAmount;
		
	}
	void displayCart() {
		System.out.println("StoreName:" +storeName);
		System.out.println("Customer Name:" +customerName);
		System.out.println("Product Name:" +productName);
		System.out.println("Final Price="+finalPrice);
	}
	

	public static void main(String[] args) {
		ShoppingCart s1=new ShoppingCart();
		ShoppingCart s2=new ShoppingCart();
		s1.customerName="Shrasta";
		s1.addProducts("Mobile",20000,1);
		s1.calculateTotal(5);
		s1.displayCart();
		s2.customerName="Sharun";
		s2.addProducts("laptop",50000,1);
		s2.calculateTotal(10);
		s2.displayCart();
		

	}

}
