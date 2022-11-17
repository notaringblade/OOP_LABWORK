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
        for (int i = 0; i <= 5000; i++){
            System.out.println("I am A");
        }
        System.out.println("exited A");

    }
}
class B extends Thread{
    public void run(){
        for (int i = 0; i <= 5000; i++){
            System.out.println("I am B");
        }
        System.out.println("exited B");
    }
}class C extends Thread{
    public void run(){
        for (int i = 0; i <= 5000; i++){
            System.out.println("I am C");
        }
        System.out.println("exited C");
    }
}

public class Threads {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        a.start();
        b.start();
        c.start();

//          new A().start();
//          new B().start();
//          new C().start();

    }
}
