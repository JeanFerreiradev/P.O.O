import java.time.LocalDate;
import java.time.Period;

public class Paciente {
	private String nome = "";
	private String sobrenome = "";
	private char sexo = '\u0000';
	private LocalDate nascimento;
	private byte idade = 0;
	private short altura = 0;
	private double peso = 0.0;
	private String CPF = "";
	private double IMC = 0.0;

	public Paciente() {

	}

	public Paciente(String nome, String sobrenome, char sexo, LocalDate nascimento, short altura, double peso,
			String CPF) {
	}

	public Paciente(String nome, String sobrenome, char sexo, LocalDate nascimento, short altura, double peso) {
	}

	public Paciente(String nome, String sobrenome, String CPF) {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public byte getIdade() {
		return idade;
	}

	public short getAltura() {
		return altura;
	}

	public void setAltura(short altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public double getIMC() {
		return IMC;
	}

	public double calcularIMC() {
		return peso / (altura * altura);
	}

	public double obterPesoIdeal() {
		if (getSexo() == 'M') {
			return (72.7 * getAltura()) - 58;
		} else {
			return (62.1 * getAltura()) - 44.7;
		}
	}

	public byte calcularIdade() {
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(nascimento, dataAtual);
		return (byte) periodo.getYears();
	}

	public String obterSituacaoIMC() {
		if (calcularIMC() < 17) {
			return "Muito abaixo do peso";
		} else if (calcularIMC() <= 18.49) {
			return "Abaixo do peso";
		} else if (calcularIMC() <= 24.99) {
			return "Peso normal";
		} else if (calcularIMC() <= 29.99) {
			return "Acima do peso";
		} else if (calcularIMC() <= 34.99) {
			return "Obesidade I";
		} else if (calcularIMC() <= 39.99) {
			return "Obesidade II ( severa )";
		} else {
			return "Obesidade III( mórbida )";
		}
	}
}
