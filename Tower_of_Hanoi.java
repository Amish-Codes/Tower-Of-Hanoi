package Recursion;
import  java.util.Scanner;
public class Tower_of_Hanoi {

    public static void twh(int n, String src, String helper, String dest) {
        if (n==1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        twh(n-1,src,dest,helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        twh(n-1,helper,src,dest);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while (true) {
            System.out.println("Enter no. of disks ->");
            int n = sc.nextInt();
            twh(n, "s", "H", "d");
        }
    }
}
