import java.util.*;
public class Decimal2Binary {
    static void dectobin(int n)
    {
    int bin=0;
    int Power=0;
    while (n>0) {
        int rem=n%2;
        bin=bin+(rem*(int)Math.pow(10,Power));
        Power++;
        n=n/2;
    }
    System.out.println(bin);
}
    public static void main(String[] args) {
        int n=7;
        dectobin(n);    // int rem=0;


    }
    
}