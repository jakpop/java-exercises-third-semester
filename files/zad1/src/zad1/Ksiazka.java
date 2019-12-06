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
public class Ksiazka implements Serializable{
    
    public String tytul;
    public String autor;
    public int rokWydania;
    public int liczbaStron;
    public String gatunek;
    
    public Ksiazka()
    {
        this.tytul = "";
        this.autor = "";
        this.rokWydania = 0;
        this.liczbaStron = 0;
        this.gatunek = "";
    }
    
    public Ksiazka(String tytul, String autor, int rokWydania, int liczbaStron, String gatunek)
    {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.liczbaStron = liczbaStron;
        this.gatunek = gatunek;
    }
    
    public Ksiazka(Ksiazka ksiazka)
    {
        this.tytul = ksiazka.tytul;
        this.autor = ksiazka.autor;
        this.rokWydania = ksiazka.rokWydania;
        this.liczbaStron = ksiazka.liczbaStron;
        this.gatunek = ksiazka.gatunek;
    }
    
    public void PrzedstawSie()
    {
        System.out.println(tytul + ", " + autor + ", " + rokWydania + ", " + liczbaStron + ", " + gatunek);
    }
    
}
