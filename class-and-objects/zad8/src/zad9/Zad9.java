/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad9;

/**
 *
 * @author pc
 */
public class Zad9 {

    public static class OperacjeMatematyczne {
	
	public static double Pow(double liczba, double potega) {
	    double wynik = 1;
	    
	    if (potega == 0) {
		return 1;
	    }
	    else if (potega == 1) {
		return liczba;
	    }
	    else {
		for (int i = 0; i < potega; i++) {
		    wynik *= liczba;
		}
	    }
	    return wynik;
	}
	
	public static double Abs(double liczba) {
	    if (liczba < 0) {
		return liczba * -1;
	    }
	    else {
		return liczba;
	    }
	}
	
	public static double Ceiling(double liczba) {
	    return (int)liczba + 1;
	}
	
	public static double Floor(double liczba) {
	    return (int)liczba;
	}
    }
    public static void main(String[] args) {
	System.out.println(OperacjeMatematyczne.Pow(9, 2));
	System.out.println(OperacjeMatematyczne.Abs(-50));
	System.out.println(OperacjeMatematyczne.Ceiling(3.14));
	System.out.println(OperacjeMatematyczne.Floor(3.14));
    }
    
}
