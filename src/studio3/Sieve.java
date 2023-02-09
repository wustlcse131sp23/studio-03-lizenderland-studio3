package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How many Numbers?");
		int n = in.nextInt() - 1;
		boolean[] array = new boolean[n];
		for (int i = 2; (i-2) < n; i++) {
			for (int j = 2; (i*j-2)<n; j++) {
				array[i*j-2] = true;
			}
		}
		for (int k = 0; k<n; k++) {
			if (!array[k]) {
				System.out.println(k+2);
			}
		}

	}
}