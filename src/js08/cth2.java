/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js08;
public class cth2 {
    public static void main(String[] args){
        int v;
        for(v = 1;v <= 10;v++)
        {
            System.out.print(" _ ");    
        }
        
        v = 1;
        
        while(v <= 10)
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
        while(v <= 10);

    }
    
}
