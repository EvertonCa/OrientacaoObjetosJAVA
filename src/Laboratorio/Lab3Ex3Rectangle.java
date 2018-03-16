package Laboratorio;

import java.util.Scanner;

public class Lab3Ex3Rectangle
{
    public Lab3Ex3Rectangle()
    {
        length = 1;
        width = 1;
    }

    public double getLenght()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

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

    public double calculaPerimetro()
    {
        double perimetro;
        perimetro = getLenght()*2 + getWidth()*2;
        return perimetro;
    }

    public double calculaArea()
    {
        double area;
        area = getLenght()*getWidth();
        return area;
    }


    private double length, width;

}
