package ui;

import java.sql.Date;
import java.util.Scanner;

import dol.Gender;
import dol.Person;
import dol.Student;
import misc.DateUtil;

public class StudentForm {
	Scanner sc;
	
	Student student;
	

	public StudentForm(Scanner scanner) {
		sc = scanner;
	}
	
	public StudentForm(Student st) {
		student = st;
	}
	

	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Student catchStudent() {
		Student st = new Student();
		System.out.println("Primer nombre: ");
		st.setFirstName(sc.next());
		
		System.out.println("Segundo nombre: ");
		st.setMiddleName(sc.next());
		
		System.out.println("Primer apellido: ");
		st.setSurName(sc.next());
		
		System.out.println("Segundo apellido: ");
		st.setSecondSurname(sc.next());
		
		System.out.println("Género: ");
	    short op = 0;
	    
	    do {
	    	System.out.println("1. Mujer.");
	    	System.out.println("2. Varón.");
	    	
	    }while(op != 1 && op != 2);
		
	    if(op == 1) {
	    	st.setGender(Gender.FEMALE);
	    }else {
	    	st.setGender(Gender.MALE);
	    	
	    }
		
		
		
		Date date = DateUtil.catchValidDate(sc, "Fecha de nacimiento (dd/MM/yyyy): ");
		st.setBirthDate(date);
			
		return st;
	}
	
	
	public void showStudent() {
		System.out.printf("Primer nombre: %s\n" , student.getFirstName());		
		
		System.out.printf("Segundo nombre: %s\n", student.getMiddleName());
		
		System.out.printf("Primer apellido: %s\n", student.getSurName());
		
		System.out.printf("Segundo apellido: %s\n", student.getSecondSurname());
		
		System.out.printf("Género: %s\n", student.getGender());
		
		System.out.printf("Fecha de nacimiento: %s\n", DateUtil.dateToString(student.getBirthDate(), "dd/MM/yyyy"));

			
	}

	
	
}
