package Teoria;

import java.util.Scanner;

public class Sales
{
    public static void main( String argv[])
    {
        Scanner input = new Scanner(System.in);

        double total = 0;
        int productID;

        System.out.print("Entre o numero do produto (1-5 ou 0 para parar): ");
        productID = input.nextInt();

        while ( productID != 0)
        {
            if (productID >= 1 && productID <= 5)
            {
                System.out.print("Entre a quantidade vendida: ");
                int quantidade = input.nextInt();

                switch ( productID )
                {
                    case 1:
                        total += quantidade * 2.98;
                        break;

                    case 2:
                        total += quantidade * 4.50;
                        break;

                    case 3:
                        total += quantidade * 9.98;
                        break;

                    case 4:
                        total += quantidade * 4.49;
                        break;

                    case 5:
                        total += quantidade * 6.87;
                        break;
                }
            }

            else if(productID != 0)
                System.out.println("Numero do produto deve ser entre 1 e 5 ou 0 para parar.");

            System.out.print("Entre o numero do produto (1-5 ou 0 para parar): ");
            productID = input.nextInt();
        }

        System.out.println();
        System.out.printf("Valor total de todos os produtos vendidos é de: $%.2f\n",total);
    }
}
