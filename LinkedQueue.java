

public class LinkedQueue<E>
{
    private Node<E> front;
    private Node<E> rear;
    private int count;

    public LinkedQueue()
    {
        front = null;
        rear = null;
        count = 0;
    }

    public void EnqueueRear(E e)
    {
        System.out.println("adding at rear: " + e);
        Node<E> nd = new Node<E>();
        nd.setData(e);
        nd.setPrevious(rear);

        if(rear != null)
            rear.setNext(nd);

        if(rear == null)
            front = nd;

        rear = nd;
       
        count++;
    }

    public void EnqueueFront(E e)
    {
        System.out.println("adding at front: " + e);

        Node<E> nd = new Node<E>();
        nd.setData(e);
        nd.setNext(front);

        if(front != null)
            front.setPrevious(nd);

        if(front == null)
            rear = nd;

        front = nd;
       
        count++;
    }

    public E DequeueFront()
    {
        E itemToReturn;

        if(count == 0)
            return null;

        itemToReturn = front.getData();
       
        Node<E> tmpFront = front.getNext();

        if(tmpFront != null)
            tmpFront.setPrevious(null);

        if(tmpFront == null)
            rear = null;

        System.out.println("removed from front: " + itemToReturn);
       
        front = tmpFront;           
        count--;

        return itemToReturn;
    }

    public E DequeueRear()
    {
        E itemToReturn;

        if(count == 0)
            return null;
       
        itemToReturn = rear.getData();       

        Node<E> tmpRear = rear.getPrevious();

        if(tmpRear != null)
            tmpRear.setNext(null);

        if(tmpRear == null)
            front = null;

        System.out.println("removed from rear: " + itemToReturn);
       
        rear = tmpRear;
        count--;        
       
        return itemToReturn;
    }

    public int size()
    {
        return count;
    }

    public boolean isEmpty()
    {
        return count == 0;
    }
    
    public void removeAll(){
    	
    	front = null;
        rear = null;
        count = 0;
    }

    public String toString()
    {
        String queueElements = "";
        Node<E> curr = front;

        while(curr != null)
        {
            queueElements = queueElements + (curr.getData()) + " ";
            curr = curr.getNext();
        }
       
        return queueElements;
    }
}