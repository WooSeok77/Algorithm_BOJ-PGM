import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursion(n));
    }
    public static int recursion(int n) {
        if(n == 0){
           return 1;

        }
        return n * recursion(n-1);
    }
}