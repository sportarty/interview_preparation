package ru.kropotov.lesson_2;

import java.util.NoSuchElementException;

/**
 * Created by Artem Kropotov on 22.07.2020
 */
public class MyLinkedList<T> {

    Node<T> first;

    Node<T> last;

    private int size;

    public static class Node<T> {
        T item;

        Node<T> prev;
        Node<T> next;

        public Node(T item, Node<T> prev, Node<T> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }

    private void linkFirst(T t) {
        final Node<T> newFirst = new Node<>(t, null, first);
        if (first == null) {
            last = newFirst;
        } else {
            first.prev = newFirst;
        }
        first = newFirst;
        size++;
    }

    private void linkLast(T t) {
        final Node<T> newLast = new Node<>(t, last, null);
        if (last == null) {
            last = newLast;
        } else {
            last.next = newLast;
        }
        last = newLast;
        size++;
    }


    public void addFirst(T t) {
        linkFirst(t);
    }


    public void addLast(T t) {
        linkLast(t);
    }


    public boolean offerFirst(T t) {
        addFirst(t);
        return true;
    }


    public boolean offerLast(T t) {
        addLast(t);
        return true;
    }

    private T unlinkFirst() {
        final T oldFirstItem = first.item;
        first.item = null;

        first = first.next;
        first.prev = null;
        size--;
        return oldFirstItem;
    }

    private T unlinkLast() {
        final T oldLastItem = last.item;
        last.item = null;

        last = last.prev;
        last.next = null;
        size--;
        return oldLastItem;
    }


    public T removeFirst() {
        final Node<T> oldFirst = first;
        if (oldFirst == null) {
            throw new NoSuchElementException();
        }
        return unlinkFirst();
    }


    public T removeLast() {
        final Node<T> oldLast = last;
        if (oldLast == null) {
            throw new NoSuchElementException();
        }
        return unlinkLast();
    }


    public T pollFirst() {
        final Node<T> f = first;
        return (f == null) ? null : unlinkFirst();
    }


    public T pollLast() {
        final Node<T> l = last;
        return (l == null) ? null : unlinkLast();
    }


    public T getFirst() {
        final Node<T> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return f.item;
    }


    public T getLast() {
        final Node<T> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return l.item;
    }


    public T peekFirst() {
        final Node<T> f = first;
        return (f == null) ? null : f.item;
    }


    public T peekLast() {
        final Node<T> l = last;
        return (l == null) ? null : l.item;
    }


    public boolean offer(T t) {
        return add(t);
    }


    public T remove() {
        return removeFirst();
    }


    public T poll() {
        final Node<T> f = first;
        return (f == null) ? null : unlinkFirst();
    }


    public T element() {
        return getFirst();
    }


    public T peek() {
        final Node<T> f = first;
        return (f == null) ? null : f.item;
    }


    public void push(T t) {
        addFirst(t);
    }

    public T pop() {
        return removeFirst();
    }


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int index, T element) {
    }

    public boolean add(T t) {
        linkLast(t);
        return true;
    }
}
