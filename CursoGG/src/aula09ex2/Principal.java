package aula09ex2;

public class Principal {
	
	public static void main(String[] args) {
        Pedido pedido1 = new Pedido(11,"2 Hamburguer e Batata Frita",49.99);
       
		Client client1 = new Client("Joana","Tv Manaus - N211");
		client1.addPedido(pedido1);
		
		pedido1.pEntregue();
		System.out.println(client1);
	}
	
}
