package lab_4;

public class Name {
    // Instance data: first, middle, and last names
    private String first;
    private String middle;
    private String last;

    // Constructor: Initializes the first, middle, and last names
    public Name(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    // Getters for first, middle, and last names
    public String getFirst() {
        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }

    // Method to return the full name in the order: first middle last
    public String firstMiddleLast() {
        return first + " " + middle + " " + last;
    }

    // Method to return the full name in the order: last, first middle
    public String lastFirstMiddle() {
        return last + ", " + first + " " + middle;
    }

    // Method to compare two Name objects (case insensitive)
    public boolean equals(Name otherName) {
        return this.first.equalsIgnoreCase(otherName.getFirst()) &&
               this.middle.equalsIgnoreCase(otherName.getMiddle()) &&
               this.last.equalsIgnoreCase(otherName.getLast());
    }

    // Method to return the initials in uppercase
    public String initials() {
        return (first.substring(0, 1).toUpperCase() +
                middle.substring(0, 1).toUpperCase() +
                last.substring(0, 1).toUpperCase());
    }

    // Method to return the total number of characters in the full name, excluding spaces
    public int length() {
        return (first.replace(" ", "").length() +
                middle.replace(" ", "").length() +
                last.replace(" ", "").length());
    }
}