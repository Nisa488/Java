package çalışmalarım;

public class Words2 {
	public static void main(String[] args) {
		Dictionary2 webster = new Dictionary2(1500, 52500);
		System.out.println("Number of pages: " + webster.getPages());
		System.out.println("Definitions per page: " + webster.computeRatio());
	}
}
