class conditional {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 20;
        if (a > b && a > c)
            System.out.println("a is greater");
        else if (b > c && b > a)
            System.out.println("b is greater");
        else
            System.out.println("c is greater");
    }
}
