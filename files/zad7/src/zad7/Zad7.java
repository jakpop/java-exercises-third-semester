/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author pc
 */
public class Zad7 {

    public static void zapiszKwadraty(int start, int end, String fileName) throws Exception {
	BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	
	for (int i = start; i <= end; i++) {
	    bw.write(String.format("Kwadrat liczby %s wynosi %s\n", start, Math.pow(start, 2)));
	    start++;    
	}
	bw.close();
    }
    
    public static void wypiszKwadraty(String fileName) throws Exception {
	BufferedReader br = new BufferedReader(new FileReader(fileName));
	
	String line = "";
	while ((line = br.readLine()) != null) {
	    System.out.println(line);
	}
	br.close();
    }
    public static void main(String[] args) throws Exception {
	zapiszKwadraty(1, 10, "zad7.txt");
	wypiszKwadraty("zad7.txt");
    }
    
}
