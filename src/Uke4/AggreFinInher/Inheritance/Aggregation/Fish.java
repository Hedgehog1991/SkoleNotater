package Uke4.AggreFinInher.Inheritance.Aggregation;

public class Fish
{
    private String name;
    
    public Fish(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    private void setName(String value) {
        this.name = value;
    }
}