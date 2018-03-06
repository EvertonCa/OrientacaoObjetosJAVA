package Laboratorio;
import java.util.Scanner;

public class Lab2Ex2Date
{
    public void setDia(int dia)
    {
        //case test para verificar se o dia entrado se encaixa nos casos de teste
        Boolean certo = false;
        while (certo == false)
        {
            if(dia > 31 || dia < 1)
            {
                Scanner teclado = new Scanner(System.in);
                mensagemErro();
                dia = teclado.nextInt();
            }
            else
                certo = true;
        }
        this.dia = dia;
    }

    public int getDia()
    {
        return dia;
    }

    public void setMes(int mes)
    {
        //case test para verificar se o mes entrado se encaixa nos casos de teste
        Boolean certo = false;
        while (certo == false)
        {
            if(mes > 12 || mes < 1)
            {
                Scanner teclado = new Scanner(System.in);
                mensagemErro();
                mes = teclado.nextInt();
            }
            else
                certo = true;
        }
        this.mes = mes;
    }

    public int getMes()
    {
        return mes;
    }

    public void setAno(int ano)
    {
        //case test para verificar se o ano entrado se encaixa nos casos de teste
        Boolean certo = false;
        while (certo == false)
        {
            if(ano < 1)
            {
                Scanner teclado = new Scanner(System.in);
                mensagemErro();
                ano = teclado.nextInt();
            }
            else
                certo = true;
        }
        this.ano = ano;
    }

    public int getAno()
    {
        return ano;
    }

    //mensagem para ser exibida quando um valor nao possivel for entrado.
    public void mensagemErro()
    {
        System.out.println("Valor inválido! Favor digitar uma data possivel!");
    }

    public void displayDate()
    {
        System.out.println("A data digitada foi: " + dia + "/" + mes + "/" + ano);
    }
    private int dia, mes, ano;
}
