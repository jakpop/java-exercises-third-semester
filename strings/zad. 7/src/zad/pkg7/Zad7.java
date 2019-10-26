/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad.pkg7;

/**
 *
 * @author pc
 */
public class Zad7 {

    public static String myReverseSplit(String[] inputStringArray)
    {
        String outputString = "";
        for (int i = 0; i < inputStringArray.length; i++)
        {
            outputString += inputStringArray[i];
        }
        return outputString;
    }
    public static void main(String[] args) {
        String[] strArr = { "ala", "ma", "kota" };
        System.out.println(myReverseSplit(strArr));
    }
    
}
