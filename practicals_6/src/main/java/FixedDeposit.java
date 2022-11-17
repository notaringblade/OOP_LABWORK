/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author notaringblade
 */


import java.util.Scanner;
class calcFD{
    private int Principal, Year, Rate, MV = 0, totalMv = 0;
    private float rate, mv, totalmv, p ;
    
    calcFD(int P, int Y, int R){
        
        
        for(int i = 1; i <=Y; i++){
            
            MV = P * R / 100;
            System.out.println("MV: " + MV);
            
            totalMv = totalMv + MV;
            
            System.out.println("total MV: " + totalMv);
            
            P = P + MV;
            System.out.println("P: " + P);
        }
        
        Principal = P;
        Year = Y;
        Rate = R;
        
        System.out.println("Principal ate the end of the term: " + Principal);
        System.out.println("Total Maturity Value at the end of the term: " + totalMv);
        
    }
    
    calcFD(float P, int Y, float r){
        
        
        for(int i = 1; i <=Y; i++){
            
           mv = P *  r;
            System.out.println("MV: " + mv);
            
            totalmv = totalmv + mv;
            
            System.out.println("total MV: " + totalmv);
            
            P = P + mv;
            System.out.println("P: " + P);
        }
        
        p = P;
        Year = Y;
        rate = r;
        
        System.out.println("Principal ate the end of the term: " + p);
        System.out.println("Total Maturity Value at the end of the term: " + totalmv);
        
    }
    
    
}

public class FixedDeposit {
    public static void main(String[] args) {
        int P, Y, R;
        float r;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your principal value: ");
        P = sc.nextInt();
        
        System.out.println("Enter your your term(in years): ");
        Y = sc.nextInt();
        
        System.out.println("Enter your interest Rate as int: ");
        R = sc.nextInt();
        
        
        calcFD fd1 = new calcFD(P,Y,R);
        
        
        System.out.println("Enter your principal value: ");
        P = sc.nextInt();
        
        System.out.println("Enter your your term(in years): ");
        Y = sc.nextInt();
        
        System.out.println("Enter your interest Rate as float: ");
        r = sc.nextFloat();
        
        
        calcFD fd2 = new calcFD(P,Y,r);
        
        
        
        
        
    }
}
