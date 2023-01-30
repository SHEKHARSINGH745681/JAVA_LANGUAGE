package java_dsa;

public class adv_pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		
		for(int i=1;i<=n;i++) {
			
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//numbers
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
				//+" " isliye aad kiya hai kyu ki space har num.ke baad
				//
			}
			System.out.println();
		}
				

	}

}
      
//OUTPUT
//    1
//   2 2
//  3 3 3
// 4 4 4 4
//5 5 5 5 5