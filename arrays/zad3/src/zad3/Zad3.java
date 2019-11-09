/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

import java.math.BigInteger;

/**
 *
 * @author pc
 */
public class Zad3 {

    public static int Fibonacci(int x)
    {
        if (x <= 1)
            return x;
        
        return Fibonacci(x-2) + Fibonacci(x-1);
    }
    
    public static void FibonacciArray()
    {
        BigInteger[] array = new BigInteger[100];
        
        System.out.println(array[0] = BigInteger.ONE);
        System.out.println(array[1] = BigInteger.ONE);
        
        for (int i = 2; i < array.length; i++)
        {
            array[i] = array[i-2].add(array[i-1]);
            System.out.println(array[i]);
        }
    }
    
    public static void main(String[] args) {
//        System.out.println(Fibonacci(7));
        FibonacciArray();
    }
    
}
