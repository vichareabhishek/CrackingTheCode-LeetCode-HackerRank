package Strings;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class FormatingOutput {
	// ---------------------------------------------------
	// main reads in the price per pound of a deli item
	// and number of ounces of a deli item then computes
	// the total price and prints a "label" for the item
	// ---------------------------------------------------
	public static void main(String[] args) {
		final double OUNCES_PER_POUND = 16.0;
		double pricePerPound; // price per pound
		double weightOunces; // weight in ounces
		double weight; // weight in pounds
		double totalPrice; // total price for the item
		Scanner scan = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		// Declare money as a NumberFormat object and use the
		// getCurrencyInstance method to assign it a value
		DecimalFormat fmt = new DecimalFormat("0.##");

		// Declare fmt as a DecimalFormat object and instantiate
		// it to format numbers with two decimal places.

		// prompt the user and read in each input
		System.out.println("Welcome to the CS Deli! ! \n ");
		System.out.print("Enter the price per pound of your item: ");
		pricePerPound = scan.nextDouble();
		System.out.print("Enter the weight (ounces): ");
		weightOunces = scan.nextDouble();
		// Convert ounces to pounds and compute the total price
		weight = weightOunces / OUNCES_PER_POUND;
		totalPrice = pricePerPound * weight;
		System.out.println("The wieght in pounds is " + fmt.format(weight));
		System.out.println("The totalprice in dollars is " + money.format(totalPrice));
		// Print the label using the formatting objects
		// fmt for the weight in pounds and money for the prices
	}
}
