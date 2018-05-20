public class ArrayBasedQueue<E> implements QueueInterface<E> {

   // Instance variables
   private E[] q;
   private int front;
   private int back;
   private int capacity;

   /**
   * Constructor
   *
   * @param capacity
   *            - number of elements the queue can hold
   */
   @SuppressWarnings("unchecked")
public ArrayBasedQueue(int capacity) {
       this.q = (E[]) (new Object[capacity]);
       this.capacity = capacity;
       this.front = -1;
       this.back = -1;
   }

   public ArrayBasedQueue() {
	
}

/**
   * Retrieves and removes the element at the head of this queue
   */
   public E dequeue() {
       if (front == -1)
           return null;
       else {
           E element = q[this.front];
           this.front = (this.front + 1) % this.capacity;
           return element;
       }
   }

   /**
   * Retrieves and removes the element at the specified index
   */
   public E dequeue(int index) {
       index = (this.front + index) % this.capacity;
       E element = q[index];

       // Move element after index one position up
       index = (index + 1) % this.capacity;
       while (index != ((this.back + 1) % this.capacity)) {
           int prevIndex = (index - 1) % this.capacity;
          
           // Check if index is 0
           if (index == 0)
               prevIndex = this.capacity - 1;
          
           this.q[prevIndex] = this.q[index];
           index = (index + 1) % this.capacity;
       }

       // Update back index of the queue
       this.back = (this.back - 1) % this.capacity;
       if (this.back == -1)
           this.back = this.capacity - 1;

       return element;
   }

   /**
   * Adds the specified element into the queue if it is possible immediately
   * without violating capacity restrictions, otherwise, throwing an
   * IllegalStateException if no space is currently available or
   * NullPointerException if the specified element is null
   */
   public void enqueue(E e) {
       // Check if queue is full
       if (((this.back + 1) % this.capacity) == this.front)
           throw new IllegalStateException("Queue full");
       else if (e == null)
           throw new NullPointerException("Element to be enqueued is null");
       else {
           // If this is the first element
           if (this.front == -1)
               this.front += 1;

           this.back = (this.back + 1) % this.capacity;
           this.q[this.back] = e;
       }
   }

   /**
   * Returns whether the queue is empty
   */
   public boolean isEmpty() {
       return (this.front == -1);
   }

   /**
   * Retrieves but does not remove the head of this queue
   */
   public E peek() {
       return this.q[this.front];
   }

   /**
   * Removes all element from the queue
   */
   public void removeAll() {
       int index = this.front;

       // Set elements at index to null
       while (index != back) {
           this.q[index] = null;
           index = (index + 1) % this.capacity;
       }

       // Set front and back
       this.front = -1;
       this.back = -1;
   }

   /**
   * Returns the count of elements in the queue
   */
   public int size() {
       if (this.front == -1)
           return 0;
       else {
           int count = 0;
           int index = this.front;

           // Count elements
           do {
               count += 1;
               index = (index + 1) % this.capacity;
           } while (index != ((this.back + 1) % this.capacity));

           return count;
       }
   }

   /**
   * Returns an iterator over elements of type T
   */
   public Iterator<E> iterator() {
       return new ElementIterator();
   }

   // Inner class for iterator
   private class ElementIterator implements Iterator<E> {

       private int currPos;
       private boolean frontVisited;

       /**
       * Constructor
       */
       public ElementIterator() {
           this.currPos = front;
           this.frontVisited = false;
       }

       /**
       * Returns true if iteration has more elements
       */
       public boolean hasNext() {
           // Check if queue is not full
           if (front != ((back + 1) % capacity))
               return (this.currPos != ((back + 1) % capacity));
           else {
               if (!frontVisited && (this.currPos == front)) {
                   frontVisited = true;
                   return true;
               } else
                   return (this.currPos != front);
           }
       }

       /**
       * Returns the next element in the iteration
       */
       public E next() {
           E element = q[this.currPos];
           // Move currPos one position ahead
           this.currPos = (this.currPos + 1) % capacity;
           return element;
       }
   }
}

