// file: Stack.java
// author: Bob Muller
//
// An API for a generic Stack. It can host values of any type T.

public interface Stack<T> {
    void push(T element);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}
