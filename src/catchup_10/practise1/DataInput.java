package catchup_10.practise1;
import java.util.Scanner;
public class DataInput {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		Integer num;
		
		while(true) {
			//主线程负责处理键盘输入
			try {
				num = scan.nextInt();
			} catch (Exception e) {
				break;
			}
			//子线程sortThread处理数据存储和排序
			SortThread sortThread = new SortThread(num);
			sortThread.start();
			//子线程disPlayThread负责输出到屏幕
			DisplayThread disPlayThread = new DisplayThread();
			sortThread.join();
			disPlayThread.start();
		}
		
		scan.close();

	}

}
