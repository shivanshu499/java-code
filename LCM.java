import java.util.*;
public class LCM {
    public static void main(String args[]) {
        try (//LCM
        Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int lcm = (n1 > n2) ? n1 : n2;//Finding the largest b|w 1 & 2 no.
            while(true) {
                if( lcm % n1 == 0 && lcm % n2 == 0 ) {//Finding the lowest factor that is common to both
                    System.out.println(lcm);         //Printing LCM ans
                    break;
                }
                ++lcm;
            }
        }
    }
}
