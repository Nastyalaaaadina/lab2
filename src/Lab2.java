import java.util.Scanner;

public class Lab2 {
    static int fact(int n){
        int result =1;
        while (n!=0){
            result *= n;
            n--;}
        return result;}
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 0 до 14:");
        int n = scan.nextInt();
         for (int i=0;i<1;i++)
          if (n>-1 & n<15) {
             int result = fact(n);
            System.out.println("Факториал от " + n + " равен: " + result);}
          if (n>=15){
            System.out.println(" Вы ввели слишком большое число, попробуйте еще раз");
        }
          if (n<0){
             System.out.println(" Число, введенное вами не соответсвует требованиям");
         }
    }
}