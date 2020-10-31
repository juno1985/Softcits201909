package catchup_12.pratice.p1;

public class Consumerthread extends Thread {

	private String message;
	private MyArrayBlockingQueue bq;
	public Consumerthread(String name, Message M, MyArrayBlockingQueue bq) {
		super(name);
		this.message = M.getMessage();
		this.bq = bq;
	}
	public String getMessage() {
		return message;
	}
	public void run() {
		for (int i = 0; i < 17; i++) {
			try {
				Thread.sleep(200);
				System.out.println(getName() + "已下单：" + getMessage());
				// 尝试放入元素，如果队列已满，线程被阻塞
				bq.put((Object) getMessage());
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
	}

}
