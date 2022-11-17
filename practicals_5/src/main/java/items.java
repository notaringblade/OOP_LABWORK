/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author notaringblade
 */
import java.util.Scanner;
class Items{
    private int n;
    private int itemCode[] = new int[100];
    private int itemPrice[] = new int[100];
    
    private int i,j;
    Scanner sc = new Scanner(System.in);
    
    void getItems(){

            do{
//                System.out.println("pr");
                System.out.println("Enter item code");
                itemCode[i] = sc.nextInt();
                System.out.println("Enter item price");
                itemPrice[i] = sc.nextInt();
                i++;
                j++;
                System.out.println("Press 0 to exit or 1 to continue");
                n = sc.nextInt();
                
            }while(n != 0);
    }
    void display(){
        for(i = 0; i<j; i++){
            System.out.println("item code = " + itemCode[i]);
            System.out.println("item price = " + itemPrice[i]);
        }
    }
    void removeItem(){
        System.out.println("Enter item to delete");
        int z = sc.nextInt();
        int count = 0;
        for(i = 0; i<10; i++){
            if(itemCode[i] == z){
                itemPrice[i] = 0;
                count ++;    
            }
        }
        if(count >0){
            System.out.println("item" + " " + z + " has successfully been removed");
        }else if(count == 0){
            System.out.println("this item does'nt exist");            
        }
    }
    void sumItems(){
        
        int sum = 0;
        for(i = 0; i < j; i++){
            sum += itemPrice[i];
        }
        System.out.println("Sum of item prices is = " + sum);
    }
    
}

public class items {
    public static void main(String[] args) {
        Items it = new Items();
        int h;
        do{
            System.out.println("1 to Enter an item");
            System.out.println("2 to Display Items");
            System.out.println("3 to Remove Items");
            System.out.println("4 to sum item prices");
            System.out.println("0 to exit");
            System.out.println("");

            h = it.sc.nextInt();
            
            switch(h){
                case 1:
                    it.getItems();
                    System.out.println(" ");
                    break;
                
                case 2:
                    it.display();
                    System.out.println(" ");

                    break;
                case 3:
                    it.removeItem();
                    System.out.println(" ");

                    break;
                case 4:
                    it.sumItems();
                    System.out.println(" ");

                    break;
                case 0:
                    System.out.println("exited");
                    break;
                default:
                        System.out.println("Please enter a valid number");

                    break;
            }

        }while(h != 0);
    }
    
    
    
}
