    import java.util.*;
    public class Inverse {
        public static void main(String args[]) {
            try (//Inverse NO.
            Scanner sc = new Scanner(System.in)) {
                int n = sc.nextInt();
                int [] a = new int[10];//Defining an array
                int count =1;
                while(n>0){
                    a[n%10]=count;
                    count++;
                    n/=10;
                }
                for(int i= a.length-1;i>0;i--){
                    if(a[i]!=0){
                        System.out.print(a[i]);//Printing array elements
                    }
                }
            }
        }
    }
