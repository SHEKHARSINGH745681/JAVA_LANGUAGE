package java_dsa;

import java.util.Scanner;

public class sumfirstnaturalnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//user input ke liye use kiya hai 9&10line
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
