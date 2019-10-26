/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad.pkg8;

/**
 *
 * @author pc
 */
public class Zad8 {

    public static boolean Palindrome(String str)
    {
        boolean flag = true;
        
        String strReverse = new StringBuffer(str).reverse().toString();
        
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) != strReverse.charAt(i))
            {
                flag = false;
            }
        }
        
/*      ---------------INNY SPOSÓB-------------
        for (int i = 0; i < str.length()/2; i++)
        {
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
            {
                flag = false;
            }
        }
*/
        return flag;
    }
    public static void main(String[] args) {
        System.out.println(Palindrome("kajak"));
    }
    
}
