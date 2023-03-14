package Uke4.AggreFinInher.Inheritance.Final;

public final class JavaProgram
{
    public static final String versionNumber = "v1.0.0";
    public final String versionDate;
    public JavaProgram() {
        this.versionDate = "2022-01-31";
    }
    
    public void printInfo() {
        System.out.println("Java Program information:");
        System.out.println(" - Version number: " + this.versionNumber);
        System.out.println(" - Version date: " + this.versionDate);
    }
    
    public static void printVersion() {
        System.out.println("Java Program version:");
        System.out.println(" - Number: " + JavaProgram.versionNumber);
    }
    public static void main(String[] args) {
        JavaProgram javaprogram = new JavaProgram();
        javaprogram.printInfo();
        JavaProgram.printVersion();
        // 
    }
}