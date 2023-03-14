package Example;

public class Person {


    //Fields
    private String name;
    private int age;
    private String phrase = "";

    //Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
//getter is a method to retrieve private data fields stored in the main class so another class or another field can
//manipulate this data.
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getPhrase(){
        return this.phrase;
    }

//Setter
    public void setName(String value){
        this.name = value;
    }
    public void setAge(int value){
        this.age = value;
    }

public void setPhrase(String value){
        this.phrase = value;
}

//Methods
public void increaseAge(){
        this.age = this.age + 1;
}
public void birthday(){
        this.increaseAge();
}


public static void main(String[] args){
    Person person1 = new Person("Kristian ", 31);
    Person person2 = new Person("Riza ", 30);


    person1.increaseAge(); // this manipulates the method output

    System.out.println(person1.name + person1.age + " and " + person2.name + person2.age);

}

}
