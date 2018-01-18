import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class MyLinkedListTest {

    @Test
    public void testNextReturnsNullWithListOf1 () {
        MyLinkedList<Integer> actual = new MyLinkedList<Integer>().next();
        assertNull(actual);
    }
    @Test
    public void testNextWithListOf2 () {
        //setup
        MyLinkedList<Integer> temp = new MyLinkedList<>(1);
        temp.setNext(new MyLinkedList<>(2));
        //test
        Integer actual = temp.next().get();
        Integer expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testLastWithListOf1 () {
        MyLinkedList<Integer> temp = new MyLinkedList<>(1);
        Integer actual = temp.last().get();
        Integer expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void testLastWithListOf3 () {
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
    public void testAfter2OnListOf4 () {
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
    public void testAfter0OnListOf2 () {
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
    public void testDetachReturnsNullWithListOf1 () {
        MyLinkedList<Integer> temp = new MyLinkedList<>(1);
        MyLinkedList<Integer> actual = temp.detach();
        assertNull(actual);
    }
    @Test
    public void testDetachWithListOf2 () {
        MyLinkedList<Integer> l1 = new MyLinkedList<>(1);
        l1.setNext(new MyLinkedList<>(2));
        Integer actual = l1.detach().get();
        Integer expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testGet () {
        Integer actual = (new MyLinkedList<>(1)).get();
        Integer expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void testGetReturnsNullOnEmptyElement () {
        MyLinkedList<Integer> temp = new MyLinkedList<>();
        Integer actual = temp.get();
        assertNull(actual);
    }

    @Test
    public void testSet () {
        MyLinkedList<Integer> temp = new MyLinkedList<>();
        temp.set(1);
        Integer actual = temp.get();
        Integer expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void testSetOverwritesPreviousValue () {
        MyLinkedList<Integer> temp = new MyLinkedList<>(1);
        temp.set(2);
        Integer actual = temp.get();
        Integer expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNextOnListOf1 () {
        //setup
        MyLinkedList<Integer> l1 = new MyLinkedList<>(1);
        MyLinkedList<Integer> l2 = new MyLinkedList<>(2);
        //test
        l1.setNext(l2);
        Integer actual = l1.next().get();
        Integer expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void testSetNextOnListOf2 () {
        //setup
        MyLinkedList<Integer> l1 = new MyLinkedList<>(1);
        MyLinkedList<Integer> l2 = new MyLinkedList<>(2);
        MyLinkedList<Integer> l3 = new MyLinkedList<>(3);
        l1.setNext(l2);
        //test
        l1.setNext(l3);
        Integer actual = l1.next().get();
        Integer expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void testSetNextWithListOf2 () {
        //setup
        MyLinkedList<Integer> l1 = new MyLinkedList<>(1);
        MyLinkedList<Integer> l2 = new MyLinkedList<>(2);
        MyLinkedList<Integer> l3 = new MyLinkedList<>(3);
        l2.setNext(l3);
        //test
        l1.setNext(l2);
        Integer actual = l1.next().next().get();
        Integer expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void testAppendOnListOf1 () {
        MyLinkedList<Integer> l1 = new MyLinkedList<>(1);
        MyLinkedList<Integer> l2 = new MyLinkedList<>(2);

        l1.append(l2);
        Integer actual = l1.next().get();
        Integer expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void testAppendOnListOf3 () {
        //setup
        MyLinkedList<Integer> l1 = new MyLinkedList<>(1);
        MyLinkedList<Integer> l2 = new MyLinkedList<>(2);
        MyLinkedList<Integer> l3 = new MyLinkedList<>(3);
        MyLinkedList<Integer> l4 = new MyLinkedList<>(4);
        l2.setNext(l3);
        l1.setNext(l2);
        //test
        l1.append(l4);
        Integer actual = l1.next().next().next().get();
        Integer expected = 4;
        assertEquals(expected, actual);
    }
    @Test
    public void testAppendOnListOf1WithListOf2 () {
        //setup
        MyLinkedList<Integer> l1 = new MyLinkedList<>(1);
        MyLinkedList<Integer> l2 = new MyLinkedList<>(2);
        MyLinkedList<Integer> l3 = new MyLinkedList<>(3);
        l2.setNext(l3);
        //test
        l1.append(l2);
        Integer actual = l1.next().next().get();
        Integer expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void testAppendOnListOf31WithListOf2 () {
        //setup
        MyLinkedList<Integer> l1 = new MyLinkedList<>(1);
        MyLinkedList<Integer> l2 = new MyLinkedList<>(2);
        MyLinkedList<Integer> l3 = new MyLinkedList<>(3);
        MyLinkedList<Integer> l4 = new MyLinkedList<>(4);
        MyLinkedList<Integer> l5 = new MyLinkedList<>(5);
        l2.setNext(l3);
        l1.setNext(l2);
        l4.setNext(l5);
        //test
        l1.append(l4);
        Integer actual = l1.next().next().next().next().get();
        Integer expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void testInsertWithListOf1IntoListOf1 () {
        MyLinkedList<Integer> l1 = new MyLinkedList<>(1);
        MyLinkedList<Integer> l2 = new MyLinkedList<>(2);
        l1.insert(l2);
        Integer actual = l2.next().get();
        Integer expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void testInsertWithListOf2IntoListOf1 () {
        MyLinkedList<Integer> l1 = new MyLinkedList<>(1);
        MyLinkedList<Integer> l2 = new MyLinkedList<>(2);
        MyLinkedList<Integer> l3 = new MyLinkedList<>(3);
        l1.setNext(l2);

        l1.insert(l3);
        Integer actual = l3.next().next().get();
        Integer expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void testInsertWithListOf2IntoListOf2 () {
        MyLinkedList<Integer> l1 = new MyLinkedList<>(1);
        MyLinkedList<Integer> l2 = new MyLinkedList<>(2);
        MyLinkedList<Integer> l3 = new MyLinkedList<>(3);
        MyLinkedList<Integer> l4 = new MyLinkedList<>(4);
        l1.setNext(l2);
        l3.setNext(l4);

        l1.insert(l3);
        Integer actual = l3.next().next().get();
        Integer expected = 2;
        assertEquals(expected, actual);
    }
}