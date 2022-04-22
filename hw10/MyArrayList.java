package hw10;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList implements MyList {
    private int capacity = 10;
    private int size;
    Integer[] array = new Integer[capacity];

    private void moreCapacity() {
        if (size == array.length) {
            Integer[] changeArray = new Integer[capacity * 2];
            for (int i = 0; i < array.length; i++) {
                changeArray[i] = array[i];
            }
            array = changeArray;
            capacity = array.length;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size()) throw new IndexOutOfBoundsException();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Integer item) {
        return indexOf(item) > -1;
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[i] = null;
                size--;
            }
        }
    }

    @Override
    public Integer get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public Integer set(int index, Integer item) {
        checkIndex(index);
        Integer returnElement = array[index];
        array[index] = item;
        return returnElement;
    }

    @Override
    public boolean add(Integer item) {
        moreCapacity();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = item;
                break;
            }
        }
        size++;
        return false;
    }

    @Override
    public void add(int index, Integer item) {
        moreCapacity();
        checkIndex(index);
        for (int i = array.length - 2; i >= index; i--) {
            array[i + 1] = array[i];
        }
        set(index, item);
        size++;
    }

    @Override
    public boolean addAll(Integer[] coll) {
        for (Integer item : coll) {
            add(item);
        }
        return coll.length > 0;
    }

    @Override
    public boolean addAll(int index, Integer[] coll) {
        checkIndex(index);
        Integer[] tailArray = new Integer[size - index];
        int ind = 0;
        for (int i = index; index <= tailArray.length; index++) {
            tailArray[ind++] = array[index];
            array[index] = null;
            size--;
        }
        for (Integer item : coll) {
            add(item);
        }
        for (int i = 0; i < tailArray.length; i++) {
            add(tailArray[i]);
        }
        return coll.length > 0;
    }

    @Override
    public Integer remove(int index) {
        checkIndex(index);
        Integer returnItem = set(index, null);
        for (int i = index; i < array.length - 1; i++) {
            Integer changeItem = array[i];
            array[i] = array[i + 1];
            array[i + 1] = changeItem;
        }
        size--;
        return returnItem;
    }

    @Override
    public boolean remove(Integer item) {
        boolean findItem = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(item)) {
                findItem = true;
                array[i] = null;
                for (int j = i; j < array.length - 1; j++) {
                    Integer changeItem = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = changeItem;
                }
                size--;
                break;
            }
        }
        return findItem;
    }

    @Override
    public boolean removeAll(Integer[] coll) {
        for (int i = 0; i < coll.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (coll[i].equals(array[j])) {
                    remove(array[j]);
                    j--;
                }
            }
        }
        return coll.length > 0;
    }

    @Override
    public int indexOf(Integer item) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(item)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(Integer item) {
        int index = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != null && array[i].equals(item)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public Integer[] toArray() {
        Integer[] secondArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            secondArray[i] = array[i];
        }
        return secondArray;
    }
}
