import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1001];
        int max = -1;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = a; j <= b; j++) {
                arr[j]++;
            }
        }

        for (int i = 0; i < 100; i++) {
            if (arr[i] > max) max = arr[i];
        }

        System.out.println(max);
        // Please write your code here.
    }
}