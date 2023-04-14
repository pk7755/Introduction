package SimplePraticeQuestions;

import java.util.Scanner;

public class StarPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n :");
		int n=sc.nextInt();
		
		
		for(int j=0;j<n;j++ ) {
			for(int i=0;i<n-j-1;i++) {
				System.out.print(" ");
			}
			for(int i=0;i<=j;i++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		sc.close();
	}
}
