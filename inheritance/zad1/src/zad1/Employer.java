/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

/**
 *
 * @author pc
 */
public class Employer extends Person {
    
    private String department;
    private String city;
    
    public String getDepartment() {
	return department;
    }

    public void setDepartment(String department) {
	this.department = department;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }
    
    public Employer(String name, String surname, int age, String department, String city) {
	super(name, surname, age);
	this.department = department;
	this.city = city;
    }
    
    @Override
    public double earnings() {
	double salary = super.earnings();

	if (city == "Warszawa" || city == "Kraków" || city == "Wrocław")
	    salary += 300;
	if (city == "Poznań" || city == "Gdańsk")
	    salary += 200;
	if (city == "Katowice")
	    salary += 1500;
	
	return salary;
    }
}
