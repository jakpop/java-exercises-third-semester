/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacwieczenia1;

/**
 *
 * @author pc
 */
public class JavaCwieczenia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 5;
        
        // triangle
        for (int i = 0; i < a; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // full square
        for (int i = 0; i < a; i++) 
        {
            for (int j = 0; j < a; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        
        //square empty inside
        for (int i = 0; i < a; i++) 
        {
            for (int j = 0; j < a; j++) 
            {
                if (i == 0 || i == a-1)
                    System.out.print("*");
                else if (j == 0 || j == a-1)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        //square with diagonal inside
        for (int i = 0; i < a; i++) 
        {
            for (int j = 0; j < a; j++) 
            {
                if (i == 0 || i == a-1)
                    System.out.print("*");
                else if (j == 0 || j == a-1)
                    System.out.print("*");
                else if (i == j)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        //square with cross inside
        for (int i = 0; i < a; i++) 
        {
            for (int j = 0; j < a; j++) 
            {
                if (i == 0 || i == a-1)
                    System.out.print("*");
                else if (j == 0 || j == a-1)
                    System.out.print("*");
                else if (i == 2 || j == 2)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        //square full under diagonal
        for (int i = 0; i < a; i++) 
        {
            for (int j = 0; j < a; j++) 
            {
                if (i == 0 || i == a-1)
                    System.out.print("*");
                else if (j == 0 || j == a-1)
                    System.out.print("*");
                else if (i >= j)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        //AXAXAXA excercise
        for (int i = 0; i < 7; i++) 
        {
            for (int j = 0; j < 7; j++) 
            {
                if ( (i % 2) == 1 || (j % 2) == 1)
                    System.out.print("X");
                else 
                    System.out.print("A");
            }
            System.out.println();
        }
        
        System.out.println();
        
        //1x1x1x1 excercise
        for (int i = 0; i < 7; i++) 
        {
            for (int j = 0; j < 7; j++) 
            {
                if ( (i % 2 == 1) && (j % 2 == 1))
                    System.out.print("1");
                else if ( (i % 2 == 0) && (j % 2 == 0))
                    System.out.print("1");
                else 
                    System.out.print("x");
            }
            System.out.println();
        }
        
        System.out.println();
        
        //1x1o1x1 excercise
        for (int i = 0; i < 7; i++) 
        {
            for (int j = 0; j < 7; j++) 
            {
                if (i == 3 || j == 3)
                    System.out.print("o");
                else if ( (i % 2 == 1) && (j % 2 == 1))
                    System.out.print("1");
                else if ( (i % 2 == 0) && (j % 2 == 0))
                    System.out.print("1");
                else 
                    System.out.print("x");
            }
            System.out.println();
        }
    }
    
}
