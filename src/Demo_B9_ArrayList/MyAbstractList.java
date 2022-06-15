package Demo_B9_ArrayList;

public abstract class MyAbstractList<E> implements MyList<E> {
    protected int size = 0;
    protected MyAbstractList(){

    }
    // thêm phần tử vào mảng
    protected MyAbstractList(E[] objects){
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);
        }
    }

    @Override
    public void add(E e) {
        add(size, e);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(E e) {
        if (indexOf(e) >= 0){
            remove(indexOf(e));
            return true;
        }else {
            return false;
        }
    }

    /** Clear the list */
    public abstract void clear();

    /** Return the index of the last matching element 75 * in this list. Return -1 if no match. */
    public abstract int lastIndexOf(E e);
}
