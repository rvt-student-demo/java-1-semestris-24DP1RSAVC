package rvt;
import java.util.*;

public class JMArrayList {
    public static void main(String[] args) {
    onlyTheseNumbers();

    }
    public static void onlyTheseNumbers() {

        ArrayList<Integer> numbers = new ArrayList<>();
    
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);

    int index = numbers.size() - 1;
    while (index >= 0) {
    int number = numbers.get(index);
    System.out.println(number);
    index = index - 1; 
        }

    }
    public static void listSize() {

    }
    public static void onTheList() {

    }
    public static void removeLast(ArrayList<String> strings) {

    }
}