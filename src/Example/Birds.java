package Example;

public class Birds {
private String name;
private String habitat;
private String species;
private String description = "";
private double wingSpan;
boolean canFly;

public Birds(String name, String species, String habitat, double wingSpan, boolean canFly){
    this.name = name;
    this.species = species;
    this.habitat = habitat;
//Below will not be possible to change from outside the constructor because its not referenced as a parameter
//Even if it is included in the argument ( new Birds("""")

    this.wingSpan = 50.5;
    this.canFly = true;
}
//Still don't understand the fucking getter
public String getDescription(){
    return this.description;
}
public void setDescription(String description){
    this.description = description;
}


public static void main(String[] args){
    Birds bluebird = new Birds("Bluebird ","Pekker ","Temperate ", 50, true);
    //Setting the value if the field from inside the method, can be done only with a constructor
    bluebird.setDescription("is very big ");

    System.out.println(bluebird.name + bluebird.species + bluebird.habitat + bluebird.description + bluebird.wingSpan + bluebird.canFly);

}

}
