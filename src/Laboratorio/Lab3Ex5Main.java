/*
Aluno: Everton Cardoso Acchetta
RA: 22.117.061-6
Disciplina: CC3642 - Orientação a Objetos

Programa criado para receber duas fracoes e executar/exibir soma, subtracao, multiplicacao e divisao entre elas.
 */

package Laboratorio;

import java.util.Scanner;

public class Lab3Ex5Main
{
    public static void main (String argv[])
    {
        Scanner teclado = new Scanner(System.in);
        int numerador, denominador;
        boolean teste = true;


        //mensagem de Welcome
        System.out.println("|-----------------------------------------------|");
        System.out.println("|     Bem vindo ao Fracoes Manipulator 3000     |");
        System.out.println("|-----------------------------------------------|");

        //entrada de valores do usuario
        System.out.println("Entre com o numerador da primeira fracao: ");
        numerador = teclado.nextInt();

        System.out.println("Entre com o denominador da primeira fracao: ");
        denominador = teclado.nextInt();

        Lab3Ex5Rational primeiraFracao = new Lab3Ex5Rational(numerador, denominador);

        System.out.println("Entre com o numerador da segunda fracao: ");
        numerador = teclado.nextInt();

        System.out.println("Entre com o denominador da segunda fracao: ");
        denominador = teclado.nextInt();

        Lab3Ex5Rational segundaFracao = new Lab3Ex5Rational(numerador, denominador);

        //menu de metodos
        while(teste)
        {
            int opcao;

            System.out.println("|-----------------------------------------------|");
            System.out.println("| Entre com a opcao desejada:                   |");
            System.out.println("| 1 - Soma das fracoes                          |");
            System.out.println("| 2 - Subtracao das fracoes                     |");
            System.out.println("| 3 - Multiplicacao das fracoes                 |");
            System.out.println("| 4 - Divisao das fracoes                       |");
            System.out.println("| 0 - Finalizar o programa                      |");
            System.out.println("|-----------------------------------------------|");
            opcao = teclado.nextInt();

            switch (opcao)
            {
                case 0: //encerra o programa
                {
                    System.out.println("|-----------------------------------------------|");
                    System.out.println("| Obrigado por usar o Fracoes Manipulator 3000  |");
                    System.out.println("|-----------------------------------------------|");
                    teste = false;
                    break;
                }

                case 1: //soma as fracoes e exibe o resultado nos dois formatos disponiveis
                {
                    Lab3Ex5Rational somaDasFracoes = new Lab3Ex5Rational();
                    somaDasFracoes = primeiraFracao.soma(segundaFracao);
                    String flutuante;
                    flutuante = somaDasFracoes.paraStringFlutuante();
                    System.out.println("A soma da fracao " + primeiraFracao.paraStringRacional() + " com a fracao " +
                            segundaFracao.paraStringRacional() + " eh: " + somaDasFracoes.paraStringRacional() +
                            " ou " + flutuante);
                    break;
                }

                case 2: //subtrai as fracoes e exibe o resultado nos dois formatos disponiveis
                {
                    Lab3Ex5Rational subtracaoDasFracoes = new Lab3Ex5Rational();
                    subtracaoDasFracoes = primeiraFracao.subtracao(segundaFracao);
                    String flutuante;
                    flutuante = subtracaoDasFracoes.paraStringFlutuante();
                    System.out.println("A subtracao da fracao " + primeiraFracao.paraStringRacional() + " com a fracao " +
                            segundaFracao.paraStringRacional() + " eh: " + subtracaoDasFracoes.paraStringRacional() +
                            " ou " + flutuante);
                    break;
                }

                case 3: //multiplica as fracoes e exibe o resultado nos dois formatos disponiveis
                {
                    Lab3Ex5Rational multiplicacaoDasFracoes = new Lab3Ex5Rational();
                    multiplicacaoDasFracoes = primeiraFracao.multiplicacao(segundaFracao);
                    String flutuante;
                    flutuante = multiplicacaoDasFracoes.paraStringFlutuante();
                    System.out.println("A multiplicacao da fracao " + primeiraFracao.paraStringRacional() + " com a fracao " +
                            segundaFracao.paraStringRacional() + " eh: " + multiplicacaoDasFracoes.paraStringRacional() +
                            " ou " + flutuante);
                    break;
                }

                case 4: //divide as fracoes e exibe o resultado nos dois formatos disponiveis
                {
                    Lab3Ex5Rational divisaoDasFracoes = new Lab3Ex5Rational();
                    divisaoDasFracoes = primeiraFracao.divisao(segundaFracao);
                    String flutuante;
                    flutuante = divisaoDasFracoes.paraStringFlutuante();
                    System.out.println("A divisao da fracao " + primeiraFracao.paraStringRacional() + " com a fracao " +
                            segundaFracao.paraStringRacional() + " eh: " + divisaoDasFracoes.paraStringRacional() +
                            " ou " + flutuante);
                    break;
                }

                default: // em caso de opcao invalida
                {
                    System.out.println("|-----------------------------------------------|");
                    System.out.println("|       Favor entrar com uma opcao valida!      |");
                    System.out.println("|-----------------------------------------------|");
                    break;
                }
            }
        }
    }
}
