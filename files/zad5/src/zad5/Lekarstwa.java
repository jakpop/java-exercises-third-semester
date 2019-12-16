/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad5;

import java.io.Serializable;

/**
 *
 * @author pc
 */
public class Lekarstwa implements Serializable {

    public String[] nazwa;
    public double[] cena;
    public double[] refundacja;
    
    Lekarstwa() { }

    Lekarstwa(String[] nazwa, double[] cena, double[] refundacja)
    {
	String[] tempArr = new String[nazwa.length];
	for (int i = 0; i < nazwa.length; i++) {
	    String temp = "";
	    temp += String.valueOf(nazwa[i].charAt(0)).toUpperCase();
	    temp += String.valueOf(nazwa[i].substring(1)).toLowerCase();
	    tempArr[i] = temp;
	}
	this.nazwa = tempArr;
	this.cena = cena;
	this.refundacja = refundacja;
    }

    public double cena(String lek, boolean ubezpieczony)
    {
	double newCena = 0;
	for (int i = 0; i < nazwa.length; i++)
	{
	    if (lek.equals(nazwa[i]))
	    {
		if (ubezpieczony == true)
		{
		    newCena = cena[i] * (1 - refundacja[i]);
		}
		else
		{
		    newCena = cena[i];
		}
	    }
	}
	return newCena;
    }

    public double kosztCalkowity()
    {
	double koszt = 0;

	for (int i = 0; i < nazwa.length; i++) {
	    koszt += cena[i];
	}

	return koszt;
    }

    public void wyswietl()
    {
	for (int i = 0; i < nazwa.length; i++) {
	    System.out.println(String.format("Nazwa: %s, Cena: %.2fzł, Refundacja: %.0f%%", nazwa[i], cena[i], refundacja[i]*100));
	}
    }
	
    public static void main(String[] args) throws Exception {
	
	Lekarstwa lek1 = new Lekarstwa(new String[]{"aspiryna", "ibuprom", "apap", "rutinoscorbin", "nospa", "xanax", "percocet", "acodin", "etopiryna", "syrop", "nurofen", "alprazolam"}, 
				       new double[]{1.0, 5.0, 10.0, 20.0, 15.0, 100.0, 44.0, 73.0, 90.0, 167.0, 11.0, 52.0},
				       new double[]{0.01, 0.5, 0.08, 0.2, 0.9, 0.17, 0.28, 0.77, 0.23, 0.09, 0.11, 0.45});
	Lekarstwa lek2 = new Lekarstwa(new String[]{"aspiryna", "ibuprom"}, 
				       new double[]{10000.0, 5.0},
				       new double[]{0.01, 0.5});
	Lekarstwa lek3 = new Lekarstwa(new String[]{"aspiryna", "ibuprom", "apap", "rutinoscorbin", "nospa", "xanax", "percocet", "acodin"}, 
				       new double[]{1.0, 5.0, 10.0, 20.0, 15.0, 100.0, 44.0, 73.0},
			               new double[]{0.01, 0.5, 0.08, 0.2, 0.9, 0.17, 0.28, 0.77});
	Lekarstwa lek4 = new Lekarstwa(new String[]{"aspiryna", "ibuprom", "apap", "rutinoscorbin", "nospa", "xanax"}, 
				       new double[]{1.0, 5.0, 10.0, 20.0, 15.0, 100.0},
				       new double[]{0.01, 0.5, 0.08, 0.2, 0.9, 0.17});
	
	Lekarstwa[] lekArray = {lek1, lek2, lek3, lek4};
	Obsluga.zapiszDoPlikuTablice(lekArray, "lek.dat");
	Obsluga.zapiszMniejNiz10(lekArray, "nowe.dat");
//	Obsluga.wypiszDanezPliku("nowe.dat");
	
    }
}
