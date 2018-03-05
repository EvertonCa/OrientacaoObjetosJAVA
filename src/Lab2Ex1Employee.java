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
        if (salario < 0)
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

    public double salarioAnual()
    {
        return salario * 12;
    }

    public double aumento(double porcentagem)
    {
        salario = salario + ((porcentagem * 0.01) * salario);
        return salario;
    }

    private String nome;
    private String sobrenome;
    private Double salario;
}
