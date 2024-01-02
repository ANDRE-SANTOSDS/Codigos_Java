package q2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
	private LocalDateTime moment;
	private OrderStatus status;
	private ArrayList<OrderItem> orderItem = new ArrayList<OrderItem>();
	private Client client;

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ArrayList<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(ArrayList<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	public void addItem(OrderItem orderItem) {
		this.orderItem.add(orderItem);
	}

	public void removeItem(OrderItem orderItem) {
		this.orderItem.remove(orderItem);
	}

	public void status() {
		for (int i = 0; i < orderItem.size(); i++) {
			System.out.print("" + orderItem.get(i).getProduct().getName() + ", $" + orderItem.get(i).getPrice()
					+ ", Quantity: " + orderItem.get(i).getQuantity() + " Subtotal " + orderItem.get(i).subTotal());

			System.out.println();
		}
	}

	public Double Total() {
		Double total = 0.0;
		for (int i = 0; i < orderItem.size(); i++) {
			total += orderItem.get(i).getPrice();
		}
		return total;
	}

	@Override
	public String toString() {
		return " Total = " + Total();
	}

}
