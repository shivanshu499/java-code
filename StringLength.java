public class StringLength {
    public static void main(String[] args) 
    {
        String inputString = "Welcome to Gla university";

        int length = findStringLength(inputString);

        System.out.println("string length = " + length);
    }

    public static int findStringLength(String input)
     {
        int length = 0;
        
        
        for (int i = 0; i < input.length(); i++) {
            length++;
        }
        
        return length;
    }
}
