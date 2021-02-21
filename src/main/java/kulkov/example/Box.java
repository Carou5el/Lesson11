package kulkov.example;

import java.util.ArrayList;

public class Box<T> {

    private ArrayList<Integer> array = new ArrayList<>();
    private float weight;
    private float weightBox;

    // Constructor.
    public Box(float weight)    {
        this.weight = weight;
    }
    // Methods.
    public void put(int count)  {
        for (int i = 0; i < count; i++) {
            array.add(1);
        }
    }
    public void changeBox(Box<T> box, int count)   {
        for (int i = 0; i < count; i++) {
            this.array.remove(this.array.size() - 1);
        }
        box.put(count);
    }
    public boolean compare(Box box)   {
        return this.getWeight() == box.getWeight();
    }

    public float getWeight() {
        weightBox = weight * array.size();
        return weightBox;
    }
}
