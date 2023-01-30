package java_dsa;

import java.util.Scanner;

public class fun_mul {
		public static int calculateProduct(int a,int b) {
		
			return a*b;
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int a =sc.nextInt();
			int b =sc.nextInt();
	
			System.out.println("Product of two num is :"+calculateProduct(a,b));
	}

}
