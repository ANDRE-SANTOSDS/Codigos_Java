package exercicio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Estado estado = new Estado(1, "Minas Gerais");

		Cidade cidade = new Cidade(1, "Uberlandia", estado);

		Endereco end1 = new Endereco(1, "Rua Flores", "300", "Apto 203", "Jardim", "36220634", cidade);
		Endereco end2 = new Endereco(2, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cidade);

		Telefone tel1 = new Telefone("27363323");
		Telefone tel2 = new Telefone("93638393");

		Cliente cli1 = new Cliente(1, "Maria Silva", "maria@gmail.com", "36378912377", TipoCliente.PESSOAFISICA);
		cli1.addTelefone(tel1);
		cli1.addTelefone(tel2);
		cli1.addEndereco(end1);
		cli1.addEndereco(end2);
		System.out.println(cli1);
		

		Categoria cat1 = new Categoria(1,"informatica");
		Categoria cat2 = new Categoria(2,"Escritório");
		
		Produto prod3 = new Produto(3,"Mouse",80.0);
		prod3.addCategoria(cat1);
		Produto prod2 = new Produto(2,"Impressora",800.0);
		prod2.addCategoria(cat1);
		prod2.addCategoria(cat2);
		Produto prod1 = new Produto(1,"Computador",2000.0);
		prod1.addCategoria(cat1);
		
		ItemPedido ip3 = new ItemPedido(100.0,1,800.0);
		ip3.addProduto(prod2);
		ItemPedido ip2 = new ItemPedido(0.0,2,80.0);
		ip2.addProduto(prod3);
		ItemPedido ip1 = new ItemPedido(200.0,1,2000.0);
		ip1.addProduto(prod1);
		
		Pedido pedido1 = new Pedido(1,LocalDateTime.now(),null);
		pedido1.addItemPedido(ip1);
		pedido1.addItemPedido(ip2);
		System.out.println(pedido1);
		System.out.println(pedido1.Total());
		PagamentoComCartao pgcc = new PagamentoComCartao(1,EstadoPagamento.QUITADO,6);
		System.out.println(pgcc);
		
		
		Pedido pedido2 = new Pedido(2,LocalDateTime.now(),null);
		pedido2.addItemPedido(ip3);
		System.out.println(pedido2);
		System.out.println(pedido2.Total());
		PagamentoComBoleto pgcb = new PagamentoComBoleto(2,EstadoPagamento.PENDENTE,LocalDate.parse("2017-10-20"),null);
		System.out.println(pgcb);
	}

}
