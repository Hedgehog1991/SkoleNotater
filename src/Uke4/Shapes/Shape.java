package Uke4.Shapes;

public abstract class Shape implements Main
{
    //extends prioritizes its base method over the method in class it extends to if it is named the same,
    //if it contains parameters it is a different method even if it shares names.

    //toString formaterer output for en klasse ?
    //Compile-time is the time at which the source code is converted into an executable code
    // while the run time is the time at which the executable code is started running.

    //# Felter
    private String color;
    private boolean filled;
    private static int shapes = 0;
    public final int id;

    //# Konstruktører
    public Shape() {
        this("red", true);
    }
    
    public Shape(String color, boolean filled) {
        this.setColor(color);
        this.setFilled(filled);
        Shape.shapes +=1;
        this.id = Shape.shapes;
    }
    abstract public double getArea();

    //# Getter-metoder
    public String getColor() {
        return this.color;
    }
    
    public boolean isFilled() {
        return this.filled;
    }

    public int getId(){
        return this.id;
    }

    //# Setter-metoder
    private void setColor(String value) {
        this.color = value;
    }
    
    private void setFilled(boolean value) {
        this.filled = value;
    }

    //public static void setId(int id) {
      //  Shape.id = id;
    //}

    //# Metoder
    @Override
    public String toString() {
        return "Shape[color=" + this.getColor() + ";filled=" + this.isFilled() + ";]";
    }

}