import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            min = Math.min(min, x1[i]);
            max = Math.max(max, x2[i]);
        }

        int offset = -min + 1;
        int size = max - min + 3;
        int[] arr = new int[size];

        for (int i = 0; i < n; i++) {
            int start = x1[i] + offset;
            int end = x2[i] + offset;
            arr[start] += 1;
            arr[end] -= 1;
        }

        int result = 0;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += arr[i];
            result = Math.max(result, sum);
        }

        System.out.println(result);
    }
}
