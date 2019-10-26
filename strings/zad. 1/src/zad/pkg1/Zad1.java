/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad.pkg1;
import java.util.Scanner;
/**
 *
 * @author student12
 */
public class Zad1 {

    // zad. 1a
    public static void LongestWord()
    {
        String wordMax;
        
        String[] words = { "chain", "longestever", "XDXD" };
        wordMax = words[0];
        
        for (int i = 0; i < words.length-1; i++)
        {
            if (words[i+1].length() > words[i].length())
                wordMax = words[i+1];
        }
        
        System.out.println(wordMax.length());
        System.out.println(wordMax);
    }
    
    // zad. 1b
    public static void CharCount()
    {
        Scanner myObj = new Scanner(System.in); //ReadLine
        
        System.out.println("Podaj łańcuch: ");
        String inputString = myObj.nextLine(); //wczytany łańcuch
        
        System.out.println("Podaj znak: ");
        String inputChar = myObj.nextLine(); //wczytany znak
        
        int count = 0;
        for (int i = 0; i < inputString.length(); i++)
        {
            if (inputString.charAt(i) == inputChar.charAt(0))
            {
                count++;
            }
        }
        System.out.println("Liczba wystąpień znaku: " +count);
    }
    public static void main(String[] args) {
        
        // zad. 1a
        LongestWord();
        
        // zad. 1b
        CharCount();
        
    }
    
}
