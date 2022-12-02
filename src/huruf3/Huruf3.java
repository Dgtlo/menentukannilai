/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huruf3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Huruf3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        double nilai;
        System.out.print("masukan nilai = ");
        nilai = scan.nextDouble();
        if (nilai >= 80 && nilai <= 100)
        {
            System.out.println("A");
        }
        else if (nilai >= 70 && nilai <=79)  
        {
            System.out.println("B");
        }
        else if (nilai >= 60 && nilai <=69)  
        {
            System.out.println("C");
        }
         else if (nilai >= 50 && nilai <=59)  
        {
            System.out.println("D");
        }
         else if(nilai <50)
         {
         System.out.println("E");
         }
    }
    
}
