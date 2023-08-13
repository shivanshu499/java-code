import java.util.*;
class Leap_year
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int y;
        System.out.println("Enter a year");
        y=sc.nextInt();
        if(y%4==0 && y%100!=0 || y%400==0)
        System.out.println("It's a leap year");
        else 
        System.out.println("Not a leap year");
    }
}