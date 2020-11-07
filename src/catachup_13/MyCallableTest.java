package catachup_13;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class MyCallableTest {

	public static void main(String[] args)
			throws InterruptedException, ExecutionException {
		// 创建callable的实现类对象
		MyCallable myCallable = new MyCallable();
		// 用futuretask包裹callable的返回值, futuretask实际上是把callable转化为runnable
		FutureTask futureTask = new FutureTask<>(myCallable);
		// 创建线程
		Thread thread = new Thread(futureTask);
		// 运行线程
		thread.start();
		// 获取线程返回的结果, futureTask的get（）方法会阻塞主线程
		Integer result = (Integer) futureTask.get();

		System.out.println("将FutureTask提交到新建线程,返回结果: " + result);

		FutureTask<Integer> futureTask1 = new FutureTask<>(
				new Callable<Integer>() {

					@Override
					public Integer call() throws Exception {
						int sum = 0;
						for (int i = 1; i <= 10; i++)
							sum += i;
						return sum;
					}

				});

		ExecutorService es = Executors.newCachedThreadPool();
		es.submit(futureTask1);

		Integer result1 = (Integer) futureTask1.get();
		System.out.println("将FutureTask提交到线程池,返回结果: " + result1);

		//Lambda表达式
		FutureTask<Integer> futureTask2 = new FutureTask<>(() -> {
			int sum = 0;
			for (int i = 1; i <= 10; i++)
				sum += i;
			return sum;
		});
		

	}

}
