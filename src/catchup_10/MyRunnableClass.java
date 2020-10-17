package catchup_10;
//通过实现Runnable接口创建线程
public class MyRunnableClass implements Runnable{

	private int i;
	
	@Override
	public void run() {
		
		for(; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "-->" + i);
		}
		
	}

}
