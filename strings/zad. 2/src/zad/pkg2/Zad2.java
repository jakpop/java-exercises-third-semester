/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad.pkg2;

/**
 *
 * @author student
 */
public class Zad2 {
    
    // zad. 2a
    static int myCompareTo(String a, String b)
    {
        int wynik = 0;
        for (int i = 0; i < a.length(); i++)
        {
            if (a.length() == b.length())
            {
                if (a.charAt(i) != b.charAt(i))
                {
                    if (a.charAt(i) > b.charAt(i))
                        wynik = 1;
                    else if (a.charAt(i) < b.charAt(i))
                        wynik = -1;
                }
                else 
                    wynik = 0;
            }
            else if (a.length() > b.length())
                wynik = 1;
            else
                wynik = -1;
        }
        return wynik;
    }
    
    //  zad. 2b
    public String word1;
    public boolean myEndsWith(String suffix)
    {
        boolean flag = false;
        for (int i = suffix.length() - 1; i >= 0; i--)
        {
            for (int j = word1.length() - 1; j > (word1.length() - 1 - suffix.length()); j--)
            {
                if (suffix.charAt(i) == word1.charAt(j))
                {
                    flag = true;
                }
                else
                {
                    flag = false;
                }
            }
        } 
        return flag;
    }
    
    // zad. 2c
    public String word2;
    public int myIndexOf(String str)
    {
        int index = 0;
        for (int i = 0; i < word2.length()-str.length()+1; i++)
        {
            if (word2.charAt(i) == str.charAt(0))  // sprawdź czy jakaś litera z łańcucha pokrywa się z pierwszą ze sprawdzanego stringa
            {
                if (word2.substring(i, i+str.length()).equals(str)) // sprawdź czy sprawdzany string znajduje się w łańuchu
                {
                    index = i;
                    break;
                }
                else
                {
                    index = -1;
                }
            }
            else
            {
                index = -1;
            }
        } 
        return index;
    }
    
    // zad. 2d
    public String word3 = "";
    public String myReplace(char a, char b)
    {
        String wordReplaced = "";
        char[] wordReplacedChar = word3.toCharArray();
        for (int i = 0; i < word3.length(); i++)
        {
            if (word3.charAt(i) == a)
            {
                wordReplacedChar[i] = b;
            }
        }
        wordReplaced = new String(wordReplacedChar);
        return wordReplaced;
    }
    
    //zad. 2e
    public String word4 = "";
    public String mySubstring(int beginIndex)
    {
        String subString = "";
        char[] word4Char = word4.toCharArray();
        char[] substringChar = new char[word4.length() - beginIndex + 1];
        for (int i = beginIndex; i < word4.length(); i++)
        {
            substringChar[i - beginIndex] = word4Char[i];
        }
        subString = new String(substringChar);
        return subString;
    }
    public static void main(String[] args) {
        
        // zad. 2a
        System.out.println(myCompareTo("aaa", "aaa"));
        
        // zad. 2b
        Zad2 Obj2b = new Zad2();
        Obj2b.word1 = "ala ma kota";
        System.out.println(Obj2b.myEndsWith("kota"));
        
        // zad. 2c
        Zad2 Obj2c = new Zad2();
        Obj2c.word2 = "ala ma kota";
        System.out.println(Obj2c.myIndexOf("kota"));

        // zad. 2d
        Zad2 Obj2d = new Zad2();
        Obj2d.word3 = "ala ma kota";
        System.out.println(Obj2d.myReplace('a', 'e'));

        // zad. 2e
        Zad2 Obj2e = new Zad2();
        Obj2e.word4 = "ala ma kota";
        System.out.println(Obj2e.mySubstring(7));
    }
    
}
