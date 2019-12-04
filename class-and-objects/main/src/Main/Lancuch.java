/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author student
 */
public class Lancuch {
    
    String lancuch;
    String koncowka;
    char pierwszaLitera;
    
    public String getLancuch() 
    {
        return this.lancuch;
    }

    public String getKoncowka() 
    {
        return this.koncowka;
    }

    public char getPierwszaLitera() 
    {
        return this.pierwszaLitera;
    }

    public void setLancuch(String value) 
    {
        this.lancuch = value;
    }

    public void setKoncowka(String value) 
    {
        this.koncowka = value;
    }

    public void setPierwszaLitera(char value) 
    {
        this.pierwszaLitera = value;
    }
    
    public Lancuch()
    {
        this.lancuch = "abcdefghij";
        this.koncowka = "hij";
        this.pierwszaLitera = 'a';
    }
    
    public Lancuch(String lancuch)
    {
        if (lancuch.length() < 5)
        {
            while (lancuch.length() < 5)
            {
                byte ascii = (byte)((byte)lancuch.charAt(lancuch.length()-1)+1);
                
                if (ascii == 123)
                {
                    ascii = 97;
                    ascii = (byte)(ascii);
                }
                
                lancuch += (char)ascii;
            }
        }
        this.lancuch = lancuch;
        this.koncowka = lancuch.substring(lancuch.length() - 3, lancuch.length());
        this.pierwszaLitera = lancuch.charAt(0);
    }
    
    public String Merge(Lancuch inputLancuch)
    {
        String outputLancuch = "";
        int lan1Index = 0;
        int lan2Index = 0;
        
        for (int i = 0; i < (this.lancuch.length() + inputLancuch.lancuch.length()); i++)
        {
            if (i%2 == 0)
            {
                outputLancuch += lancuch.charAt(lan1Index);
                lan1Index++;
            }
            else
            {
                outputLancuch += inputLancuch.lancuch.charAt(lan2Index);
                lan2Index++;
            }
        }
        
        return outputLancuch;
    }
    
    public int ileASCII()
    {
        int suma = 0;
        
        for (int i = 0; i < this.lancuch.length(); i++)
        {
            suma += (int)this.lancuch.charAt(i);
        }
        return suma;
    }
}
