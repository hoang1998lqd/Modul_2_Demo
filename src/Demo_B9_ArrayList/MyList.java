package Demo_B9_ArrayList;

public interface MyList <E>  extends  java.lang.Iterable<E>{
    // Thêm phần tử
    public void add(E e);
    // Thêm phần tử vào vị trí Index
    public void add (int index, E e);
    public void clear();
    public boolean contains(E e);
    public E get (int index);
    public int indexOf(E e);
    public boolean isEmpty();
    public int lastIndexOF (E e);
    public boolean remove(E e);
    public E remove (int index);
    public Object set (int index, E e);
    public int size();


}
