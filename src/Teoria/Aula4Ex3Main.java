package Teoria;

import java.util.Scanner;

public class Aula4Ex3Main
{
    public static void main(String argv[])
    {
        Aula4Ex3Pessoa pessoa1 = new Aula4Ex3Pessoa();
        Aula4Ex3Pessoa pessoa2 = new Aula4Ex3Pessoa();

        String nome;
        String cpf;

        Scanner teclado = new Scanner(System.in);

        nome = teclado.nextLine();
        cpf = teclado.nextLine();

        pessoa1.setNome(nome);
        pessoa1.setCPF(cpf);

        nome = teclado.nextLine();
        cpf = teclado.nextLine();

        pessoa2.setNome(nome);
        pessoa2.setCPF(cpf);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("CPF: " + pessoa1.getCPF());
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("CPF: " + pessoa2.getCPF());
    }
}
