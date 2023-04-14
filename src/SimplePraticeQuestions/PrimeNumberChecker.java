package SimplePraticeQuestions;

import java.util.Scanner;

public class PrimeNumberChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int y=sc.nextInt();
		int h;
		for(int n=1;n<=y;n++) {
		h=n;
		int count=0;
		for(int i=2;i<=n/2;i++) {
			if (n%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("Prime Number is "+h);
		}
		sc.close();
		}
	}

}
