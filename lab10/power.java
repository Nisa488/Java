package lab10;

import java.util.Scanner;

public class power 
{ 
public static void main(String[] args) 
{ 
   int base, exp; 
   int answer; 
   Scanner scan = new Scanner(System.in); 

   System.out.print("Welcome to the power program! "); 
   System.out.println("Please use integers only."); 

   // Get base 
   System.out.print("Enter the base you would like raised to a power: "); 
   base = scan.nextInt(); 

   // Get exponent 
   System.out.print("Enter the power you would like it raised to: "); 
   exp = scan.nextInt(); 

   // Call the power method to compute base^exp
   answer = Power(base, exp); 
   System.out.println(base + " raised to the " + exp + " is " + answer); 
   scan.close();
} 

// ------------------------------------------------- 
//   Computes and returns base^exp 
// ------------------------------------------------- 
public static int Power(int base, int exp) 
{ 
   // Base case: when exp is 0, the result is 1
   if (exp == 0) {
       return 1;
   }
   // Recursive case: base * base^(exp - 1)
   else {
       return base * Power(base, exp - 1);
   }
} 
} 
