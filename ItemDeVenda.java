public class ItemDeVenda {
	private Produto produto = new Produto();

	private int quantidade = 0;
	private double subtotal = 0.0;

	public ItemDeVenda() {

	}

	public ItemDeVenda(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void atualizarProduto(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public double calcularSubtotal() {
		this.subtotal = produto.getPreco() * quantidade;
		return subtotal;

	}

	@Override
	public String toString() {
		return "Produto: " + getProduto() + "\n" + "Quantidade: " + getQuantidade();
	}
}
