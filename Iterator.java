public interface Iterator<E> {

   /**
   * Returns true if iteration has more elements
   */
   public boolean hasNext();
   /**
   * Returns the next element in the iteration
   */
   public E next();
}