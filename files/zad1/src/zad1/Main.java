/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String[] args) throws Exception {
        
        //zad. 1
        Film f1 = new Film("Shrek", "Antonio Banderas", 1999, new String[]{"Shrek", "Osioł", "Fiona" });
//        f1.PrzedstawSie();
//	System.out.println(Obsluga.zapiszDoPliku(f1));
	
	Ksiazka k1 = new Ksiazka("Rozmyślania", "Marek Aureliusz", 20, 100, "filozofia");
	Object[] objectArray = {f1, k1};
	
//	System.out.println(Obsluga.zapiszDoPlikuTablice(objectArray));
	Obsluga.wypiszDanezPliku("plik2.obj");
    }
}
