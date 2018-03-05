import java.util.Scanner;

public class Aula4Ex4SwapperDemo
{
    public static void main(String argv[])
    {
        Aula4Ex4Swapper troca = new Aula4Ex4Swapper();

        float x, y;

        Scanner teclado = new Scanner(System.in);

        x = teclado.nextInt();
        y = teclado.nextInt();

        troca.setX(x);
        troca.setY(y);

        troca.swap();
        System.out.println(troca.getX());
        System.out.println(troca.getY());
    }
}
