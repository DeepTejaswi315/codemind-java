import java.util.*;
public class Arithmetic{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.printf("Sum:%d
", a+b);
        System.out.printf("Difference:%d
", a-b);
        System.out.printf("Product:%d
", a*b);
        System.out.printf("Quotient:%d
", a/b);
        System.out.printf("Remainder:%d
", a%b);
    }
}