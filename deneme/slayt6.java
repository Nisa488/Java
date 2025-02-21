package deneme;
import java.util.Scanner;
public class slayt6 {

	public static void main(String[] args) {
		System.out.println("The 1. example:");
		int grade, category;

	      Scanner scan = new Scanner(System.in);

	      System.out.print("Enter a numeric grade (0 to 100): ");
	      grade = scan.nextInt();

	      category = grade / 10;

	      System.out.print("That grade is ");

	      switch (category)
	      {
	         case 10:
	            System.out.println("a perfect score. Well done.");
	            break;
	         case 9:
	            System.out.println("well above average. Excellent.");
	            break;
	         case 8:
	            System.out.println("above average. Nice job.");
	            break;
	         case 7:
	            System.out.println("average.");
	            break;
	         case 6:
	            System.out.println("below average. You should see the");
	            System.out.println("nstructor to clarify the material "
	                                + "presented in class.");
	            break;
	         default:
	            System.out.println("not passing.");
	      }
	      scan.close();
	      System.out.println("-----------------------------------------");
	      
	      System.out.println("The 2. example:");
	      int count = 0;
	      do{
	         count++;
	         System.out.println(count);
	      } while (count < 5);
	      System.out.println("-----------------------------------------");

	      System.out.println("The 3. example:");
	      int count1 = 0;
	      do{
	    	 System.out.println(count1);
	         count1++;
	      } while (count1 < 5);
	      System.out.println("-----------------------------------------");
	      
	      System.out.println("The 4. example:");
	      int count2 = 0;
	      do{
	    	 System.out.println(count2);
	         ++count2;
	      } while (count2 < 5);
	      System.out.println("-----------------------------------------");
	      
	      System.out.println("The 5. example:");
	      int count3 = 0;
	      do{
	         ++count3;
	         System.out.println(count3);
	      } while (count3 < 5);
	      System.out.println("-----------------------------------------");
	      
	}

}
