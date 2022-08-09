package br.udemy.ex2;

public class Employee {
	private String name;
	private double grossSalary;
	private double tax;

	public double NetSalary() {
		return grossSalary - tax;
	}

	public void IncreaseSalary(double percentage) {
		grossSalary += (grossSalary * (percentage / 100));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
}
