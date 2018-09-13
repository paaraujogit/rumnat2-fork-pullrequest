import java.util.ArrayList;

public class CarrinhoCompras  {

	ArrayList<Produto> list = new ArrayList<Produto>();
	
	
	
	
	public CarrinhoCompras() {
		
		
		
		
		

}
	
	public void adicionarProduto (Produto p){
		
		
		list.add(p);
	
}
	
	public int obterNumeroProduto() {
		
		return list.size();
	}
	
	public Produto  obterProdutoPosicao(int n) {
		
	return	list.get(n);
		
		
	}
	
	public void removerProdutoPosicao (int r) {
		
		list.remove(r);
	}
}

