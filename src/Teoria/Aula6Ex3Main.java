package Teoria;

import java.util.Scanner;

public class Aula6Ex3Main
{
    public static void main(String argv[])
    {
        Aula6Ex3Funcionario func1 = new Aula6Ex3Funcionario();
        Aula6Ex3Funcionario func2 = new Aula6Ex3Funcionario("Fulano", 20, "Masc", 123);

        System.out.println(func1.getNome() + " " + func1.getIdade() + " " + func1.getSexo() + " " + func1.getNumero());
        System.out.println(func2.getNome() + " " + func2.getIdade() + " " + func2.getSexo() + " " + func2.getNumero());
    }
}
