package assignment_2;

public class DogInformation {
	public static void main(String[] args) {
		Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Max");
        Dog dog3 = new Dog("Bella");

        dog1.setAge(3);
        dog1.setGender("Male");
        dog1.setBonesEaten(10);

        dog2.setAge(2);
        dog2.setGender("Female");
        dog2.setBonesEaten(15);

        dog3.setAge(7);
        dog3.setGender("Male");
        dog3.setBonesEaten(20);

        System.out.println("Dog 1 is called " + dog1.getName() + ".");
        System.out.println("Dog 1 is " + dog1.dogAgeAsPeopleYears() + " years old in human years.");
        System.out.println("Dog 1 has eaten " + dog1.getBonesEaten() + " bones so far.");

        System.out.println("Dog 2 is called " + dog2.getName() + ".");
        System.out.println("Dog 2 is " + dog2.dogAgeAsPeopleYears() + " years old in human years.");
        System.out.println("Dog 2 has eaten " + dog2.getBonesEaten() + " bones so far.");

        System.out.println("Dog 3 is called " + dog3.getName() + ".");
        System.out.println("Dog 3 is " + dog3.dogAgeAsPeopleYears() + " years old in human years.");
        System.out.println("Dog 3 has eaten " + dog3.getBonesEaten() + " bones so far.");
	}
}
