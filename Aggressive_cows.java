package sorting;

import java.util.Arrays;

public class Aggressive_cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] stall= {1,2,8,4,};
		Arrays.sort(stall);
		int noc=3;

	}
	public static int LargestminDistance(int[] satll,int noc) {
		
		int lo=stall[0];
		int hi= 
				stall[stall.length-1];
		
		int ans=0;
		while(lo<=hi) {
			
			int mid=(lo+hi)/2;
			if(isitpossible(stall,noc,mid)==true) {
				ans=mid;
				lo=mid+1;
				
			}else {
				hi=mid-1;
			}
		}
		return ans;
		

}
}
	