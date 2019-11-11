package Task1;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
			int n = scan.nextInt();
			int a, b=0,c;
			c = n;
			while(n>0) {
				a = n % 10;
				n = n / 10;
				b = b + (a*a*a);
				System.out.println(a+ " "+n+ " " +b);
			}
			if(c == b) {
				System.out.println("Armstrong Number");
			}
			else {
				System.out.println("Not Armstrong Number");
			}
			System.out.println("File has been modified" );
	}

}
