package futebol;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);//Objeto usado para receber os nomes dos time do usuário.
		String TimeNome1;
		String TimeNome2;
		int i;
		Scanner scanner = new Scanner(System.in);//Objeto usado para receber a tecla enter.
		
		System.out.println("Iniciando as partidas da Rodada do Brasileirão");
			for(i=1;i<4;i++)
			{
				System.out.println("Vai começar a partida Número " + i);
				System.out.println("Entre com o nome do time Local: ");
				TimeNome1 = ler.nextLine();
				System.out.println("Entre com o nome do time visitante: ");
				TimeNome2 = ler.nextLine();
				
				Time Time1 = new Time();
				Time1.setNome(TimeNome1);
				
				Time Time2 = new Time();
				Time2.setNome(TimeNome2);
				
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
							   "Gabriel Nunes Klein\n" +
							   "Github: https://github.com/gabriel-klein/POOTRAB");
		
		}

}
