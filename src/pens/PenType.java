package pens;

public enum PenType
{
    FOUNTAIN,
    ROLLER_BALL,
    BALL_POINT;

    public String toString()
    {
        String text = super.toString();

        return text.toLowerCase().replace("_", " ");
    }
}
