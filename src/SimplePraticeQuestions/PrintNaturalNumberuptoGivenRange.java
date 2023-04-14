package SimplePraticeQuestions;

import java.util.Scanner;

public class PrintNaturalNumberuptoGivenRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the upper Limit to print the number : ");
		int ul=sc.nextInt();
		for(int i=0;i<=ul;i++) {
			System.out.println(i);
		}
		sc.close();
	}

}
