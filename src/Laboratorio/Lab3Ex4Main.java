package Laboratorio;

import java.util.Scanner;

public class Lab3Ex4Main
{
    public static void main (String argv[])
    {
        Scanner teclado = new Scanner(System.in);
        int hora, minuto, segundo;
        boolean teste = true;

        System.out.println("|-----------------------------------------------|");
        System.out.println("|       Bem vindo ao Time Manipulator 3000      |");
        System.out.println("|-----------------------------------------------|");

        System.out.println("Entre com a hora desejada (0 - 23 horas): ");
        hora = teclado.nextInt();

        System.out.println("Entre com o minuto desejado (0 - 59 minutos): ");
        minuto = teclado.nextInt();

        System.out.println("Entre com o segundo desejado (0 - 59 segundos): ");
        segundo = teclado.nextInt();

        Lab3Ex4Time2 tempo = new Lab3Ex4Time2(hora, minuto, segundo);

        while(teste)
        {
            int opcao;

            System.out.println("|-----------------------------------------------|");
            System.out.println("| Entre com a opcao desejada:                   |");
            System.out.println("| 1 - Incrementar 1 segundo                     |");
            System.out.println("| 2 - Incrementar 1 minuto                      |");
            System.out.println("| 3 - Incrementar 1 hora                        |");
            System.out.println("| 4 - Mostrar o tempo no formato hh:mm:ss       |");
            System.out.println("| 5 - Mostrar o tempo no formato hh:mm:ss AM/PM |");
            System.out.println("| 0 - Finalizar o programa                      |");
            System.out.println("|-----------------------------------------------|");
            opcao = teclado.nextInt();

            switch (opcao)
            {
                case 0:
                {
                    System.out.println("|-----------------------------------------------|");
                    System.out.println("|   Obrigado por usar o Time Manipulator 3000   |");
                    System.out.println("|-----------------------------------------------|");
                    teste = false;
                    break;
                }

                case 1:
                {
                    tempo.tick();
                    System.out.println("|-----------------------------------------------|");
                    System.out.println("|                     FEITO!                    |");
                    System.out.println("|-----------------------------------------------|");
                    break;
                }

                case 2:
                {
                    tempo.incrementMinute();
                    System.out.println("|-----------------------------------------------|");
                    System.out.println("|                     FEITO!                    |");
                    System.out.println("|-----------------------------------------------|");
                    break;
                }

                case 3:
                {
                    tempo.incrementHour();
                    System.out.println("|-----------------------------------------------|");
                    System.out.println("|                     FEITO!                    |");
                    System.out.println("|-----------------------------------------------|");
                    break;
                }

                case 4:
                {
                    String saida;
                    saida = tempo.toUniversalString();
                    System.out.println("|-----------------------------------------------|");
                    System.out.println("|                 " + saida + "                      |");
                    System.out.println("|-----------------------------------------------|");
                    break;
                }

                case 5:
                {
                    String saida;
                    saida = tempo.toString();
                    System.out.println("|-----------------------------------------------|");
                    System.out.println("|                " + saida + "                    |");
                    System.out.println("|-----------------------------------------------|");
                    break;
                }

                default:
                {
                    System.out.println("|-----------------------------------------------|");
                    System.out.println("|       Favor entrar com uma opcao valida!      |");
                    System.out.println("|-----------------------------------------------|");
                    break;
                }
            }
        }

    }
}
