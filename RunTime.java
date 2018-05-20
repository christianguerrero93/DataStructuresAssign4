

public class RunTime implements RunTimeInterface{
	
	   private static final int MAX = 10;
	   private long[] runtimes;
	   private int count;
	  

	   public RunTime() {
	       this.runtimes = new long[MAX];
	       this.count += 0;
	   }

	@Override
	public TimeUnits getTimeUnits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTimeUnits(TimeUnits timeUnits) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemoryUnits getMemoryUnits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMemoryUnits(MemoryUnits memoryUnits) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getLastRunTime() {
		return this.runtimes[this.count - 1];
	}

	@Override
	public double getLastMemoryUsage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double[] getRunTimes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double[] getMemoryUsages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void resetRunTimes() {
		for (int i = 0; i < MAX; i++) {
	           this.runtimes[i] = 0;
	       }
		
	}

	@Override
	public void addRuntime(long runTime) {
		if (this.count == MAX) {

            System.arraycopy(this.runtimes, 1, this.runtimes, 0, MAX - 1);
	          
	           this.runtimes[MAX - 1] = runTime;
	       } else {
	          
	           this.runtimes[count] = runTime;
	         
	           this.count += 1;
	       }
		
	}

	@Override
	public double getAverageRunTime() {
		double sum = 0;
	       for (int i = 0; i < this.count; i++) {
	           sum += this.runtimes[i];
	       }
	      
	       return (sum / this.count);
	}

	@Override
	public double getAverageMemoryUsage() {
		// TODO Auto-generated method stub
		return 0;
	}

}
