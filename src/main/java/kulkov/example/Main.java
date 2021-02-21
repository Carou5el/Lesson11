package kulkov.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
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
}
