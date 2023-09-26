    import java.util.*;
    public class NthFino {
        //Nth Fibonacci (Hard)
        static int fibo(int n){   
            if (n <= 1)    //Base equation
            return n;
            return fibo(n - 1) + fibo(n - 2);
        }
        public static void main(String args[]){
            try (Scanner sc = new Scanner(System.in)) {
                int n = sc.nextInt();
                System.out.println(fibo(n));
            }
        }
    }
