package pedidodevendas;

public class PedidosClientes {

	public static void main(String[] args) {
		
		Pedidos pedidos = new Pedidos();
		
		pedidos.codigo = "254.98";
		pedidos.subtotal = 300.0;
		pedidos.desconto = (pedidos.subtotal * 10 / 100);
		//pedidos.total = (pedidos.subtotal - pedidos.desconto);
		
		imprimir("O c�digo do produto �: " + pedidos.getCodigo());
		imprimir("O valor subtotal �: R$ " + pedidos.getSubtotal());
		imprimir("O valor do desconto � de: R$ " + pedidos.getDesconto());
		imprimir("O valor total � de: R$ " + pedidos.getTotal());

	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}

}
