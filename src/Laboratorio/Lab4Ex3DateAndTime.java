/*
Aluno: Everton Cardoso Acchetta
RA: 22.117.061-6
Disciplina: CC3642 - Orientação a Objetos

Programa criado para receber uma hora (hh:mm:ss) e data e acrescentar em um loop infinito, 1 segundo por segundo no valor entrado
 */

package Laboratorio;

public class Lab4Ex3DateAndTime
{
    public Lab4Ex3DateAndTime(int hora, int minuto, int segundo, int dia, int mes, int ano) //construtor
    {
        setTime(hora, minuto, segundo);
        month = chechMonth (mes);
        year = ano;
        day = chechDay (dia);

    }

    private int chechMonth (int mes) //checa se os valores entrados para o mes correspondem as restricoes
    {
        if (mes > 0 && mes <= 12)
            return mes;
        else
        {
            System.out.printf("Invalid month (%d) set to 1.", mes);
            return 1;
        }
    }

    private int chechDay (int dia)//checa se os valores entrados para o dia correspondem as restricoes
    {
        int daysPerMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (dia > 0 && dia <= daysPerMonth[month])
            return dia;

        if (month == 2 && dia == 29 && (year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0)))
            return dia;

        System.out.printf("Invalid day (%d) set to 1.", dia);
        return 1;
    }

    public void setTime( int h, int m, int s) //seta a hora completa
    {
        setHour( h );
        setMinute( m );
        setSecond( s );
    }

    public void setHour(int h) // seta a hora
    {
        hour = ( ( h >= 0 && h < 24) ? h : 0);
    }

    public void setMinute(int m) // seta o minuto
    {
        minute = ( ( m >= 0 && m < 60) ? m : 0);
    }

    public void setSecond(int s) // seta o segundo
    {
        second = ( ( s >= 0 && s < 60) ? s : 0);
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

    public void tick() // incrementa 1 segundo no tempo, incrementando 1 minuto caso os segundos passem de 59
    {
        if(second < 59)
        {
            second++;
        }
        else
        {
            second = 0;
            incrementMinute();
        }
    }

    public void incrementMinute() // incrementa 1 minuto no tempo, incrementando 1 hora caso os minutos passem de 59
    {
        if(minute < 59)
        {
            minute++;
        }
        else
        {
            minute = 0;
            incrementHour();
        }
    }

    public void incrementHour() // incrementa 1 hora no tempo, zerando caso passe de 23 horas e incrementando um dia.
    {
        if(hour < 23)
        {
            hour++;
        }
        else
        {
            hour = 0;
            nextDay();
        }
    }

    public String toString() // exibe a hora e data
    {
        return String.format("%d:%02d:%02d %s %d/%d/%d", ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"), month, day, year);
    }

    private int month, day, year, hour, minute, second;
}
