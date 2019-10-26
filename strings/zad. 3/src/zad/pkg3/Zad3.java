/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad.pkg3;
import java.util.Scanner;
/**
 *
 * @author pc
 */
public class Zad3 {

    // zad. 3a
    static void Names()
    {
        Scanner myObj = new Scanner(System.in); //ReadLine
        
        System.out.println("Ile imion chcesz sprawdzić?");
        String s_names = myObj.nextLine();
        int i_names = Integer.parseInt(s_names);
        
        String[] a_names = new String[i_names]; //tworzenie tablicy o podanej wyżej długości
        
        System.out.println("Wprowadź imiona");
        for (int i = 0; i < a_names.length; i++)
        {
            a_names[i] = myObj.nextLine();
        }
        
        System.out.println("Imiona dziewczyn: ");
        for (int i = 0; i < a_names.length; i++)
        {
            if (a_names[i].endsWith("a") == true)
            {
                System.out.println(a_names[i]);
            }
        }
    }
    
    // zad. 3b - NIESKOŃCZONE
    static void ChangeLetters()
    {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Wpisz łańcuch");
        String s_chain = myObj.nextLine();
        
        System.out.println("Wybierz pierwszy znak");
        String s_char1 = myObj.nextLine();
        System.out.println("Wybierz drugi znak");
        String s_char2 = myObj.nextLine();
        
        String s_newChain1 = s_chain;
        for (int i = 0; i < s_chain.length(); i++)
        {
            if (s_chain.charAt(i) == s_char1.charAt(0))
            {
                s_newChain1 = s_newChain1.substring(0, i)+s_char2+s_newChain1.substring(i+1);
                s_newChain1 = s_newChain1.substring(0, i)+s_char2+s_newChain1.substring(i+1);
            }
        }
        
        String s_newChain2 = s_chain;
        for (int i = 0; i < s_chain.length(); i++)
        {
            if (s_chain.charAt(i) == s_char2.charAt(0))
            {
                s_newChain2 = s_newChain2.substring(0, i)+s_char1+s_newChain2.substring(i+1);
            }
        }
        
        System.out.println("Nowy łańcuch: " +s_newChain1);
        System.out.println("Nowy łańcuch: " +s_newChain2);
    }
    public static void main(String[] args) {
        
        // zad. 3a
        Names();
        
        // zad. 3b
        ChangeLetters();
        
    }
    
}
