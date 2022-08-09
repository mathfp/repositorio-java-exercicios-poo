package br.udemy.ex9;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private Date moment;
	private OrderStatus status;

	Client client;
	List<OrderItem> items = new ArrayList<OrderItem>();

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	SimpleDateFormat sdfBirth = new SimpleDateFormat("dd/MM/yyyy");
	
	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {
		Double total = 0.0;

		for (OrderItem oi : items) {
			total += oi.subTotal();
		}

		return total;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client.getName());
		sb.append(" ("+sdfBirth.format(client.getBirthDate())+")" + " - ");
		sb.append(client.getEmail() + "\n");
		sb.append("Order items: \n");

		for (OrderItem oi : items) {
			sb.append(oi.getProduct().getName() + ", $" + String.format("%.2f",oi.getProduct().getPrice()) + ", Quantity: " + oi.getQuantity()
					+ ", Subtotal: $" + String.format("%.2f", oi.subTotal()) + "\n");
		}
		
		sb.append("Total price: $");
		sb.append(String.format("%.2f",total()));
		
		return sb.toString();
	}
}
