package Teoria;

public class Aula6Ex3Funcionario
{
    public Aula6Ex3Funcionario(){}
    public Aula6Ex3Funcionario(String nome, int idade, String sexo, int numero)
    {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.numero = numero;
    }

    public int getIdade()
    {
        return idade;
    }

    public int getNumero()
    {
        return numero;
    }

    public String getNome()
    {
        return nome;
    }

    public String getSexo()
    {
        return sexo;
    }

    private String nome, sexo;
    private int idade, numero;
}
