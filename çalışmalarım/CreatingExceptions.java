package çalışmalarım;
import java.util.Scanner;
public class CreatingExceptions {
	public static void main(String[] args) throws OutOfRangeException{
		final int MIN= 25, MAX=40;
		Scanner scan = new Scanner(System.in);
		OutOfRangeException problem=new OutOfRangeException("Input value is out of range.");
		System.out.print("Enter an integer value between" + MIN+ " and "+MAX+", inclusive: ");
		int value = scan.nextInt();
		if(value<MIN || value>MAX) {
			extracted(problem);
		}
		System.out.println("End of main method.");
		scan.close();
	}

	private static void extracted(OutOfRangeException problem) throws OutOfRangeException {
		throw problem;
	}
}
