package qt10_bridge;

public class Cliente {
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		lista.add(Compras.Limao);
		lista.add(Compras.Laranja);
		lista.add(Compras.Pera);
		lista.add(Compras.Banana);
		
		lista.setImp(new ListaMarcador());
		
		lista.listaOrdenada();
		
	}
}
