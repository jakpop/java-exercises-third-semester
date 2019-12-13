/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

import java.io.*;
import java.util.Random;

/**
 *
 * @author pc
 */
public class Zad3 {

    public static void createFile(String fileName) throws Exception
    {
	BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	Random rand = new Random();
	
	for (int i = 0; i < rand.nextInt(31); i++)
	{
	    bw.write(String.valueOf(rand.nextDouble()));
	    bw.write(":");
	}
	bw.close();
    }
    
    public static void replace(String fileName, char[] toBeReplaced, char[] replacedBy) throws Exception
    {
	BufferedReader br = new BufferedReader(new FileReader(fileName));

	String line = br.readLine();
	String replaced = "";
	
	replace:
	for (int i = 0; i < line.length(); i++)
	{
	    for (int j = 0; j < toBeReplaced.length; j++)
	    {
		if (line.charAt(i) == toBeReplaced[j])
		{
		    replaced += replacedBy[j];
		    continue replace;
		}
	    }
	    replaced += line.charAt(i);
	}
	
//	System.out.println(line);
//	System.out.println(replaced);
	
	br.close();
	
	BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	bw.write(replaced);
	bw.close();
    }
    
    public static void main(String[] args) throws Exception {
	createFile("zad3.txt");
	replace("zad3.txt", new char[]{'.', ':'}, new char[]{',', ' '});
    }
    
}
