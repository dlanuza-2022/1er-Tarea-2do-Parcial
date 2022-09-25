package bll;

import java.util.Scanner;

import dal.StudentDal;
import ui.StudentForm;

public class Application {

	
	private Scanner sc = new Scanner(System.in);
	
	
	public void displayOptions() {
		System.out.println("Gestionar personas");
		System.out.println("1. Agregar");
		System.out.println("2. Mostrar");
		System.out.println("3. Volver");
		
	}

	public void show() {
		short option = 0;
		
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			option = sc.nextShort();
			switch (option) {
				case 1:
					save();
					break;
				case 2:
					open();
					break;
				case 3:
					System.exit(0);
					break;
				default:
					System.out.println("Opción no válida.");
					break;
			}
		}while(option!=3);
		
	}
	public void save() {
		StudentForm sf = new StudentForm(sc);
		StudentDal sd = new StudentDal();
		sd.setStudent(sf.catchStudent());
		
		System.out.println("Por favor indica la ruta para guardar el archivo: ");
		String filePath = sc.next();
		System.out.println("Por favor indica el nombre del archivo: ");
		String fileName = sc.next();
		
		sd.setFilePath(filePath);
		sd.setFileName(fileName);
		sd.save();
	}
	
	public void open() {
	
			
		System.out.println("Por favor indica la ruta del archivo a abrir");
		String filePath = sc.next();
		StudentDal sd = new StudentDal();
		sd.setFilePath(filePath);
		StudentForm sf = new StudentForm(sd.open());
		sf.showStudent();
		
	}
	
}
