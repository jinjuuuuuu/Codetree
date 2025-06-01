import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[2001];  // 충분히 큰 배열
        int current = 1000;         // 중간 지점에서 시작

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'L') {
                for (int j = current - x + 1; j <= current; j++) {
                    arr[j]++;
                }
                current = current - x;
            } else if (dir == 'R') {
                for (int j = current + 1; j <= current + x; j++) {
                    arr[j]++;
                }
                current = current + x;
            }
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 2) cnt++;
        }
        System.out.println(cnt);
    }
}
