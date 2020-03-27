package futebol;

import java.util.Date;
import java.util.Random;

public class Partida {
	private Time timeVisitante;
	private Time timeLocal;
	private int scoreVisitante;
	private int scoreLocal;
	private Date dataPartida;
	
	public Time getTimeVisitante() {
		return timeVisitante;
	}

	public void setTimeVisitante(Time timeVisitante) {
		this.timeVisitante = timeVisitante;
	}

	public Time getTimeLocal() {
		return timeLocal;
	}

	public void setTimeLocal(Time timeLocal) {
		this.timeLocal = timeLocal;
	}
	
	public Date getDataPartida() {
		return dataPartida;
	}

	public void setDataPartida(Date dataPartida) {
		this.dataPartida = dataPartida;
	}
	
	public void iniciarPartida(Time timeLocal, Time timeVisitante)
	{
		this.setTimeLocal(timeLocal);
		this.setTimeVisitante(timeVisitante);
		this.setDataPartida(new Date());//Pega a data e hora atual para a partida.
		
		Random random = new Random();
		this.scoreVisitante = random.nextInt(10);//Gera números aleatórios de 0 - 10.
		this.scoreLocal = random.nextInt(10);
	}
	
	public void mostrarResultado()
	{
		System.out.println(this.timeLocal.getNome()+" " + this.scoreLocal + " X " + this.scoreVisitante + " " +this.timeVisitante.getNome() + "\n");
	}
	
	public void finalizarPartida()
	{
		if(this.scoreVisitante > this.scoreLocal)//Caso o time visitante vença.
		{
			this.timeVisitante.setQtdVitorias(1);
			this.timeVisitante.setQtdPontos(3);
			this.timeLocal.setQtdDerrotas(1);
		}
		else if(this.scoreVisitante < this.scoreLocal)//Caso o time visitante perca.
		{
			this.timeLocal.setQtdVitorias(1);
			this.timeLocal.setQtdPontos(3);
			this.timeVisitante.setQtdDerrotas(1);
		}
		else										  //Caso empate a partida.
		{
			this.timeLocal.setQtdEmpates(1);
			this.timeVisitante.setQtdEmpates(1);
			this.timeLocal.setQtdPontos(1);
			this.timeVisitante.setQtdPontos(1);
		}
	}


}
