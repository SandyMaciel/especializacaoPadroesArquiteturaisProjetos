package padroes.exercicios.abstractfactory;

public interface EmpresaEletronicos {
	ProdutoComputador criaComputador(String computador);

	ProdutoPortatil criaPortatil(String portatil);
}