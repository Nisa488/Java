package test;

import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int i = 0;
			for (; i<5 ; i++) {
				System.out.println("Java öğreniyorum");
			}
			scan.close();
		}
	}
}
