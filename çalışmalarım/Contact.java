package çalışmalarım;

public class Contact implements Comparable<Contact>{
	private String firstName, lastName, phone;
	public Contact(String first, String last, String telephone) {
		firstName = first;
		lastName = last;
		phone = telephone;
	}
	public String toString() {
		return lastName + ", " + firstName + "\t" + phone;
	}
	public boolean equals (Object other) {
		return(lastName.equals(((Contact)other).getLastName()) && firstName.equals(((Contact)other).getFirstName()));		
	}
	public int compareTo(Contact other) {
		int result;
		if (lastName.equals(other.getLastName()))
			result = firstName.compareTo(other.getFirstName());
		else
			result = lastName.compareTo(other.getLastName());
		return result;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
}
