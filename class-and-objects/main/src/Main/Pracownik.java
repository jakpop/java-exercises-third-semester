/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.*;

/**
 *
 * @author pc
 */
public class Pracownik {
    
    private String imie;
    private String nazwisko;
    private String stanowisko;
    private int stazPracy;
    private double pensja;
    
    public String getImie() {
        return imie;
    }
    
    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public int getStazPracy() {
        return stazPracy;
    }

    public void setStazPracy(int stazPracy) {
        this.stazPracy = stazPracy;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }
    
    public Pracownik()
    {
        this.imie = "Imie";
        this.nazwisko = "Nazwisko";
        this.pensja = 999.99;
        this.stanowisko = "Stanowisko";
        this.stazPracy = 9;
    }
    
    public Pracownik(String imie, String nazwisko, String stanowisko, int stazPracy)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.stazPracy = stazPracy;
        
        if (stanowisko == "manager")
            this.pensja = 3600.00 + 150*stazPracy + 500.00;
        else if (stanowisko == "kierownik")
            this.pensja = 3600.00 + 150*stazPracy + 1000.00;
        else
            this.pensja = 3600.00 + 150*stazPracy;
            
    }
    
    public Pracownik(Pracownik pracownik)
    {
	this.imie = pracownik.imie;
	this.nazwisko = pracownik.nazwisko;
	this.stanowisko = pracownik.stanowisko;
	this.stazPracy = pracownik.stazPracy;
	this.pensja = pracownik.pensja;
    }
    
    public boolean zwiekszPensja(double wzrost)
    {
        double podwyzka = 1 + wzrost;
        this.pensja *= podwyzka;
        
        if (this.pensja > 10000.00)
        {
            this.pensja /= podwyzka;
            return false;
        }
        
        return true;
    }
    
    public void zwiekszStaz()
    {
        this.stazPracy += 1;
        
        if (stanowisko == "manager")
            this.pensja = 3600.00 + 150*stazPracy + 500.00;
        
        if (stanowisko == "kierownik")
            this.pensja = 3600.00 + 150*stazPracy + 1000.00;
        
    }
    
    
    /* ZADANIE 5 */
    public static Random rand = new Random();
    
    public static String surname;
    public static String randomSurname()
    {
        surname = "";
        for (int i = 0; i < 3 + rand.nextInt(13); i++)
        {
            if (i == 0)
            {
                surname += (char)(rand.nextInt(26) + 65);
            }
            surname += (char)(rand.nextInt(26) + 97);
        }
        return surname;
    }
    
    /* ZADANIE 6 */
    public static void Ranking(Pracownik[] firma, int klucz) 
    {
        switch (klucz) 
        {
            case 0:
                Arrays.sort(firma, Comparator.comparing(Pracownik::getNazwisko));
                break;
            case 1:
                Arrays.sort(firma, Comparator.comparing(Pracownik::getStanowisko));
                break;
            case 2:
                Arrays.sort(firma, Comparator.comparing(Pracownik::getPensja));
                break;
        }
    }
    
}
