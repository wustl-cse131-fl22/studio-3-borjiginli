package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please give us n: ");
		int n = in.nextInt();
		
		int[] sieve = new int[n];
		int numCount = 0;
		for(int i = 0; i < sieve.length; i++) {
			numCount++;
			sieve[i]=numCount;
		}
		
		double length =sieve.length;
		for(int x = 2; x < Math.sqrt(length); x++) {
			for(int z =0; z < sieve.length; z++) {
				int temp = 0;
				temp=sieve[z];
					if((temp%x==0)&&(temp!=x)) {
						sieve[z]=0;
					}
					
			}
		}
		for(int y = 0; y < sieve.length; y++) {
			if((sieve[y]!=0) && (sieve[y]!=1)) {
				System.out.println(sieve[y]);
			}
		}


	}

}
