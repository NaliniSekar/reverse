# reverse
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaaa;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Aaaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int b,c=0,a,temp;
        System.out.println("enter num");
        Scanner in=new Scanner(System.in);
        b=in.nextInt();
        temp=b;
        while(b>0)
        {
            
            a=b%10;
            b=b/10;
            c=(c*10)+a;
            
            System.out.println(+c);
        }
        
        
    }
    
}
