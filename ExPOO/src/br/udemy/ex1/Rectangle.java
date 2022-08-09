package br.udemy.ex1;

public class Rectangle {
	private double width;
	private double height;

	public double Area() {
		return width * height;
	}

	public double Perimeter() {
		return (2 * width) + (2 * height);
	}

	public double Diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
