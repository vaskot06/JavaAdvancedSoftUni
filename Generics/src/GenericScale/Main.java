package GenericScale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> scale = new Scale<>(30, 30);

        System.out.println(scale.getHeavier());
    }
}
