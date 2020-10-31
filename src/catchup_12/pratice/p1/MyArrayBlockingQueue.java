package catchup_12.pratice.p1;

public class MyArrayBlockingQueue {

	private Object[] queue;
	// 队列的头部，获取数据时总是从头部获取
	private int head;
	// 队列尾部，push数据时总是从尾部添加
	private int tail;
	// 队列长度
	private int size;
	// 数组中能存放数据的最大容量
	private final static int MAX_CAPACITY = 1 << 30;
	// 数组长度
	private int capacity;
	// 最大下标
	private int maxIndex;
	/*
	 * 为阻塞数组队列设定长度
	 */
	public MyArrayBlockingQueue(int initialCapacity) {
		if (initialCapacity > MAX_CAPACITY)
			throw new OutOfMemoryError("initialCapacity too large");
		if (initialCapacity <= 0)
			throw new IndexOutOfBoundsException(
					"initialCapacity must be more than zero");
		queue = new Object[initialCapacity];
		capacity = initialCapacity;
		maxIndex = initialCapacity - 1;
		head = tail = -1;
		size = 0;
	}

	/*
	 * 阻塞数组队列的默认长度为16；
	 */
	public MyArrayBlockingQueue() {
		queue = new Object[16];
		capacity = 16;
		head = tail = -1;
		size = 0;
		maxIndex = 15;//capacity - 1
	}

	/**
	 * 队列中存储的数据量
	 */
	public int getSize() {
		return size;
	}

	/**
	 * 队列是否为空
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * 清空队列
	 */
	public void clear() {
		for (int i = 0; i < queue.length; i++) {
			queue[i] = null;
		}
		tail = head = -1;
		size = 0;
	}
	/*
	 * 入队列
	 */
	public void enqueue(Object object) {
		//极端情况，put线程循环一圈后take一个元素都没有拿走，防止put返回覆盖第一个元素
		if (size > capacity) { 

			System.err.println(
					"queue's size more than or equal to array's capacity");
			return;
		}
		//如果put线程已经放入数组的最后一个index，则要返回到index=0
		if (++tail > maxIndex) {
			tail = 0;
		}
		queue[tail] = object;
		size++;
	}

	/*
	 * 出队列
	 */
	public Object dequeue() {
		Object object;
		if (isEmpty()) {
			System.err.println("the queue is null");
			return null;
		}
		if (++head > maxIndex) {
			head = 0;
		}
		size--;
		object = queue[head];
		queue[head] = null;

		return object;
	}

	/**
	 * 往队列里添加元素，直到队列满时，执行wait方法，释放锁，转而执行take方法
	 */
	public void put(Object object) {
		synchronized (this) {
			while (size == capacity) {
				try {
					System.out.println("订单已经满了");
					this.wait();
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
			this.enqueue(object);
			System.out.println("您有新的订单" + object);
			this.notifyAll();
		}
	}

	/**
	 * 取出队列里的元素，直到队列为空时，执行wait方法，释放锁，转而执行put方法
	 */
	public Object take() {
		Object object = null;
		synchronized (this) {
			while (size == 0) {
				try {
					System.out.println("没有订单了");
					this.wait();
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
			object = this.dequeue();
			System.out.println(object + "订单已完成");
			this.notifyAll();
			return object;
		}
	}

}
