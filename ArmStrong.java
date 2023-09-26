 import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isArmstrong = isArmstrongNumber(num);
        System.out.println(isArmstrong);
        scanner.close();
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int numOfDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numOfDigits);
            num /= 10;
        }

        return sum == originalNum;
    }
}

