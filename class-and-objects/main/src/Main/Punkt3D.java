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
public class Punkt3D {
    
    private double a;
        private double b;
        private double c;
        
        public double getA() 
        {
            return this.a;
        }
        
        public double getB() 
        {
            return this.b;
        }
        
        public double getC() 
        {
            return this.c;
        }
        
        public void setA(double value) 
        {
            this.a = value;
        }
        
        public void setB(double value) 
        {
            this.b = value;
        }
        
        public void setC(double value) 
        {
            this.c = value;
        }
        
        public Punkt3D()
        {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
        
        public Punkt3D(double x, double y, double z)
        {
            this.a = x;
            this.b = y;
            this.c = z;
        }
        
        public double OdlegloscEuklidesowa()
        {
            return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        }
        
        public double OdlegloscManhattan()
        {
            return (Math.abs(a) + Math.abs(b) + Math.abs(c));
        }
    
}
