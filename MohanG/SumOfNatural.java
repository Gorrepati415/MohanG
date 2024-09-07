/* 1. Write a program to print the sum of Nth natural number, take the N as an input from the user.
Hint, sum of nth natural number formula is (n * (n + 1) / 2), For user input go through Scanner class provided by java.
  */

 import java.util.Scanner;
  class SumOfNatural{
       public static void main(String[]args)
       {
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter Natural Number");
       int n=scanner.nextInt();
       
        int sum= n*(n+1)/2;
        System.out.println(sum);
        scanner.close();
       }
   }