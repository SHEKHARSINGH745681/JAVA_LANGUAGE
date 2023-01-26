package java_dsa;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n1 =4;
		int m =5;
		// n=row,m=column
		//inner loop
		for(int i=1;i<=n1;i++) {
		
		for(int j=1;j<=m;j++){
			//cell(i,j)pr hai kuz selected pr * pint krna hai
			if(i == 1||j == 1||i ==n1||j ==m){
				System.out.print("*");//println jab use krte hai bt * har line pr print krna hota hai toh
			}
			else {
				System.out.print(" ");
			}
		}
			System.out.println();
			
		}
		

	}

}
