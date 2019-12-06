/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

import java.io.*;

/**
 *
 * @author student
 */
public class Film implements Serializable {
    
    public String tytul;
    public String rezyser;
    public int rokProdukcji;
    public String[] aktorzy;
    
    public Film()
    {
        this.tytul = "";
        this.rezyser = "";
        this.rokProdukcji = 0;
        this.aktorzy = null;
    }
    
    public Film(String tytul, String rezyser, int rokProdukcji, String[] aktorzy)
    {
        this.tytul = tytul;
        this.rezyser = rezyser;
        this.rokProdukcji = rokProdukcji;
        this.aktorzy = aktorzy;
    }
    
    public Film(Film film)
    {
        this.tytul = film.tytul;
        this.rezyser = film.rezyser;
        this.rokProdukcji = film.rokProdukcji;
        this.aktorzy = film.aktorzy;
    }
    
    public static void wypiszAktorow(String[] aktorzy)
    {
        for (String a : aktorzy)
            System.out.print(a + ", ");
	System.out.println();
    }
    
    public void PrzedstawSie()
    {
        System.out.print(tytul + "; " + rezyser + "; " + rokProdukcji + "; ");
        wypiszAktorow(aktorzy);
    }
}
