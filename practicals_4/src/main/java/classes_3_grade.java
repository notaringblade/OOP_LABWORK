/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author notaringblade
 */

import java.util.Scanner;

class Topper{
    Scanner sc = new Scanner(System.in);
    
    private String name;
    private int roll_no, marks;
    private Character grade;
    
    void getdata(){
        System.out.println("enter the student's name: ");
        name = sc.nextLine();
        
        System.out.println("enter the student's roll number: ");
        roll_no = sc.nextInt();
        
        System.out.println("enter the student's marks: ");
        marks = sc.nextInt();
        
    }
    
    private void calculateMarks(){
        if(marks >= 75){
            grade = '0';
        }else if(marks >= 60 &&  marks < 75){
            grade = 'A';
        }else if(marks >= 45 &&  marks < 60){
            grade = 'B';
        }else if(marks >= 35 &&  marks < 45){
            grade = 'C';
        }else if(marks < 35){
            grade = 'F';
        }else if (marks > 100 || marks < 0 ){
            grade = 'I';
        }
    }
    
    void display(){
        calculateMarks();
        
        System.out.println("Student's Name: " + name);
        System.out.println(" ");
        System.out.println("Student's Roll Number: " + roll_no);
        System.out.println(" ");
        System.out.println("Student's Grade: " + grade);

    }
    
    int sendRollNo(){
        return roll_no;
    }
    
    int sendMarks(){
        return marks;
    }
}
public class classes_3_grade {
    
//    static void displayAgain(char con, int h){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("do you wish to display something else?: 'y': yes, 'n': no");
//        con = sc.next().charAt(0);
//        
//    }
    
    public static void main(String[] args) {
        Topper st = new Topper(); 
        
        System.out.println("Enter Number of Students: ");
        int x = st.sc.nextInt();
        int i;
        
        
        Topper sts[] = new Topper[x];
        
//        st.getdata();
//        st.display();
        
        for(i = 0; i < x; i++){
            sts[i] = new Topper();
            sts[i].getdata();
        }
        
        i = 0;
        
        char con = 'y';
        do {
            
            System.out.println("choose display type");
            System.out.println("1) Topper");
            System.out.println("2) According to roll no.");
        
        
            int h = st.sc.nextInt();
        
            switch(h){
            case 1:
                //display topper
                int max = 0;
                int index = 0;
                for(i = 0; i<sts.length; i++){
                    if(sts[i].sendMarks() >= max){
                        max = sts[i].sendMarks();
                         index = i;
                    }
                }
                sts[index].display();
                
                System.out.println("do you wish to display something else?: 'y': yes, 'n': no");
                con = st.sc.next().charAt(0);
                
                break;
            
            case 2:
                //display according to roll no
                int count = 0;
                while(count == 0){
                    
                    System.out.println("enter a roll no to search");
                    int y = st.sc.nextInt();
                    
                    for (i = 0; i < sts.length; i++){
                        if(sts[i].sendRollNo() == y){
    //                        System.out.println(sts[i]);
                              sts[i].display();
                              count ++;
                        }

                    }
                    
                    if(count == 0){
                        System.out.println("This Roll Number Does Not Exist");
                        System.out.println(" ");
                    }
                    
                }
                
                System.out.println("do you wish to display something else?: 'y': yes, 'n': no");
                con = st.sc.next().charAt(0);
                
                break;
            default:
                System.out.println("Invalid choice");
                System.out.println("do you wish to display something else?: 'y': yes, 'n': no");
                con = st.sc.next().charAt(0);
            }
        } while( con == 'y');
        
    }
        
    
        
    
            
    
    
    
}
