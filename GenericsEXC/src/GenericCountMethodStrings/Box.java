package GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> data;


    public Box(List<T> input) {
        this.data = input;
    }

    public void add(T line) {
        this.data.add(line);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : data) {
            sb.append(String.class.getName());
            sb.append(": ").append(t).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public void swap(List<T> list, int firstIndex, int secondIndex) {
        T first = list.get(firstIndex);
        T second = list.get(secondIndex);
        list.add(secondIndex, first);
        list.add(firstIndex, second);
        list.remove(firstIndex + 1);
        list.remove(secondIndex + 1);
    }

    public int compare(List<T> data, T element) {
        int counter = 0;
        for (T datum : data) {
            if (datum.compareTo(element) > 0) {
                counter++;
            }
        }
        return counter;
    }

}

