package GenericScale;

public class Scale<T extends Comparable<T>> {

 private T left;
 private T right;


    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier(){
        T bestElement = null;

        if (this.left.compareTo(this.right) > 0) {
            bestElement = this.left;
        } else if (this.left.compareTo(this.right) < 0) {
            bestElement = this.right;
        }

        return bestElement;
    }


}
