/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

import java.io.*;

/**
 *
 * @author pc
 */
public class Obsluga implements Serializable {
    
    public static int zapiszDoPliku(Film film) throws Exception
    {
	ObjectOutputStream strumienZapisu = null;
	
	try
	{
	    strumienZapisu = new ObjectOutputStream(new FileOutputStream("plik.obj"));
	    strumienZapisu.writeObject(film);
	    
	    return 0;
	}
	
	catch(Exception e)
	{
	    e.printStackTrace();
	    return -1;
	}
    }
    
    public static int zapiszDoPlikuTablice(Object[] objectArray) throws Exception
    {
	ObjectOutputStream strumienZapisu = null;
	
	try
	{
	    strumienZapisu = new ObjectOutputStream(new FileOutputStream("plik2.obj"));
	    for (int i = 0; i < objectArray.length; i++) 
	    {
		strumienZapisu.writeObject(objectArray[i]);
	    }
	    return 0;
	}
	catch(Exception e)
	{
	    e.printStackTrace();
	    return -1;
	}
    }
    
    public static void wypiszDanezPliku(String nazwaPliku) throws Exception
    {
	ObjectInputStream strumienOdczytu = null;
	
	try
	{
	    strumienOdczytu = new ObjectInputStream(new FileInputStream(nazwaPliku));
	    
	    Object obj = null;
	    
	    Film fTest = new Film();
	    Ksiazka kTest = new Ksiazka();
	    
	    while ((obj = strumienOdczytu.readObject()) != null)
	    {
		if (obj instanceof Ksiazka)
		{
		    kTest = (Ksiazka)obj;
		    kTest.PrzedstawSie();
		}
		if (obj instanceof Film)
		{
		    fTest = (Film)obj;
		    System.out.println(fTest.tytul + ", " + fTest.rezyser);
		}
	    }
	}
	
	catch (EOFException ex)
	{
	    System.out.println("Koniec pliku");
	}
	catch (Exception e)
	{
	    e.printStackTrace();
	}
    }
}
