Import java.util.Scanner;
class odd even
{

    public static void main(String[] args) {

        int n;
        System.out.print("enter the number");
        Scanner r = new Scanner(System.in);
        n = r.nextint();

        if (n % 2 == 0) {
            System.out.print("even number");
        } else {
            System.out.print("odd number");
        }
    }
}