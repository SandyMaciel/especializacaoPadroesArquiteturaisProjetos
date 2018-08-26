package padroes.exercicios.abstractfactory;

public class EmpresaLG implements EmpresaEletronicos{

	@Override
	public ProdutoComputador criaComputador(String computador) {
		if(computador == "DesktopLG") {
			return new DesktopLG();
		}else {
			return new NotebookLG();
		}
		
	}

	@Override
	public ProdutoPortatil criaPortatil(String portatil) {
		if(portatil == "SmartphoneLG") {
			return new SmartphoneLG();
		}else {
			return new TabletLG();
		}
	}

}