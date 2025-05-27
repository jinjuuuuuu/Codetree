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
            min = Math.min(min, Math.min(x1[i], x2[i]));
            max = Math.max(max, Math.max(x1[i], x2[i]));
        }

        int offset = -min;
        int[] arr = new int[max - min + 2];

        for (int i = 0; i < n; i++) {
            int start = x1[i] + offset;
            int end = x2[i] + offset;
            for (int j = start; j <= end; j++) {
                arr[j]++;
            }
        }

        int result = 0;
        for (int cnt : arr) {
            if (cnt > result) result = cnt;
        }

        System.out.println(result);
    }
}
