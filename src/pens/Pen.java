package pens;

public class Pen
{
    private PenType type; // ball-point, roller-ball, fountain
    private PenThickness thickness; //fine, regular, thick
    private PenColor color;

    public Pen(PenType type, PenThickness thickness, PenColor color)
    {
        this.type = type;
        this.thickness = thickness;
        this.color = color;
    }

    public PenType getType()
    {
        return type;
    }

    public void setType()
    {
        this.type = type;
    }

    public void setThickness(PenThickness thickness)
    {
        this.thickness = thickness;
    }

    public PenColor getColor()
    {
        return color;
    }

    public void setColor(PenColor color)
    {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "type='" + type.toString() + '\'' +
                ", thickness='" + thickness + "("+ thickness.getThicknessValue() + ")" + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
