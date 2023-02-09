package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How many Numbers?");
		int n = in.nextInt();
		int[] array = new int[n];
		for (int i=0; i<n; i++) {
			array[i] = i + 1;
		}
		

	}

}
