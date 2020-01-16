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
public class Employee extends Person {
    
    private int jobSeniority;
    private double salary;

    public int getJobSeniority() {
	return jobSeniority;
    }

    public void setJobSeniority(int jobSeniority) {
	this.jobSeniority = jobSeniority;
    }

    public double getSalary() {
	return salary;
    }

    public void setSalary(double salary) {
	this.salary = salary;
    }
    
    public Employee(String name, String surname, int age, int jobSeniority, double salary) {
	super(name, surname, age);
	this.jobSeniority = jobSeniority;
	this.salary = salary;
    }
    
    @Override
    public String introduce() {
	String introduce;
	introduce = String.format(", %.2f, %s", getSalary(), getJobSeniority());
	
	return (super.introduce() + introduce);
    }
}
