package q2;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Order order;
	private Product product;

	public OrderItem(Integer quantity, Double price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}

	public OrderItem(Integer quantity, Double price, Product product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subTotal() {
		return this.price = this.quantity * this.product.getPrice();
	}

	@Override
	public String toString() {
		return "Subtotal = " + subTotal();
	}

}
