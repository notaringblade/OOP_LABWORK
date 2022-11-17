/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author notaringblade
 */
import java.util.Scanner;


public class CA_1 {
    
    static void add(int i , int[] x, int n){
                Scanner sc = new Scanner(System.in);
                    for (i = 0; i < n ; i++ ){
                        System.out.println("Enter an element to be added to the array");
                        x[i] = sc.nextInt();
                    }
                }
    
    static void bubble_sort(int n, int[]xz){
        int i = 0, j = 0, temp = 0;
        for (i = 0; i < n; i++){
                    for (j = 0; j < n-1; j++){
                        if (xz[j] > xz[j + 1]){
                            temp = xz[j +1];
                            xz[j + 1] = xz[j];
                            xz[j] = temp; 
                        }
                    }
                }
    }
    
    static void selection_sort(int p, int y[] ){
        int i = 0, j = 0, temp = 0;
        for (i = 0; i < p; i++){
                    for ( j = 0; j < p; j++){
                        for (int z = j + 1; z < p; z++){
                            if (y[j] > y[z]){
                                temp = y[z];
                                y[z] = y[j];
                                y[j] = temp;
                            }
                        }
                    }
                }
    }
    
    static void merge_sort(int z[], int z_value, int xz[], int xz_value, int xyz[]){
        int i = 0, j = 0, k = 0;
        while (i < z_value && j < xz_value){
                    if(z[i] < xz[j]){
                        xyz[k] = z[i];
                        i++;
                        k++;
                    }else if (z[i] > xz[j]){
                        xyz[k] = xz[j];
                        j++;
                        k++;
                    }else {
                        xyz[k] = z[i];
                        i++;
                        k++;
                    }
                }
                            
                
                if (i < z_value){
                    for (i = i; i<z_value; i++){
                        xyz[k] = z[i];
                        k++;
                    }
                }else if(j < xz_value){
                    for (j = j; j<xz_value; j++){
                        xyz[k] = xz[j];
                        k++;
                    }
                }
    }
    
    
    static void display_array(int p , int y[]){
        int i = 0;
        for (i = 0; i < p ; i++){
                    System.out.println(y[i]);
                    System.out.println(" ");
                }
        
        System.out.println("Your Array Size is: " + p);
    }
    
    
    
    public static void main(String[] args) {
        
        
        
        
        
        int i,j = 1,n,p;
         
        char h = '1';
        
        //Bubble Sort
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("choose a sorting method: ");
            System.out.println("(b) Bubble Sort");
            System.out.println("(s) Selection Sort");
            System.out.println("(m) Merge Sort");
            System.out.println("(0) To Exit");

            h = sc.next().charAt(0);
        
        switch(h){
            case 'b':
                
                
                System.out.println("You have selected Bubble Sort");
                
                System.out.println("Enter Size of Your array");
                
                int u[] = new int[sc.nextInt()];
                //add
                add(0, u, u.length);
                
                //sort
                bubble_sort(u.length, u);
                
                //display
                display_array(u.length, u);
                
                System.out.println("Your Array Has Been Sorted Using Bubble Sort");
                
                break;

            
            //selection sort
            case 's':
                System.out.println("You have selected Selection Sort");
                
                System.out.println("What Should The Size of Your Array Be?");
                p = sc.nextInt();
                
                int y[] = new int[p];
                //add
                add(0, y, p);
                
                //sort
                selection_sort(p, y);
                
                //display
                display_array(p, y);
                
                System.out.println("Your Array Has Been Sorted Using Selection Sort");
                
                break;
                
                
                //merge
            case 'm':
                System.out.println("merge sort selected");
                
//                array 1
                System.out.println("Enter amount of elements for the first array");
                n = sc.nextInt();
                int[] z = new int[n];
                int z_value = n;
                i = 0;
                
                //add
                add(i, z, n);
                
                //sort
                bubble_sort(n, z);
//                
                
//                array 2
                System.out.println("Enter amount of elements for the second array");
                n = sc.nextInt();
                int[] xz = new int[n];
                int xz_value = n;
                i = 0;
                //add to array
                
                //add
                add(i, xz, n);
                
                //sort
                bubble_sort(n, xz);

//              merged arrat
                int xyz[] = new int [z_value + xz_value];
//                System.out.println(xyz.length);
                
                merge_sort(z, z_value, xz, xz_value, xyz);
                
//                display array
                
                display_array(xyz.length, xyz);
                System.out.println("Your Arrays Have Been Sorted Using Merge Sort");

                break;
                
            case '0':
                System.out.println("Exited");
                j = 0;
                break;
                
            default:
                System.out.println("Invalid Choice");
        }
        }while(j != 0);
        
        
        
    }
}