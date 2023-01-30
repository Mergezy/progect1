import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = input.nextInt();//задание размера массива
        if (n == 0) System.out.println("В массиве не может быть меньше 1 числа");
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {//заполнение массива
            System.out.printf("Введите %d элемент: ", i+1);
            mas[i] = input.nextInt();
        }
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3= Integer.MIN_VALUE;//минимальное значение инта
        int min = Integer.MAX_VALUE;
        double sum = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max1) {
                max3 = max2; // присвоение второго максимального третьему
                max2 = max1; // присвоение первого макимального второму
                max1 = mas[i]; // присвоение нынешнего элемента массива первому максимальному
            } else if (mas[i] > max2 && mas[i] != max2) {//!= на случай одинаковых элементов
                max3 = max2;
                max2 = mas[i];
            } else if (mas[i] > max3 && mas[i] != max3) {
                max3 = mas[i];
            }
            if (mas[i] <  min){min = mas[i];}
//            System.out.print(mas[i]+" ");
//            System.out.print("max 1 = " + max1+" ");
//            System.out.print("max 2 = " + max2+" ");
//            System.out.print("max 3 = " + max3+" ");
//            System.out.print("min = " + min+" \n"

        }
            for (int i : mas) {sum += i;}//среднее арифмитическое
            sum /= n;

// 13 0 9 11 17
        System.out.print("Первое максимальное: " + max1+" || ");
        if (max2 != Integer.MIN_VALUE){
            System.out.print("Второе макимальное: " + max2+" || ");}
        if (max3 != Integer.MIN_VALUE){
            System.out.println("Третье максимальное: " + max3);}
        System.out.println("Минимальное число: "+min);
        System.out.println("Среднее арифмитическое: " + sum);


    }

}


