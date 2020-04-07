package futebol;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time[] times = new Time[6];
		Scanner ler = new Scanner(System.in);//Objeto usado para receber os nomes dos time do usu�rio.
		String TimeNome1;
		String TimeNome2;
		int i;
		Scanner scanner = new Scanner(System.in);//Objeto usado para receber a tecla enter.
		
		System.out.println("Iniciando as partidas da Rodada do Brasileir�o");
			for(i=1;i<=3;i++)
			{
				Time Time1 = null;
				Time Time2 = null;
				int j;
				
				System.out.println("Vai come�ar a partida N�mero " + i);
				System.out.println("Entre com o nome do time Local: ");
				TimeNome1 = ler.nextLine();
				System.out.println("Entre com o nome do time visitante: ");
				TimeNome2 = ler.nextLine();
				
				for (j = 0; j < times.length; j++) {
					if (times[j] == null){
						break;
					}
					if (times[j].getNome().equals(TimeNome1.trim())) {
						Time1 = times[j];
						break;
					}
				}

				if (Time1 == null) {
					Time1 = new Time(TimeNome1);
					times[j] = Time1;
				}
				
				for (j = 0; j < times.length; j++) {
					if (times[j] == null){
						break;
					}
					if (times[j].getNome().equals(TimeNome2.trim())) {
						Time2 = times[j];
						break;
					}
				}

				if (Time2 == null) {
					Time2 = new Time(TimeNome2);
					times[j] = Time2;
				}
					
				Time1.listar();
				Time2.listar();
						
				System.out.println("\nDigite enter para prosseguir: ");
				scanner.nextLine();
				
				Partida partida1 = new Partida();
				partida1.iniciarPartida(Time1,Time2);
				partida1.mostrarResultado();
				partida1.finalizarPartida();
				
				Time1.listar();
				Time2.listar();
			}
			
			System.out.println("-----------------------------------FIM DA RODADA---------------------------------------\n"+
							   "Integrantes do grupo: "+
							   "Gabriel Nunes Klein, João Victor Cruz\n" +
							   "Github: https://github.com/gabriel-klein/POOTRAB");
		
		}

}
