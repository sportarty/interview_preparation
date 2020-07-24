package ru.kropotov.lesson_2;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by Artem Kropotov on 22.07.2020
 */
public class MyArrayList<T> implements MyList<T> {

    private static final int DEFAULT_CAPACITY = 16;

    private Object[] data;

    private int size;

    public MyArrayList() {
        data = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity must be greater 0");
        } else {
            data = new Object[capacity];
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void growDataCapacity() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    @Override
    public void add(int index, T element) {
        Objects.checkIndex(index, size);
        if (data.length == size + 1) {
            growDataCapacity();
        }
        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = element;
        size++;
    }

    @Override
    public boolean add(T t) {
        if (size == data.length) {
            growDataCapacity();
        }
        data[size] = t;
        size++;
        return true;
    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) data[index];
    }

    @Override
    public T set(int index, T element) {
        Objects.checkIndex(index, size);
        T oldValue = (T) data[index];
        data[index] = element;
        return oldValue;
    }


    @Override
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T oldValue = (T) data[index];
        if (index < size - 1) {
            System.arraycopy(data, index + 1, data, index, size - index - 1);
        }
        size--;
        return oldValue;
    }

    @Override
    public boolean remove(Object o) {
        final Object[] es = data;
        final int size = this.size;
        int i = indexOf(o);
        if (i > 0) {
            remove(i);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public int indexOf(Object o) {
        final Object[] es = data;
        final int size = this.size;
        int i = 0;
        if (o == null) {
            for (; i < size; i++) {
                if (es == null) {
                    return i;
                }
            }
        } else {
            for (; i < size; i++) {
                if (o.equals(es)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        final Object[] es = data;
        final int size = this.size;
        int i = size - 1;
        if (o == null) {
            for (; i >= 0; i--) {
                if (es == null) {
                    return i;
                }
            }
        } else {
            for (; i >= 0; i--) {
                if (o.equals(es)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /*@Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public <T1> T1[] toArray(IntFunction<T1[]> generator) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<? super T> filter) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<T> operator) {

    }

    @Override
    public void clear() {

    }

    @Override
    public void sort(Comparator<? super T> c) {

    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

    @Override
    public Stream<T> stream() {
        return null;
    }

    @Override
    public Stream<T> parallelStream() {
        return null;
    }*/
}
