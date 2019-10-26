/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad.pkg4;

/**
 *
 * @author pc
 */
public class Zad4 {

    // zad. 4a
    public String word1 = "";
    public String myToUpperCase()
    {
        String wordUpper = "";
        char[] charsUpper = word1.toCharArray();
        int ascii;
        int asciiUpper;
        for (int i = 0; i < word1.length(); i++)
        {
            ascii = (byte)word1.charAt(i);           //kod ASCII pierwszego znaku
            if (ascii > 64 && ascii < 91)            //jeśli jest już uppercase
            {
                continue;
            }
            asciiUpper = ascii - 32;                //kod ASCII uppercase
            charsUpper[i] = (char)asciiUpper;       //wprowadź kolejne znaki uppercasem do tablicy
            
            if (word1.charAt(i) == ' ')
            {
                charsUpper[i] = ' '; 
            }
        }
        wordUpper = new String(charsUpper);         //zamiana tablicy znaków na stringa
        return wordUpper;
    }
    
    // zad. 4b
    public String word2 = "";
    public String myToLowerCase()
    {
        String wordLower = "";
        char[] charsLower = word2.toCharArray();
        int ascii;
        int asciiLower;
        for (int i = 0; i < word2.length(); i++)
        {
            ascii = (byte)word2.charAt(i);           //kod ASCII pierwszego znaku
            if (ascii > 96 && ascii < 123)           //jeśli jest już lowercase
            {
                continue;
            }
            asciiLower = ascii + 32;                //kod ASCII lowercase
            charsLower[i] = (char)asciiLower;       //wprowadź kolejne znaki lowercasem do tablicy
            if (word2.charAt(i) == ' ')
            {
                charsLower[i] = ' '; 
            }
        }
        wordLower = new String(charsLower);         //zamiana tablicy znaków na stringa
        return wordLower;
    }
    public static void main(String[] args) {
        
        // zad. 4a
        Zad4 Obj4a = new Zad4();
        Obj4a.word1 = "Ala ma kota";
        System.out.println(Obj4a.myToUpperCase());

        // zad. 4b
        Zad4 Obj4b = new Zad4();
        Obj4b.word2 = "ALA ma KOTA";
        System.out.println(Obj4b.myToLowerCase());
    }
    
}
