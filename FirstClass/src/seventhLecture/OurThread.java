package seventhLecture;

public class OurThread extends Thread {
	private String threadName;
	private int startingPoint;
	private int counter;
	private int adder;
	private int timeDifference;
	private OurThread dependentThread;
	private boolean threadAliveFlag;
	
	
	 //---------------------------------------Constructor------------------------------------
	public OurThread(String threadName, int startingPoint, int adder, int timeDifference, OurThread dependentThread, boolean threadAliveFlag) {
		super();
		this.threadName = threadName;
		this.startingPoint = startingPoint;
		this.adder = adder;
		this.timeDifference = timeDifference;
		this.dependentThread = dependentThread;
		this.threadAliveFlag = threadAliveFlag;
	}

	
	//--------------------------------run() Method------------------------
	@Override
	public void run() {
		counter=startingPoint;
		
		if (dependentThread!=null) {
			try {
				dependentThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		while (threadAliveFlag) {
			counter+=adder;
			try {
				sleep(timeDifference);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	public void stopThread() {
		threadAliveFlag=false;
	}
	
	
	//-------------------------------Getters &Setters-------------------------------
	public String getThreadName() {
		return threadName;
	}



	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}



	public int getStartingPoint() {
		return startingPoint;
	}



	public void setStartingPoint(int startingPoint) {
		this.startingPoint = startingPoint;
	}



	public int getCounter() {
		return counter;
	}



	public void setCounter(int counter) {
		this.counter = counter;
	}



	public int getAdder() {
		return adder;
	}



	public void setAdder(int adder) {
		this.adder = adder;
	}



	public int getTimeDifference() {
		return timeDifference;
	}



	public void setTimeDifference(int timeDifference) {
		this.timeDifference = timeDifference;
	}



	public boolean isThreadAliveFlag() {
		return threadAliveFlag;
	}



	public void setThreadAliveFlag(boolean threadAliveFlag) {
		this.threadAliveFlag = threadAliveFlag;
	}



}
