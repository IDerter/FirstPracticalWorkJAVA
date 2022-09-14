public class Garmonick {
    public static void main(String[] args)
    {
        float sum = 0;
        for (int i = 1;i<11;i++)
        {
            sum += 1.0/i;
            System.out.print(i + ") число гармонического ряда - ");
            System.out.println(sum);
        }
    }
}
