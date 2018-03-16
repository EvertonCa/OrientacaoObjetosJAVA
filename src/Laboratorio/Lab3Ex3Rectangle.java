/*
Aluno: Everton Cardoso Acchetta
RA: 22.117.061-6
Disciplina: CC3642 - Orientação a Objetos

Programa criado para calcular o perimetro e/ou a area de um triangulo
 */

package Laboratorio;

import java.util.Scanner;

public class Lab3Ex3Rectangle
{
    public Lab3Ex3Rectangle() // construtor padrao que define os lados como 1
    {
        length = 1;
        width = 1;
    }

    //gets
    public double getLenght()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    //sets que verificam se o valor esta entre 0.0 e 20.0 e alerta em caso de valor fora do especificado
    public void setLength(double length)
    {
        if(length > 0.0 && length < 20.0)
            this.length = length;
        else {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Valor deve ser maior que 0.0 e menor que 20.0!");
            length = teclado.nextFloat();
            setLength(length);
        }
    }

    public void setWidth(double width)
    {
        if(width > 0.0 && width < 20.0)
            this.width = width;
        else {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Valor deve ser maior que 0.0 e menor que 20.0!");
            width = teclado.nextFloat();
            setWidth(width);
        }
    }

    //calcula o perimetro
    public double calculaPerimetro()
    {
        double perimetro;
        perimetro = getLenght()*2 + getWidth()*2;
        return perimetro;
    }

    //calcula a area
    public double calculaArea()
    {
        double area;
        area = getLenght()*getWidth();
        return area;
    }


    private double length, width;

}
