import java.util.Iterator;

public class ArrayBasedStack<E> implements StackInterface<E> {
   private E[] theArray;
   private int topOfStack;

   private static final int DEFAULT_CAPACITY = 10;

   @SuppressWarnings("unchecked")
public ArrayBasedStack() {
       theArray = (E[]) new Object[DEFAULT_CAPACITY];
       topOfStack = -1;
   }

   @Override
   public Iterator<E> iterator() {
       return new ElementIterator<E>(this);
   }

   @Override
   public void clear() {
       topOfStack = -1;
   }

   @Override
   public boolean isEmpty() {
       return topOfStack == -1;
   }

   @SuppressWarnings("unchecked")
@Override
   public E peek() {
       if (isEmpty())
           throw new IllegalStateException("ArrayBasedStack peek");
       return (E) theArray[topOfStack];
   }

   @SuppressWarnings("unchecked")
@Override
   public E pop() {
       if (isEmpty())
           throw new IllegalStateException("ArrayBasedStack pop");
       return (E) theArray[topOfStack--];
   }

   @Override
   public void push(E e) {
       if (topOfStack + 1 == theArray.length)
           doubleArray();
       theArray[++topOfStack] = e;

   }

   @Override
   public int size() {
       return topOfStack+1;
   }

   @SuppressWarnings("unchecked")
private void doubleArray() {
       Object[] newArray;
       newArray = new Object[theArray.length * 2];
       for (int i = 0; i < theArray.length; i++)
           newArray[i] = theArray[i];
       theArray = (E[]) newArray;
   }

}