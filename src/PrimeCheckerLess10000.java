import java.util.Scanner;

public class PrimeCheckerLess10000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số để kiểm tra(lưu ý số nhỏ hơn 10000)");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " là số nguyên tố");
        } else System.out.println(number + " không phải là số nguyên tố");
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return isPrime = false;
            }
        }
        return isPrime;
    }
}
