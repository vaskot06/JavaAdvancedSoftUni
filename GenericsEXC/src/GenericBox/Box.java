package GenericBox;

import java.util.List;

public class Box<T> {
    private List<T> input;


    public Box(List<T> input) {
        this.input = input;
    }

    public void add(T line){
        this.input.add(line);
    }

    @Override
    public String toString() {
     StringBuilder sb = new StringBuilder();
        for (T t : input) {
            sb.append(Integer.class.getName());
            sb.append(": ").append(t);
        }
        return sb.toString();
    }
}
