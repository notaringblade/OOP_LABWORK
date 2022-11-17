/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author notaringblade
 */
import java.util.Scanner;

class xAndY{
    private int x, y;
    Scanner sc = new Scanner(System.in);
    
    void getX_Y(){
        System.out.println("Enter valur of x");
        x = sc.nextInt();
        System.out.println("Enter valur of y");
        y = sc.nextInt();
    }
    
    int returnX(){
        return(x);
    }
    
    int returnY(){
        return(y);
    }
}
class calculate extends xAndY{
    int ans;
    void calculateXandY(){
        getX_Y();
        ans = returnX()+ returnY();
        System.out.println("answer is: " + ans);
    }
}


public class inheritance {
    public static void main(String[] args) {
        calculate calc = new calculate();
        calc.calculateXandY();
    }
}
