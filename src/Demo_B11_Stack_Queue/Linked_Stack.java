package Demo_B10_Stack_Queue;

import java.util.LinkedList;

public class Linked_Stack<T> {
    private LinkedList<T> stack;

   public Linked_Stack(){
        stack = new LinkedList<>();
   }
   public void push(T value){
       stack.addLast(value);
   }
   public T pop(){
       if (Empty()){
           System.out.println("Không thể xóa được nữa");
       }
       return stack.removeFirst();
   }
   public int size(){
       return stack.size();
   }
   public boolean Empty(){
       if (stack.size() == 0){
           return true;
       }
       return false;
   }

    @Override
    public String toString() {
        return "Linked_Stack{" +
                "stack=" + stack +
                '}';
    }
}
