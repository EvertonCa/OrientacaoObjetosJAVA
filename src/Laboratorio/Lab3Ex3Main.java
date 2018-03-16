/*
Aluno: Everton Cardoso Acchetta
RA: 22.117.061-6
Disciplina: CC3642 - Orientação a Objetos

Programa criado para calcular o perimetro e/ou a area de um triangulo
 */

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


        //entrada de valores do triangulo pelo usuario
        System.out.println("Entre com o comprimento do retangulo: ");
        buffer = teclado.nextDouble();
        triangulo1.setLength(buffer);

        System.out.println("Entre com a largura do retangulo: ");
        buffer = teclado.nextDouble();
        triangulo1.setWidth(buffer);

        //menu para calculo de perimetro ou area.
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
                case 0: // finaliza o programa
                {
                    System.out.println("|-----------------------------------------------|");
                    System.out.println("| Obrigado por usar o Rectangle Calculator 3000 |");
                    System.out.println("|-----------------------------------------------|");
                    teste = false;
                    break;
                }

                case 1: // calcula o perimetro
                {
                    System.out.println("PERIMETRO = " + triangulo1.calculaPerimetro());
                    break;
                }

                case 2: // calcula a area
                {
                    System.out.println("AREA = " + triangulo1.calculaArea());
                    break;
                }
            }
        }
    }
}
