/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author notaringblade
 */
import java.util.Scanner;
interface Area{
    final static float pi = 3.147F;
    float compute(float x, float y);
}

class Circle implements Area{
    Scanner sc = new Scanner(System.in);
    float ans = 0, r;
    void get_data(){
        System.out.println("Enter radius value: ");
        r = sc.nextFloat();
    }
    public float compute(float x, float y){
        ans = pi * (x*x);
        return(ans);
    }
}

class Rectangle implements Area{
    Scanner sc = new Scanner(System.in);
    float ans = 0,l,b;
    void get_data(){
        System.out.println("Enter length value: ");
        l = sc.nextFloat();
        System.out.println("Enter breath value: ");
        b = sc.nextFloat();
    }
    public float compute(float x, float y){
        ans = x * y;
        return(ans);
    }
}

public class interfaces_area_example {
    public static void main(String[] args) {
      
        float ans =0;
        
        Circle c = new Circle();
        c.get_data();
        ans = c.compute(c.r, 0);
        System.out.println("Area of your circle is: " + ans);

        Rectangle rect = new Rectangle();
        rect.get_data();
        ans = rect.compute(rect.l, rect.b);
        System.out.println("Area of your rectangle is: " + ans);

    }
}
