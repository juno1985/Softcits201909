package lesson6.bank;

public class Oop {

	public static void main(String[] args) {
		/*
		 * //取钱 Withdraw withdraw = new Withdraw(); int num = withdraw.queue_up();
		 * withdraw.operation(num); withdraw.comment(); //办卡 NewCard newCard = new
		 * NewCard(); num = newCard.queue_up(); newCard.operation(num);
		 * newCard.comment();
		 */
		/**
		 * 编译 - 父类类型
		 * 运行 - 子类类型
		 * 
		 * 多态
		 */
		AbstractOperation withdraw = new Withdraw();
		withdraw.operation();
		
		AbstractOperation newcard = new NewCard();
		newcard.operation();
	}

}
