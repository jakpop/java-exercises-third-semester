/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad.pkg6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class Zad6 {

    public static boolean isSeparator(char a, char[] b)
    {
        boolean flag = false;

        for (int i = 0; i < b.length; i++)
        {
            if (a == b[i])
                flag = true;
        }
        return flag;
    }
    
    public static String[] mySplit(String inputString, char[] arraySeparator)
    {
        String tempString = "";
        List<String> tempArray = new ArrayList<String>();
        int stringPositionInArray = 0;
        
        for (int i = 0; i < inputString.length(); i++)
        {
            if (isSeparator(inputString.charAt(i), arraySeparator))
                {
                    tempArray.add(stringPositionInArray, tempString);
                    tempString = "";
                    stringPositionInArray++;
                }
            else
            {
                tempString += inputString.charAt(i);
                if (i == inputString.length()-1)
                    tempArray.add(stringPositionInArray, tempString);
            }
        }
        
        String[] outputArray = new String[tempArray.size()];
        for (int i = 0; i < tempArray.size(); i++)
            outputArray[i] = tempArray.get(i);
        
        return outputArray;
    }
    public static void main(String[] args) {
        
        char[] chArr = { '+', '-', '=', ';' };
        String[] strArr = mySplit("ala+ma;kota-i=psa", chArr );
        
        for (String s : strArr)
            System.out.println(s);
    }
    
}
