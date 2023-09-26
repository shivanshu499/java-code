import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter a upper string");

        
        String uppercaseString = scanner.nextLine();

        String lowercase = convertToLowercase(uppercaseString);

        System.out.println("Lowercase string" +lowercase);

        scanner.close();


    }

    public static String convertToLowercase(String uppercaseString) {
        
        return uppercaseString.toLowerCase();

    

    }
    
}
