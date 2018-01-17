import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class MyLinkedListTest {

    @Test
    public void testNextReturnsNullWithListLength1 () {
        MyLinkedList<Integer> actual = new MyLinkedList<Integer>().next();
        assertNull(actual);
    }
    @Test
    public void testNextWithListLength2 () {
        //setup
        MyLinkedList<Integer> temp = new MyLinkedList<>(1);
        temp.setNext(new MyLinkedList<>(2));
        //test
        Integer actual = temp.next().get();
        Integer expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testLastWithListLength1 () {
        MyLinkedList<Integer> temp = new MyLinkedList<>(1);
        Integer actual = temp.last().get();
        Integer expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void testLastWithListLength3 () {
        //setup
        MyLinkedList<Integer> temp = new MyLinkedList<>(1);
        MyLinkedList<Integer> temp1 = new MyLinkedList<>(2);
        temp1.setNext(new MyLinkedList<>(3));
        temp.setNext(temp1);
        //test
        Integer actual = temp.last().get();
        Integer expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void testAfter2OnListLength4 () {
        //setup
        MyLinkedList<Integer> l1 = new MyLinkedList<>(1);
        MyLinkedList<Integer> l2 = new MyLinkedList<>(2);
        MyLinkedList<Integer> l3 = new MyLinkedList<>(3);
        MyLinkedList<Integer> l4 = new MyLinkedList<>(4);
        l3.setNext(l4);
        l2.setNext(l3);
        l1.setNext(l2);
        //test
        Integer actual = l1.after(2).get();
        Integer expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void testAfter0OnListLength2 () {
        //setup
        MyLinkedList<Integer> l1 = new MyLinkedList<>(1);
        MyLinkedList<Integer> l2 = new MyLinkedList<>(2);
        l1.setNext(l2);
        //test
        Integer actual = l1.after(0).get();
        Integer expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void testAfterReturnsLastElementWithInputOutOfBounds () {
        //setup
        MyLinkedList<Integer> l1 = new MyLinkedList<>(1);
        MyLinkedList<Integer> l2 = new MyLinkedList<>(2);
        MyLinkedList<Integer> l3 = new MyLinkedList<>(3);
        MyLinkedList<Integer> l4 = new MyLinkedList<>(4);
        l3.setNext(l4);
        l2.setNext(l3);
        l1.setNext(l2);
        //test
        Integer actual = l1.after(5).get();
        Integer expected = 4;
        assertEquals(expected, actual);
    }
    @Test
    public void testAfterReturnsFirstElementWithNegativeInput () {
        //setup
        MyLinkedList<Integer> l1 = new MyLinkedList<>(1);
        MyLinkedList<Integer> l2 = new MyLinkedList<>(2);
        l1.setNext(l2);
        //test
        Integer actual = l1.after(-2).get();
        Integer expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testDetachReturnsNullWithListLength1 () {
        MyLinkedList<Integer> temp = new MyLinkedList<>(1);
        MyLinkedList<Integer> actual = temp.detach();
        assertNull(actual);
    }
    @Test
    public void testDetachWithListLength2 () {
        MyLinkedList<Integer> l1 = new MyLinkedList<>(1);
        l1.setNext(new MyLinkedList<>(2));
        Integer actual = l1.detach().get();
        Integer expected = 2;
        assertEquals(expected, actual);
    }


    @Test
    public void get() {
    }

    @Test
    public void set() {
    }

    @Test
    public void setNext() {
    }

    @Test
    public void append() {
    }

    @Test
    public void insert() {
    }
}