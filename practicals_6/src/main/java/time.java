/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author notaringblade
 */
import java.util.Scanner;
class takeTime{
    private int hours = 0, minutes = 0;
    
    
    
    takeTime(int h, int m){
        hours = h;
        minutes = m;
    }
    
    void addTime(takeTime t1, takeTime t2){
        takeTime temp = new takeTime(hours, minutes);
        temp.hours = t1.hours + t2.hours + ((t1.minutes + t2.minutes) / 60);
        temp.minutes = (t1.minutes + t2.minutes) %60 ;
        
        System.out.println("hours: " + temp.hours);
        System.out.println("minutes: " + temp.minutes);

    }
}

public class time {
    
    
    public static void main(String[] args) {
        int h,m,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of hours: ");
        h = sc.nextInt();
        System.out.println("enter number of minutes: ");
        m = sc.nextInt();
        
        takeTime t1 = new takeTime(h,m);
//        t1.display();
        
        System.out.println("enter number of hours: ");
        h = sc.nextInt();
        System.out.println("enter number of minutes: ");
        m = sc.nextInt();
        
        takeTime t2 = new takeTime(h,m);
//        t2.display();
        
        takeTime t3 = new takeTime(0, 0);
        
        t3.addTime(t1, t2);
    }
}
