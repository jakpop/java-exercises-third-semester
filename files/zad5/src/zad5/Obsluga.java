/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad5;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author pc
 */
public class Obsluga implements Serializable {
    
    public static void zapiszDoPliku(Object object, String fileName) throws Exception
    {
	ObjectOutputStream strumienZapisu = null;
	
	try
	{
	    strumienZapisu = new ObjectOutputStream(new FileOutputStream(fileName));
	    strumienZapisu.writeObject(object);
	}
	
	catch(Exception e)
	{
	    e.printStackTrace();
	}
    }
    
    public static void zapiszDoPlikuTablice(Object[] objectArray, String fileName) throws Exception
    {
	ObjectOutputStream strumienZapisu = null;
	
	try
	{
	    strumienZapisu = new ObjectOutputStream(new FileOutputStream(fileName));
	    for (int i = 0; i < objectArray.length; i++) 
	    {
		strumienZapisu.writeObject(objectArray[i]);
	    }
	}
	catch(Exception e)
	{
	    e.printStackTrace();
	}
    }
    
    public static void zapiszMniejNiz10(Lekarstwa[] lekArray, String fileName) throws Exception
    {
	ObjectOutputStream strumienZapisu = null;
	
	int count = 0;
	try
	{
	    strumienZapisu = new ObjectOutputStream(new FileOutputStream(fileName));
	    for (int i = 0; i < lekArray.length; i++) 
	    {
		if (lekArray[i].nazwa.length < 10 && lekArray[i].kosztCalkowity() < 1000.0)
		{
		    strumienZapisu.writeObject(lekArray[i]);
		    count++;
		}
	    }
	}
	catch(Exception e)
	{
	    e.printStackTrace();
	}
	
	BufferedWriter bw = new BufferedWriter(new FileWriter("ile.txt"));
	bw.write(String.valueOf(count));
	bw.close();
    }
    
    public static void wypiszDanezPliku(String nazwaPliku) throws Exception
    {
	ObjectInputStream strumienOdczytu = null;
	
	try
	{
	    strumienOdczytu = new ObjectInputStream(new FileInputStream(nazwaPliku));
	    
	    Object obj = null;
	    
	    Lekarstwa test = new Lekarstwa();
	    
	    while ((obj = strumienOdczytu.readObject()) != null)
	    {
		if (obj instanceof Lekarstwa)
		{
		    test = (Lekarstwa)obj;
		    test.wyswietl();
		    System.out.println("");
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
