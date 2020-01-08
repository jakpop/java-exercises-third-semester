/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad6;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

/**
 *
 * @author pc
 */
public class Zad6 {

    public static void writeToRandomAccesFile(String fileName, House[] houses) throws Exception
    {
	try
	{
	    RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
	    
	    for (int i = 0; i < houses.length; i++) {
		raf.writeUTF(houses[i].name);
		raf.writeInt(houses[i].floorCount);
		raf.writeDouble(houses[i].price);		
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
	    RandomAccessFile raf = new RandomAccessFile(fileName, "rw");

	    while (true) {
		System.out.println(String.format("%s, %s, %s", raf.readUTF(), raf.readInt(), raf.readDouble()));
	    }
	}
	catch (EOFException e) {
	    //nothing
	}
	catch (FileNotFoundException e) {
	    e.printStackTrace();
	}
	catch (IOException e) {
	    e.printStackTrace();
	}
    }
    
    public static String decreasePriceOneFloorHouses(String fileName) throws Exception
    {
	House house = new House();
	String largestFloorHouse = "";
	
	try
	{
	    RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
	    
	    int maxFloor = 0;
	    while (true) {
		house.name = raf.readUTF();
		house.floorCount = raf.readInt();
		house.price = raf.readDouble();
		
		if (house.floorCount == 0) {
		    raf.seek(raf.getFilePointer() - 8);
		    raf.writeDouble(house.price * 0.9);
		}
		if (house.floorCount > maxFloor) {
		    maxFloor = house.floorCount;
		    largestFloorHouse = house.name;
		}
	    }
	}
	catch (EOFException e) {
	    
	}
	catch (FileNotFoundException e) {
	    e.printStackTrace();
	}
	catch (IOException e) {
	    e.printStackTrace();
	}
	
	return largestFloorHouse;
    }
    public static void main(String[] args) throws Exception {
	House h1 = new House("dom1", 0, 100.0);
	House h2 = new House("dom2", 5, 200.0);
	House h3 = new House("dom3", 15, 1000.0);
	House[] houses = {h1, h2, h3};
	
	writeToRandomAccesFile("houses.txt", houses);
	System.out.println(decreasePriceOneFloorHouses("houses.txt"));
	readFromRandomAccesFile("houses.txt");
    }
    
}
