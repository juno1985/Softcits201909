package catchup_12.pratice.p1;

class Producerthread extends Thread {
	private MyArrayBlockingQueue bq;

	public Producerthread(String name, MyArrayBlockingQueue bq) {
		super(name);
		this.bq = bq;
	}
	public void run() {
		while (true) {
			try {
				Thread.sleep(200);
				// 尝试取出元素，如果队列已空，线程被阻塞
				Object object = bq.take();
				System.out.println("从队列中得到订单，并从订单系统取出: " + object.toString());
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
	}
}
