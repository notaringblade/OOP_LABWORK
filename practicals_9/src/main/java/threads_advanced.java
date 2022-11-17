
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author notaringblade
 */

class A extends Thread{
    public void run(){
        for(int i = 0; i <= 500; i++){
            if(i == 100){
                yield();
            }
            System.out.println("I am in A");
        }
        System.out.println("exited A");
    }
}
class B extends Thread{
    public void run(){
        for(int j = 0; j <= 500; j++){
            if(j == 100){
                stop();
            }
            System.out.println("I am in B");
        }
        System.out.println("exited B");
    }
}
class C extends Thread{
    public void run(){
        for(int k = 0; k <= 500; k++){
            if(k == 300){
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(C.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("I am in C");
        }
        System.out.println("exited C");
    }
}

public class threads_advanced {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        a.start();
        b.start();
        c.start();
    }
}
