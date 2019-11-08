/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad5;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Zad5 {
    
    //zad. 5a
    public static void tabliczkaMnozenia()
    {
        int[][] arr = new int[10][10];
        
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[1].length; j++)
            {
                arr[i][j] = (i+1)*(j+1);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    //zad. 5b
    public static void randomArrayMaxSum() 
    {
        int [][] arr = new int[10][5];
        
        Random rand = new Random();
        int suma = 0;
        int sumaMax = 0;
        
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[1].length; j++)
            {
                arr[i][j] = rand.nextInt(21);
                suma += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            
            if (suma > sumaMax)
            {
                sumaMax = suma;
            }
            
            System.out.print("| suma = " + suma + "\n");
            suma = 0;
        }
        System.out.println("\nNajwiększa suma w wierszu = " +sumaMax);
    }
    
    //zad. 5c
    public static void fillArrayDouble()
    {
        double[][] arr = new double[10][10];
        
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Wyzerować doatnie czy ujemne? (wpisz: 1 lub -1)");
        int input = sc.nextInt();
        
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[1].length; j++)
            {
                arr[i][j] = Math.round((rand.nextDouble() - 0.5)*100.0)/100.0;
                
                if (input < 0)
                {
                    if (arr[i][j] < 0)
                    {
                        arr[i][j] = 0;
                    }
                }
                else
                {
                    if (arr[i][j] > 0)
                    {
                        arr[i][j] = 0.0;
                    }
                }
                
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    //zad. 5d
    public static void averageAndDiagonal()
    {
        int[][] arr = new int[5][5];
        
        Random rand = new Random();
        double average = 0;
        double sumAverage = 0;
        int sumIndex = 0;
        int sumDiagonal = 0;
        
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[1].length; j++)
            {
                arr[i][j] = rand.nextInt(201)-100;
                sumAverage += arr[i][j];
                sumIndex += 1;
                
                if ( i == j)
                {
                    sumDiagonal += arr[i][j];
                }
                
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        average = sumAverage/sumIndex;
        System.out.println("\nŚrednia: " +average);
        System.out.println("Suma na diagonali: " +sumDiagonal);
    }
    
    public static void main(String[] args) {
        
        //zad. 5a
//        tabliczkaMnozenia();
        
        //zad. 5b
//        randomArrayMaxSum();

        //zad. 5c
//        fillArrayDouble();

        //zad. 5d
//        averageAndDiagonal();
    }
    
}