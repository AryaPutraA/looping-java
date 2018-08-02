/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js08;
import java.util.Scanner;
public class cth2 {
    public static void main(String[] args){
        Scanner b = new Scanner(System.in);
        int v, c;
        System.out.print("Pilih Nomer yang akan di gandakan: ");
        c = b.nextInt();
        for(v = 1;v <= c;v++)
        {
            System.out.print(" _ ");    
        }
        
        v = 1;
        
        while(v <= c)
        {
            System.out.print(" - ");
            v++;
        }
        
        v = 1;
        
        do
        {
            System.out.print(" ~ ");
            v++;
        }
        while(v <= c);

    }
    
}
