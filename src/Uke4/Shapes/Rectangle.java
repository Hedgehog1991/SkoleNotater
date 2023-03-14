package Uke4.Shapes;

public class Rectangle extends Shape{

    double width;
    double height;



    public Rectangle(double width, double height) {
        super();
    this.width = width;
        this.height = height;
    }

    public double getArea(){
    return width*height;
    }

    public double getPerimeter(){
    return (width*2)+(height*2);
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "id=" + getId() +
                ", width=" + width +
                ", height=" + height +
                ", area=" + getArea() +
                ", perimiter=" + getPerimeter() +
                ", color=" + getColor() +
                '}';
    }


    }


