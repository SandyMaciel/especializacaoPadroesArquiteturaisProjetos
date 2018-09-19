package padroes.trabalho.QT_15_builder;


public class Atendimento {

	protected PedidoBuilder pedidoCliente;

	public Atendimento(PedidoBuilder pedido) {
		this.pedidoCliente = pedido;
	}

	public void mcLancheFeliz() {

		pedidoCliente.adicionarSanduiche();
		pedidoCliente.adicionarBatata();
		pedidoCliente.adicionarBrinquedo();
		pedidoCliente.adicionarRefrigerante();

	}

	public PedidoBuilder getPedidoCliente() {
		return pedidoCliente;
	}

}
