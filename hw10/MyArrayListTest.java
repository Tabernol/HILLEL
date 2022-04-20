package hw10;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    private static int capacity = 10;
    private static int size;
    private static MyArrayList array;

    @BeforeAll
    static void beforeAll() {
        array = new MyArrayList();
    }

    @Test
    void size() {
        array.add(12);
        array.add(23);
        array.add(12);
        assertEquals(3,array.size());
    }
    @Test
    void isEmpty1(){
        assertEquals(true, array.isEmpty());
    }
    @Test
    void isEmpty2(){
        array.add(12);
        assertEquals(false, array.isEmpty());
    }
    @Test
    void contains1(){
        array.add(12);
        assertEquals(true,array.contains(12));

    }

    @Test
    void contains2(){
        array.add(12);
        assertEquals(false, array.contains(11));
    }
    @Test
    void clear1(){
        array.add(12);
        array.add(13);
        array.clear();
        assertEquals(0, array.size());
    }
    @Test
    void clear2(){
        array.add(12);
        array.add(13);
        array.add(13);
        array.clear();
        assertEquals(null, array.get(0));
    }
    @Test
    void get1(){
        array.add(12);
        array.add(13);
        array.add(14);
        assertEquals(13, array.get(1));
    }
    @Test
    void set1(){
        array.add(12);
        array.add(13);
        array.set(1,15);
        assertEquals(15,array.get(1));
    }
    @Test
    void set2(){
        array.add(12);
        array.add(13);
        array.set(1,15);
        assertEquals(15,array.set(1,20));
    }
    @Test
    void add1(){
        array.add(1);
        array.add(1);
        assertEquals(2,array.size());
    }
    @Test
    void add2(){
        array.add(1);
        array.add(2);
        array.add(3);
        array.remove(1);

        assertEquals(3, array.get(1));
    }
    @Test
    void addIndex1(){
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(1,4);
        assertEquals(4, array.get(1));
    }
    @Test
    void addIndex2(){
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(3,4);
        assertEquals(4,array.get(3));
    }
    @Test
    void addAll1(){
        array.add(12);
        array.addAll(new Integer[]{14,15,16});
        assertEquals(4,array.size());
    }
    @Test
    void addAll2(){
        array.add(12);
        array.addAll(new Integer[]{14,15,16});
        assertEquals(15,array.get(2));
    }
    @Test
    void addAllIndex1 (){
        array.add(12);
        array.add(13);
        array.add(14);
        array.addAll(1,new Integer[]{22,33,44});
        assertEquals(33,array.get(2));
    }
    @Test
    void addAllIndex2 (){
        array.add(12);
        array.add(13);
        array.add(14);
        array.addAll(1,new Integer[]{22,33,44});
        assertEquals(6,array.size());
    }
    @Test
    void removeIndex1 (){
        array.add(12);
        array.add(22);
        array.add(32);
        array.remove(0);
        assertEquals(22,array.get(0));
    }
    @Test
    void removeIndex2 (){
        array.add(12);
        array.add(22);
        array.add(32);
        array.remove(2);
        assertEquals(2,array.size());
    }
    @Test
    void removeItem1 (){
        array.add(12);
        array.add(13);
        array.add(14);
        array.add(14);
        array.remove((Integer) 14);
        assertEquals(3,array.size());

    }
    @Test
    void removeItem2 (){
        array.add(12);
        array.add(13);
        array.add(14);
        assertEquals(true,array.remove((Integer) 14));
    }
    @Test
    void removeItem3 (){
        array.add(12);
        array.add(13);
        array.add(14);
        assertEquals(false,array.remove((Integer) 44));
    }
    @Test
    void removeAll1(){
        array.add(12);
        array.add(12);
        array.add(13);
        array.add(14);
        array.add(15);
        array.add(15);
        array.removeAll(new Integer[]{15,12});
        assertEquals(2,array.size());
    }
    @Test
    void removeAll2(){
        array.add(12);
        array.add(12);
        array.add(13);
        array.add(14);
        array.add(15);
        array.add(15);
        array.removeAll(new Integer[]{15,12, 16,78});
        assertEquals(2,array.size());
    }
    @Test
    void removeAll3(){
        array.add(12);
        array.add(12);
        array.add(13);
        array.add(14);
        array.add(15);
        array.add(15);
        array.removeAll(new Integer[]{});
        assertEquals(6,array.size());
    }
    @Test
    void indexOf1(){
        array.add(12);
        array.add(13);
        array.add(14);
        array.add(15);
        assertEquals(3,array.indexOf(15));
    }
    @Test
    void indexOf2(){
        array.add(12);
        array.add(13);
        array.add(14);
        array.add(15);
        assertEquals(-1,array.indexOf(21));
    }
    @Test
    void indexOf3(){
        array.add(12);
        array.add(13);
        array.add(13);
        array.add(15);
        assertEquals(1,array.indexOf(13));
    }
    @Test
    void lastIndexOf1(){
        array.add(12);
        array.add(13);
        array.add(13);
        array.add(15);
        assertEquals(2,array.lastIndexOf(13));
    }
    @Test
    void lastIndexOf2(){
        array.add(12);
        array.add(13);
        array.add(13);
        array.add(15);
        assertEquals(0,array.lastIndexOf(12));
    }
    @Test
    void lastIndexOf3(){
        array.add(12);
        array.add(13);
        array.add(13);
        array.add(15);
        assertEquals(-1,array.lastIndexOf(122));
    }
}