import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Seminar_6 {
    public static void main(String[] args) {
        MySet ms = new MySet();
        ms.add(1);
        ms.add(2);
        ms.add(3);
        ms.add(2);
        ms.add(8);
        ms.add(4);
        ms.add(5);
        ms.add(7);
        ms.print();
//        ms.delete(8);
//        ms.print();
        System.out.println(ms.toList());
        System.out.println(ms.toListUpToElement(5));


        MySet ms1 = new MySet();
        ms1.add(1);
        ms1.add(2);
        ms1.add(5);
        ms1.add(6);
        ms.print();

        ms.unit(ms1);
        ms.print();
    }
}

class MySet {
    private HashMap <Integer, Object> mySet;
    private static final Object OBJECT = new Object();
    public MySet() {
        this.mySet = new HashMap<>();
    }
    public void add(Integer number) {
        this.mySet.putIfAbsent(number, OBJECT);
    }
    public void delete(Integer number) {
        this.mySet.remove(number);
    }
    public void print() {
        mySet.forEach((k, v) -> System.out.print(k + " "));
        System.out.println();
    }

    public void unit(MySet otherSet) {
        otherSet.mySet.forEach((k, v) -> this.add(k));
    }
    public int size() {
        return this.mySet.size();
    }
    public int get(int index) {
        return (int) this.mySet.keySet().toArray()[index];
    }
    public ArrayList<Integer> toList() {
        return new ArrayList<Integer>(this.mySet.keySet());
    }
    public ArrayList<Integer> toListUpToElement(Integer element) {
        if (!mySet.containsKey(element)) return null;
        ArrayList<Integer> output = new ArrayList<>();
        for (int k:
             mySet.keySet()) {
            output.add(k);
            if (k == element) break;
        }
        return output;
    }
}
