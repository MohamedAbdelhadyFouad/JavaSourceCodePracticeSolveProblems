package javaapplication25;

import java.util.Scanner;

public class JavaApplication25 {
    // Function to calculate the factorial

    private static int FactorialRecursion(int number) {
        int z = 1;
        if (number == 1) {
            return 1;
        }
        z = FactorialRecursion((number - 1)) * number;
        return z;

    }

    // this practice Fibonacci series 
    public static void Fibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the nth number to find the fibinocci value : ");
        int input = sc.nextInt();
        System.out.println("\n Fibinocci series upto " + input + "th number ");
        int array[] = new int[input];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

        }
        System.out.println("");

    }
    
     

    public static void main(String[] args) {
      //Finding factorial of a number using recursion in java source code 
        System.out.println("******************************************************************************");
        System.out.println("Practice factorial  Function : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int f = sc.nextInt();
        System.out.println("The factorail of this number is : " + FactorialRecursion(f));
        System.out.println("******************************************************************************");     
        System.out.println("Practice Fibonacci Function : ");
        Fibonacci();
    
        System.out.println("******************************************************************************");
                

        // Implementation of Binary Search tree 
        BSTApp a = new BSTApp();
        Node root = null;
       root= a.insertNode(root, 8);
              root= a.insertNode(root, 3);   
              root= a.insertNode(root, 6);
      PrimeNumbers p = new PrimeNumbers();
      


        

    }

}
