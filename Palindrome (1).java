import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,d,nd=0;
        System.out.println("Enter the number:");
        a=sc.nextInt();
        int b=a;
        d=a%10;
        nd=d*10 + nd;
        a=a/10;
        if(b==nd)
        {
        System.out.println("Number "+b+" is palindrome");
        }
        else
        System.out.println("Number "+b+" is not palindrome");
        
    }
}