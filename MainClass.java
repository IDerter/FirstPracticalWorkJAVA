import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args) {
        int [] mas = new int[10];
        int sum = 0;
        for (int i = 0;i<mas.length;i++)
        {
            mas[i] = i;
            System.out.print(i);
            System.out.print(" ");
            sum+=i;
        }
        System.out.println();
        System.out.println(sum/ mas.length);
    }

}
