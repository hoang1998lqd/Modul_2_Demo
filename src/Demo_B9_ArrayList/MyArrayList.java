package Demo_B9_ArrayList;

public class MyArrayList<E> extends MyAbstractList<E>{
  public static final int INITIAL_CAPACITY = 10;
  private E[] data = (E[]) new Object[INITIAL_CAPACITY];
  // Tạo mảng rỗng

    public MyArrayList(){}

    // Tạo một list từ 1 mảng Objects
    public MyArrayList(E[] objects){
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);
        }
    }

    @Override
    public void add(int index, E e) {
        ensureCapacity();
// Move the elements to the right after the specified index
        for (int i = size - 1; i >= index; i--) data[i + 1] = data[i];
// Insert new element to data[index]
        data[index] = e;
// Increase size by 1
        size++;
    }



    @Override
    public boolean contains(E e) {
        return false;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }

    }

    @Override
    public void clear() {
        data = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }
    @Override
    /** Return the element at the specified index */
    public E get(int index) {
        checkIndex(index);
        return data[index];


    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }

    @Override
    /** Return the index of the first matching element 66 * in this list. Return -1 if no match. */
    public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i])) return i;
        return -1;
    }

    @Override
    public int lastIndexOF(E e) {
        return 0;
    }

    @Override
    /** Return the index of the last matching element 75 * in this list. Return -1 if no match. */
    public int lastIndexOf(E e) {

        for (int i = size - 1; i >= 0; i--) if (e.equals(data[i])) return i;
        return -1;
    }

    @Override
    /** Remove the element at the specified position 84 * in this list. Shift any subsequent elements to the left. 85 * Return the element that was removed from the list. */
    public E remove(int index) {
        checkIndex(index);

        E e = data[index];

        // Shift data to the left
        for (int j = index; j < size - 1; j++)
            data[j] = data[j + 1];

        data[size - 1] = null; // This element is now null

        // Decrement size
        size--;
        return e;
    }

    @Override
    /** Replace the element at the specified position
     *  in this list with the specified element. */
    public E set(int index, E e) {
        checkIndex(index);
        E old = data[index];
        data[index] = e;
        return old;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1) result.append(", ");
        }

        return result.toString() + "]";
    }

    /**
     * Trims the capacity to current size
     */
    public void trimToSize() {

        if (size != data.length) {
            E[] newData = (E[]) (new Object[size]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        } // If size == capacity, no need to trim
    }

    @Override
    /** Override iterator() defined in Iterable */
    public java.util.Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements java.util.Iterator {
        private int current = 0; // Current index

        @Override
        public boolean hasNext() {
            return (current < size);
        }

        @Override
        public E next() {
            return data[current++];
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(current);
        }
    }

    public static void main(String[] args) {


        // Create a list
        MyList list = new MyArrayList();

        // Add elements to the list
        list.add("America"); // Add it to the list
        System.out.println("(1) " + list);

        list.add(0, "Canada"); // Add it to the beginning of the list
        System.out.println("(2) " + list);

        list.add("Russia"); // Add it to the end of the list

        System.out.println("(3) " + list);

        list.add("France"); // Add it to the end of the list
        System.out.println("(4) " + list);

        list.add(2, "Germany"); // Add it to the list at index 2
        System.out.println("(5) " + list);

        list.add(5, "Norway"); // Add it to the list at index 5
        System.out.println("(6) " + list);

        // Remove elements from the list
        list.remove("Canada"); // Same as list.remove(0) in this case
        System.out.println("(7) " + list);

        list.remove(2); // Remove the element at index 2
        System.out.println("(8) " + list);

        list.remove(list.size() - 1); // Remove the last element
        System.out.print("(9) " + list + "\n(10) ");

//        for (String s : list) {
//            System.out.print(s.toUpperCase() + " ");
//        }
    }
}

