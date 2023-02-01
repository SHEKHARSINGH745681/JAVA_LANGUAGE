package java_dsa;

import java.util.Scanner;

public class _2DArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row = sc.nextInt();
		int cols = sc.nextInt();
		
		int[][] numbers= new int[row][cols];
		
		//input
		for(int i=0;i<row ;i++) {
			
			for(int j=0;j<cols;j++){
				numbers[i][j]=sc.nextInt();
			}
		}
		//output
		for(int i=0;i<row;i++) {
			for(int j=0;i<cols;j++) {
				System.out.print(numbers[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}
