package catchup_12.pratice.p1;

public class OrderTest {

	public static void main(String[] args) {
		MyArrayBlockingQueue bq = new MyArrayBlockingQueue();
		Message message1 = new Message("111", "百香果", 2);
		Message message2 = new Message("112", "珍珠", 1);
		new Consumerthread("顾客1", message1, bq).start();
		new Consumerthread("顾客2", message2, bq).start();
		new Producerthread("Coco 奶茶店", bq).start();
	}
}
