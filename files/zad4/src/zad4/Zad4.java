/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4;

/**
 *
 * @author pc
 */
public class Zad4 {

    static class Lekarstwa 
    {
	private String[] nazwa;
	private double[] cena;
	private double[] refundacja;
	
	public String[] getNazwa() {
	    return nazwa;
	}
	
	public void setNazwa(String[] nazwa) {
	    this.nazwa = nazwa;
	}

	public double[] getCena() {
	    return cena;
	}

	public void setCena(double[] cena) {
	    this.cena = cena;
	}

	public double[] getRefundacja() {
	    return refundacja;
	}

	public void setRefundacja(double[] refundacja) {
	    this.refundacja = refundacja;
	}	
	
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
    }
    
    public static void main(String[] args) {
	String[] nazwa = {"aspiRYNA", "iBuPrOm", "rutinoscorbin"};
	double[] cena = {10.0, 20.0, 30.0};
	double[] refundacja = {0.02, 0.1, 0.5};
	Lekarstwa lekarstwa = new Lekarstwa(nazwa, cena, refundacja);
	lekarstwa.wyswietl();
	System.out.println(String.format("Cena po refundacji: %.2f zł", lekarstwa.cena("Rutinoscorbin", true)));
	System.out.println(String.format("Koszt całkowity: %.2f zł", lekarstwa.kosztCalkowity()));
    }
    
}
