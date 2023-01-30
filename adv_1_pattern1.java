package java_dsa;

public class adv_1_pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		//first half
		for(int i=1;i<=n;i++) {
			//1st part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//spaces
			int spaces =2*(n-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			//2nd part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//revesse
				for(int i=n;i>=1;i--) {
					//1st part
					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}
					//spaces
					int spaces =2*(n-i);
					for(int j=1;j<=spaces;j++) {
						System.out.print(" ");
					}
					//2nd part
					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println();
		

	}


	}

}
