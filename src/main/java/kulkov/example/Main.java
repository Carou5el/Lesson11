package kulkov.example;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ChangePosition cp = new ChangePosition();

        String[] strArr = {"dog", "cat", "frog", "cow", "owl"};

        for (String str :
                strArr) {
            System.out.printf("[]: %s\n", str);
        }

        cp.changePosition(strArr, 1, 2);

        for (String str :
                strArr) {
            System.out.printf("[]: %s\n", str);
        }

    }
}
