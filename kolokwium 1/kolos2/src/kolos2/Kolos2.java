/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2;

import java.util.Random;

/**
 *
 * @author pc
 */
public class Kolos2 {

    public static String WordShuffle(String lan1, String lan2)
    {
        String lan3 = "";
        int lan1Index = 0, lan2Index = 0;
        int count = 0;
        
        for (int i = 0; i < (lan1.length() + lan2.length()); i++)
        {
            if (i%2 == 0)
            {
                lan3 += lan1.charAt(lan1Index);
                lan1Index++;
                count++;
            }
            else
            {
                lan3 += lan2.charAt(lan2Index);
                lan2Index++;
                count++;
            }
        }
        return lan3;
    }
    public static void main(String[] args) {
        System.out.println(WordShuffle("aaaa", "bbbb"));
    }
    
}
