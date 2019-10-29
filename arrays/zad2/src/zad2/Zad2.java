/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;
import java.util.Random;

/**
 *
 * @author pc
 */
public class Zad2 {

    // zad. 2b
    public static void FillArray(int x)
    {
        Random rand = new Random();
        int[] arrayToBeFilled = new int[x];
        int count = 0;
        for (int i = 0; i < x; i++)
        {
            arrayToBeFilled[i] = rand.nextInt(100);
            count += arrayToBeFilled[i];
        }
        
        for (int i = 0; i < arrayToBeFilled.length; i++)
            System.out.println(arrayToBeFilled[i]);
        
        System.out.println("Zliczona wartość: " +count);
    }
    public static void main(String[] args) {
        
        // zad. 2b
        FillArray(10);
        
    }
    
}
