/*
Aluno: Everton Cardoso Acchetta
RA: 22.117.061-6
Disciplina: CC3642 - Orientação a Objetos

Programa criado para receber o Dia, Mês e Ano do usuário e exibir a data formatada dd/mm/aaaa.
 */
package Laboratorio;
import java.util.Scanner;

public class Lab2Ex2DateTest
{
    public static void main (String argv[])
    {
        Scanner teclado = new Scanner(System.in);
        Lab2Ex2Date data = new Lab2Ex2Date();

        int buffer;

        //Entrar com o dia da data
        System.out.println("Entre com o dia: ");
        buffer = teclado.nextInt();

        data.setDia(buffer);

        //Entrar com o mes da data
        System.out.println("Entre com o mês: ");
        buffer = teclado.nextInt();

        data.setMes(buffer);

        //Entrar com o ano da data
        System.out.println("Entre com o ano: ");
        buffer = teclado.nextInt();

        data.setAno(buffer);

        //exibir a data
        data.displayDate();

    }
}
