package Demo_B9_ArrayList;

import java.util.Arrays;

public class BT_ArrayList_List<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public BT_ArrayList_List() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    // Thêm phần tử vào cuối mảng
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    // Thêm phần tử vào vị trí bất kỳ trong mảng.
    //

    public void add (int index, E e){
       if (index < 0 || index > size){
           System.out.println("Không thêm được vào vị trí: " + index + " !!!");
       }
       else {
           System.arraycopy(elements,index,elements,index+1,size - index);
           elements[index] = e;
           size++;
       }
    }
    // Xóa phần tử theo vị trí.
    public void remove(int index){
        if (index< 0 || index> size){
            System.out.println("Không thể xóa tại vị trí " + index + " !!!!");
        }else {
            System.arraycopy(elements,index+1,elements,index, size -index);
            size--;
        }

    }

    // Đếm số lượng phần tử có gán giá trị.
    public int size(){
        return size;
    }
    // Xóa dữ liệu khỏi mảng.
    public void clear(){
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
    }
    // Duyệt mảng thành chuỗi
    public String toString() {
        int count= 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null){
                count ++;
            }
        }
        Object newArr [] = new Object[count];
        System.arraycopy(elements,0,newArr,0,newArr.length);
        elements = newArr;
        return "MyArrayList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }

    // Check có giá trị có nằm trong mảng hay không.

    public void contains(E e){
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)){
                System.out.println("Có chứa " + e + " trong mảng");
                break;
            }
        }
        if (!flag){
            System.out.println("Không chứa " + e + " trong mảng");
        }

    }

    // Lấy giá trị theo vị trị.
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}
