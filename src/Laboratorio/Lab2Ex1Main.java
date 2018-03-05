package Laboratorio;

import java.util.Scanner;

public class Lab2Ex1Main
{
    public static void main(String argv[])
    {
        Lab2Ex1Employee funcionario1 = new Lab2Ex1Employee();
        Lab2Ex1Employee funcionario2 = new Lab2Ex1Employee();

        Scanner teclado = new Scanner(System.in);

        String buffer;
        Double salario, aumento;

        //PRIMEIRO FUNCIONARIO
        System.out.println("Entre com o nome do primeiro funcionário: ");
        buffer = teclado.nextLine();

        funcionario1.setNome(buffer);

        System.out.println("Entre com o sobrenome do primeiro funcionário: ");
        buffer = teclado.nextLine();

        funcionario1.setSobrenome(buffer);

        System.out.println("Entre com o salário mensal do primeiro funcionário");
        salario = teclado.nextDouble();

        funcionario1.setSalario(salario);

        //EXIBIR SALARIO ANUAL DO PRIMEIRO FUNCIONARIO
        System.out.println("O salário anual do funcionário "+ funcionario1.getNome() + " " + funcionario1.getSobrenome()
                + " é: R$" + funcionario1.salarioAnual());

        //LIMPAR BUFFER DO SCANNER
        buffer = teclado.nextLine();

        //SEGUNDO FUNCIONARIO
        System.out.println("Entre com o nome do segundo funcionário: ");
        buffer = teclado.nextLine();

        funcionario2.setNome(buffer);

        System.out.println("Entre com o sobrenome do segundo funcionário: ");
        buffer = teclado.nextLine();

        funcionario2.setSobrenome(buffer);

        System.out.println("Entre com o salário mensal do segundo funcionário");
        salario = teclado.nextDouble();

        funcionario2.setSalario(salario);

        //EXIBIR SALARIO ANUAL DO SEGUNDO FUNCIONARIO
        System.out.println("O salário anual do funcionário "+ funcionario2.getNome() + " " + funcionario2.getSobrenome()
                + " é: R$" + funcionario2.salarioAnual());

        //AUMENTO DO PRIMEIRO FUNCIONARIO

        System.out.println("Entre com a % de aumento que deseja dar para o funcionario " + funcionario1.getNome() + " "
                + funcionario1.getSobrenome());

        aumento = teclado.nextDouble();

        funcionario1.aumento(aumento);

        System.out.println("O novo salário do funcionario " + funcionario1.getNome() + " " + funcionario1.getSobrenome()
                + " será R$" + funcionario1.getSalario() + " mensais e R$" + funcionario1.salarioAnual() + " anuais.");

        //AUMENTO DO SEGUNDO FUNCIONARIO

        System.out.println("Entre com a % de aumento que deseja dar para o funcionario " + funcionario2.getNome() + " "
                + funcionario2.getSobrenome());

        aumento = teclado.nextDouble();

        funcionario2.aumento(aumento);

        System.out.println("O novo salário do funcionario " + funcionario2.getNome() + " " + funcionario2.getSobrenome()
                + " será R$" + funcionario2.getSalario() + " mensais e R$" + funcionario2.salarioAnual() + " anuais.");

    }

}