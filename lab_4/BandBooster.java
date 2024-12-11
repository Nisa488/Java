package lab_4;

public class BandBooster {
    // Instance data: name and boxesSold
    private String name;
    private int boxesSold;

    // Constructor: Initializes the name and sets boxesSold to 0
    public BandBooster(String boosterName) {
        name = boosterName;
        boxesSold = 0;  // Initial number of boxes sold is 0
    }

    // Method to get the name of the band booster
    public String getName() {
        return name;
    }

    // Method to update sales: adds the given number of boxes to boxesSold
    public void updateSales(int additionalBoxes) {
        boxesSold += additionalBoxes;
    }

    // Method to return the string representation of the BandBooster
    public String toString() {
        return name + ": " + boxesSold + " boxes";
    }
}