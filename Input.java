import java.util.Collection;
import java.util.Scanner;
public class Input {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину масссива:");
        int j;
        j = sc.nextInt(); //считывает целое число из поток ввода и сохраняет в переменную
        int i;
        int col = 0;
        int [] mas = new int[j];
        while (col<mas.length)
        {
            i = sc.nextInt();
            mas[col] = i;
            col++;

        }
        int max = -10000;
        int min = 10000;
        int sum = 0;
        for (int k = 0;k<mas.length;k++)
        {
            if (mas[k]<min)
                min = mas[k];
            else
                max = mas[k];
            sum += mas[k];
            System.out.print(mas[k]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("Сумма элементов массива: ");
        System.out.println(sum);
        System.out.print("Макс элемент массива: ");
        System.out.println(max);
        System.out.print("Мин элемент массива: ");
        System.out.println(min);
    }

}

