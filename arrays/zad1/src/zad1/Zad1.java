/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;
import java.util.Random;

/**
 *
 * @author pc
 */
public class Zad1 {

    public static String RandomString(int x)
    {
        Random rand = new Random();
        String randString = "";
        for (int i = 0; i < x; i++)
        {
            randString += (char)(rand.nextInt(122-33) + 33);
        }
        return randString;
    }
    public static void main(String[] args) {
        System.out.println(RandomString(10));
    }
    
}
