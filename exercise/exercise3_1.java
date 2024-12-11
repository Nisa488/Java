package exercise;

import java.util.Scanner;
import java.util.Random;
public class exercise3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Lütfen adınızı girin: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Lütfen soyadınızı girin: ");
        String lastName = scanner.nextLine();

        if (lastName.length() < 5) {
            System.out.println("Soyadınız en az beş harf uzunluğunda olmalıdır.");
        } else {
            char firstLetter = firstName.charAt(0);
            
            String lastNamePart = lastName.substring(0, 5);
            
            int randomNumber = random.nextInt(90) + 10; 

            String username = firstLetter + lastNamePart + randomNumber;

            System.out.println("Oluşturulan kullanıcı adı: " + username);
        }

        scanner.close();
	}

}