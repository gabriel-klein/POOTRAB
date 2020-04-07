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
			this.timeVisitante.ganhar();
			this.timeLocal.perder();
		}
		else if(this.scoreVisitante < this.scoreLocal)//Caso o time visitante perca.
		{
			this.timeLocal.ganhar();
			this.timeVisitante.perder();
		}
		else					      //Caso empate a partida.
		{
			this.timeLocal.empatar();
			this.timeVisitante.empatar();
		}
	}


}
