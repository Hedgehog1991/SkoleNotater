package Uke4.Shapes;

public  class Square extends Rectangle
{

    //# Konstruktører
    public Square() {
        this(10.0);
    }

    public Square(double side) {
        super(side,side);


        }  @Override
        public int getId() {
            return this.id;
    }

    @Override
    public String toString() {
        return "Square{" +
                "id=" + getId() + ", area =" + getArea() + ", perimiter=" +getPerimeter() + ", color=" + getColor() +
                '}';
    }
}