package java_dsa;

public class adv_pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//palindromic patter ka mtlb dono side same dikhe
		int n =5;
		
		for(int i=1;i<=n;i++) {
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//1st half num
			for(int j=i; j>=1;j--) {
				System.out.print(j);
			}
			//2nd half
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
