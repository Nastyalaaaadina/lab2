import java.util.Scanner;

    public class First {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число!:");
            int a = sc.nextInt();
            System.out.println("Введено число:" + a);
            System.out.println("Введите число!:");
            int b = sc.nextInt();
            System.out.println("Введено число:" + b);
            System.out.println("Введите число!:");
            int c = sc.nextInt();
            System.out.println("Введено число:" + c);
            System.out.println("Введите число!:");
            int d = sc.nextInt();
            System.out.println("Введено число!:" + d);
            int answer = Math.min(Math.min(a, b), Math.min(c, d));
            System.out.println("Наименьшее число: " + answer);
        }
    }

