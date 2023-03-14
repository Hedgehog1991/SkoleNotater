package Uke4.Shapes;

public class Circle extends Shape
{
    //# Felter

    private double radius;
    
    //# Konstruktører
    public Circle() {
        this(0);
    }
    
    public Circle(double radius) {
        super();
        
        this.setRadius(radius);
    }
    
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        
        this.setRadius(radius);
    }
    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "id=" + getId() +
                ", radius=" + getRadius() +
                ", area="  + getArea() +
                ", perimiter=" +getPerimeter() +
                ", color=" + getColor() +
                '}';
    }

    //# Getter-metoder
    public double getRadius() {
        return this.radius;

    }
    
    //# Setter-metoder
    private void setRadius(double value) {
        this.radius = value;
    }
    
    //# Metoder
    // Regn ut areal
    public  double getArea() {
        return Math.PI*(radius*radius);
    }

    // Regn ut omkrets
    public double getPerimeter() {
        return 2*Math.PI*(radius);
    }


}