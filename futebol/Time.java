package futebol;

public class Time {
	private String nome;
	private int qtdVitorias;
	private int qtdEmpates;
	private int qtdDerrotas;
	private int qtdPontos;
	
	public Time()//Gera um time "zerado".
	{
		setQtdDerrotas(0);
		setQtdEmpates(0);
		setQtdPontos(0);
		setQtdVitorias(0);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQtdVitorias() {
		return qtdVitorias;
	}
	
	public void setQtdVitorias(int qtdVitorias) {
		this.qtdVitorias = this.qtdVitorias + qtdVitorias;
	}
	
	public int getQtdEmpates() {
		return qtdEmpates;
	}
	
	public void setQtdEmpates(int qtdEmpates) {
		this.qtdEmpates = this.qtdEmpates + qtdEmpates;
	}
	
	public int getQtdPontos() {
		return qtdPontos;
	}
	
	public void setQtdPontos(int qtdPontos) {
		this.qtdPontos = this.qtdPontos + qtdPontos;
	}
	
	public int getQtdDerrotas() {
		return qtdDerrotas;
	}
	
	public void setQtdDerrotas(int qtdDerrotas) {
		this.qtdDerrotas = this.qtdDerrotas + qtdDerrotas;
	}
	
	public void listar()
	{
		System.out.println("\nTime: " + this.nome + "\n" +
						   "Vitorias: " + this.qtdVitorias + "\n" +
						   "Empates: " + this.qtdEmpates + "\n" +
						   "Derrotas: " + this.qtdDerrotas + "\n" +
						   "Pontos: " + this.qtdPontos + "\n");
		
	}
}
