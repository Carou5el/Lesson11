package kulkov.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        Task1();
        Task2();
    }

    private static void Task1() {
        ChangePosition cp = new ChangePosition();

        String[] strArr = {"dog", "cat", "frog", "cow", "owl"};
        ArrayList<String> arr2 = cp.convert(strArr);

        System.out.printf("Before.\n");
        for (String str :
                strArr) {
            System.out.printf("[]: %s\n", str);
        }

        cp.changePosition(strArr, 1, 2);

        System.out.printf("After.\n");
        for (String str :
                strArr) {
            System.out.printf("[]: %s\n", str);
        }

        System.out.printf("ArrayList.\n");
        System.out.printf("Arraylist size = %d\n", arr2.size());
        Iterator iterator = arr2.iterator();
        while(iterator.hasNext())   {
            System.out.println(iterator.next());
        }
    }

    private static void Task2() {
        Apple app = new Apple();
        Orange oran = new Orange();

        Box<Apple> boxApple = new Box<>(app.getWeigth());
        Box<Apple> boxApple2 = new Box<>(app.getWeigth());
        Box<Orange> boxOrange = new Box<>(oran.getWeigth());

        boxApple.put(13);
        boxOrange.put(10);

        boxApple.changeBox(boxApple2, 10);
        System.out.println(boxApple.compare(boxApple2));
        System.out.printf("Weight of box for apples = %.2f\n", boxApple.getWeight());
        System.out.printf("Weight of box for apples = %.2f\n", boxApple2.getWeight());
    }
}
