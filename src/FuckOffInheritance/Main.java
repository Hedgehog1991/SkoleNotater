package FuckOffInheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.go();
        System.out.println("doors "+car.doors +"\nwheels "+car.wheels);


        Bike bike = new Bike();
        bike.stop();
        System.out.println(bike.pedals);

        System.out.println(car.speed );
        System.out.println(bike.speed + "" + bike.wheels);


    }



}
