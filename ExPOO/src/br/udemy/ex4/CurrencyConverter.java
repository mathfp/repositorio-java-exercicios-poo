package br.udemy.ex4;

 public class CurrencyConverter {
	
	private static final double IOF = 0.06;
	private static double dolarPrice;
	
	public static double converter(double valueDollar) {
		return dolarPrice * valueDollar + (IOF * dolarPrice * valueDollar); 
	}

	public static double getDolarPrice() {
		return dolarPrice;
	}

	public static void setDolarPrice(double dolarPrice) {
		CurrencyConverter.dolarPrice = dolarPrice;
	}
}
