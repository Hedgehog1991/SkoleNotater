package AprosjektOppgave.Oppgave2;

public class Person extends Collective {




    public String personName;
    public int age;
    public String email;

    @Override
    public String toString() {
        return "\n " +
                "\u001B[32m[Name: " + personName + '\'' +
                " Age: " + age +
                " email: " + email + '\'' +
                "]";
    }

    public Person(String personName, int age, String email) {

        this.personName = personName;
        this.age = age;
        this.email = email;
    }
    public Person(String personName) {
        super();
        this.personName = personName;

    }


/*
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setEmail(String email) {
        this.email = email;
    }

 */
}