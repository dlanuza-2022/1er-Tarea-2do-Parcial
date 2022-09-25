package dol;

import java.sql.Date;

import misc.DateUtil;

public class Student extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4679625488618055617L;

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return super.getFirstName();
	}

	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		super.setFirstName(firstName);
	}

	@Override
	public String getMiddleName() {
		// TODO Auto-generated method stub
		return super.getMiddleName();
	}

	@Override
	public void setMiddleName(String middleName) {
		// TODO Auto-generated method stub
		super.setMiddleName(middleName);
	}

	@Override
	public String getSurName() {
		// TODO Auto-generated method stub
		return super.getSurName();
	}

	@Override
	public void setSurName(String surName) {
		// TODO Auto-generated method stub
		super.setSurName(surName);
	}

	@Override
	public String getSecondSurname() {
		// TODO Auto-generated method stub
		return super.getSecondSurname();
	}

	@Override
	public void setSecondSurname(String secondSurname) {
		// TODO Auto-generated method stub
		super.setSecondSurname(secondSurname);
	}

	@Override
	public Date getBirthDate() {
		// TODO Auto-generated method stub
		return super.getBirthDate();
	}

	@Override
	public void setBirthDate(Date birthDate) {
		// TODO Auto-generated method stub
		super.setBirthDate(birthDate);
	}

	@Override
	public Gender getGender() {
		// TODO Auto-generated method stub
		return super.getGender();
	}

	@Override
	public void setGender(Gender gender) {
		// TODO Auto-generated method stub
		super.setGender(gender);
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}
	
	public void showStudent() {
		System.out.printf("Primer nombre: %s\n" , getFirstName());		
		
		System.out.printf("Segundo nombre: %s\n", getMiddleName());
		
		System.out.printf("Primer apellido: %s\n", getSurName());
		
		System.out.printf("Segundo apellido: %s\n", getSecondSurname());
		
		System.out.printf("Género: %s\n", getGender());
		
		System.out.printf("Fecha de nacimiento: %s\n", DateUtil.dateToString(getBirthDate(), "dd/MM/yyyy"));

			
	}
	
	
	

}
