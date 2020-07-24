package ru.kropotov.lesson_2;

/**
 * Created by Artem Kropotov on 23.07.2020
 */
public interface MyList<T> {
    int size();

    boolean isEmpty();

    void add(int index, T element);

    boolean add(T t);

    T get(int index);

    T set(int index, T element);

    T remove(int index);

    boolean remove(Object o);

    boolean contains(Object o);

    int indexOf(Object o);

    int lastIndexOf(Object o);
}
