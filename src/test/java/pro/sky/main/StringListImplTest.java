package pro.sky.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {

    @org.junit.jupiter.api.Test
    void add() {
        StringListImpl stringList = new StringListImpl(4);
        stringList.add("Test1");
        stringList.add("Test2");
        Assertions.assertTrue(stringList.size() == 2);
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        StringListImpl stringList = new StringListImpl();
        stringList.add("Test1");
        stringList.add("Test2");
        stringList.add("Test3");
        stringList.add(1,"Test4");
        Assertions.assertTrue(stringList.indexOf("Test4") == 1);
    }

    @org.junit.jupiter.api.Test
    void testConstruct() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new StringListImpl(-2));
    }

    @org.junit.jupiter.api.Test
    void set() {
        StringListImpl stringList = new StringListImpl(4);
        stringList.add("Test1");
        stringList.add("Test2");
        stringList.add("Test3");
        stringList.set(1,"Test4");
        Assertions.assertTrue(stringList.indexOf("Test4") == 1);
    }

    @org.junit.jupiter.api.Test
    void remove() {
        StringListImpl stringList = new StringListImpl(4);
        stringList.add("Test1");
        stringList.add("Test2");
        stringList.add("Test3");
        stringList.remove(1);
        Assertions.assertTrue(stringList.lastIndexOf("Test2") == -1);
        Assertions.assertFalse(stringList.contains("Test2"));
    }

    @org.junit.jupiter.api.Test
    void get() {
        StringListImpl stringList = new StringListImpl(4);
        stringList.add("Test1");
        stringList.add("Test2");
        stringList.add("Test3");
        stringList.add("Test4");
        Assertions.assertTrue(Objects.equals(stringList.get(2), "Test3"));
        Assertions.assertThrows(StorageIsFullException.class, () -> stringList.add("Test5"));
    }

    @org.junit.jupiter.api.Test
    void testAddNow() {
        StringListImpl stringList = new StringListImpl(2);
        Assertions.assertTrue(stringList.isEmpty());
        stringList.add("Test1");
        stringList.add("Test2");
        stringList.toArray();
        stringList.remove("Test2");
    }

    @org.junit.jupiter.api.Test
    void testExceptions() {
        StringListImpl stringList = new StringListImpl(2);
        stringList.add("Test1");
        stringList.add("Test2");
        Assertions.assertThrows(IllegalArgumentException.class, () -> stringList.lastIndexOf(null));
    }

    @org.junit.jupiter.api.Test
    void size() {
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
    }

    @org.junit.jupiter.api.Test
    void clear() {
    }

    @org.junit.jupiter.api.Test
    void toArray() {
    }
}