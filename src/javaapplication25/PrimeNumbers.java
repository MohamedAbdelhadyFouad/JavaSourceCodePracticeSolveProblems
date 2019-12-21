/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {

    // find the prime numbers fom 1-value 
    public PrimeNumbers() {
        isPrime();

    }

    public void isPrime() {
         int  i=0;
         int j=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the value: ");
        int x = sc.nextInt();
        
        System.out.println("");
        
        for (i = 1; i <= x; i++)
        {    
               int check=0; 
            boolean c = false;
           
            for ( j = i; j >= 1; j--) 
            {
             
                if (i % j == 0) {
                   check = check + 1;
                   c = true;
                }

            }
            if (check == 2) {
                // the prime number to be print 
               System.out.println(i);

            }

        }

    }

}
