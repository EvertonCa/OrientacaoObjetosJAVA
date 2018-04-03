/*
Aluno: Everton Cardoso Acchetta
RA: 22.117.061-6
Disciplina: CC3642 - Orientação a Objetos

Programa criado para receber uma hora (hh:mm:ss) e data e acrescentar em um loop infinito, 1 segundo por segundo no valor entrado
 */

package Laboratorio;

import java.util.Scanner;

public class Lab4Ex3Main
{
    public static void main (String argv[])
    {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, ano, segundo, minuto, hora;

        //mensagem de Welcome
        System.out.println("|-----------------------------------------------|");
        System.out.println("|    Bem vindo ao Time/Date Manipulator 3000    |");
        System.out.println("|-----------------------------------------------|");

        //entrada de valores do usuario
        System.out.println("Entre com o dia desejado (1 - 31): ");
        dia = teclado.nextInt();

        System.out.println("Entre com o mes desejado (1 - 12): ");
        mes = teclado.nextInt();

        System.out.println("Entre com o ano desejado: ");
        ano = teclado.nextInt();

        System.out.println("Entre com a hora desejada (0 - 23 horas): ");
        hora = teclado.nextInt();

        System.out.println("Entre com o minuto desejado (0 - 59 minutos): ");
        minuto = teclado.nextInt();

        System.out.println("Entre com o segundo desejado (0 - 59 segundos): ");
        segundo = teclado.nextInt();

        //criacao do objeto com os dados do usuario
        Lab4Ex3DateAndTime data = new Lab4Ex3DateAndTime(hora, minuto, segundo, dia, mes, ano);

        while (true) //loop infinito
        {
            data.tick(); //incrementa 1 segundo
            System.out.printf("%s\n", data.toString()); //exibe a nova hora/data
            try { Thread.sleep (1000); } catch (InterruptedException ex) {} //faz o console esperar 1 segundo.
        }
    }
}
