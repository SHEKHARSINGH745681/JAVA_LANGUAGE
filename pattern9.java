package java_dsa;

public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		//outer loop
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				int sum=i+j;
				if(sum % 2 == 0) {
					System.out.print("1 ");//even
				}else{//odd
					System.out.print("0 ");
			}
		}
		System.out.println();

	}

}
}