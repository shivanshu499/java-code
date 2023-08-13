class Temp {
    // instance variable
    int a = 10;
    int b = 20;

    void sum() {
        // instance method
        int c = a + b;
        System.out.print("the result of a and b is " + c);
        
    }
      public static void main(String[] args)
      {
        Temp t=new Temp();
        System.out.println(t.a+t.b);
        System.out.println(t.b);
        t.sum();
      }    

}