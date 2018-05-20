public interface StackInterface<E> extends Iterable<E>{
   /**
   * Removes All elements from the stack
   */
   void clear();
   /**
   * This method is called to determine if the stack is empty
   * @return
   */
   boolean isEmpty();
   /**
   * Retrieves but does not remove the top of the stack
   * @return
   */
   E peek();
   /**
   * Retrieves and removes the element at top of the stack
   * @return
   */
   E pop();
  
   /**
   * Pushed the specified element into this queue
   * @param e
 * @throws StackException 
   */
   void push(E e) ;

   /**
   * To obtain the count of element in the stack
   * @return
   */
   int size();
   }