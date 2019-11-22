/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos1;

/**
 *
 * @author pc
 */
public class Kolos1 {

    public static boolean By3Division(int liczba)
    {
        boolean wynik = false;
        String liczbaString = Integer.toString(liczba);
        int[] array = new int[liczbaString.length()];
        int suma = 0;
        
        for (int i = 0; i < liczbaString.length(); i++)
        {
            array[i] = Character.getNumericValue(liczbaString.charAt(i));
            suma += array[i];
        }
        
        if (suma <= 9)
        {
            if (suma == 9 || suma == 6 || suma == 3 || suma == 0)
                wynik = true;
            else
                wynik = false;
        }
        else
            wynik = By3Division(suma);
        
        return wynik;
    }
    public static void main(String[] args) {
        System.out.println(By3Division(30));
    }
    
}
