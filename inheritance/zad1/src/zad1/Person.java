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
public class Person {
    
    private String name;
    private String surname;
    private int age;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getSurname() {
	return surname;
    }

    public void setSurname(String surname) {
	this.surname = surname;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }
    
    public Person() {
	this.name = "no name";
	this.surname = "no surname";
	this.age = 18;
    }
    
    public Person(String name, String surname, int age) {
	this.name = name;
	this.surname = surname;
	this.age = age;
    }
    
    public String introduce() {
	String introduce;
	introduce = String.format("%s, %s, %s", getName(), getSurname(), getAge());
	
	return introduce;
    }
    
    public double earnings() {
	double salary;
	salary = 2000 + (getAge() - 18)*150;
	
	return salary;
    }
}
