package java_dsa;

public class adv_pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
		 //spaces
			for(int j=1;j>=i;j--) {
				System.out.print(" ");
			}
			//stars
			for(int j=1;j<=5;j++) {
				
				if(i>=2 && i<=4) {
					if(j>=2 && j<=4) {
						System.out.print(" ");
					}
					else{
				          System.out.print("*");
			}
				} 
				
				else {
			System.out.print("*");
		}

	}
			System.out.println();

}
	}
}
