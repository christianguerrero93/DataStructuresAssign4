# DataStructuresAssign4


Overview

In this assignment you will be implementing two Abstract Data Types (ADT) the Queue ADT and the Stack ADT. In addition, you will be using two different implementations for each ADT:

    Array Based
    Linked

You will also be writing a driver to test your Queue and Stack implementations and you will be measuring the run times and memory use of each test case.

You will also be adding some functionality to the RunTime class that you created for Homework 1.

Finally, you will be analysing and comparing the performance of the test cases on both the Array Based and the Linked implementations of both the Queue ADT and the Stack ADT.
Details

    RunTime Class

    You will be expanding the functionality of the RunTime class to implement the expanded RunTime Interface, The interface may be downloaded from RunTimeInterface.java
    Array Based Queue Class

    You will write the ArrayBasedQueue.java class which will implement the Queue Interface. The interface may be downloaded from QueueInterface.java.

    Please note that Queue Interface extends the Iterable Interface. See the Information On The Iterable Interface below.
    Linked Queue Class

    You will write the LinkedQueue.java class which will implement the Queue Interface. The interface may be downloaded from QueueInterface.java.

    Please note that Queue Interface extends the Iterable Interface. See the Information On The Iterable Interface below.

    Also note that the Linked Queue Class should be a Doubly Linked Queue.
    Array Based Stack Class

    You will write the ArrayBasedStack.java class which will implement the Stack Interface. The interface may be downloaded from StackInterface.java.

    Please note that Stack Interface extends the Iterable Interface. See the Information On The Iterable Interface below.
    Linked Stack Class

    You will write the LinkedStack.java class which will implement the Stack Interface. The interface may be downloaded from StackInterface.java.

    Please note that Stack Interface extends the Iterable Interface. See the Information On The Iterable Interface below.

    Also note that the Linked Stack Class should be a Doubly Linked Stack.
    Information On The Iterable Interface

    The Iterable Interface requires you to implement one method Iterator iterator(). So, all your Queue and Stack classes must implement this interface.
    Element Iterator Class

    You will write the ElementIterator.java class which will implement the Iterator Interface.

    Please note, you only need to implement two methods from the Iterator interface: boolean hasNext() and E next()
    Node Class

    You will write the Node.java Please see the Node Class Documentation for all the methods you will need.

    Please note that the Node Class is a node for a Doubly Linked Queue or Doubly Linked Stack.
    Driver Class

    You will write the Driver.java class which will implement the Driver Interface. The interface may be downloaded from DriverInterface.java.

    Please note that you do not inherit from the RunTime class. However, you do have to use the RunTime class to measure run times and memory usages.
    Queue Test Cases

    All the elements being enqueued and dequeued from your queues must be instances of the java.land.String class.
        Create an instance of your queue that accepts java.lang.String Objects. Starting with an empty queue, use the enqueue(E e) method to add 10,000 java.lang.String objects representing the strings ("String 1" ≤ s ≤ "String 10000") to the Queue.
        Starting with an instance of your queue that accepts java.lang.String Objects that is fully populated with 10,000 java.lang.String objects representing the strings ("String 1" ≤ s ≤ "String 10000") in the Queue. Use the dequeue() method to remove all the objects from the queue, one at a time.
        Starting with an instance of your queue that accepts java.lang.String Objects that is fully populated with 10,000 java.lang.String objects representing the strings ("String 1" ≤ s ≤ "String 10000") in the Queue. Use the Iterator() method to obtain an ElementIterator object. Use the ElementIterator object to display the strings from the queue one String per line.
    Stack Test Cases

    All the elements being pushed and popped from your stacks must be instances of the java.lang.String class.
        Create an instance of your stack that accepts java.lang.String Objects. Starting with an empty stack, use the push(E e) method to add 10,000 java.lang.String objects representing the strings ("String 1" ≤ s ≤ "String 10000") to the stack.
        Starting with an instance of your stack that accepts java.lang.String Objects that is fully populated with 10,000 java.lang.String objects representing the strings ("String 1" ≤ s ≤ "String 10000") in the stack. Use the pop() method to remove all the objects from the stack, one at a time.
        Starting with an instance of your stack that accepts java.lang.String Objects that is fully populated with 10,000 java.lang.String objects representing the strings ("String 1" ≤ s ≤ "String 10000") in the stack. Use the Iterator() method to obtain an ElementIterator object. Use the ElementIterator object to display the strings from the stack, one String per line.
    Output From Driver Main Method

    Please note that, in addition to implementing the DriverInterface, you are also required to write your own public static main(String[] args) method in Driver.java.

    Your main() method will have to call the runTestCase() method for each of test cases listed above a total of ten times for each test case:

    For each call to the runQueueTestCase() method your main() method will a table with the following output for the Array Based Queue and the Linked Queue implementations:

    Running test = Test Case Name
    		  Run 1   Run 2   Run 3   Run 4   Run 5   Run 6   Run 7   Run 8   Run 9  Run 10 Average
                     Micro   Micro   Micro   Micro   Micro   Micro   Micro   Micro   Micro   Micro   Micro
    		Seconds Seconds Seconds Seconds Seconds Seconds Seconds Seconds Seconds Seconds Seconds
    		------- -------	------- -------	------- -------	------- -------	------- -------	-------
    ArrayBasedQueue
    LinkedQueue
    	

    Running test = Test Case Name
    		  Run 1      Run 2      Run 3      Run 4      Run 5      Run 6      Run 7      Run 8      Run 9     Run 10     Average
    		Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes
    		---------- ---------- ---------- ---------- ---------- ---------- ---------- ---------- ---------- ---------- ----------
    ArrayBasedQueue
    LinkedQueue
    	

    For each call to the runStackTestCase() method your main() method will a table with the following output for the Array Based Stack and the Linked Stack implementations:

    Running test = Test Case Name
    		  Run 1   Run 2   Run 3   Run 4   Run 5   Run 6   Run 7   Run 8   Run 9  Run 10 Average
                     Micro   Micro   Micro   Micro   Micro   Micro   Micro   Micro   Micro   Micro   Micro
    		Seconds Seconds Seconds Seconds Seconds Seconds Seconds Seconds Seconds Seconds Seconds
    		------- -------	------- -------	------- -------	------- -------	------- -------	-------
    ArrayBasedStack
    LinkedStack
    	

    Running test = Test Case Name
    		  Run 1      Run 2      Run 3      Run 4      Run 5      Run 6      Run 7      Run 8      Run 9     Run 10     Average
    		Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes
    		---------- ---------- ---------- ---------- ---------- ---------- ---------- ---------- ---------- ---------- ----------
    ArrayBasedStack
    LinkedStack
    	

    Please note that the run times and the average are in Micro Seconds and the memory usage is in Kilo Bytes.
    Analysis:

    Using the tables you created by running Driver.main(), copy your results into a Microsoft Word document and answer the following questions using 1-3 complete sentences for each question:
        Discuss the difference in run times and memory usage between the array based queue and the linked queue for all the test cases. Did the results match your expectations? Why or why not? Be as specific as possible.
        Are the run times ever similar for both the array based queue and the linked queue? Why or why not? Be as specific as possible.
        In which test cases is the array based queue faster than the linked queue? Please explain the reason. Be as specific as possible.
        Discuss the difference in run times and memory usage between the array based stack and the linked stack for all the test cases. Did the results match your expectations? Why or why not? Be as specific as possible.
        Are the run times ever similar for both the array based stack and the linked stack? Why or why not? Be as specific as possible.
        In which test cases is the array based stack faster than the linked stack? Please explain the reason. Be as specific as possible.

Link for requirements
http://bit.ly/cmp338-s17-hw4
