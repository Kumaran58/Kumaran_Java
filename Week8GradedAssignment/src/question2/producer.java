package question2;


public class producer extends Thread{
	private Thread1 obj;

	public producer(Thread1 obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		synchronized (obj) {
			try {
				System.out.println("Serialize called by Producer");
				obj.serializeProjectDetails();	
				obj.notifyAll();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}



