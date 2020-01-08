/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;
import java.io.*;
import java.util.Random;

/**
 *
 * @author pc
 */
public class Zad2 {

    public static void writeToRandomAccesFile(String fileName) throws Exception
    {
	Random rand = new Random();
	try
	{
	    RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
	    
	    for (int i = 0; i < 20; i++) {	//wpisuje dane do pliku
		raf.writeInt(rand.nextInt(101) + 50);
	    }
	    raf.close();
	}
	catch (FileNotFoundException e) {
	    e.printStackTrace();
	}
	catch (IOException e) {
	    e.printStackTrace();
	}
    }
    
    public static void readFromRandomAccesFile(String fileName) throws Exception
    {
	try
	{
	    RandomAccessFile raf = new RandomAccessFile(fileName, "r");
	    
	    raf.seek(0);
	    for (int i = 0; i < 20; i++) {
		System.out.println(raf.readInt());
	    }
	    raf.close();
	}
	catch (FileNotFoundException e) {
	    e.printStackTrace();
	}
	catch (IOException e) {
	    e.printStackTrace();
	}
    }
    
    public static void changeValuesRandomAccesFile(String fileName) throws Exception
    {
	try
	{
	    RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
	    int temp = 0;
	    
	    for (int i = 0; i < 20; i++) {
		temp = raf.readInt();
		raf.seek(raf.getFilePointer() - 4);
		raf.writeInt(temp + 1); 
	    }
	    raf.close();
	}
	catch (FileNotFoundException e) {
	    e.printStackTrace();
	}
	catch (IOException e) {
	    e.printStackTrace();
	}
    }
    public static void main(String[] args) throws Exception {
	
	writeToRandomAccesFile("raf.txt");
	readFromRandomAccesFile("raf.txt");
	changeValuesRandomAccesFile("raf.txt");
	System.out.println();
	readFromRandomAccesFile("raf.txt");
    }
    
    
}
