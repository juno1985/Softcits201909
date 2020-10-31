package catchup_12.pratice.p2;

import java.util.concurrent.BlockingQueue;

public class Xiaofeizhe implements Runnable {
	private BlockingQueue<Xiaoxi> Xx;

	public Xiaofeizhe(BlockingQueue<Xiaoxi> q) {
		this.Xx = q;
	}

	@Override
	public void run() {
		try {
			Xiaoxi m;
			while ((m = Xx.take()).getXiangying() != "exit") {
				Thread.sleep(10);
				System.out.println("������ " + m.getXiangying());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
