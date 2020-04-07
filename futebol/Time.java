package futebol;

public class Time {
	private String nome;
	private int qtdVitorias;
	private int qtdEmpates;
	private int qtdDerrotas;
	private int qtdPontos;
	
	public Time(String nome)//Gera um time "zerado".
	{
		this.nome = nome;
		this.qtdVitorias = 0;
		this.qtdEmpates = 0;
		this.qtdDerrotas = 0;
		this.qtdPontos = 0;
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
	
	public void ganhar() {
		this.qtdVitorias += 1;
		this.qtdPontos += 3;
	}
	
	public int getQtdEmpates() {
		return qtdEmpates;
	}
	
	public void empatar() {
		this.qtdEmpates += 1;
		this.qtdPontos += 1;
	}
	
	public int getQtdPontos() {
		return qtdPontos;
	}
	
	
	public int getQtdDerrotas() {
		return qtdDerrotas;
	}
	
	public void perder() {
		this.qtdDerrotas += 1;
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
