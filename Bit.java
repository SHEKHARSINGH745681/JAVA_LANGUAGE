package java_dsa;

import java.util.*;

public class Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int pos =2;
		int bitmask =1<<pos;
		
		if((bitmask & n)==0) {
			
			System.out.println("bit was zero");
		}else {
			System.out.println("bit was one");
		}

	}

}