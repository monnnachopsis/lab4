import java.util.Scanner;
import  java.lang.String;

public class var12 {
    public static void main(String[] args) {
        int a;
        int b;
        int max = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        a = in.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        b = in.nextInt();

        //заполнение
        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                arr[i][j] = in.nextInt();
            }
        }
        in.close();

        //вывод
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        //макс четное число
        boolean find = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int temp = arr[i][j];
                if (temp % 2 == 0) {
                    if (find) {
                        max = temp;
                        find = false;
                    } else if (temp > max) {
                        max = temp;
                    }
                }
            }
        }

        //вывод макс. четного числа или если его нет, то вывод ошибки
        System.out.println(find ? "Нет четных чисел" : max);


    }
}