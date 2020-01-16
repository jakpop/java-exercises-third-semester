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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Person p1 = new Person("jan", "kowalski", 28);
//	System.out.println(p1.introduce());
//	p1.earnings();
	
	Employee e1 = new Employee("jakub", "bukaj", 23, 5, 3000);
	System.out.println(e1.introduce());
	
	Employer em1 = new Employer("bukaj", "jakub", 28, "it", "Katowice");
//	System.out.println(em1.earnings());
    }
    
}
