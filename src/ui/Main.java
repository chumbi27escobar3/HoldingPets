package ui;
import java.util.Scanner;

public class Main {

	private Scanner entry;
	
	public Main() {
		
		entry =new Scanner(System.in);	
	}
	
	public static void main(String[] args) {
		
		Main m = new Main();
		m.showSelection();

	}
	public void showMenu() {
	
    System.out.println("Bienvenido a la verinaria");
    System.out.println("Por favor seleccione la opcion que desea:");
	System.out.println("1.Registrar Mascota.");
	System.out.println("2.Registrar Dueño.");
	System.out.println("3.Ver clientes.");
	System.out.println("4.Mostrar la disponbilidad de los cuertos.");
	System.out.println("5.Creacion de historia clinica a mascota hopitalizada.");
	System.out.println("6.Informe de oaciente hospitalizados en el momento.");
	System.out.println("7.Consultar datos del dueño de el animal hospitalizado con el nombre del dueño.");
	System.out.println("8.Consultar datos del dueño de el animal hospitalizado con el nombre de la mascota.");
	System.out.println("9.Dar de alta a una mascota hopitalizada.");
	System.out.println("10.Calcular costos de hospitalización.");
	System.out.println("11.Calcular costo de medicamento.");
	System.out.println("12.salir.");
		
	}
	
	public void showSelection() {
		showMenu();
//		boolean selection = false;
		int option = entry.nextInt();
//		while(selection) {
		switch(option) {
		
		
		case 1:
			
			System.out.println("vamos home");
			
			break;
			
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			
			System.out.println("chao home pues");
//			selection = true;
			
			break;
		
		}
//		}
	}
}
