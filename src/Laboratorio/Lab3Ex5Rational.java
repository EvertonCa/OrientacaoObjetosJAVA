/*
Aluno: Everton Cardoso Acchetta
RA: 22.117.061-6
Disciplina: CC3642 - Orientação a Objetos

Programa criado para receber duas fracoes e executar/exibir soma, subtracao, multiplicacao e divisao entre elas.
 */

package Laboratorio;

import java.util.Scanner;

public class Lab3Ex5Rational
{
    public Lab3Ex5Rational() //construtor padrao
    {
        numerator = 1;
        denominator = 1;
    }

    public Lab3Ex5Rational(int numerator, int denominator) //construtor com numeros definidos + simplificacao
    {
        this.numerator = numerator;
        this.denominator = denominator;
        simplificaFracao();
    }
    public void simplificaFracao() //metodo que simplifica a fracao para o minimo divisivel.
    {
        boolean keepGoing = true;
        while (keepGoing)
        {
            if((numerator % denominator == 0 || denominator % numerator == 0) && (numerator != 1 && denominator != 1))
            {
                if(denominator > numerator)
                {
                    denominator = denominator / numerator;
                    numerator = numerator / numerator;
                }
                else
                {
                    numerator = numerator / denominator;
                    denominator = denominator / denominator;
                }
            }
            else if((numerator % 2 == 0 && denominator % 2 == 0) && (numerator != 1 && denominator != 1))
            {
                denominator = denominator / 2;
                numerator = numerator / 2;
            }
            else if((numerator % 3 == 0 && denominator % 3 == 0) && (numerator != 1 && denominator != 1))
            {
                denominator = denominator / 3;
                numerator = numerator / 3;
            }
            else if((numerator % 5 == 0 && denominator % 5 == 0) && (numerator != 1 && denominator != 1))
            {
                denominator = denominator / 5;
                numerator = numerator / 5;
            }
            else if((numerator % 7 == 0 && denominator % 7 == 0) && (numerator != 1 && denominator != 1))
            {
                denominator = denominator / 7;
                numerator = numerator / 7;
            }
            else
                keepGoing = false;
        }
    }

    public Lab3Ex5Rational soma(Lab3Ex5Rational segundaFracao) //metodo que executa a soma de duas fracoes
    {
        Lab3Ex5Rational somaDasFracoes = new Lab3Ex5Rational();
        somaDasFracoes.numerator = (numerator * segundaFracao.denominator) + (segundaFracao.numerator * denominator);
        somaDasFracoes.denominator = denominator * segundaFracao.denominator;

        somaDasFracoes.simplificaFracao();

        return somaDasFracoes;
    }

    public Lab3Ex5Rational subtracao(Lab3Ex5Rational segundaFracao) //metodo que executa a subtracao de duas fracoes
    {
        Lab3Ex5Rational subtracaoDasFracoes = new Lab3Ex5Rational();
        subtracaoDasFracoes.numerator = (numerator * segundaFracao.denominator) - (segundaFracao.numerator * denominator);
        subtracaoDasFracoes.denominator = denominator * segundaFracao.denominator;

        subtracaoDasFracoes.simplificaFracao();

        return subtracaoDasFracoes;
    }

    public Lab3Ex5Rational multiplicacao(Lab3Ex5Rational segundaFracao) //metodo que executa a multiplicacao de duas fracoes
    {
        Lab3Ex5Rational multiplicacaoDasFracoes = new Lab3Ex5Rational();
        multiplicacaoDasFracoes.numerator = numerator * segundaFracao.numerator;
        multiplicacaoDasFracoes.denominator = denominator * segundaFracao.denominator;

        multiplicacaoDasFracoes.simplificaFracao();

        return multiplicacaoDasFracoes;
    }

    public Lab3Ex5Rational divisao(Lab3Ex5Rational segundaFracao) //metodo que executa a divisao de duas fracoes
    {
        Lab3Ex5Rational divisaoDasFracoes = new Lab3Ex5Rational();
        divisaoDasFracoes.numerator = numerator * segundaFracao.denominator;
        divisaoDasFracoes.denominator = denominator * segundaFracao.numerator;

        divisaoDasFracoes.simplificaFracao();

        return divisaoDasFracoes;
    }

    public String paraStringRacional() //metodo que retorna uma string com a fracao em formato xx/yy
    {
        return String.format("%d/%d", numerator, denominator);
    }

    //metodo que retorna uma string com a fracao em formato flutuante e permite escolher quantas casas decimais
    public String paraStringFlutuante()
    {
        float flutuante, numeradorFlutuante = numerator, denominadorFlutuante = denominator;
        int casas;
        String formatado;
        flutuante = numeradorFlutuante / denominadorFlutuante;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha com quantas casas decimais deseja exibir o valor (entre 1 e 5):");
        casas = teclado.nextInt();

        switch (casas) {
            case 1: {
                formatado = String.format("%.1f", flutuante);
                break;
            }

            case 2: {
                formatado = String.format("%.2f", flutuante);
                break;
            }

            case 3: {
                formatado = String.format("%.3f", flutuante);
                break;
            }

            case 4: {
                formatado = String.format("%.4f", flutuante);
                break;
            }

            case 5: {
                formatado = String.format("%.5f", flutuante);
                break;
            }

            default: {
                formatado = String.format("%f", flutuante);
            }
        }

        return formatado;
    }

    private int numerator, denominator;
}
