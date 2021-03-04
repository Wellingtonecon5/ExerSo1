package view;

import java.util.Scanner;

import controller.RedesController;
public class Principal {

	public static void main(String[] args) {
		
		RedesController redesController = new RedesController ();
		
		System.out.println("1- Abrir config");
		System.out.println("2 - Ping");
		System.out.println("Finaliza");

		Scanner  sc = new Scanner (System.in);
		System.out.println("Selecione uma opção");
		int opc =sc.nextInt();
		
        switch (opc) {
		case 1:
		String process = "ipconfig";
		redesController.readProcess(process);
		break;
		case 2:
		String process1 = "www.google.com";
		redesController.readProcess(process1);
		break;
		case 3:
		default:
		
	}

}
	}
