package Teoria;

public class Aula4Ex4Swapper
{
    public void setX(float x)
    {
        this.x = x;
    }

    public void setY(float y)
    {
        this.y = y;
    }

    public Float getX()
    {
        return x;
    }

    public Float getY()
    {
        return y;
    }

    public void swap()
    {
        float buffer;

        buffer = x;
        x = y;
        y = buffer;

    }


    private float x;
    private float y;
}
