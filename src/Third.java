import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        System.out.println("Введено число:" + a);
        System.out.println("Введите число:");
        int b = sc.nextInt();
        System.out.println("Введено число:" + b);
        System.out.println("Введите число:");
        int c = sc.nextInt();
        System.out.println("Введено число:" + c);
        System.out.println("Введите число:");
        int d = sc.nextInt();
        System.out.println("Введено число:" + d);
        int answer = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println("Наибольшее число: " + answer);
        int f = Math.min(Math.min(a, b), Math.min(c, d));
        System.out.println("Наименьшее число: " + f);
    }
}
