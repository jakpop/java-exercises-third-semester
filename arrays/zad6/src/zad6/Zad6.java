/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad6;

import java.util.Random;

/**
 *
 * @author pc
 */
public class Zad6 {

    public static void JaggedArray()
    {
        Random rand  = new Random();
        int max = -25;
        int min = 25;
        
        /* stwórz nieregularną tablicę 2D */
        int[][] jaggArr = new int[10][];
        for (int i = 0; i < jaggArr.length; i++)
        {
            jaggArr[i] = new int[jaggArr.length - i];
        }
        
        /* stwórz regularną tablicę jednowymairową */
        int[] regArr = new int[jaggArr.length];
        
        /* wypełnij nieregularną tablicę losowymi wartościami i znajdź max i min element w odpowiednich wierszach */
        for (int i = 0; i < jaggArr.length; i++)
        {
            for (int j = 0; j < jaggArr[i].length; j++)
            {
                jaggArr[i][j] = rand.nextInt(51)-25;
                System.out.print(jaggArr[i][j] + " ");
                
                if (jaggArr[i][j] >= max)
                    max = jaggArr[i][j];
                if (jaggArr[i][j] <= min)
                    min = jaggArr[i][j];
            }
            
            if (i%2 == 1)
            {
                regArr[i] = max;
                max = -25;
                min = 25;
            }
            if (i%2 == 0)
            {
                regArr[i] = min;
                min = 25;
                max = -25;
            }
            
            System.out.println();
        }
        
        System.out.println("\nRegularna tablica:");
        for (int i = 0; i < regArr.length; i++)
        {
            System.out.print(regArr[i] + " ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        JaggedArray();
    }
    
}
