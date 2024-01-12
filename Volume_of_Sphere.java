import java.util.*;
public class Volume {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        double v =(4*3.14*(r*r*r))/3;
        System.out.printf("%.2f",v);
    }
}