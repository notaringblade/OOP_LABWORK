/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author notaringblade
 */

import java.util.Scanner;
class Student {
    String name;
    int age, rollNo;
    
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student's name");
        name = sc.nextLine();
        
        System.out.println("Enter the Student's age");
        age = sc.nextInt();
        
        System.out.println("Enter the Student's Roll Number");
        rollNo = sc.nextInt();
    }
    
    void displaydata(){
        System.out.println("The Student's name" + " "  + name);
        
        System.out.println("Student's age is" + " " + age);
        
        System.out.println("The Student's Roll Number is" + " " + rollNo);
    }
    
}
public class classes_1 {
    public static void main(String[] args) {
        
        
        Student s = new Student();
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("how many students?");
        int n = sc.nextInt();
        
        Student st[] = new Student[n];
        
        for (int i = 0; i < n; i++){
            st[i] = new Student();
            st[i].getdata();
//            System.out.println(" ");
//            s.displaydata();
            
//            st[i] = s;
//            System.out.println(st[i]);
        }
        
        System.out.println(" ");
        for(int j = 0; j < n; j++){
            st[j].displaydata();
        }
    }
        
    }
    
    

