
public class Driver implements DriverInterface {

	public static void main(String[] args){
		Driver d = new Driver();
	}
	@Override
	public QueueInterface<String> createQueue(QueueType queueType, QueueTestType queueTestType) {
		return null; 

	}

	@Override
	public StackInterface<String> createStack(StackType stackType, StackTestType stackTestType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RunTime runQueueTestCase(QueueType queueType, QueueTestType queueTestType, int numberOfTimes) {
		RunTime runTime = new RunTime();
		return runTime;
	}

	@Override
	public RunTime runStackTestCase(StackType stackType, StackTestType stackTestType, int numberOfTimes) {
		RunTime runTime = new RunTime();
		return runTime;
	}

}
