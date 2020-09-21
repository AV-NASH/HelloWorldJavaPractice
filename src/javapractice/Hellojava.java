package javapractice;


import java.util.Scanner;

public class Hellojava {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		add(a,b);
	
	}
	
	private static void add(int num1,int num2) {
		long sum=num1+num2;
		System.out.println(sum);

		System.out.println(" thank you so much");


	}
}

