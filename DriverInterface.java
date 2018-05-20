
public interface DriverInterface {
	enum QueueType {ArrayBasedQueue, LinkedQueue};
	enum QueueTestType {Enqueue, Dequeue, Iterate}

	enum StackType {ArrayBasedStack, LinkedStack}

	enum StackTestType {Push, Pop, Iterate};
	QueueInterface<String> createQueue(QueueType queueType, QueueTestType queueTestType);
	StackInterface<String> createStack(StackType stackType, StackTestType stackTestType);
	RunTime runQueueTestCase(QueueType queueType, QueueTestType queueTestType, int numberOfTimes);
	RunTime runStackTestCase(StackType stackType, StackTestType stackTestType, int numberOfTimes);
	
	
	
}
