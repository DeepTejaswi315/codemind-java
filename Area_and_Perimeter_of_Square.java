import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int area = a*a;
        int perimeter = 4*a;
        System.out.printf("%d %d",area,perimeter);
    }
}