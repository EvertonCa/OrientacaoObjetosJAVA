/*
Aluno: Everton Cardoso Acchetta
RA: 22.117.061-6
Disciplina: CC3642 - Orientação a Objetos

Programa criado para receber o Nome, Sobrenome e Salario de 2 funcionários. Exibir o salário anual, aplicar um aumento
e exibir o novo salário.
 */
package Laboratorio;

public class Lab2Ex1Employee
{
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
    }

    public void setSalario(Double salario)
    {
        if (salario < 0) //verifica se o valor entrado é positivo. Caso contrario, atribui 0
            salario = 0.0;

        this.salario = salario;
    }

    public String getNome()
    {
        return nome;
    }

    public String getSobrenome()
    {
        return sobrenome;
    }

    public Double getSalario()
    {
        return salario;
    }

    //exibe o salário anual.
    public double salarioAnual()
    {
        return salario * 12;
    }

    //aplica um aumento em % no salario do funcionário
    public void aumento(double porcentagem)
    {
        salario = salario + ((porcentagem * 0.01) * salario);
    }

    private String nome;
    private String sobrenome;
    private Double salario;
}
