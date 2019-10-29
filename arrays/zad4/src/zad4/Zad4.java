/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4;
import java.util.Random;

/**
 *
 * @author pc
 */
public class Zad4 {

    public static double[] FillArray(int n)
    {
        double[] arr = new double[n];
        Random rand = new Random();
        
        for (int i = 0; i < n; i++)
        {
            arr[i] = rand.nextInt(11) - 5;
        }
        return arr;
    }
    
    public static double[] Sort(double[] arr)
    {
        int n = arr.length; 
  
        for (int i = 0; i < n - 1; i++) 
        { 
            int min = i; 
            for (int j = i+1; j < n; j++)
            {
                if (arr[j] < arr[min]) 
                    min = j; 
            }
            
            double temp = (double)arr[min]; 
            arr[min] = arr[i]; 
            arr[i] = temp;            
        }
        return arr;
    }
    
    public static double Average(double[] a)
    {
        double average = 0;
        double count = 0;
        for (int i = 0; i < a.length; i++)
        {
            count += a[i];
        }
        average = (count/a.length);
        return average;
    }
    
    public static double CustomAverage(double[] a)
    {
        int index = 0;
        double average = 0;
        double count = 0;
        
        for (int i = 0; i < a.length; i++)
        {
            if (i%2 != 0 && a[i] != 0)
            {
                count += a[i];
                index++;
            }
            
        }
        average = (count/index);
        
        return average;
    }
    
    public static double Median(double[] a)
    {
        double median = 0;
        if (a.length%2 != 0)
        {
            median = a[((a.length + 1)/2)];
        }
        else
        {
            median = ((a[a.length/2 - 1] + a[a.length/2])/2);
        }
        return median;
    }
    
    public static void main(String[] args) {
        
        double[] intArr = FillArray(10);
        Sort(intArr);
        
        for (double d : intArr)
            System.out.println(d);
        
        System.out.println("Srednia: " +Average(intArr));
        System.out.println("Mediana: " +Median(intArr));
        System.out.println("Srednia dla parzystych, niezerowych elementów: " +CustomAverage(intArr));
    }
    
}
