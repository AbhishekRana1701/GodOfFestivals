import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("Volv");
        cars.add("Vol");
        cars.add("Vo");
        cars.add("V");
        System.out.println(cars);
    }
    
}
