/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad.pkg5;

/**
 *
 * @author pc
 */
public class Zad5 {

    public String caesar;
    public StringBuffer caesarCipher(int a)
    {
        StringBuffer newCaesar = new StringBuffer();
        int ascii;
        int asciiCaesar;
        for (int i = 0; i < caesar.length(); i++)
        {
            if (Character.isUpperCase(caesar.charAt(i)))        // czy UpperCase
            {
                if (a > 0)
                {
                    ascii = (byte)caesar.charAt(i);
                    asciiCaesar = ((ascii + a - 65) % 26 + 65);
                    newCaesar.append((char)asciiCaesar);
                }
                else
                {
                    ascii = (byte)caesar.charAt(i);
                    asciiCaesar = ((ascii + a - 90) % 26 + 90);
                    newCaesar.append((char)asciiCaesar);
                }
                
            }
            else if (Character.isLowerCase(caesar.charAt(i)))    // czy LowerCase
            {
                if (a > 0)
                {
                    ascii = (byte)caesar.charAt(i);
                    asciiCaesar = ((ascii + a - 97) % 26 + 97);
                    newCaesar.append((char)asciiCaesar);
                }
                else
                {
                    ascii = (byte)caesar.charAt(i);
                    asciiCaesar = ((ascii + a - 122) % 26 + 122);
                    newCaesar.append((char)asciiCaesar);
                }
                
            }
            else 
            {
                newCaesar.append(caesar.charAt(i));
            }
        }
        return newCaesar;
    }
    public static void main(String[] args) {
        Zad5 Obj = new Zad5();
        Obj.caesar = "ALA MA KOTA";
        System.out.println(Obj.caesarCipher(-5));
    }
    
}
