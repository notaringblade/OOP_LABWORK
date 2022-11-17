/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author notaringblade
 */

import java.util.Scanner;
class Greater {
    
    Scanner sc = new Scanner(System.in);
    int a, b, z;
    void getdata(){
        System.out.println("choose first number");
         a = sc.nextInt();
        
        System.out.println("choose second number");
         b = sc.nextInt();
    }
    
    
    private void checkValue(){
        if(a > b){
            z = 1;
//            return(z);
        }else if(b > a){
            z = 2;
        }else if(a == b){
            z =3;
        }
    }
    
    void display(){
        checkValue();
        if (z == 3){
            System.out.println("numbers are equal");
        }else if(z == 2){
            System.out.println( b + " b is > than a " + a);
        }else if ( z == 1){
            System.out.println( a + " a is > than b " + b);
        }
    }
    
}

public class classes_2 {
    public static void main(String[] args) {
        Greater g = new Greater();
        g.getdata();
        g.display();
    }
}
