package exercicio;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
	private Integer id;
	private LocalDateTime data;
	private Pagamento pagamento;
	private ArrayList<ItemPedido> itemPedido = new ArrayList<>();

	public Pedido(Integer id, LocalDateTime data, Pagamento pagamento) {
		super();
		this.id = id;
		this.data = data;
		this.pagamento = pagamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public ArrayList<ItemPedido> getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(ArrayList<ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}
	
	public void addItemPedido(ItemPedido itemPedido) {
		this.itemPedido.add(itemPedido);
	}

	public void removeItemPedido(ItemPedido itemPedido) {
		this.itemPedido.remove(itemPedido);
	}
	
	public Double total() {
		Double total = 0.0;
		for (int i = 0; i < itemPedido.size(); i++) {
			total += itemPedido.get(i).subTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", data=" + data + ", itemPedido=" + itemPedido + "]";
	}
	
	public String Total() {
		return "Total = "+total();
	}
	
}
