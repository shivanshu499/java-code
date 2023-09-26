	import java.util.*;
	public class Replace {
		public static void main(String args[]) {
			try (//Replace Them All
			Scanner sc = new Scanner(System.in)) {
				int n = sc.nextInt();
				String s = Integer.toString(n);//Convert int string
				int l = s.length();//Finding length
				String s1 = "";
				//use the logic to replace all 0's with 1 in a given integer
				for(int i = 0 ; i < l ; i++)
				{
					if(s.charAt(i) == '0')//If zero found
						s1 = s1 + '5';//Changes to 5
					else
						s1 = s1 + s.charAt(i);	//String to int
				}
				System.out.println(s1);//Printing Converted no.
			}
	}
	}
