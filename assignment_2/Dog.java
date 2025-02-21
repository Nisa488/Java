package assignment_2;

public class Dog {
	private String name;
    private int age;
    private String gender;
    private int bonesEaten;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getBonesEaten() {
        return bonesEaten;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBonesEaten(int bonesEaten) {
        this.bonesEaten = bonesEaten;
    }

    public int dogAgeAsPeopleYears() {
        if (age == 1) {
            return 15;
        } else if (age == 2) {
            return 15 + 9;
        } else {
            return 15 + 9 + (age - 2) * 5;
        }
    }
}
