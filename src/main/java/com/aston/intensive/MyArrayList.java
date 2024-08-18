package com.aston.intensive;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class MyArrayList<T> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        elements = new Object[capacity];
    }


    public int size() {
        return size;
    }

    public void add(T item) {
        if (size == elements.length - 1)
            ensureCapacity();
        elements[size++] = item;
    }

    public T get(int index) {
        return (T) elements[index];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int index, T element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index is incorrect");
        }
        if (size == elements.length - 1) {
            ensureCapacity();
        }
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public void addAll(Collection<? extends T> c) {
        for (T element : c) {
            add(element);
        }
    }

    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index is incorrect");
        }
        Object item = elements[index];
        for (int i = index; i <= size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (T) item;
    }

    public T remove(Object o) {
        int index = 0;
        boolean flaq = false;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                index = i;
                flaq = true;
            }
        }
        if (flaq) {
            Object item = elements[index];
            for (int i = index; i <= size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
            return (T) item;
        } else return null;
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void sort(Comparator<? super T> c) {
        quickSort(elements, 0, size - 1, c);
    }


    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    private void quickSort(Object[] arr, int low, int high, Comparator<? super T> c) {
        if (low < high) {
            int pi = partition(arr, low, high, c);

            quickSort(arr, low, pi - 1, c);
            quickSort(arr, pi + 1, high, c);
        }
    }

    private int partition(Object[] arr, int low, int high, Comparator<? super T> c) {
        Object pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (c.compare((T) arr[j], (T) pivot) > 0) {
                i++;


                Object temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Object temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

}




