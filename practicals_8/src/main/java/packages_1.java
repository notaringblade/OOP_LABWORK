/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author notaringblade
 */

import myPackages.circle;
import myPackages.circumferance;
import java.util.Scanner;
public class packages_1 {
    public static void main(String[] args) {
        float r;
        float area, circum;
        
        circle CA = new circle();
        circumferance CC = new circumferance();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter circle's radius");
        r = sc.nextFloat();
        
        area = CA.CircleArea(r);
        circum = CC.CircleCircumferance(r);
        
        System.out.println("area of your circle is: " + area);
        System.out.println("circumferance of your circle is: " + circum);
    }
}
