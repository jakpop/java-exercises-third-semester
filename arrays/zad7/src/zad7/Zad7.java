/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad7;

import java.util.Random;

/**
 *
 * @author student
 */
public class Zad7 {

    // zad. 7a
    public static void MatrixSum()
    {
        int[][] firstArray2D = new int[4][4];
        int[][] secondArray2D = new int[4][4];
        int[][] thirdArray2D = new int[4][4];
        
        Random rand = new Random();
        
        System.out.println("Pierwsza tablica:");
        for (int i = 0; i < firstArray2D.length; i++)
        {
            for (int j = 0; j < firstArray2D[i].length; j++)
            {
                firstArray2D[i][j] = rand.nextInt(100);
                System.out.print(firstArray2D[i][j] + " ");
            }
            
            System.out.println();
        }
        
        System.out.println("\nDruga tablica:");
        for (int i = 0; i < secondArray2D.length; i++)
        {
            for (int j = 0; j < secondArray2D[i].length; j++)
            {
                secondArray2D[i][j] = rand.nextInt(100);
                System.out.print(secondArray2D[i][j] + " ");
            }
            
            System.out.println();
        }
        
        System.out.println("\nTrzecia tablica:");
        for (int i = 0; i < thirdArray2D.length; i++)
        {
            for (int j = 0; j < thirdArray2D[i].length; j++)
            {
                thirdArray2D[i][j] = firstArray2D[i][j] + secondArray2D[i][j];
                System.out.print(thirdArray2D[i][j] + " ");
            }
            
            System.out.println();
        }
        
    }
    
    //zad. 7b
    public static void Vowels()
    {
        int[][] array2D = new int[5][5];
        
        Random rand = new Random();
        String vowels = "";
        String consonants = "";
        
        for (int i = 0; i < array2D.length; i++)
        {
            for (int j = 0; j < array2D[i].length; j++)
            {
                array2D[i][j] = rand.nextInt(26) + 97;
                System.out.print((char)array2D[i][j] + " ");
                
                if ((char)array2D[i][j] == 'a' || (char)array2D[i][j] == 'e' || (char)array2D[i][j] == 'i' || 
                    (char)array2D[i][j] == 'o' || (char)array2D[i][j] == 'u' || (char)array2D[i][j] == 'y')
                {
                    vowels += (char)array2D[i][j];
                }
                else
                {
                    consonants += (char)array2D[i][j];
                }
            }
            
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Samogloski: " + vowels);
        System.out.println("Spolgloski: " + consonants);
    }
    
    //zad. 7c
    public static void Fill2DArrayWithLetters(String wordInput)
    {
        char[][] arrayOfChars = new char[wordInput.length()/10 + 1][10];
        int count = 0;
        
        for (int i = 0; i < arrayOfChars.length; i++)
        {
            if (wordInput.length() < 16)
            {
                System.out.println("Minimum length of string is 16");
                break;
            }
            
            for (int j = 0; j < arrayOfChars[1].length; j++)
            {
                if (count < wordInput.length())
                {
                    arrayOfChars[i][j] = wordInput.charAt(count);
                    count++;
                    System.out.print(arrayOfChars[i][j]);
                }
                else
                {
                    arrayOfChars[i][j] = '0';
                    System.out.print(arrayOfChars[i][j]);
                }
            }
            
            System.out.println();
        }
    }
    
    //zad. 7d
    public static void MatrixDivision()
    {
        double[][] firstArray2D = new double[4][4];
        double[][] secondArray2D = new double[4][4];
        double[][] thirdArray2D = new double[4][4];
        
        Random rand = new Random();
        
        System.out.println("Pierwsza tablica:");
        for (int i = 0; i < firstArray2D.length; i++)
        {
            for (int j = 0; j < firstArray2D[i].length; j++)
            {
                firstArray2D[i][j] = rand.nextDouble()*10;
                System.out.print(firstArray2D[i][j] + " ");
            }
            
            System.out.println();
        }
        
        System.out.println("\nDruga tablica:");
        for (int i = 0; i < secondArray2D.length; i++)
        {
            for (int j = 0; j < secondArray2D[i].length; j++)
            {
                secondArray2D[i][j] = rand.nextDouble()*10;
                System.out.print(secondArray2D[i][j] + " ");
            }
            
            System.out.println();
        }
        
        System.out.println("\nTrzecia tablica:");
        for (int i = 0; i < thirdArray2D.length; i++)
        {
            for (int j = 0; j < thirdArray2D[i].length; j++)
            {
                if (secondArray2D[i][j] == 0)
                {
                    System.out.print("CannotDivideBy0" + " ");
                }
                else
                {
                    thirdArray2D[i][j] = firstArray2D[i][j] / secondArray2D[i][j];
                    System.out.print(thirdArray2D[i][j] + " ");
                }
            }
            
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        //zad. 7a
//        MatrixSum();

        //zad. 7b
//        Vowels();

        //zad. 7c
//        String word = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the "; 
//        String word2 = "aa bb cc";
//        Fill2DArrayWithLetters(word);

        //zad. 7d
        MatrixDivision();
    }
    
}
