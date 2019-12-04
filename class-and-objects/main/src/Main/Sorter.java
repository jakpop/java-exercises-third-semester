/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author pc
 */
public class Sorter {
    
//    String s_Pensja = String.valueOf(getPensja());
//    
//    public static int compareName(Pracownik a, Pracownik b)
//    {
//	return a.getImie().compareTo(b.getImie());
//    }
//    
//    public static int comparePosotion(Pracownik a, Pracownik b)
//    {
//	return a.stanowisko.compareTo(b.stanowisko);
//    }
//    
//    public static int compareSalary(Pracownik a, Pracownik b)
//    {
//	return a.s_Pensja.compareTo(b.s_Pensja);
//    }
    
    public static void Ranking(Pracownik[] firma, int klucz) 
    {
        switch (klucz) 
        {
            case 0:
                Arrays.sort(firma, Comparator.comparing(Pracownik::getImie));
                break;
            case 1:
                Arrays.sort(firma, Comparator.comparing(Pracownik::getStanowisko));
                break;
            case 2:
                Arrays.sort(firma, Comparator.comparing(Pracownik::getPensja));
                break;
        }
    }
    
}
