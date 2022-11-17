/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author notaringblade
 */
import java.util.Scanner;
class test_constructors{
    private int x, y;
    test_constructors(){
        x = 0;
        y = 100;
    }
    test_constructors(int u, int v){
        x = x + u;
        y = y + v;
    }
    void display(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
public class constructors {
    public static void main(String[] args) {
        int u,v;
        Scanner sc = new Scanner(System.in);
        test_constructors t = new test_constructors();
        
        t.display();
        
        System.out.println("enter value for x");
        u = sc.nextInt();
        System.out.println("enter value for y");
        v = sc.nextInt();

        test_constructors t1 = new test_constructors(u,v);
        t1.display();
    }
}
