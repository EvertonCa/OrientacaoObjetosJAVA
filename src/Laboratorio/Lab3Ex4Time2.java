package Laboratorio;

public class Lab3Ex4Time2
{
    public Lab3Ex4Time2()
    {
        this(0, 0, 0);
    }

    public Lab3Ex4Time2(int h)
    {
        this(h, 0, 0);
    }

    public Lab3Ex4Time2(int h, int m)
    {
        this(h, m, 0);
    }

    public Lab3Ex4Time2(int h, int m, int s)
    {
        setTime(h, m, s);
    }

    public Lab3Ex4Time2 ( Lab3Ex4Time2 time )
    {
        this(time.getHour(), time.getMinute(), time.getSecond() );
    }

    public void setTime( int h, int m, int s)
    {
        setHour( h );
        setMinute( m );
        setSecond( s );
    }

    public void setHour(int h)
    {
        hour = ( ( h >= 0 && h < 24) ? h : 0);
    }

    public void setMinute(int m)
    {
        minute = ( ( m >= 0 && m < 60) ? m : 0);
    }

    public void setSecond(int s)
    {
        second = ( ( s >= 0 && s < 60) ? s : 0);
    }

    public int getHour()
    {
        return hour;
    }

    public int getMinute()
    {
        return minute;
    }

    public int getSecond()
    {
        return second;
    }

    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString()
    {
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    public void tick()
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

    public void incrementMinute()
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

    public void incrementHour()
    {
        if(hour < 23)
        {
            hour++;
        }
        else
        {
            hour = 0;
        }
    }

    private int hour;
    private int minute;
    private int second;
}