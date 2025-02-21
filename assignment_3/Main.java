package assignment_3;
//3 2si
//Interface Cryptable with methods for encryption and decryption
interface Cryptable {
 String encrypt(String input);
 String decrypt(String encryptedData);
}

//Class representing Blowfish encryption
class BlowfishEncryption implements Cryptable {

 
 public String encrypt(String input) {
     // Reverse the string as a simple placeholder for encryption
     return reverseString(input);
 }

 
 public String decrypt(String encryptedData) {
     // Reverse the string back to decrypt it
     return reverseString(encryptedData);
 }

 // Helper method to reverse a string
 private String reverseString(String str) {
     StringBuilder reversed = new StringBuilder(str);
     return reversed.reverse().toString();
 }
}

//Class representing Twofish encryption
class TwofishEncryption implements Cryptable {

 
 public String encrypt(String input) {
     // Reverse the string as a simple placeholder for encryption
     return reverseString(input);
 }

 
 public String decrypt(String encryptedData) {
     // Reverse the string back to decrypt it
     return reverseString(encryptedData);
 }

 // Helper method to reverse a string
 private String reverseString(String str) {
     StringBuilder reversed = new StringBuilder(str);
     return reversed.reverse().toString();
 }
}

//Main class to test encryption and decryption
public class Main {
 public static void main(String[] args) {
     // Instantiate encryption objects
     Cryptable blowfish = new BlowfishEncryption();
     Cryptable twofish = new TwofishEncryption();

     // Original data to be encrypted and decrypted
     String textToEncrypt = "HelloWorld";

     // Test Blowfish encryption and decryption
     String blowfishEncrypted = blowfish.encrypt(textToEncrypt);
     System.out.println("Blowfish Encrypted: " + blowfishEncrypted);

     String blowfishDecrypted = blowfish.decrypt(blowfishEncrypted);
     System.out.println("Blowfish Decrypted: " + blowfishDecrypted);

     // Test Twofish encryption and decryption
     String twofishEncrypted = twofish.encrypt(textToEncrypt);
     System.out.println("Twofish Encrypted: " + twofishEncrypted);

     String twofishDecrypted = twofish.decrypt(twofishEncrypted);
     System.out.println("Twofish Decrypted: " + twofishDecrypted);
 }

}

