package com.metadave.etp.rep;

public class ETPTerm<T> {
    protected T value;

    public ETPTerm(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
