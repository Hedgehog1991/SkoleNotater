package Uke4.Shapes;

import java.util.HashMap;
import java.util.Map;

public interface Main {


     static void main(String[] args) {
        Circle cs1 = new Circle(19);
        Circle cs2 = new Circle(5);
        Circle cs3 = new Circle(10);
        Square sq1 = new Square(9);
        Square sq2 = new Square(7);
        Square sq3 = new Square(3);
        Rectangle rc1 = new Rectangle(15, 5);
        Rectangle rc2 = new Rectangle(9, 5);
        Rectangle rc3 = new Rectangle(6, 10);
        Rectangle rc4 = new Rectangle(3, 12);


        HashMap<Integer, Shape> shapeHashMap = new HashMap<>();
        shapeHashMap.put(cs1.id, cs1);
        shapeHashMap.put(cs2.id, cs2);
        shapeHashMap.put(cs3.id, cs3);
        shapeHashMap.put(sq1.id, sq1);
        shapeHashMap.put(sq2.id, sq2);
        shapeHashMap.put(sq3.id, sq3);
        shapeHashMap.put(rc1.id, rc1);
        shapeHashMap.put(rc2.id, rc2);
        shapeHashMap.put(rc3.id, rc3);
        shapeHashMap.put(rc4.id, rc4);


        System.out.println(shapeHashMap.get(5).toString() + " hello" +
                "");
        System.out.println();

        int threshold = 10;

        for (Map.Entry<Integer, Shape> entry : shapeHashMap.entrySet()) {
            Integer id = entry.getKey();
            Shape shape = entry.getValue();
            //if (shape.getArea() < threshold) {
                System.out.println(id + " " + shape);
           // }
        }
    }
}





