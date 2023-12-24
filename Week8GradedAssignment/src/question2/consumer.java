package question2;

public class consumer extends Thread {
	private Thread1 obj;

	public consumer(Thread1 obj) {
		this.obj = obj;
	}


	@Override
	public void run() {
		synchronized (obj) {
			try {
				obj.wait();
				System.out.println("DeSerialize called by consumer");
				obj.deserializeProjectDetails();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}


