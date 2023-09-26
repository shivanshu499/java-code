	import java.util.*;
	public class BinarytoDecimal {
		public static void main(String args[]) {
			try (//Binary To Decimal
			Scanner sc = new Scanner(System.in)) {
				int n = sc.nextInt();//Taking input of no.
				int decimal = 0;	//Initizallinzing a variable 	
				int m = 0;  //For power
				while(n > 0){
					int temp = n%10; 
					decimal += temp*Math.pow(2, m);  
					n /= 10;  
					m++;  
				}
				System.out.println(decimal);
			}
		}
	}
