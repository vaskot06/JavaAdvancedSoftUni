package ListUtilities;

import java.util.Comparator;
import java.util.List;

public class ListUtils<T extends Comparable<T>> {

//    public T getMin(List<T> list) {
//        T min = null;
//        if (list.size() == 0) {
//            throw new IllegalArgumentException();
//        }
//            min = list.stream().min(Comparable::compareTo).stream().findFirst().get();
//
//
//        return min;
//    }

//    public T getMax(List<T> list) {
//        T max = null;
//        if (list.size() == 0) {
//            throw new IllegalArgumentException();
//        } else {
//            max = list.stream().max(Comparator.naturalOrder()).stream().findFirst().get();
//        }
//
//        return max;
//    }

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.size() == 0) throw new IllegalArgumentException();
        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max.compareTo(list.get(i)) < 0)
                max = list.get(i);
        }
        return max;
    }

    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if (list.size() == 0) throw new IllegalArgumentException();
        T min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) > 0)
                min = list.get(i);
        }
        return min;
    }

}
