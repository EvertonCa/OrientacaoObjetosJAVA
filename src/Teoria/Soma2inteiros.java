package Teoria;

import java.util.Scanner;

public class Soma2inteiros
{
    public static void main( String args[])
    {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int result;

        System.out.print("Entre com o primeiro numero: ");
        x = input.nextInt();

        System.out.print("Entre com o segundo numero: ");
        y = input.nextInt();

        System.out.print("Entre com o terceiro numero: ");
        z = input.nextInt();

        result = x * y * z;

        System.out.printf("O produto é: %d\n", result);
    }
}
