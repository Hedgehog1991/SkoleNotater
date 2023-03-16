package AprosjektOppgave.Oppgave2;

public class Person extends Collective {

    public int day;
    public int  month;
    public int year;
    public int endDay;
    public int endMonth;
    public int endYear;

    public  String personName;
    public int age;
    public String email;
    public String signature;
    public String defaultValue;

    @Override
    public String toString() {
        return
                "\u001B[32m|- Name: " + personName +"\n" +
                "|- Age: " + age + "\n" +
                "|- Email: " + email + "\n" + "|-" ;
    }

    public Person(String personName, int age, String email) {
        this.personName = personName;
        this.age = age;
        this.email = email;
    }

    public Person(String personName, int day, int month, int year, int endDay, int endMonth, int endYear) {
        this.personName = personName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.endDay = endDay;
        this.endMonth = endMonth;
        this.endYear = endYear;
    }
    public Person (String unoccupied){
        this.defaultValue = "empty";
    }

    public String getPersonName() {
        return personName;
    }
    public String getSignature() {
        return signature;
    }
}