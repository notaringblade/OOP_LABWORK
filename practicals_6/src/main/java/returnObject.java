/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author notaringblade
 */

import java.util.Scanner;
class Object{
    Scanner sc = new Scanner(System.in);
    int x, y;
    void get_x_y(){
        
        System.out.println("Enter value of X");
        x = sc.nextInt();
        
        System.out.println("Enter value of Y");
        y = sc.nextInt();
        
    }
    
    Object addObject(Object o1, Object o2){
        Object returnedObject = new Object(); 
        returnedObject.x = o1.x + o2.x;
        returnedObject.y = o1.y + o2.y;
        return(returnedObject);
    }
    
    void display(){
        System.out.println("value of x is: " + x);
        System.out.println("value of y is: " + y);
    }
    
}

public class returnObject {
    public static void main(String[] args) {
        Object o1 = new Object();
        
        Object o2 = new Object();
        
        System.out.println("Object 1: ");
        o1.get_x_y();


        System.out.println("Object 2: ");
        o2.get_x_y();
        
        Object o3 = new Object();
        Object o4 = o3.addObject(o1, o2);
        
        System.out.println("Result of add objects(returned object): ");
        o4.display();

    }
}
