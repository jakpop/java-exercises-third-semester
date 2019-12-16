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
	try
	{
	    RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
	    Random rand = new Random();
	    
	    raf.seek(0);
	    for (int i = 0; i < 20; i++) {	//wpisuje dane do pliku
		raf.write(rand.nextInt(101) + 50);
		System.out.println(raf.readInt());
	    }
	    System.out.println("");
	    
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
	    RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
	    
	    raf.seek(0);
	    for (int i = 0; i < 20; i++) {
		int a = raf.readInt();
		raf.writeInt(a + 1);
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
    public static void main(String[] args) throws Exception {
	
	writeToRandomAccesFile("raf.txt");
	readFromRandomAccesFile("raf.txt");
    }
    
}
