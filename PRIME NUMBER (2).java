import java.util.Scanner;

class c {
    public static void main(String[] args) {
        int n, count = 0, i = 1;
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        System.out.print("enter the number");
        while (i <= n) {
            if (n % i == 0) {
                count = count + 1;
                i = i + 1;
            }
            if (count == 2)
                System.out.print("prime number ");
            else
                System.out.print(" not prime number ");

        }

    }

}
