import java.util.Scanner;

public class Main {
	static Scanner console = new Scanner(System.in);
	static Produto produto = new Produto();
	static ItemDeVenda item = new ItemDeVenda(produto, -1);

	static void mostrarMenu() {
		System.out.println("\n\n");
		System.out.println("\t MENU");
		System.out.println("[ 1 ] Cadastrar produto: ");
		System.out.println("[ 2 ] inserir quantidade: ");
		System.out.println("[ 3 ] ???: ");
		System.out.println("[ 4 ] ???: ");
		System.out.println("[ 0 ] Subtotal da compra: ");
		System.out.println("\n Digite a opção:");

		byte opcao = console.nextByte();
		switch (opcao) {
		case 1:
			System.out.print("Id do produto: ");
			produto.setIdProduto(console.nextLine());
			console.nextLine();
			System.out.print("\nNome: ");
			produto.setNome(console.nextLine());
			System.out.print("\nCategoria: ");
			produto.setCategoria(console.nextLine());
			System.out.print("\nPreço: ");
			produto.setPreco(console.nextDouble());
			System.out.print("\nMarca: ");
			produto.setMarca(console.nextLine());
			console.nextLine();
			System.out.print("\nModelo: ");
			produto.setModelo(console.nextLine());
			System.out.print("\npeso: ");
			produto.setPeso(console.nextDouble());
			System.out.print("\nAltura: ");
			produto.setAltura(console.nextDouble());
			System.out.print("\nComprimento: ");
			produto.setComprimento(console.nextDouble());
			System.out.print("\nLargura: ");
			produto.setLargura(console.nextDouble());
			break;
		case 2:
			System.out.println("Quantidade: ");
			item.setQuantidade(console.nextInt());
		    break;
		case 0:
			System.out.println(item.calcularSubtotal());
	  }
		mostrarMenu();
	}

	public static void main(String[] args) {
//		Endereco endereco = new Endereco();
//		String Endereco = endereco.toString();
//		System.out.println(Endereco);
//		Produto Carne = new Produto();
//		ItemDeVenda Carne1 = new ItemDeVenda();
//		Carne1.atualizarProduto(Carne, 3);
//		System.out.println(Carne1);
//		Carne.setPreco();
//		System.out.println("Subtotal: " + Carne1.calcularSubtotal());
//		Carne.setCategoria();
//		System.out.println(Carne.getCategoria());
		mostrarMenu();
	}
}
