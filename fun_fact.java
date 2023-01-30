package java_dsa;

import java.util.Scanner;

public class fun_fact {
	
	public static void printfactorial(int n) {
		//loop
		if(n<0) {
			System.out.println("invalid number");
			return;
		}
		int factorial=1;
		
		for(int i=n;i>=1;i--) {
			factorial=factorial*i;
			
		}
		System.out.println(factorial);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		
		printfactorial(n);

	}

}
