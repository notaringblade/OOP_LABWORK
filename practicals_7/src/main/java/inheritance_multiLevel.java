/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author notaringblade
 */
import java.util.Scanner;
class student{
    private String name;
    private int roll_no;
    Scanner sc = new Scanner(System.in);
    
    void getData(){
        System.out.println("Enter Student name: ");
        name = sc.nextLine();
        System.out.println("Enter Student roll_no: ");
        roll_no = sc.nextInt();
    }
    
    void displayData(){
        System.out.println("student name: " + name);
        System.out.println("student roll_no: " + roll_no);
    }
}
class marks extends student{
    private int m1,m2,m3,m4,m5;
    
    void get_marks(){

         System.out.println("Enter value of m1: ");
         m1 = sc.nextInt();

         System.out.println("Enter value of m2: ");
         m2 = sc.nextInt();

         System.out.println("Enter value of m3: ");
         m3 = sc.nextInt();

         System.out.println("Enter value of m4: ");
         m4 = sc.nextInt();

         System.out.println("Enter value of m5: ");
         m5 = sc.nextInt();

    }
    void display_marks(){
        System.out.println("Marks are: ");
        System.out.println("m1 marks: " + m1);
        System.out.println("m2 marks: " + m2);
        System.out.println("m3 marks: " + m3);
        System.out.println("m4 marks: " + m4);
        System.out.println("m5 marks: " + m5);
    }
    
    int return_1(){
        return(m1);
    }
    int return_2(){
        return(m2);
    }
    int return_3(){
        return(m3);
    }
    int return_4(){
        return(m4);
    }
    int return_5(){
        return(m5);
    }
    
}

class result extends marks{
    private int total, percentage;
    int m1,m2,m3,m4,m5;
    void getMarks(){
        m1 = return_1();
        m2 = return_2();
        m3 = return_3();
        m4 = return_4();
        m5 = return_5();
    
    }
    void calculateTotal(){
        getMarks();
        total = total + m1 + m2 + m3 + m4 + m5;
        percentage = total/5;
    }
    void displayAll(){
        displayData();
        display_marks();
        if(total < 0 || total> 500){
            System.out.println("the marks entered may have been wrong (INVALID TOTAL!!!" + total + ")"); 
        }else{
            System.out.println("total = " + total);
        }
        if(percentage < 0 || percentage > 100){
            System.out.println("the marks entered may have been wrong (INVALID PERCENTAGE!!!" + percentage + ")"); 
        }else{
            System.out.println("percentage = " + percentage + "%");
        }
    }
    
}

public class inheritance_multiLevel {
    public static void main(String[] args) {
        result res = new result();
        res.getData();
        res.get_marks();
        res.calculateTotal();
        res.displayAll();
    }
}
