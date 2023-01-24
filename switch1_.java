package java_dsa;
import java.util.*;

public class switch1_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int button =sc.nextInt();
		
		//if(button == 1) {
	    //System.out.println("hello");
			
		//}else if(button == 2){
		//System.out.println("namste");
			
		//}else if(button == 3){
		//System.out.println("invalid button");
		//}
		
		switch(button) {
		case 1:System.out.println("hello");
		break;
		case 2:System.out.println("namste");
		break;
		case 3 :System.out.println("ram ram");
		break;
		default:System.out.println("invalid button");
		}
	}	
		

}
