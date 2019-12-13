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
	    RandomAccessFile rafFile = new RandomAccessFile(fileName, "rw");
	    Random rand = new Random();
	    
	    for (int i = 0; i < 20; i++) {	//wpisuje dane do pliku
		rafFile.seek(rafFile.getFilePointer() );
		rafFile.writeInt(rand.nextInt(101) + 50);
		System.out.println(rafFile.readInt());
	    }
	    System.out.println("");
	    
	    rafFile.close();
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
	    RandomAccessFile rafFile = new RandomAccessFile(fileName, "rw");
	    
	    for (int i = 0; i < 20; i++) {
		int a = rafFile.readUnsignedByte();
		rafFile.seek(0);
		rafFile.writeInt(a + 1);
		System.out.println(a);
	    }
	    rafFile.close();
	}
	catch (FileNotFoundException e) {
	    e.printStackTrace();
	}
	catch (IOException e) {
	    e.printStackTrace();
	}
    }
    public static void main(String[] args) throws Exception {
	
	writeToRandomAccesFile("raffile.txt");
	readFromRandomAccesFile("raffile.txt");
    }
    
}
