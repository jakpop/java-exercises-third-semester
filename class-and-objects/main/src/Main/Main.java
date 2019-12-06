/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        //zad. 1
//        Punkt3D p = new Punkt3D(1, 2, 3);
//        System.out.println(p.OdlegloscEuklidesowa());
//        System.out.println(p.OdlegloscManhattan());
        
        //zad. 2
        Lancuch l1 = new Lancuch("xyz");
        System.out.println(l1.lancuch);
        System.out.println(l1.koncowka);
        System.out.println(l1.pierwszaLitera);

        //zad. 3
        Lancuch l2 = new Lancuch("iiiii");
        System.out.println(l1.Merge(l2));
        System.out.println(l1.ileASCII());
        System.out.println(l2.ileASCII());

        //zad. 4
//        Pracownik p1 = new Pracownik();
//        System.out.println(p1.getImie() + " " + p1.getNazwisko() + " " + p1.getPensja() + " " + p1.getStanowisko() + " " + p1.getStazPracy());
//        
//        Pracownik p2 = new Pracownik("Jan", "Kowalski", "kierownik", 10);
//        System.out.println(p2.getImie() + " " + p2.getNazwisko() + " " + p2.getPensja() + " " + p2.getStanowisko() + " " + p2.getStazPracy());
//        System.out.println(p2.zwiekszPensja(0.5) + " " + p2.getPensja());
//        p2.zwiekszStaz();
//        System.out.println(p2.getStazPracy() + " " + p2.getPensja());

        //zad. 5
//        Random rand = new Random();
//        
//        String[] imiona = { "Aneta", "Bartosz", "Celina", "Damian", "Ela", "Fjerzy", "Grzegorz", "Hanna", "Ireneusz", "Jolanta", "Krzysztof" };
//        String[] stanowiska = { "młodszy specjalista", "starszy specjalista", "księgowy", "manager", "kierownik" };
//        String[] stanowiska2 = { "młodszy specjalista", "starszy specjalista", "księgowy", };
//        
//        Pracownik[] arrayPracownik = new Pracownik[100];
//        
//        int countKierownik = 0;
//        int countManager = 0;
//        for (int i = 0; i < arrayPracownik.length; i++)
//        {
//            arrayPracownik[i] = new Pracownik(imiona[rand.nextInt(imiona.length)], Pracownik.randomSurname(), stanowiska[rand.nextInt(stanowiska.length)], rand.nextInt(26));
//            
//            if (arrayPracownik[i].getStanowisko() == "kierownik")
//            {
//                countKierownik++;
//            }
//            if (arrayPracownik[i].getStanowisko() == "manager")
//            {
//                countManager++;
//            }
//            
//            if (countKierownik > 3)
//            {
//                arrayPracownik[i].setStanowisko(stanowiska2[rand.nextInt(stanowiska2.length)]);
//            }
//            if (countManager > 10)
//            {
//                arrayPracownik[i].setStanowisko(stanowiska2[rand.nextInt(stanowiska2.length)]);
//            }
//            
//            System.out.println(arrayPracownik[i].getImie() + " " + arrayPracownik[i].getNazwisko() + " " + arrayPracownik[i].getPensja() + " " + arrayPracownik[i].getStanowisko() + " " + arrayPracownik[i].getStazPracy());
//        }
        
        //zad. 6
//        Pracownik.Ranking(arrayPracownik, 0);
//	System.out.println("\nsorted:");
//        for (int i = 0; i < arrayPracownik.length; i++) 
//	{
//            System.out.println(arrayPracownik[i].getImie() + " " + arrayPracownik[i].getNazwisko() + " " + arrayPracownik[i].getPensja() + " " + arrayPracownik[i].getStanowisko() + " " + arrayPracownik[i].getStazPracy());
//        }
	
	//zad. 7
//	Pracownik p3 = new Pracownik("Jan", "Kowalski", "kierownik", 10);
//	System.out.println(p3.getImie() + " " + p3.getNazwisko() + " " + p3.getPensja() + " " + p3.getStanowisko() + " " + p3.getStazPracy());
//	Pracownik p4 = new Pracownik(p3);
//	System.out.println(p4.getImie() + " " + p4.getNazwisko() + " " + p4.getPensja() + " " + p4.getStanowisko() + " " + p4.getStazPracy());
    }
    
}


