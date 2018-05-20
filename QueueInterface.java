public interface QueueInterface<E> extends Iterable<E> {

   /**
   * Retrieves and removes the element at the head of this queue
   */
   public E dequeue();

   /**
   * Retrieves and removes the element at the specified index
   */
   public E dequeue(int index);

   /**
   * Adds the specified element into the queue if it is possible immediately
   * without violating capacity restrictions, otherwise, throwing an
   * IllegalStateException if no space is currently available or
   * NullPointerException if the specified element is null
   */
   public void enqueue(E e);

   /**
   * Returns whether the queue is empty
   */
   public boolean isEmpty();

   /**
   * Retrieves but does not remove the head of this queue
   */
   public E peek();

   /**
   * Removes all element from the queue
   */
   public void removeAll();

   /**
   * Returns the count of elements in the queue
   */
   public int size();
}