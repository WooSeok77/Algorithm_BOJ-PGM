import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int K = sc.nextInt();
        int sum = 0;
        for(int i = 0 ; i < K ; i++) {
            int n = sc.nextInt();
            if (n == 0) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }
            while(!stack.isEmpty()) {
                sum += stack.pop();
            }
            System.out.println(sum);
    }
}