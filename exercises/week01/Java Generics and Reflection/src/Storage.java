/**
 * Created by George on 10/01/2016.
 */
public class Storage<T> {
    T x;

    public void setValue(T value) {
        x = value;
    }

    public T getValue() {
        return x;
    }
}
