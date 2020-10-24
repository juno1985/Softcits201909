package catchup_11.safety;

public class DrawTest
{
	public static void main(String[] args)
	{
		// 创建一个账户
		Account acct = new Account("工商银行卡" , 1000);
		// 模拟两个线程对同一个账户取钱
		new DrawThread("张三老婆" , acct , 800).start();
		new DrawThread("张三儿子" , acct , 800).start();
	}
}
