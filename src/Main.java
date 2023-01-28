import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = input.nextInt();
        if (x < 1) {System.out.println("X не может быть меньше 1!"); return;}
        System.out.print("Введите n: ");
        double sum = 0;
        int n = input.nextInt();
        while (n >= 0) {
            double  m = 1 / ((2 * n + 1) * Math.pow(x, 2 * n + 1));
            sum = sum + m;
            n--;
        }
        System.out.println("Ответ = "+sum*2);
    }
}
