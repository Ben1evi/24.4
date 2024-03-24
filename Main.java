import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите массив");
        int n = scanner.nextInt();
        int[] h = new int[n];

        System.out.println("Введите параметр k");
        int k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
            System.out.println("Вы ввели значение: " + h[i]);
        }

        int minSum = Integer.MAX_VALUE;
        int minIndex = 0;
        
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += h[i];
        }

        minSum = sum;

        for (int i = 0; i <= n - k; i++) {
            sum -= h[i];
            sum += h[i + k - 1];
        
            if (sum < minSum) {
                minSum = sum;
                minIndex = i + 1;
            }
        }        
        
        System.out.println("Индекс первой полосы с минимальной суммой: " + minIndex);
        scanner.close();
    }
}
