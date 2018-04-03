/*
Aluno: Everton Cardoso Acchetta
RA: 22.117.061-6
Disciplina: CC3642 - Orientação a Objetos

Programa criado para receber uma data (dia, mes e ano) e incrementar eternamente um dia nessa data, respeitando as restriçoes
 */


package Laboratorio;

import java.util.Scanner;

public class Lab4Ex2Main
{
    public static void main (String argv[])
    {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, ano;

        //mensagem de Welcome
        System.out.println("|-----------------------------------------------|");
        System.out.println("|       Bem vindo ao Date Manipulator 3000      |");
        System.out.println("|-----------------------------------------------|");

        //entrada de valores do usuario
        System.out.println("Entre com o dia desejado (1 - 31): ");
        dia = teclado.nextInt();

        System.out.println("Entre com o mes desejado (1 - 12): ");
        mes = teclado.nextInt();

        System.out.println("Entre com o ano desejado: ");
        ano = teclado.nextInt();

        //criacao do objeto com os dados do usuario
        Lab4Ex2Date data = new Lab4Ex2Date(mes, dia, ano);

        while (true) //loop infinito
        {
            data.nextDay(); //incrementa um dia
            System.out.printf("%s\n", data.toString()); //exibe a nova data
            try { Thread.sleep (1000); } catch (InterruptedException ex) {} //faz o console esperar 1 segundo.
        }
    }
}
