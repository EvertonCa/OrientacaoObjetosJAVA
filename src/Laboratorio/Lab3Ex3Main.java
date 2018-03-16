package Laboratorio;

import java.util.Scanner;

public class Lab3Ex3Main
{
    public static void main (String argv[])
    {
        Scanner teclado = new Scanner(System.in);
        Lab3Ex3Rectangle triangulo1 = new Lab3Ex3Rectangle();
        double buffer;
        boolean teste = true;

        System.out.println("|-----------------------------------------------|");
        System.out.println("|     Bem vindo ao Rectangle Calculator 3000    |");
        System.out.println("|-----------------------------------------------|");

        System.out.println("Entre com o comprimento do retangulo: ");
        buffer = teclado.nextDouble();
        triangulo1.setLength(buffer);

        System.out.println("Entre com a largura do retangulo: ");
        buffer = teclado.nextDouble();
        triangulo1.setWidth(buffer);

        while (teste)
        {
            int opcao;

            System.out.println("|-----------------------------------------------|");
            System.out.println("| Entre com a opcao desejada:                   |");
            System.out.println("| 1 - Perimetro do retangulo                    |");
            System.out.println("| 2 - Area do retangulo                         |");
            System.out.println("| 0 - Finalizar o programa                      |");
            System.out.println("|-----------------------------------------------|");
            opcao = teclado.nextInt();

            switch (opcao)
            {
                case 0:
                {
                    System.out.println("|-----------------------------------------------|");
                    System.out.println("| Obrigado por usar o Rectangle Calculator 3000 |");
                    System.out.println("|-----------------------------------------------|");
                    teste = false;
                    break;
                }

                case 1:
                {
                    System.out.println("PERIMETRO = " + triangulo1.calculaPerimetro());
                    break;
                }

                case 2:
                {
                    System.out.println("AREA = " + triangulo1.calculaArea());
                    break;
                }
            }
        }
    }
}
