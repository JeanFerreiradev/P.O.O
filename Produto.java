import java.util.Scanner;
public class Produto {
	Scanner console = new Scanner(System.in);
	private String idProduto = "";
	private String nome = "";
	private String categoria = "";
	private double preco = 0.0;
	private String marca = "";
	private String modelo = "";
	private double altura = 0.0;
	private double largura = 0.0;
	private double comprimento = 0.0;
	private double peso = 0.0;

	public Produto() {
		
	}

	public Produto(String idProduto, String nome, String categoria, double preco, double altura, double largura,
			double comprimento, double peso) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
		this.peso = peso;
	}
	public Produto(String idProduto, String nome, double preco, double altura, double largura,
			double comprimento, double peso) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
		this.peso = peso;
	}
	public String getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Produto [getPreco()=" + getPreco() + ", getAltura()=" + getAltura() + ", getLargura()=" + getLargura()
				+ ", getComprimento()=" + getComprimento() + ", getPeso()=" + getPeso() + "]";
	}
}
