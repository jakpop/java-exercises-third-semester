/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;
import java.io.*;

/**
 *
 * @author pc
 */
public class Zad2 {

    public static void writeToRandomAccesFile(String fileName, int position, double[] doubleArray) throws Exception
    {
	try
	{
	    RandomAccessFile rafFile = new RandomAccessFile(fileName, "rw");
	    
	    
	    rafFile.seek(position);				//ustawia pointer na wybranej pozycji
	    for (int i = 0; i < doubleArray.length; i++) {	//wpisuje dane do pliku
		rafFile.writeDouble(doubleArray[i]);
	    }
	    rafFile.close();
	}
	catch (IOException e)
	{
	    e.printStackTrace();
	}
    }
    
    public static void readFromrandomAccesFile(String fileName, int position) throws Exception
    {
	try
	{
	    RandomAccessFile rafFile = new RandomAccessFile(fileName, "rw");
	    
	    rafFile.seek(position);
	    System.out.println(rafFile.readDouble());
	    rafFile.close();
	}
	catch (IOException e)
	{
	    e.printStackTrace();
	}
    }
    public static void main(String[] args) {
    }
    
}
