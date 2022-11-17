/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author notaringblade
 */
import java.util.Scanner;
class a{
    int a,b;
    Scanner sc = new Scanner(System.in);
    public void calc(){
        System.out.println("Enter value of a: ");
        a = sc.nextInt();
        System.out.println("Enter value of b: ");
        b = sc.nextInt();
        
        int ans = 0;
        for(int i = 0; i <= 1000; i++){
            
            ans = ans + (a + b);
            System.out.println("ans: " + ans);

        }
    }
}

class Run extends a implements Runnable{
    public void run(){
        
        calc();
    }
}
public class runnable_interface {
    public static void main(String[] args) {
        Run r = new Run();
        
        Thread threadx = new Thread(r);
        
        threadx.start();
    }
}
