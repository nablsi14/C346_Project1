public class MyLinkedList<T> implements ILinkedList<T> {
    private T value;
    private MyLinkedList<T> next;

    public MyLinkedList(T value) {
        this.value = value;
    }

    public MyLinkedList () {}

    @Override
    public MyLinkedList<T> next () {
        return next;
    }

    @Override
    public MyLinkedList<T> last () {
        MyLinkedList temp = this;
        while (temp.next != null)
            temp = temp.next;
        return temp;
    }

    @Override
    public MyLinkedList<T> after(int n) {
        MyLinkedList<T> temp = this;
        for (int i = 0; i < n && temp.next != null; i++)
            temp = temp.next;
        return temp;
    }

    @Override
    public MyLinkedList<T> detach() {
        MyLinkedList<T> temp = next;
        next = null;
        return temp;
    }

    @Override
    public T get () {
        return value;
    }

    @Override
    public void set (T value) {
        this.value = value;
    }

    @Override
    public void setNext(ILinkedList<T> next){
        this.next = (MyLinkedList)next;
    }

    @Override
    public void append(ILinkedList<T> next) {
        MyLinkedList<T> temp = this;
        while (temp.next != null)
            temp = temp.next;
        temp.next = (MyLinkedList)next;
    }

    @Override
    public void insert(ILinkedList<T> newFirst) {
        ((MyLinkedList)newFirst).next = this;
    }
}
