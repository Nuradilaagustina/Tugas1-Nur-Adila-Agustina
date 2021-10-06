public class StackGeneric<T> {
    public T[] angka;
    public int top = 0;

    public StackGeneric(int n) {
        angka = (T[]) new Object[n];
    }
    public boolean isEmpty() {
        return top == 0;
    }
    public boolean isFull() {
        return top == angka.length;
    }
    public void push(T value) {
        if (!isFull()) {
            angka[top] = value;
            top = top + 1;
        } else {
            System.out.println("stack penuh");
        }
    }

    public T pop() {
        if (!isEmpty()) {
            top = top - 1;
            T x = angka[top];
            return x;
        } else {
            return null;
        }
    }
    public T peek () {
        if (!isEmpty()) {
            return angka[top - 1];
        } else {
            return null;
        }
    }
}