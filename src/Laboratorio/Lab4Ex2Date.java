/*
Aluno: Everton Cardoso Acchetta
RA: 22.117.061-6
Disciplina: CC3642 - Orientação a Objetos

Programa criado para receber uma data (dia, mes e ano) e incrementar eternamente um dia nessa data, respeitando as restriçoes
 */

package Laboratorio;

public class Lab4Ex2Date
{
    public Lab4Ex2Date(int theMonth, int theDay, int theYear)
    {
        month = chechMonth (theMonth);
        year = theYear;
        day = chechDay (theDay);

        System.out.printf("Date object constructor for date %s\n", this);
    }

    private int chechMonth (int testMonth)
    {
        if (testMonth > 0 && testMonth <= 12)
            return testMonth;
        else
        {
            System.out.printf("Invalid month (%d) set to 1.", testMonth);
            return 1;
        }
    }

    private int chechDay (int testDay)
    {
        int daysPerMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (testDay > 0 && testDay <= daysPerMonth[month])
            return testDay;

        if (month == 2 && testDay == 29 && (year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0)))
            return testDay;

        System.out.printf("Invalid day (%d) set to 1.", testDay);
        return 1;
    }

    public String toString()
    {
        return String.format( "%d/%d/%d", month, day, year);
    }

    public void nextDay() //incrementa 1 dia na data inserida, respeitando as restricoes
    {
        int daysPerMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //vetor de comparacao

        if ( day < daysPerMonth[month]) //se o dia é menor que o vetor de comparaçao
            day++;

        else // se o dia é igual ao vetor de comparacao ou é bisexto
        {
            if ( month == 12 ) // incrementa ano e inicia dia e mes em 1
            {
                day = 1;
                month = 1;
                year++;
            }

            else //incrementa mes e inicia dia em 1
            {
                day = 1;
                month++;
            }
        }
    }

    private int month, day, year;
}
