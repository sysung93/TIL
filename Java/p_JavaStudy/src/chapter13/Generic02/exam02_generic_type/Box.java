package chapter13.Generic02.exam02_generic_type;

import java.util.Objects;

public class Box<T> {
    private T t;

    public void set(Object object) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
